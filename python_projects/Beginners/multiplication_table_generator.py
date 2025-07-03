# num = int(input("Enter a number to get its multiplication table: "))

# for i in range(1, 11):
#     print(f"{num} x {i} = {num * i}")


num = int(input("Enter a number: "))
start = int(input("Start from: "))
end = int(input("End at: "))

print(f"Multiplication table of {num} from {start} to {end}:")

for i in range(start, end + 1):
    print(f"{num} x {i} = {num * i}")
