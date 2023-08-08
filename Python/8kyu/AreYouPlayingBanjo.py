# https://www.codewars.com/kata/53af2b8861023f1d88000832

def are_you_playing_banjo(name):
    deflt = "{} does not play banjo"
    does = "{} plays banjo"
    if (name[0].upper() == "R"):
        deflt = does
    return deflt.format(name)