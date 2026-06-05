# contexts/infrastructure/

Purpose: Globally-true infrastructure concerns (runtime, hosting, secrets, observability, CI/CD, shared transport, etc.)

All BCs emit infra concerns into this BC.

## Ubiquitous language

- **runtime:** execution environment (Java version, OS, etc.)
- **secrets:** sensitive data (API keys, passwords, tokens)
- **observability:** metrics, logs, traces
- **CI/CD:** continuous integration, continuous deployment
- **shared transport:** network transport (HTTP, gRPC, queues)