# import random

# number = random.randint(1, 10)
# guess = int(input("Guess a number between 1 and 10: "))

# if guess == number:
#     print("Correct! You guessed it!")
# else:
#     print(f"Wrong! The number was {number}.")


import random

number = random.randint(1, 20)
attempts = 5

print("Guess a number between 1 and 20. You have 5 attempts.")

while attempts > 0:
    guess = int(input("Enter your guess: "))

    if guess == number:
        print("🎉 Correct! You guessed it!")
        break
    elif guess < number:
        print("Too low! Try again.")
    else:
        print("Too high! Try again.")

    attempts -= 1

if attempts == 0:
    print(f"Game over! The number was {number}.")
