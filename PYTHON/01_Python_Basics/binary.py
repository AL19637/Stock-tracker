# This program converts an integer to its binary representation.
def start():
    num = int(   input("Enter a integer: ")     )
    binary_string = to_binary(num)
    print("The binary representation of", num, "is", binary_string)

def to_binary(x):
    x = abs(x)
    result = str()

    if x == 0:
        return "0"

    while x > 0:
        remainder = x % 2
        result = result + str(remainder)
        x = x // 2

    result = "".join(reversed(result))
    return result

start()