"""
count = 0
def char_in_string(char, st):
    for letter in st:
        if letter == char:  # check
            count = count + 1
    return count  # return total

"""
# This version allows the user to enter multiple characters and find them in the strings until they choose to quit.
def char_in_string(char, st):
    count = st.count(char) # simplify
    return count

char = ""
while char.lower() != "quit":
    char = input("Enter a character or 'quit': ")
    if char.lower() == "quit":
        break

    st = input("Enter a string or 'quit': ")
    if st.lower() == "quit":
        break

    count = char_in_string(char, st)
    if count == 1:
        print(count, char)
    else:
        print(count, char + "'s")