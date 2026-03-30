# A Caesar cipher is a simple encryption technique in which each letter in a
# word is shifted by a certain number of places down the alphabet. 
letters = 'abcdefghijklmnopqrstuvwxyz'
numbers = range(len(letters))
letter_map = dict(zip(letters, numbers))

def shift_word(word, n):
    new_letters = []
    for letter in word:
        old = letter_map[letter]
        new_roll = (old + n) % 26 #wrap using modulus
        new_letter = letters[new_roll] #letter new
        new_letters.append(new_letter) #adds
    return ''.join(new_letters)

print(shift_word("cheer", 7)) #jolly
print(shift_word("melon", 16)) #cubed
print(shift_word("jolly", 19)) #cheer
