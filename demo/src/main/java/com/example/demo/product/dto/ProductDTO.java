package com.example.demo.product.dto;

import com.example.demo.product.Product;
import lombok.Getter;


public class ProductDTO {

    int id;

    String category;

    String tag;

    String city;

    String latitude;

    String longitude;

    String description;
    String address;




    public void setAddress(String address) {
        this.address = address;
    }

    public ProductDTO(Product product) {
        setId(product.getId());
        setTag(product.getTag());
        setCity(product.getCity());
        setAddress(product.getAddress());
        setDescription(product.getDescription());
        setLatitude(product.getLatitude());
        setLongitude(product.getLongitude());
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getTag() {
        return tag;
    }

    public String getCity() {
        return city;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
