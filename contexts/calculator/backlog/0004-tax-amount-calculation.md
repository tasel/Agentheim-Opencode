---
id: calculator-0004
title: Tax amount calculation (19% of ORDER VALUE)
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
The existing backlog has overlapping tasks that claim to do the same thing. Tax amount calculation is a distinct responsibility that should be separate from display.

## What
This task calculates only the TAX AMOUNT by computing 19% of ORDER VALUE. It does not handle display or final value.

## Acceptance criteria
- [ ] Takes ORDER VALUE as input (from PriceCalculator.calculateOrderValue())
- [ ] Computes TAX AMOUNT = ORDER VALUE × 0.19
- [ ] Does not affect ORDER VALUE
- [ ] Does not handle display (separate responsibility)
- [ ] Returns TAX AMOUNT as a double value to the caller (will be used in calculator flow)
- [ ] Does not modify InputParser.java, OutputFormatter.java (input/output are separate responsibilities)
- [ ] Does not read from stdin (input is provided value)
- [ ] Does not modify PriceCalculator.calculateOrderValue() (calculates order value first, then tax amount)
- [ ] Does not calculate ORDER VALUE (takes ORDER VALUE as input, uses PriceCalculator.calculateOrderValue() to get ORDER VALUE)

## Notes
This is a distinct responsibility from ORDER VALUE (Quantity × Price) and TAX RATE (display of 19% constant). Tax amount calculation is ORDER VALUE × 0.19. Code changes needed in PriceCalculator.java to add calculateTaxAmount() method.

Implementation approach:
- Add calculateTaxAmount(orderValue) method in PriceCalculator.java
- Implementation: return orderValue * 0.19;
- Update CalculatorMain to call this new method and use value.
- Verify with test: ORDER_VALUE = 100 → TAX_AMOUNT should be 19.0
