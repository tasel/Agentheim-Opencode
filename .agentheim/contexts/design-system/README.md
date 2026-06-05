# contexts/design-system/

Purpose: Frontend design system (tokens, components, patterns)

All frontend BCs share this design system.

## Ubiquitous language

- **tokens:** design tokens (colors, spacing, typography)
- **components:** UI components (buttons, inputs, cards, etc.)
- **patterns:** patterns (layouts, flows, interactions)

## Todo Gate

All frontend tasks must `depends_on` `contexts/design-system/todo/design-system-XXX-styleguide.md`

This gate applies only to frontend BCs. CLI BCs skip this gate.

## Infra Note

This BC owns the design system. No network, no DB, no runtime. Just design tokens, components, and patterns.