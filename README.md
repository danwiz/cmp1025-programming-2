# CMP1025 — Programming 2

Governed Java 21 instructional repository for CMP1025 Programming 2.

## Release baseline

- Java 21 LTS
- Maven
- Four-layer architecture: presentation, application, domain, infrastructure
- JUnit 5, AssertJ, Mockito and ArchUnit
- JaCoCo, Spotless, Checkstyle and SpotBugs
- GitHub Actions CI, CodeQL and release-evidence workflows
- Architecture diagrams, ADR index, LMS traceability and release manifest

## Build

```bash
mvn -B verify
```

## Run

```bash
java -cp target/classes com.wisdom.cmp1025.presentation.ConsoleApplication
```

Expected output:

```text
2.50
```

## Governance

Architecture and tooling decisions are governed by ADR-001 through ADR-008. Release `0.9.0` is the first executable instructional baseline.
