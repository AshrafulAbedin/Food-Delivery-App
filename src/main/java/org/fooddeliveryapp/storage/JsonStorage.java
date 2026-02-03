package org.fooddeliveryapp.storage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.fooddeliveryapp.model.Restaurant;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonStorage {
    private final ObjectMapper mapper;
    //ObjectMapper = JSON <-> Java translator
    //converts Java Obj to JSON Strings and
    //convert JSON Strings to Java Obj
    //http://baeldung.com/jackson-object-mapper-tutorial
    private final String restaurantsFile = "data/restaurants.json";
    //File path = Where data lives on disk
    public JsonStorage() {
        this.mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    //saving Restaurants through object mapper write value
    // Check data folder
    public void saveRestaurants(List<Restaurant> restaurants) throws IOException
    {
        new File("data").mkdirs();
        mapper.writeValue(new File(restaurantsFile), restaurants);
    }

    //Loading Restaurants by reading JSON file through object mapper
    public List<Restaurant> loadRestaurants() throws IOException
    {
        File file = new File(restaurantsFile);
        if (!file.exists()) return new ArrayList<>();
        return List.of(mapper.readValue(file, Restaurant[].class));
    }
}
