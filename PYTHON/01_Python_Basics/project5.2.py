def uses_any(word, letters):
    for letter in letters:
        if letter in word:
            return True
    return False

def check_word(word):
    word = word.upper()

    e_wrong_positions = [2, 3, 4] # 3rd, 4th and 5th letters
    no_letters = ['S', 'P', 'A', 'D', 'C', 'L', 'R', 'K', 'T', 'O']

    if word[4] != 'M':
        return False

    if uses_any(word, no_letters):
        return False

    if 'E' not in word:
        return False

    for e in e_wrong_positions:
        if word[e] == 'E':
            return False
    return True

#word file
word_list = []
file_object = open('words.txt')
for line in file_object:
    word = line.strip()
    if len(word) == 5:
        word_list += [word.upper()]

poss_words = []
for word in word_list:
    if check_word(word):
        poss_words += [word]

print("Total words:", len(poss_words))
print("Possible words:", poss_words)