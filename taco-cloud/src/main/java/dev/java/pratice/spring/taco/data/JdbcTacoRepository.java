package dev.java.pratice.spring.taco.data;

import java.sql.Timestamp;
import java.sql.Types;
import java.util.Arrays;
import java.util.Date;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import dev.java.pratice.spring.taco.model.Ingredient;
import dev.java.pratice.spring.taco.model.Taco;
import dev.java.pratice.spring.taco.repository.TacoRepository;

@Repository
public class JdbcTacoRepository implements TacoRepository {

	private static final String INSERT_TACO_SQL = "insert into Taco(name, createdAt) values(?, ?)";

	private JdbcTemplate jdbc;

	public JdbcTacoRepository(JdbcTemplate jdbc) {
		super();
		this.jdbc = jdbc;
	}

	@Override
	public Taco save(Taco taco) {
		long tacoId = saveTacoInfo(taco);

		for (Ingredient ingredient : taco.getIngredients()) {
			saveIngredientToTaco(ingredient, tacoId);
		}

		return taco;
	}

	private long saveTacoInfo(Taco taco) {
		taco.setCreatedAt(new Date());
		PreparedStatementCreatorFactory factory = new PreparedStatementCreatorFactory(INSERT_TACO_SQL, Types.VARCHAR,
				Types.TIMESTAMP);
		factory.setReturnGeneratedKeys(true);
		
		PreparedStatementCreator creator = factory.newPreparedStatementCreator(
				Arrays.asList(taco.getName(), new Timestamp(taco.getCreatedAt().getTime())));

		KeyHolder holder = new GeneratedKeyHolder();

		jdbc.update(creator, holder);

		long id = holder.getKey().longValue();
		taco.setId(id);

		return holder.getKey().longValue();
	}

	private void saveIngredientToTaco(Ingredient ingredient, long tacoId) {
		jdbc.update("insert into Taco_Ingredients (taco, ingredient) values (?, ?)", tacoId, ingredient.getId());
	}

}
