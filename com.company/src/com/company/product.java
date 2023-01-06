package com.company;

import java.util.ArrayList;
import java.util.List;

class product {
    int id;
    String name;
    float price;
    public product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        List<product> productsList = new ArrayList<product>();
        //Adding Products
        productsList.add(new product(1,"HP Laptop",25000f));
        productsList.add(new product(2,"Dell Laptop",30000f));
        productsList.add(new product(3,"Lenevo Laptop",28000f));
        productsList.add(new product(4,"Sony Laptop",28000f));
        productsList.add(new product(5,"Apple Laptop",90000f));
        List<Float> productPriceList = new ArrayList<Float>();
        for(com.company.product product: productsList){

            // filtering data of list
            if(product.price<30000){
                productPriceList.add(product.price);    // adding price to a productPriceList
            }
        }
        System.out.println(productPriceList);   // displaying data
    }
}






