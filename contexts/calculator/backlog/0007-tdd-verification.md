---
id: calculator-0007
title: TDD verification of tax calculation flow
status: backlog
type: feature
created: 2026-06-05
priority: high
due_date: 2026-06-07
depends_on:
- calculator-0002
- calculator-0003
- calculator-0004
- calculator-0005
- calculator-0006
---

## Why
The existing backlog has overlapping tasks that claim to do the same thing. TDD verification is a distinct responsibility that should be separate from the individual tasks.

## What
This task verifies the complete tax calculation flow. It verifies that:
- ORDER VALUE = Quantity × Price
- TAX RATE = 19%
- TAX AMOUNT = ORDER VALUE × 0.19
- TAX VALUE = ORDER VALUE (displayed as TAX VALUE)
- FINAL VALUE = ORDER VALUE + TAX AMOUNT
and the output format matches the specification.

## Acceptance criteria
- [ ] Verifies ORDER VALUE = Quantity × Price
- [ ] Verifies TAX RATE = 19%
- [ ] Verifies TAX AMOUNT = ORDER VALUE × 0.19
- [ ] Verifies TAX VALUE = ORDER VALUE (displayed as TAX VALUE)
- [ ] Verifies FINAL VALUE = ORDER VALUE + TAX AMOUNT
- [ ] Verifies output format: ORDER VALUE\nTAX RATE\nTAX VALUE\nFINAL VALUE
- [ ] Verifies all calculations are correct and produce expected results
- [ ] Verifies output format matches the specification
- [ ] Verifies all values are formatted with appropriate precision

## Notes
This is a verification task that verifies the complete tax calculation flow. The task verifies that all calculations are correct and produce expected results. The task verifies that output format matches the specification. The task verifies that all values are formatted with appropriate precision. The task verifies that the output format is correct. The task verifies that the output format is: ORDER VALUE\nTAX RATE\nTAX VALUE\nFINAL VALUE.

Implementation approach:
- Verify ORDER VALUE = Quantity × Price (PriceCalculator.java)
- Verify TAX RATE = 19% (OutputFormatter.java)
- Verify TAX AMOUNT = ORDER VALUE × 0.19 (PriceCalculator.java)
- Verify TAX VALUE = ORDER VALUE (OutputFormatter.java)
- Verify FINAL VALUE = ORDER VALUE + TAX AMOUNT (PriceCalculator.java)
- Verify output format: ORDER VALUE\nTAX RATE\nTAX VALUE\nFINAL VALUE (OutputFormatter.java)
- Verify all values are formatted with appropriate precision (OutputFormatter.java)
- Verify the output format is correct (OutputFormatter.java)
- Verify the output format is: ORDER VALUE\nTAX RATE\nTAX VALUE\nFINAL VALUE (OutputFormatter.java)
- Verify all values are formatted with appropriate precision (OutputFormatter.java)
- Verify the output format is correct (OutputFormatter.java)
- Verify the output format is: ORDER VALUE\nTAX RATE\nTAX VALUE\nFINAL VALUE (OutputFormatter.java)
- Verify the output format is correct (OutputFormatter.java)
