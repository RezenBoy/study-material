def print_pyramid(rows):
    for i in range(1, rows + 1):
        print(" " * (rows - i) + "* " * i)

def print_square(size):
    for i in range(size):
        print("* " * size)

def print_triangle(rows):
    for i in range(1, rows + 1):
        print("* " * i)

print("Pattern Options:\n1. Pyramid\n2. Square\n3. Right Triangle")
choice = input("Choose a pattern (1/2/3): ")
rows = int(input("Enter number of rows: "))

if choice == "1":
    print_pyramid(rows)
elif choice == "2":
    print_square(rows)
elif choice == "3":
    print_triangle(rows)
else:
    print("Invalid option!")
