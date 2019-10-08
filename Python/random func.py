# def math(num):
#    return num*num
   
# print(math(5))

def emoji_converter(massage):
    words = massage.split(' ')
    emoji= {
    ":)": " 😊 ",
    ":(": " 🙂 "
    }
    output= " "
    for word in words:
        output += emoji.get(word, word) + " "
    return output


massage = input ('-->')
print(emoji_converter(massage))
