# import random

# responses = ["Yes", "No", "Maybe", "Ask again", "Definitely", "I don't think so"]

# question = input("Ask your question: ")
# answer = random.choice(responses)
# print("Magic 8 Ball says:", answer)

import random

responses = [
    "Yes, definitely.",
    "No way!",
    "Ask again later.",
    "It is certain.",
    "I don't think so.",
    "Absolutely!",
    "Not sure, maybe."
]

print("Welcome to the Magic 8 Ball!")
while True:
    question = input("\nAsk a yes/no question (or type 'exit' to quit): ")
    if question.lower() == "exit":
        print("Goodbye!")
        break
    else:
        print("Magic 8 Ball says:", random.choice(responses))
