package hello.core;

import lombok.*;

@Data
public class HelloLombok {

    private String name;
    private int age;

    public  static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("adfas");

        String name = helloLombok.getName();
        System.out.println("name = " + name);
    }
}
