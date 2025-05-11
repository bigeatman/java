package com.intbridge.test.utils;

import com.intbridge.test.model.Ingredient.Type;

//@formatter:off
public class Literals {
	
	public static final String[] INGREDIENT_ID = new String[] {
			"FLTO", "COTO", "GRBF", "CORN", "TMTO", "LETC", "CHED", "JACK", "SLSA", "SRCR" 
	};
	
	public static final String[] INGREDIENT_NAME = new String[] {
			"Flour Tortilla", "Corn Tortilla", "Ground Beef", "Carnitas", "Diced Tomatoes", "Lettuce", "Cheddar", "Monterry Jack", "Salsa", "Sour Cream"
	};
	
	public static final Type[] INGREDIENT_TYPE = new Type[] {
			Type.WRAP, Type.WRAP, Type.PROTEIN, Type.PROTEIN, Type.VEGGIES, Type.VEGGIES, Type.CHEESE, Type.CHEESE, Type.SAUCE, Type.SAUCE
	};
	
	public static final long MILLIS_IN_YEAR = 31_536_000_000L;
	
	public static final String DATE_FORMAT = "%2d/%2d";
	
	public static final String[] USERS_ID = {
			"john_doe", "jane_doe", "mike_smith", "emily_brown", "david_williams", "lisa_jones", "james_miller", "sarah_davis", "robert_moore", "susan_taylor", "michael_anderson", "karen_lee"
	};
	
	public static final String[] USERS_PS = {
			"John@1234", "Jane@5678", "Mike@9876", "Emily@2468", "David@1122", "Lisa@3344", "James@5566", "Sarah@7788", "Robert@9900", "Susan@1122", "Michael@3344", "Karen@5566"
	};
	
	public static final String[] USERS_FULLNAME = {
			"John Doe", "Jane Doe", "Mike Smith", "Emily Brown", "David Williams", "Lisa Jones", "James Miller", "Sarah Davis", "Robert Moore", "Susan Taylor", "Michael Anderson", "Karen Lee"
	};
}
