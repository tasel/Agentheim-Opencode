---
id: calculator-0002
title: Order value calculation
status: backlog
type: feature
context: calculator
created: 2026-06-05
priority: high
due_date: 2026-06-07
depends_on: []
---

## Why
The existing backlog has overlapping tasks that claim to do the same thing. Each calculation should be a distinct responsibility to ensure maintainability and testability.

## What
This task calculates only the ORDER VALUE by multiplying QUANTITY and PRICE. It does not handle display, tax calculation, or final value.

## Acceptance criteria
- [ ] Reads QUANTITY from first line of stdin (raw number)
- [ ] Reads PRICE from second line of stdin (raw number)
- [ ] Computes ORDER VALUE = QUANTITY × PRICE
- [ ] Does not modify InputParser.java, PriceCalculator.java, OutputFormatter.java (already implement these responsibilities)
- [ ] Returns ORDER VALUE as a double value to the caller (CalculatorMain will handle output format)

## Notes
Current code already implements this in PriceCalculator.calculateOrderValue(); move task to todo if it passes verification. This task focuses solely on order value calculation without tax logic.
