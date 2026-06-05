---
id: calculator-0006
title: Final value display (ORDER VALUE + TAX AMOUNT)
status: backlog
type: feature
created: 2026-06-05
priority: high
due_date: 2026-06-07
depends_on:
- calculator-0002
- calculator-0004
---

## Why
The existing backlog has overlapping tasks that claim to do the same thing. Final value display is a distinct responsibility that should be separate from calculation.

## What
This task displays the FINAL VALUE in the output format. FINAL VALUE = ORDER VALUE + TAX AMOUNT (ORDER VALUE + (ORDER VALUE × 0.19)). This is a display-only responsibility (display "FINAL VALUE: <FINAL VALUE>).

## Acceptance criteria
- [ ] Displays `FINAL VALUE: <value>` line in the output string (FINAL VALUE = ORDER VALUE + TAX AMOUNT)
- [ ] Does not calculate FINAL VALUE (calculation is separate responsibility)
- [ ] Does not affect existing order value calculation logic (takes ORDER VALUE and TAX AMOUNT as inputs)
- [ ] Does not modify PriceCalculator.java
- [ ] Does not modify OutputFormatter.java
- [ ] Does not modify InputParser.java
- [ ] Does not modify CalculatorMain.java
- [ ] Does not read from stdin
- [ ] Does not write to stdout
- [ ] Does not calculate ORDER VALUE (separate responsibility)
- [ ] Does not calculate TAX AMOUNT (separate responsibility)
- [ ] Does not calculate ORDER VALUE × 0.19 (separate responsibility)
- [ ] Does not modify PriceCalculator.calculateOrderValue()
- [ ] Does not modify OutputFormatter.format()
- [ ] Does not modify InputParser.parse()
- [ Does not modify PriceCalculator.java
- [ Does not modify OutputFormatter.java
- [ Does not modify InputParser.java
- [ Does not modify CalculatorMain.java

## Notes
This is a display-only addition. The final value is displayed as the value of ORDER VALUE + TAX AMOUNT. The code change is minimal: modify OutputFormatter.format() to include the final value line. The values passed to OutputFormatter are ORDER VALUE and TAX AMOUNT. This task adds the line "FINAL VALUE: <ORDER VALUE + TAX AMOUNT>" to the output format.

Implementation approach:
- Modify OutputFormatter.java format() method
- Add `+ "FINAL VALUE: <ORDER VALUE + TAX AMOUNT>\n"` to the return statement after existing formatting
- Update caller (CalculatorMain) to pass required values (if needed) or hardcode in formatter
