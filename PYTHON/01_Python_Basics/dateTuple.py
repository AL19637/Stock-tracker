# This program defines a Date class and demonstrates how to use it. 
# Convert it to a tuple, and compare two dates.
class Date:
    """ Represents a year, month, and day. """

    def make_date(self, year, month, day):
        self.year = year
        self.month = month
        self.day = day

    def print_date(self):
        print(f"{self.year:04d} - {self.month:02d} - {self.day:02d}")

    def date_to_tuple(self):
        return self.year, self.month, self.day

    def is_after(self, other):
        return self.date_to_tuple() > other.date_to_tuple()

#part 1
def make_date(year, month, day):
    d = Date()
    d.year = year
    d.month = month
    d.day = day
    return d

def print_date(d):
    print(f"{d.year:04d} - {d.month:02d} - {d.day:02d}")

def date_to_tuple(d):
    return (d.year, d.month, d.day)

def is_after(d1, d2):
    return date_to_tuple(d1) > date_to_tuple(d2)

#part 1
d1 = make_date(1933, 6, 22)
d2 = make_date(1933, 9, 17)
print_date(d1)
print_date(d2)
print(is_after(d2, d1))
print(is_after(d1, d2))

print() #message to separate

#part 2
d1, d2 = Date(), Date()
d1.make_date(1933, 6, 22)
d2.make_date(1933, 9, 17)
d1.print_date()
d2.print_date()
print(d2.is_after(d1))
print(d1.is_after(d2))
