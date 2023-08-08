# https://www.codewars.com/kata/599febdc3f64cd21d8000117

NUM = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]

def numbers_of_letters(n):
    s = ''.join(NUM[i] for i in map(int, str(n)))
    return [s] + (numbers_of_letters(len(s)) if len(s) != n else [])