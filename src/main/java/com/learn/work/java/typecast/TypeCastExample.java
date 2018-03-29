package com.learn.work.java.typecast;
class Vehicle {
	String nameOfVehicle;

	public Vehicle(String nameOfVehicle) {
		super();
		this.nameOfVehicle = nameOfVehicle;
	}

	@Override
	public String toString() {
		return "Vehicle [nameOfVehicle=" + nameOfVehicle + "]";
	}	
	
	
}

class TwoWheeler extends Vehicle {
	String vehicleModel;
	public TwoWheeler(String nameOfVehicle, String vehicleModel) {
		super(nameOfVehicle);
		this.vehicleModel = vehicleModel;
	}
	@Override
	public String toString() {
		return "TwoWheeler [nameOfVehicle=" + nameOfVehicle + ", vehicleModel=" + vehicleModel + "]";
	}
	
	
}

public class TypeCastExample {
    
    public static void main(String[] args) {
    	Vehicle    v1 = new  Vehicle("A");
    	Vehicle    v2 = (Vehicle)new  TwoWheeler("B","C");
    	//TwoWheeler v3 = (TwoWheeler) v1;
    	System.out.println(v2);
    }

	@Override
	public String toString() {
		return "TypeCastExample []";
	}
}