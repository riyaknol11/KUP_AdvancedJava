package com.knoldus.Assignment1;

import java.time.LocalTime;
import java.util.ArrayList;

class Menu {

       static ArrayList<Dish> menuList = new ArrayList<>();
    // static block that adds new Dish in menulist.
    static {
        menuList.add(new Dish(11, "Biryani", LocalTime.now()));
        menuList.add(new Dish(12,"Chole Bhature", LocalTime.now()));
        menuList.add(new Dish(13, "Momos", LocalTime.now()));
        menuList.add(new Dish(14,"Pasta", LocalTime.now()));
    }

    //method displaying the dishes from menuList
    public static void displayDishes(){
        for (Dish index : menuList) {
            System.out.println(index);
        }
    }
    public static void compareID(int id){
        Dish searchId = new Dish(id);
        boolean isFound=false;
        for(Dish dish:menuList){
            if(dish.equals(searchId)){
                System.out.println(dish.toString());
                isFound=true;
                break;
            }
        }
    }



    }

