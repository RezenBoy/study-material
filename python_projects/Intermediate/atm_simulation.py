balance = 1000
pin = "1234"

def atm_menu():
    global balance
    while True:
        print("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit")
        choice = input("Choose an option: ")

        if choice == "1":
            print(f"💰 Your balance is ₹{balance}")
        elif choice == "2":
            amount = float(input("Enter amount to deposit: ₹"))
            balance += amount
            print("Amount deposited.")
        elif choice == "3":
            amount = float(input("Enter amount to withdraw: ₹"))
            if amount > balance:
                print("Insufficient funds.")
            else:
                balance -= amount
                print("Withdrawal successful.")
        elif choice == "4":
            print("Thank you for using ATM!")
            break
        else:
            print("Invalid choice. Try again.")

# ATM Login
user_pin = input("Enter your PIN: ")
if user_pin == pin:
    print("Access Granted.")
    atm_menu()
else:
    print("Wrong PIN!")
