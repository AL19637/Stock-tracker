# Here you will create a roster for a soccer team. 
# You will be prompted to enter the jersey number and rating for five players. 
# Then, you will be able to add, remove, and update players in the roster, 
# as well as output players above a certain rating.
roster = {}

# Players
for i in range(1, 6):
    jersey = int(input(f"Enter player {i}'s jersey number:\n"))
    rating = int(input(f"Enter player {i}'s rating:\n"))
    roster[jersey] = rating
    print()

def display_roster():
    print("ROSTER")
    for jersey in sorted(roster.keys()):
        print(f"Jersey number: {jersey}, Rating from 1-10: {roster[jersey]}")

def menu():
    print("\nMENU")
    print("a - Add player")
    print("d - Remove player")
    print("u - Update player rating")
    print("r - Output players above a rating")
    print("o - Output roster")
    print("q - Quit")

    option = input("\nChoose an option:\n")

    if option == 'o':
        display_roster()

    elif option == 'a':
        jersey = int(input("Enter a new player's jersey number:\n"))
        rating = int(input("Enter the player's rating:\n"))
        roster[jersey] = rating

    elif option == 'd':
        jersey = int(input("Enter a jersey number:\n"))
        if jersey in roster:
            del roster[jersey]

    elif option == 'u':
        jersey = int(input("Enter a jersey number:\n"))
        if jersey in roster:
            rating = int(input("Enter a new rating for player:\n"))
            roster[jersey] = rating

    elif option == 'r':
        rating = int(input("Enter a rating:\n"))
        print(f"\nABOVE {rating}")
        for jersey in sorted(roster.keys()):
            if roster[jersey] > rating:
                print(f"Jersey number: {jersey}, Rating from 1-10: {roster[jersey]}")

    # Repeat menu
    if option != 'q':
        menu()

display_roster()
menu()
