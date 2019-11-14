package com.example.esoftwarica.model;



public class addStudentViewModel  {

    static String name, age, gender, address;
    static int imageId;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        addStudentViewModel.name = name;
    }

    public static String getAge() {
        return age;
    }

    public static void setAge(String age) {
        addStudentViewModel.age = age;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        addStudentViewModel.gender = gender;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        addStudentViewModel.address = address;
    }

    public static int getImageId() {
        return imageId;
    }

    public static void setImageId(int imageId) {
        addStudentViewModel.imageId = imageId;
    }
}