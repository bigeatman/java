package dev.java.pratice.spring.taco.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import dev.java.pratice.spring.taco.model.Ingredient;
import dev.java.pratice.spring.taco.model.Taco;
import dev.java.pratice.spring.taco.repository.IngredientRepository;

@Repository
public class JdbcIngredientRepository implements IngredientRepository {

	private JdbcTemplate jdbc;

	public JdbcIngredientRepository(JdbcTemplate jdbc) {
		super();
		this.jdbc = jdbc;
	}

	@Override
	public List<Ingredient> findAll() {
		return jdbc.query("select id, name, type from Ingredient", this::mapRowToIngredient);
	}

	@Override
	public Ingredient findByid(String id) {
		return jdbc.queryForObject("select id, name, type from Ingredient where id=?", this::mapRowToIngredient, id);
	}

	@Override
	public Ingredient save(Ingredient ig) {
		jdbc.update("insert into Ingredient (id, name, type) values (?, ?, ?)", ig.getId(), ig.getName(),
				ig.getType().toString());

		return ig;
	}

	private Ingredient mapRowToIngredient(ResultSet rs, int rowNum) throws SQLException {
		return new Ingredient(rs.getString("id"), rs.getString("name"), Ingredient.Type.valueOf(rs.getString("type")));
	}
}
