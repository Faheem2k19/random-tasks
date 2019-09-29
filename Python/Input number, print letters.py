# m = [[1, 2, 3],
#      [11, 12, 13],
#      [21, 22, 23]
#      ]

# for row in m:
#     for item in row:
#         print(item)

# number=[12,1,3,4,4,45]

# number1=number.copy()

# number1.append(10)
# number1= list(dict.fromkeys(number1))
# print(number1)


phone=input("Phone: " )

numbers_mapping={
    "1":"one",
    "2":"two",
    "3":"three",
    "4":"four"
}

output=" "

for ch in phone:
    output += numbers_mapping.get(ch,"!") + " "

print(output)


