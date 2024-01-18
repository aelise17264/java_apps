package com.example.demo;

public class Person {

    //to generate getters & setters in vs code right click on word
    // select Source Action & click Generate Getter or Generate Setter

    private String name;
    private String greeting;
    
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    

}
