package org.fooddeliveryapp.api;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class TestApi {
    @WebMethod
    public String getRestaurantsByArea(String area) {
        return "Restaurants in " + area + ": Amania Hotel, Food Court";
    }
}