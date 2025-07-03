def quiz_game():
    questions = {
        "What is the capital of France?": "Paris",
        "Which planet is known as the Red Planet?": "Mars",
        "What is 5 + 7?": "12",
        "Which language is used to write Python programs?": "English",
    }

    score = 0

    for q, a in questions.items():
        user_answer = input(q + " ")
        if user_answer.strip().lower() == a.lower():
            print("✅ Correct!\n")
            score += 1
        else:
            print(f"Incorrect. The answer was {a}\n")

    print(f"You scored {score}/{len(questions)}")

quiz_game()
