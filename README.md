### Brief

Write a robot simulator.

A robot factory's test facility needs a program to verify robot movements.

The robots have three possible movements:

- turn right
- turn left
- advance

Robots are placed on a hypothetical infinite grid, facing a particular direction (north, east, south, or west) at a set of {x,y} coordinates, e.g., {3,8}, with coordinates increasing to the north and east.

The robot then receives a number of instructions, at which point the testing facility verifies the robot's new position, and in which direction it is pointing.

### Example

- Say a robot starts at {7, 3} facing north. Then running this stream of instructions should leave it at {9, 4} facing west.
- The letter-string "RAALAL" means:
  - Turn right
  - Advance twice
  - Turn left
  - Advance once
  - Turn left yet again


### Running the tests

Feel free to leverage you IDE to run your junit tests.  Alternative you can run all the tests by entering the following in your terminal:

```sh
$ ./gradlew test
```

All the best and happy coding!
