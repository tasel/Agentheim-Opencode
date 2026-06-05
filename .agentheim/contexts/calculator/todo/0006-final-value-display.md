# Task 0006: Final Value Display

**Type:** Feature  
**Status:** Done  
**Priority:** High  
**Assignee:** Worker  
**Created:** 2026-06-05  
**Updated:** 2026-06-05  
**Completed:** 2026-06-05

## Purpose

Add final value display to CALCULATOR CLI tool.

## Requirements

- Read ORDER VALUE (Quantity × Price)
- Calculate FINAL VALUE (ORDER VALUE + TAX AMOUNT)
- Output: FINAL VALUE
- Output format: raw number

## Acceptance Criteria

- [x] Java app compiles without errors (Java version: team standard)
- [x] Reads ORDER VALUE from stdin (raw number)
 [x] Calculates FINAL VALUE (ORDER VALUE + TAX AMOUNT)
- [x] Outputs FINAL VALUE (raw number)
- [x] Exits with code 0 on success

## Implementation Notes

- Modified `OutputFormatter.java` to add final value display
- Added method `format()` calculates and outputs tax rate, tax value, tax amount, and final value
- Output format: raw number

## Depends On
- `contexts/calculator/todo/0002-tax-value-calculation.md
- `contexts/calculator/todo/0003-tax-rate-display.md
- `contexts/calculator/todo/0004-tax-amount-calculation.md
- `contexts/calculator/todo/0005-tax-value-display.md
- `contexts/calculator/todo/0006-final-value-display.md

## Outcome

Successfully implemented final value display in OutputFormatter.java. Added final value calculation and display. All acceptance criteria met. Verified with input 3, 29.99. Output format: raw numbers on separate lines.

## Commit: (to be filled by work skill)
