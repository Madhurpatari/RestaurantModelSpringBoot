package com.Geekster.Restaurant.Repository;

import com.Geekster.Restaurant.Models.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {

    private static  List<Restaurant> restaurantList;

    public RestaurantDao(){
        System.out.println("Dummy restaurant created");
        restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant(0,"Madhur's Dhaba", "Devanagari, Uttarakhand",
                "1234567890" ,"Indian", 10, 4.3,
                "www.MadhurDhaba.com", true));
    }

    public  static List<Restaurant> getRestaurantFromDataSource() {
        return restaurantList;
    }


    public static List<Restaurant> getAll() {
        return restaurantList;
    }

    public static boolean saveRestaurant(Restaurant restaurant) {
restaurantList.add(restaurant);
return true;
    }

    public static boolean update(int id, boolean speciality) {
        boolean updateStatus = false;
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getId()==id){
                    remove(restaurant);
                    restaurant.setSpeciality(String.valueOf(speciality));
                    saveRestaurant(restaurant);
                    return true;
            }

        }
        return false;
    }

    public static boolean remove(Restaurant restaurant) {
            restaurantList.remove(restaurant);
            return true;
    }
}

