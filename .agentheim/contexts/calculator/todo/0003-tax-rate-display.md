# Task 0003: Tax Rate Display (19%)

**Type:** Feature  
**Status:** Done  
**Priority:** High  
**Assignee:** Worker  
**Created:** 2026-06-05  
**Updated:** 2026-06-05  
**Completed:** 2026-06-05

## Purpose

Add tax rate display (19%) to CALCULATOR CLI tool.

## Requirements

- Read ORDER VALUE (Quantity × Price)
- Calculate TAX RATE (19%)
- Output: TAX RATE
- Output format: raw number

## Acceptance Criteria

- [x] Java app compiles without errors (Java version: team standard)
- [x] Reads ORDER VALUE from stdin (raw number)
- [x] Calculates TAX RATE (19%)
- [x] Outputs TAX RATE (raw number)
- [x] Exits with code 0 on success

## Implementation Notes

- Modified `OutputFormatter.java` to add tax rate display
- Output format: raw number
- Tax rate: 19%
- Tax value: same as order value
- Tax amount: 19% of order value
- Final value: order value + tax amount

## Depends On
- `contexts/calculator/todo/0002-tax-value-calculation.md
- `contexts/calculator/todo/0003-tax-rate-display.md
- `contexts/calculator/todo/0004-tax-amount-calculation.md
- `contexts/calculator/todo/0005-tax-value-display.md
- `contexts/calculator/todo/0006-final-value-display.md

## Outcome

Successfully implemented tax rate display (19%) in OutputFormatter.java. Added tax rate calculation and display. All acceptance criteria met. Verified with input 3, 29.99. Output format: raw numbers on separate lines.

## Commit: (to be filled by work skill)
