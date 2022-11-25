import openai

PROMPT = """
#/usr/bin/env python3
# Write a program with numpy and scikit-learn
"""



# get rest of the prompt from command line
import sys
code = sys.argv[1]

PROMPT += "#".join(code.split("\n"))

openai.api_key = ""
print(PROMPT)
response = openai.Completion.create(
    engine="code-davinci-002",
    prompt=PROMPT,
    temperature=0.2,
    max_tokens=200,
    top_p=0.95,
    n=1
)

print(response.choices[0].text)