package org.fooddeliveryapp;

import org.fooddeliveryapp.model.Restaurant;
import org.fooddeliveryapp.storage.JsonStorage;
import org.fooddeliveryapp.api.TestApi;

import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("######## Food Delivery App ########\n");
        System.out.println("Loading...\n");

        //==Test 1: File Storage
        System.out.println("Testing JSON Storage");
        JsonStorage storage = new JsonStorage();

        //create sample restaurant
        Restaurant r1 = new Restaurant();
        r1.setName("Amania Hotel");
        r1.setAddress("Chowmuhuni, Begumganj");
        r1.setArea("Begumganj");
        r1.setOpen(true);

        //Save to file
        storage.saveRestaurants(List.of(r1));
        System.out.println("saved to data/restaurants.json");

        //Load from file
        List<Restaurant> loaded = storage.loadRestaurants();
        System.out.println("restaurants loaded: " + loaded.get(0).getName());
        System.out.println();

        //Test 2: SOAP API
        System.out.println("🌐 Starting SOAP API...");
        Endpoint.publish("http://localhost:8080/restaurants", new TestApi());
        System.out.println("✅ SOAP API running at: http://localhost:8080/restaurants?wsdl");
        System.out.println("👉 KEEP THIS WINDOW OPEN and visit the URL in your browser!");
    }
}