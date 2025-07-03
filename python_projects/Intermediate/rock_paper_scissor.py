import random

choices = ['rock', 'paper', 'scissors']
player_score = 0
computer_score = 0

print("Welcome to Rock, Paper, Scissors!")
while True:
    player = input("\nChoose Rock, Paper or Scissors (or type 'exit' to quit): ").lower()
    if player == 'exit':
        break
    if player not in choices:
        print("Invalid choice!")
        continue

    computer = random.choice(choices)
    print("Computer chose:", computer)

    if player == computer:
        print("🤝 It's a tie!")
    elif (player == "rock" and computer == "scissors") or \
         (player == "paper" and computer == "rock") or \
         (player == "scissors" and computer == "paper"):
        print("🎉 You win!")
        player_score += 1
    else:
        print("💻 Computer wins!")
        computer_score += 1

    print(f"Score: You {player_score} - {computer_score} Computer")
