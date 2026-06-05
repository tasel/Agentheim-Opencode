---
id: calculator-0003
title: Tax rate display (19%)
status: backlog
type: feature
context: calculator
created: 2026-06-05
priority: high
due_date: 2026-06-07
depends_on:
- calculator-0002
---

## Why
Currently, the system doesn't display TAX RATE (19%). This will be a new responsibility in OutputFormatter to show the constant tax rate as part of the output.

## What
This task displays the TAX RATE (19%) in the output format. It's a display-only responsibility that adds the tax rate to the format string.

## Acceptance criteria
- [ ] Adds `TAX RATE: 19%` line to the output string
- [ ] Does not calculate tax (calculation is separate responsibility)
- [ ] Does not affect existing order value calculation logic
- [ ] Output format: `QUANTITY\nPRICE\nORDER VALUE\nTAX RATE: 19%`
- [ ] Modify only OutputFormatter.java to add tax rate line
- [ ] Test with various inputs to ensure rate displays regardless of values
- [ ] Tax rate is hardcoded to 19% (no change needed for now)

## Notes
This is a display-only addition. The tax rate is a constant (19%) in the requirements. The code change is minimal: modify OutputFormatter.format() to include the tax rate line.

Implementation approach:
- Modify OutputFormatter.java format() method
- Add `+ "TAX RATE: 19%\n"` to the return statement after existing formatting
- Update caller (CalculatorMain) to pass required values (if needed) or hardcode in formatter
