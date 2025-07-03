def print_board(board):
    print()
    for row in board:
        print(" | ".join(row))
        print("-" * 5)

def check_winner(board):
    # Check rows, cols and diagonals
    for i in range(3):
        if board[i][0] == board[i][1] == board[i][2] != " ":
            return True
        if board[0][i] == board[1][i] == board[2][i] != " ":
            return True
    if board[0][0] == board[1][1] == board[2][2] != " ":
        return True
    if board[0][2] == board[1][1] == board[2][0] != " ":
        return True
    return False

board = [[" "]*3 for _ in range(3)]
turn = "X"
moves = 0

print("⭕❌ Welcome to Tic-Tac-Toe!")

while moves < 9:
    print_board(board)
    row = int(input(f"{turn}'s turn - Enter row (0-2): "))
    col = int(input("Enter column (0-2): "))

    if board[row][col] == " ":
        board[row][col] = turn
        moves += 1

        if check_winner(board):
            print_board(board)
            print(f"🎉 {turn} wins!")
            break

        turn = "O" if turn == "X" else "X"
    else:
        print("❌ Cell already taken!")

if moves == 9 and not check_winner(board):
    print_board(board)
    print("😐 It's a draw!")
