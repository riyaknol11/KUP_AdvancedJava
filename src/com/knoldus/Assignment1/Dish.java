package com.knoldus.Assignment1;

import java.time.LocalDateTime;
import java.time.LocalTime;

class Dish {
   Integer dishId;
   String dishName;
  LocalTime creationTime;


    // Constructor for initializing the Dish object
    public Dish(Integer dishId, String dishName, LocalTime creationTime) {
        this.dishId = dishId;
        this.dishName = dishName;
        this.creationTime = creationTime;
    }

    public Dish(Integer dishId) {
        this.dishId = dishId;
    }

    // Overriding the equals method to compare two Dish objects
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Dish)) {
            return false;
        }

        // Casting the object to Dish class and comparing the dishId of both objects
        Dish other = (Dish) object;
        return this.dishId.equals(other.dishId);
    }

    @Override
    public String toString() {
        return  "dishId=" + dishId + ", dishName='" + dishName + '\'' + ", creationTime=" + creationTime ;
    }
}

