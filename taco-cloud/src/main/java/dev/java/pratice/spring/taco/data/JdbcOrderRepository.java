package dev.java.pratice.spring.taco.data;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;

import dev.java.pratice.spring.taco.model.Order;
import dev.java.pratice.spring.taco.model.Taco;
import dev.java.pratice.spring.taco.repository.OrderRepository;

@Repository
public class JdbcOrderRepository implements OrderRepository {

	private SimpleJdbcInsert orderInserter;

	private SimpleJdbcInsert orderTacoInserter;

	private ObjectMapper objectMapper;

	public JdbcOrderRepository(JdbcTemplate jdbc) {
		this.orderInserter = new SimpleJdbcInsert(jdbc).withTableName("Taco_Order").usingGeneratedKeyColumns("id");
		this.orderTacoInserter = new SimpleJdbcInsert(jdbc).withTableName("Taco_Order_Tacos");
		this.objectMapper = new ObjectMapper();
	}

	@Override
	public Order save(Order order) {
		order.setPlacedAt(new Date());
		long orderId = saveOrderDetails(order);

		for (Taco taco : order.getTacos()) {
			saveTacoToOrder(taco, orderId);
		}

		return order;
	}

	private long saveOrderDetails(Order order) {
		Map<String, Object> values = objectMapper.convertValue(order, Map.class);
		values.put("placedAt", order.getPlacedAt());

		long orderId = orderInserter.executeAndReturnKey(values).longValue();
		order.setId(orderId);
		return orderId;
	}

	private void saveTacoToOrder(Taco taco, long orderId) {
		Map<String, Object> values = new HashMap<>();

		values.put("tacoOrder", orderId);
		values.put("taco", taco.getId());

		orderTacoInserter.execute(values);
	}
}
