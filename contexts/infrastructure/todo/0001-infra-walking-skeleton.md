# Task 0001: Walking Skeleton - CALCULATOR CLI

- status: ready
- type: spike
- priority: high
- owner: worker
- created: 2026-06-05
- updated: 2026-06-05
- due: soon

## Why
CALCULATOR is a simple stdin-based CLI tool that reads Quantity and Price, computes the product, and outputs the ORDER VALUE. We need a walking skeleton to establish the project's foundations:

- Input: QUANTITY on first line, PRICE on second line
- Output: Display QUANTITY, PRICE, and ORDER VALUE (QUANTITY × PRICE)
- Single run: processes input once, then exits (no loop)
- Setup: One-time setup (e.g., alias, shell command)
- No persistence, no UI, no integration.
- No special error handling beyond team standards (the vision states: "Team-Standards folgen Team-Kompetenz")
- Language: Team standard programming language (choose one that fits team expertise, prioritize simplicity, minimal setup, and standard library support for stdin processing.
- Output format: The output should be clearly formatted: Quantity, Price, and Order Value on separate lines.

## What
Create a minimal implementation of CALCULATOR that validates the input, performs the calculation, and outputs the result in a simple readable format.

### Implementation steps:
1. Create a simple command-line script in a team-standard language (e.g., Python, Bash, Node.js).
2. Read the first line from STDIN for Quantity, second line for Price.
3. Calculate ORDER VALUE = Quantity × Price.
4. Output the result on separate lines: QUANTITY, PRICE, ORDER VALUE.
5. Exit on completion (no error handling, no retry. The vision states: "Keine Fehlerbehandlung für ungültige Eingaben (Team-Standard folgen Team-Kompetenz)"
6. Setup: Create a shell alias or simple shell script wrapper for calling CALCULATOR with one argument.

## Acceptance criteria
- The CALCULATOR script reads the first line from STDIN for Quantity and the second line for Price.
- The CALCULATOR calculates ORDER VALUE = Quantity × Price and prints QUANTITY, PRICE, and ORDER VALUE.
- The CALCULATOR runs once (no loop, no restarts, no user interaction between runs). Each run is independent.
- The CALCULATOR works with team-standard languages (Python, Bash, Node.js, etc.). We prefer Python or Node.js (simpler, better standard library support).
- The CALCULATOR does not persist any data (no database, no file storage, no logging).
- The CALCULATOR can be called with an alias in the shell, e.g., "calc" or "calcquantic".
- The CALCULATOR should have a simple command interface: the user types "calc", enters Quantity and Price, and sees the result.

## Notes
- Team-Standards: The team should use the same language as the rest of the project (e.g., Python).
- Team-Kompetenz: The team should be familiar with the language chosen (e.g., Python).
- Simple command line interface: The user should be able to run CALCULATOR without any configuration (e.g., alias, shell command).
- No persistence: The CALCULATOR does not save any data (e.g., no database, no file storage).
- No error handling: The vision states "Keine Fehlerbehandlung für ungültige Eingaben (Team-Kompetenz)". This means that the user should be able to run CALCULATOR without any error handling (e.g., no explicit error handling, no error messages).
- No specific error handling: The team should be able to run CALCULATOR without any error handling (e.g., no error messages).
- No logging: No logging, no extra files created, no persistence.

## Depends on:
- Architectural decision ADR 0001: Choice of team standard language for stdin-based CLI tool.

## Related research:
- N/A (choose the simplest possible option: Python with `input()` for stdin, or Bash with `read`/`$(( ))`).