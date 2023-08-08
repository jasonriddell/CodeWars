# https://www.codewars.com/kata/53573877d5493b4d6e00050c
def capital(capitals): 
    str = "The capital of {} is {}"
    o_arr = []
    for i in capitals:
        i_keys = i.keys()
        if 'state' in i_keys:
            arg1 = i.get("state")
        else:
            arg1 = i.get("country")
        arg2 = i.get("capital")
        o_arr.append(str.format(arg1, arg2))
    return o_arr