numbers=[1,4,5,8,23,63,45]

max=numbers[0]
for number in numbers:
    if number > max:
        max=number

print(max)