package com.example.demo.bean;

public class Depart {
//    private String id;
    private String name;
    private Integer location;
//    public String getId() {
//        return id;
//    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    @Override
    public  String toString(){
        return "Depart{name='"+name+",loaction='"+location+"}";
    }

}