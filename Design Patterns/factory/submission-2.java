
/*
 * FACTORY METHOD DESIGN PATTERN
 *
 * Definition:
 * Factory Method is a CREATIONAL design pattern that defines a method
 * for creating objects, while allowing subclasses to decide which
 * concrete class to instantiate.
 *
 * Steps:
 * 1. Create a common interface for the products.
 * 2. Implement the interface in concrete product classes.
 * 3. Create an abstract factory with a creation method.
 * 4. Create concrete factories that decide which product to instantiate.
 * 5. The client uses a factory without directly creating the product.
 */

// STEP 1: Product interface
// Defines the common behavior that all vehicles must provide.
interface Vehicle {
    String getType();
}

// STEP 2: Concrete products
// Each class implements the Vehicle interface differently.

class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

class Bike implements Vehicle {
    @Override
    public String getType() {
        return "Bike";
    }
}

class Truck implements Vehicle {
    @Override
    public String getType() {
        return "Truck";
    }
}

// STEP 3: Creator (abstract factory)
// Declares the factory method that creates a Vehicle.
// It does not specify which concrete vehicle will be created.
abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

// STEP 4: Concrete creators (concrete factories)
// Each factory overrides createVehicle() to decide
// which concrete Vehicle implementation to instantiate.

class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}

// STEP 5: Client code (example usage)
// The client works with VehicleFactory and Vehicle abstractions.
// It does not need to know the concrete product's class.

