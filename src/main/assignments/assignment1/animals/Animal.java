package main.assignments.assignment1.animals;

abstract public class Animal {
    private String name;
    private String type;
    private String sound;
    private String bestFood;

    Animal(String name, String type, String sound, String bestFood){
        this.name = name;
        this.type = type;
        this.sound = sound;
        this.bestFood = bestFood;
    }

    public void makeSound(){
        if (this.sound.equals("")){
            System.out.println("The silence this animal produces is deafening!");
        } else {
            System.out.println(this.sound);
        }
    }

    @Override
    public String toString(){
        return "This is a " + this.type + " called " + this.name + ". Its favourite food is " + this.bestFood + ".";
    }
}
