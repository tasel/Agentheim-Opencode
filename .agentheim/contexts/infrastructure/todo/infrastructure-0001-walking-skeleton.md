# Walking Skeleton for CALCULATOR

**Type:** Spike
**Status:** Proposed
**Priority:** High
**Assignee:** Architect
**Created:** 2026-06-05
**Updated:** 2026-06-05
**Due Date:** 2026-06-06

## Purpose

This task builds the minimal end-to-end walking skeleton for CALCULATOR: a single Java main class (`CalculatorMain.java`) that reads two lines from stdin, calculates the product, and prints the result to stdout.

## Acceptance Criteria

- [ ] The app boots without errors
- [ ] It reads `QUANTITY: 3` and `PRICE: 29.99` from stdin
- [ ] It calculates `ORDER VALUE: 59.97
- [ ] It prints `QUANTITY: 3`, `PRICE: 29.99`, `ORDER VALUE: 59.97` to stdout
- [ ] It exits with code 0

## Notes

- Create `CalculatorMain.java` in `src/main/java/`
- Package-private helper classes: `InputParser`, `PriceCalculator`, `OutputFormatter`
- Minimal dependencies: `java.util.Scanner`, `System.out`, `System.err`

## Depends On

N/A (no upstream dependencies, infrastructure foundation is trivial)