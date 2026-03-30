w1 = float(input("Enter weight 1: "))
w2 = float(input("Enter weight 2: "))
w3 = float(input("Enter weight 3: "))
w4 = float(input("Enter weight 4: "))


weights = [w1, w2, w3, w4]
print()
print("Weights:", weights)
print()
average_weight = sum(weights) / len(weights)
print(f"Average weight: {average_weight:.2f}")
print()
max_weight = max(weights)
print(f"Max weight: {max_weight:.2f}")


print()
wee = int(input("Enter a list location (1 - 4) to turn into kilograms: ")) - 1
pounds = weights[wee]
kilograms = pounds / 2.2
print()

print(f"Weight in pounds: {pounds:.2f}")
print(f"Weight in kilograms: {kilograms:.2f}")
weights.sort()
print("Sorted list:", weights)
print()
