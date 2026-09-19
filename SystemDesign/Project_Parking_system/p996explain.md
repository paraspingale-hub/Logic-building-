# program996.java - Simple Flow

1. Java starts execution in the `main` method of `program996`.
2. The `main` method is currently empty, so nothing happens and the program ends immediately.
3. `VehicalType`, `SpotType`, and `TicketStatus` are enums. They only define fixed values for vehicle types, parking spot types, and ticket states.
4. These enums are not used yet because the parking system classes and logic have not been implemented.

**Current execution:** Start `main` -> do nothing -> program ends.

## program997.java

1. Java starts from the empty `main` method in `program997`.
2. Because `main` has no statements, the program ends immediately without printing anything.
3. The enums store vehicle types, parking spot types, and ticket states.
4. The abstract `vehical` class stores a vehicle number and type. `Bike`, `Car`, and `Truck` inherit from it and define their own `display()` method.
5. These vehicle classes are only definitions at this stage; no object is created or displayed during execution.

**Current execution:** Start `main` -> create nothing -> print nothing -> program ends.

## program998.java

1. Java starts execution in the empty `main` method of `program998`.
2. Since `main` does not call the factory or create an object, the program prints nothing and ends.
3. The `vehicalFactory` class contains `createVehical()`. It checks the vehicle type and creates a `Bike`, `Car`, or `Truck` object with the given number.
4. If an invalid type is given, the factory throws an error.

**Current execution:** Start `main` -> create nothing -> print nothing -> program ends.
