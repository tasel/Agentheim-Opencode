# contexts/calculator/

Purpose: CALCULATOR domain (stdin-based price calculation tool)

All domain concerns for the price calculator (Quantity, Price, ORDER VALUE) live here.

## Ubiquitous language

- **QUANTITY:** Ganzzahl (oder Dezimalzahl) für Stückzahl.
- **PRICE:** Dezimalzahl für Preis pro Stück.
- **ORDER VALUE:** Ergebnis der Multiplikation QUANTITY × PRICE.

## Infra Note

This BC owns its own local CLI entry point (`CalculatorMain.java`). No shared transport, no network, no DB.

## Todo Gate: Styleguide

All frontend tasks must `depends_on` `contexts/design-system/todo/design-system-XXX-styleguide.md`

This BC has no frontend — the tool is a CLI with single stdin/stdout. Skip the styleguide gate.

## ADRs

Any domain ADRs go here.

## BC Local Infra

The CLI entry point (`CalculatorMain.java`) is this BC's own infrastructure. No shared infra beyond the local runtime.