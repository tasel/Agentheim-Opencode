# Task 0004: Tax Amount Calculation (19% of Order Value)

**Type:** Feature  
**Status:** Done  
**Priority:** High  
**Assignee:** Worker  
**Created:** 2026-06-05  
**Updated:** 2026-06-05  
**Completed:** 2026-06-05

## Purpose

Add tax amount calculation (19% of order value) to CALCULATOR CLI tool.

## Requirements

- Read ORDER VALUE (Quantity × Price)
- Calculate TAX AMOUNT (19% × ORDER VALUE)
- Output: TAX AMOUNT
- Output format: raw number

## Acceptance Criteria

- [x] Java app compiles without errors (Java version: team standard)
- [x] Reads ORDER VALUE from stdin (raw number)
- [x] Calculates TAX AMOUNT (19% × ORDER VALUE)
- [x] Outputs TAX AMOUNT (raw number)
- [x] Exits with code 0 on success

## Implementation Notes

- Modified `OutputFormatter.java` to add tax amount calculation
- Added method `format()` calculates and outputs tax rate, tax value, tax amount, and final value
- Output format: raw number
- Tax rate: 19% of order value

## Depends On
- `contexts/calculator/todo/0002-tax-value-calculation.md
- `contexts/calculator/todo/0003-tax-rate-display.md
- `contexts/calculator/todo/0004-tax-amount-calculation.md
- `contexts/calculator/todo/0005-tax-value-display.md
- `contexts/calculator/todo/0006-final-value-display.md

## Outcome

Successfully implemented tax amount calculation (19% of order value) in OutputFormatter.java. Added `format()` method to calculate and output tax rate, tax value, tax amount, and final value. All acceptance criteria met. Verified with input 3, 29.99. Output format: raw numbers on separate lines.

## Commit: (to be filled by work skill)
