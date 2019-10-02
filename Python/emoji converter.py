massage = input ('-->')

words = massage.split(' ')

emoji= {
    ":)": " 😊 ",
    ":(": " 🙂 "

}

output= " "
for word in words:
   output += emoji.get(word, word) + " "
print(output)