/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData;

/**
 *
 * @author ulfur
 */
public class Car {
    private String id;
    
    private String model;
    private CarType carType;
    private int numberOfDoors;
    
    private User owner;
    
    public Car(){}
    public Car(String id, String model, CarType carType, int numberOfDoors, User owner){
        this.id = id;
        this.model = model;
        
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.numberOfDoors = numberOfDoors;
        this.owner = owner;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
    
    
    
}
