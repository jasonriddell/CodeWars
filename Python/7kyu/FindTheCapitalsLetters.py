# https://www.codewars.com/kata/539ee3b6757843632d00026b
def capitals(word):
    caps = []
    for i in range(len(word)):
        if word[i].isupper():
            caps.append(i) 
    return caps