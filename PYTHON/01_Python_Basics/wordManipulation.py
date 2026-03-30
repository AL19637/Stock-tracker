# This program defines a Sentence class that allows you to manipulate the words in a sentence.
import random # for scramble

class Sentence:
    """
    Sentence and how to
    change its words.
    """
    def __init__(self, sentence):
        """
        Sentence object as well as sentence to a list.
        """
        self.original = sentence
        words = sentence.split()  # Split
        self.clean_words = []
        for word in words:
            clean_word = word.strip('.,:;!?"\'()') #take away punctuations
            self.clean_words.append(clean_word)

    def __str__(self):
        """
        Sentence to string.
        """
        return ' '.join(self.clean_words)

    def get_word(self, index):
        """
        The index get one desired word operation.
        """
        if 0 <= index < len(self.clean_words):
            return self.clean_words[index]
        else:
            return "" #return nothing

    def set_word(self, index, new_word):
        """
        Replaces index with a new word.
        """
        if 0 <= index < len(self.clean_words):
            self.clean_words[index] = new_word


    def scramble(self):
        """
        Scrambles the words in a sentence.
        """
        #This was hard.
        words = self.clean_words[:]
        random.shuffle(words)
        return words

if __name__ == "__main__":
    #Sentence
    s = Sentence("Python is nice and fun!")

    #Index
    print("Word at index 2:", s.get_word(2))
    print("Word at index 3:", s.get_word(3))
    print("Word at index 4:", s.get_word(4))

    s.set_word(2, "hard")
    s.set_word(3, "but")
    s.set_word(4, "useful")

    #Print end
    print("Original sentence:", s.original)
    print("Scrambled sentence:", ' '.join(s.scramble()))
    print("Final sentence after changes:", s)

