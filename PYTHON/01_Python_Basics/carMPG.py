import math
class Car:
    """car"""
    def __init__(self, mpg=0, gas_gallon=0):
        self.mpg = mpg
        self.gas_gallon = gas_gallon

    def __str__(self):
        return "The MPG of the car is " + str(self.mpg) + ", and the gas left in the gas tank is " + str(self.gas_gallon) + " gallons."


    # add gas method
    def add_gas(self, gallons):
        self.gas_gallon = self.gas_gallon + gallons

    # drive method
    def drive(self, miles):
        gallons_needed = math.ceil(miles/self.mpg)

        if gallons_needed > self.gas_gallon:
            extra_needed = gallons_needed - self.gas_gallon
            print("There is not enough gas left to drive", miles, " miles. You need to add at least", extra_needed, "more gallons.")
        else:
            self.gas_gallon = self.gas_gallon - gallons_needed


if __name__ == "__main__":
    my_car_collection = []

    #First car
    mpg = int(input("Enter the MPG of the car:\n"))
    gas = int(input("Enter the gallons of gas in the tank:\n"))
    car1 = Car(mpg, gas)

    add = int(input("Enter the gallons of gas to add:\n"))
    car1.add_gas(add)

    miles = int(input("Enter the miles to drive:\n"))
    car1.drive(miles)

    print(car1)
    my_car_collection.append(car1)

    #Two cars
    count = 0
    while count < 2:
        print("\nEnter information for another car:")
        mpg = int(input("Enter the MPG of the car:\n"))
        gas = int(input("Enter the gallons of gas in the tank:\n"))
        new_car = Car(mpg,gas)
        my_car_collection.append(new_car)
        count = count + 1

    # All cars
    print("\nCar Collection:")
    index = 0
    for car in my_car_collection:
        print(index, ":", car)
        index = index + 1

    #Pick a car
    choice = int(input("\nPick a car:\n"))
    print(my_car_collection[choice])
