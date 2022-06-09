package com.just.chatbot;

public class Completion {

    String name;
    String precautionOne;
    String precautionTwo;
    String precautionThree;
    String getPrecautionFour;
    String description;

    public Completion(String name,String description, String precautionOne, String precautionTwo, String precautionThree, String getPrecautionFour) {
        this.name = name;
        this.precautionOne = precautionOne;
        this.precautionTwo = precautionTwo;
        this.precautionThree = precautionThree;
        this.getPrecautionFour = getPrecautionFour;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Completion{" +
                "name='" + name + '\'' +
                ", precautionOne='" + precautionOne + '\'' +
                ", precautionTwo='" + precautionTwo + '\'' +
                ", precautionThree='" + precautionThree + '\'' +
                ", getPrecautionFour='" + getPrecautionFour + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
