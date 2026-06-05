---
id: calculator-0005
title: Tax value display (TAX RATE × TAX VALUE)
status: backlog
type: feature
created: 2026-06-05
priority: high
due_date: 2026-06-07
depends_on:
- calculator-0004
---

## Why
The existing backlog has overlapping tasks that claim to do the same thing. Tax value display is a distinct responsibility that should be separate from calculation.

## What
This task displays the TAX VALUE in the output format. TAX VALUE = TAX RATE × TAX VALUE (19% × TAX VALUE). The requirement states "TAX VALUE: <value> (equal to ORDER VALUE) - this means the displayed value is the same as ORDER VALUE. The formula in the requirements is confusing - clarify that the displayed value is the same as ORDER VALUE (not 19% × ORDER VALUE, which would be TAX AMOUNT). The task displays ORDER VALUE as TAX VALUE. This is a display-only responsibility (display "TAX VALUE: <ORDER VALUE>").

## Acceptance criteria
- [ ] Displays `TAX VALUE: <value>` line in the output string (same value as ORDER VALUE)
- [ ] Does not calculate tax (calculation is separate responsibility)
- [ ] Does not affect existing order value calculation logic (takes ORDER VALUE as input)
- [ ] Does not modify PriceCalculator.java
- [ ] Does not modify OutputFormatter.java
- [ ] Does not modify InputParser.java
- [ ] Does not modify CalculatorMain.java
- [ ] Does not read from stdin
- [ ] Does not write to stdout
- [ ] Does not calculate ORDER VALUE (separate responsibility)
- [ ] Does not calculate TAX RATE (separate responsibility)
- [ ] Does not calculate TAX AMOUNT (separate responsibility)
- [ ] Does not modify PriceCalculator.calculateOrderValue()
- [ ] Does not modify OutputFormatter.format()
- [ ] Does not modify InputParser.parse()
- [ ] Does not modify CalculatorMain.main()
- [ ] Does not modify PriceCalculator.java
- [ ] Does not modify OutputFormatter.java
- [ ] Does not modify InputParser.java
- [ ] Does not modify CalculatorMain.java

## Notes
This is a display-only addition. The tax value is displayed as the same value as ORDER VALUE. The code change is minimal: modify OutputFormatter.format() to include the tax value line. The value passed to OutputFormatter is ORDER VALUE (which equals TAX VALUE per requirements). This task adds the line "TAX VALUE: <ORDER VALUE>" to the output format.

Implementation approach:
- Modify OutputFormatter.java format() method
- Add `+ "TAX VALUE: <ORDER VALUE>\n"` to the return statement after existing formatting
- Update caller (CalculatorMain) to pass required values (if needed) or hardcode in formatter