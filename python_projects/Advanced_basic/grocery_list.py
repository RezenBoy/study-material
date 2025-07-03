grocery_list = []

def show_menu():
    print("\n📋 Grocery List Menu")
    print("1. Add Item")
    print("2. Remove Item")
    print("3. View List")
    print("4. Exit")

while True:
    show_menu()
    choice = input("Choose an option: ")

    if choice == "1":
        item = input("Enter item to add: ")
        grocery_list.append(item)
        print("✅ Item added.")
    elif choice == "2":
        item = input("Enter item to remove: ")
        if item in grocery_list:
            grocery_list.remove(item)
            print("🗑️ Item removed.")
        else:
            print("❌ Item not found.")
    elif choice == "3":
        print("\n🛒 Grocery List:")
        for i, item in enumerate(grocery_list, 1):
            print(f"{i}. {item}")
    elif choice == "4":
        print("👋 Goodbye!")
        break
    else:
        print("❌ Invalid option.")
