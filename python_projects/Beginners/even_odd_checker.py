# def calculator():
#     num1 = float(input("Enter first number: "))
#     op = input("Enter operation (+, -, *, /): ")
#     num2 = float(input("Enter second number: "))

#     if op == "+":
#         print("Result:", num1 + num2)
#     elif op == "-":
#         print("Result:", num1 - num2)
#     elif op == "*":
#         print("Result:", num1 * num2)
#     elif op == "/":
#         print("Result:", num1 / num2)
#     else:
#         print("Invalid operation!")

# calculator()

numbers = input("Enter numbers separated by commas: ")
numbers = numbers.split(',')

for num in numbers:
    if int(num.strip()) % 2 == 0:
        print(f"{num.strip()} is Even")
    else:
        print(f"{num.strip()} is Odd")
