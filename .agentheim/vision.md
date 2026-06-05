# Vision: CALCULATOR

## Purpose
CALCULATOR ist ein einfacher Preiskalkulator für Mitarbeitende, der über STDIN aufgerufen wird. Er berechnet den Wert einer Bestellung aus Stückzahl und Stückpreis als Single-Use-Tool ohne Extra-Lernkurve.

## Users
Mitarbeitende im Unternehmen, die schnell und ohne Kommandozeilen-Expertise einen einfachen Preis berechnen müssen.

## The problem
Aktuell fehlt ein sofort verfügbares Tool für einfache Preisberechnungen. Mitarbeitende brauchen kein volles Kalkulationssystem — sie wollen nur schnell Quantity × Price berechnen, ohne sich in komplexe Systeme einzuarbeiten.

## What success looks like
- Ein Mitarbeitender ruft CALCULATOR auf, gibt Quantity und Price ein und erhält innerhalb von Sekunden das Ergebnis.
- Die Eingabe ist intuitiv: Erste Zeile Quantity, zweite Zeile Price.
- Der Kalkulator läuft lokal, ist sofort verfügbar und erfordert keine Setup-Komplexität.

## Non-goals
- Keine interaktive Schleife (ein Durchlauf pro Aufruf).
- Keine Speicherung von Eingaben oder Ergebnissen.
- Keine Unterstützung für Einheiten, Rabatte, Steuern oder komplexe Formeln.
- Keine Weboberfläche oder Desktop-App — rein STDIN-CLI-Tool.
- Keine Fehlerbehandlung für ungültige Eingaben (Team-Standards folgen Team-Kompetenz).

## Ubiquitous language (seed)
- **QUANTITY:** Ganzzahl (oder Dezimalzahl) für Stückzahl.
- **PRICE:** Dezimalzahl für Preis pro Stück.
- **ORDER VALUE:** Ergebnis der Multiplikation QUANTITY × PRICE.

## Open questions
- Welche Sprache wird gewählt, um die einfache Berechnung umzusetzen?
- Wie wird das Tool installiert oder aufgerufen? (Alias in Shell? Python-Modul? JAR-File?
- Sollt das Team die Sprache wählen oder wird eine Standardeinstellung definiert? (Team-Standards: Python, Bash, Node.js (CLI), etc.)