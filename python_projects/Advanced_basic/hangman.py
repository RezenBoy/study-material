import random

words = ['python', 'programming', 'hangman', 'challenge', 'student']
word = random.choice(words)
guessed = ['_'] * len(word)
tries = 6
guessed_letters = []

print("🕹️ Welcome to Hangman!")

while tries > 0 and '_' in guessed:
    print("\nWord:", ' '.join(guessed))
    print(f"Tries left: {tries}")
    guess = input("Guess a letter: ").lower()

    if guess in guessed_letters:
        print("⚠️ You already guessed that letter.")
        continue
    guessed_letters.append(guess)

    if guess in word:
        for i in range(len(word)):
            if word[i] == guess:
                guessed[i] = guess
        print("✅ Correct!")
    else:
        tries -= 1
        print("❌ Incorrect!")

if '_' not in guessed:
    print(f"\n🎉 Congratulations! You guessed the word: {word}")
else:
    print(f"\n💀 You ran out of tries. The word was: {word}")
