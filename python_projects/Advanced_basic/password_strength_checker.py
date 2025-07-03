import string

def check_strength(password):
    strength = 0
    if len(password) >= 8:
        strength += 1
    if any(c.isdigit() for c in password):
        strength += 1
    if any(c in string.ascii_uppercase for c in password):
        strength += 1
    if any(c in string.punctuation for c in password):
        strength += 1

    print("\n🔍 Password analysis:")
    if strength == 4:
        print("🟢 Strong Password")
    elif strength == 3:
        print("🟡 Moderate Password")
    else:
        print("🔴 Weak Password")

password = input("Enter a password to check: ")
check_strength(password)
