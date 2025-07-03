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


def calculator():
    while True:
        num1 = float(input("Enter first number: "))
        op = input("Enter operation (+, -, *, /): ")
        num2 = float(input("Enter second number: "))

        if op == "+":
            print("Result:", num1 + num2)
        elif op == "-":
            print("Result:", num1 - num2)
        elif op == "*":
            print("Result:", num1 * num2)
        elif op == "/":
            if num2 == 0:
                print("Cannot divide by zero!")
            else:
                print("Result:", num1 / num2)
        else:
            print("Invalid operation!")

        again = input("Do you want to calculate again? (yes/no): ")
        if again.lower() != "yes":
            break

calculator()
