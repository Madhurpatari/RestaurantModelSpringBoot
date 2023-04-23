package com.Geekster.Restaurant.Controller;

import com.Geekster.Restaurant.Models.Restaurant;
import com.Geekster.Restaurant.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.spi.RegisterableService;
import java.util.List;

@RestController
@RequestMapping(value = "/restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable int id) {
        return restaurantService.getRestaurantById(id);
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return RestaurantService.getAllRestaurants();
    }

    @PostMapping(value = "/add")
    public String addRestaurant(@RequestBody Restaurant restaurant) {
        return RestaurantService.save(restaurant);
    }

    @PutMapping(value = "/update/{id}/{speciality}")
    public String updateRestaurantById(@PathVariable int id, @PathVariable String speciality){
        return RestaurantService.updateRestaurantById(id,speciality);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteRestaurant(@PathVariable int id){
        return RestaurantService.delete(id);
    }

}
