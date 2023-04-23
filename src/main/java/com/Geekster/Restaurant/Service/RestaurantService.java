package com.Geekster.Restaurant.Service;

import com.Geekster.Restaurant.Models.Restaurant;
import com.Geekster.Restaurant.Repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantDao restaurantDao;

    public static List<Restaurant> getAllRestaurants() {
        return RestaurantDao.getAll();
    }

    public static String save(Restaurant restaurant) {
        boolean status =RestaurantDao.saveRestaurant(restaurant);
        if (status){
return "Restaurant added successfully";
        }else{
return "failed to add Restaurant";
        }

    }

    public static String updateRestaurantById(int id, String speciality) {
        boolean updateStatus =RestaurantDao.update(id,  Boolean.parseBoolean(speciality));
        if(updateStatus){
            return  "Restaurant with id : " + id + " was updated";
        }else{
            return "Restaurant with id : " +id  + " not found";
         }
    }

    public static String delete(int id) {
        boolean deleteResponse = false;
        String status;
        if(!(id >= 0))
        {
            List<Restaurant> listRightNow =  RestaurantDao.getRestaurantFromDataSource();

            for(Restaurant restaurant : listRightNow)
            {
                if(restaurant.getId() == id)
                {
                    deleteResponse = RestaurantDao.remove(restaurant);
                    if(deleteResponse)
                    {
                        status = "Restaurant with id: " + id + " was deleted!!!";
                    }
                    else
                    {
                        status = "Restaurant with id: " + id + " was not deleted!!!...Database error";
                    }
                    return status;
                }
            }

            return "Restaurant with id: " + id + " does not exist!!!";
        }
        else
        {
            return "Invalid Id ....Cannot accept Null ID!!";
        }
    }


    public  Restaurant getRestaurantById(int id) {
        List<Restaurant> listRightNow = RestaurantDao.getRestaurantFromDataSource();
        for (Restaurant restaurant : listRightNow) {
            if (restaurant.getId() == id) {
                return restaurant;
            }
        }
        return null;
    }
    }
