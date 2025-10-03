# A Domain-specific Language for the IUPAC nomenclature – Xtext project

This repository contains an example project for developing a **Domain-specific Language (DSL)** using [Xtext](https://www.eclipse.org/Xtext/).  
It is based on the book *Domain-Specific Languages: Effective Modeling, Automation, and Reuse* by Wąsowski & Berger (2023) and the accompanying **Xtext tutorial**.

## What this DSL is about

The DSL in this project models a subset of the **IUPAC nomenclature**.  
Its purpose is to encode **organic molecules** (chains and branches of carbon atoms) into structured names following IUPAC rules.

- **Chains** represent the main carbon backbone (e.g., *Butan*, *Heptan*).  
- **Branches** represent substituents attached to the chain (e.g., *Methyl*, *Ethyl*).  
- **Prefixes** (Mono, Di, Tri, Tetra) describe multiple branches of the same type.  
- **Positions** indicate where branches are attached to the chain.

For example:  
```
4-MonoEthyl-2,3-DiMethylHeptan
```
This represents a 7-carbon chain (*Heptan*) with one ethyl branch at position 4 and two methyl branches at positions 2 and 3.

The DSL supports:
- Syntax checking of IUPAC names  
- Semantic validation rules (e.g., branch names must be sorted alphabetically, prefix counts must match positions)  
- A generated editor with syntax highlighting, code completion, and error feedback

## Contents

- **Xtext Grammar** - Defines the concrete textual syntax for the IUPAC DSL
- **Ecore Model** - Represents the abstract syntax/metamodel of molecules
- **Generated Editor** - Provides a text editor for writing molecule descriptions with autocomplete and validation
- **OCL Constraints** - Add static semantic checks (e.g., branch names cannot be identical)
- **Use Cases** - Validation and categorization/grouping of IUPAC names

---

## Requirements

- **Java 17** or newer
- **Gradle 7.5+** (included via Gradle Wrapper)
- **Eclipse Modeling Tools** (optional - only needed for model/grammar changes)
  - [Download Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/)
  - **OCL Plugin**: `Help → Install New Software` → `https://download.eclipse.org/modeling/mdt/ocl/builds/release/6.20.0`
  - **Xtext SDK**: `Help → Install New Software` → `https://download.eclipse.org/releases/2021-09/` → Search for "Xtext"

---

## Quick Start

### 1. Clone and Build

```bash
git clone https://github.com/Masu98s/Dsldesign.git
cd Dsldesign

# Build everything
./gradlew build          # Linux/Mac
.\gradlew.bat build      # Windows
```

This automatically:
- Downloads all dependencies
- Generates EMF model code from `iupac.genmodel`
- Generates Xtext parser from `MyDsl.xtext`
- Compiles all Java sources

### 2. Parse IUPAC Files

Create a file `examples/test.iupac`:
```
2-MonoMethylButan
3-EthylHexan
```

Parse it:
```bash
.\gradlew.bat :dsldesign.iupac.xtext:parseIupac "-Pfile=examples/test.iupac"
```
**Note:** If the relative path doesn't work (PowerShell path issues), use the full absolute path:
```bash
.\gradlew.bat :dsldesign.iupac.xtext:parseIupac "-Pfile=C:\full\path\to\examples\test.iupac"
```

Output:
```
Valid IUPAC file
Chains: 2
  - 2-MonoMethylButan
  - 3-EthylHexan
```

---

## Project Structure

```
Dsldesign/
├── buildSrc/              # Custom Gradle tasks for code generation
├── deps-emf/              # EMF dependency configuration
├── deps-xtext/            # Xtext dependency configuration
├── dsldesign.iupac/       # EMF Ecore metamodel
│   ├── model/
│   │   ├── iupac.ecore    # Ecore metamodel definition
│   │   └── iupac.genmodel # EMF generator model
│   ├── src/               # Handwritten Java code
│   └── src-gen/           # Generated EMF code (not in Git)
├── dsldesign.iupac.xtext/ # Xtext grammar and language definition
│   ├── src/
│   │   └── org/xtext/example/mydsl/
│   │       ├── MyDsl.xtext           # Xtext grammar
│   │       └── GenerateMyDsl.mwe2    # MWE2 workflow
│   ├── src-gen/           # Generated Xtext infrastructure (not in Git)
│   └── build.gradle
├── examples/              # Sample .iupac files
├── web-editor/            # Optional web-based editor
├── build.gradle           # Root build configuration
├── settings.gradle        # Multi-project setup
└── README.md
```

---

## Usage

### Command-Line Parser

The Gradle-based parser validates IUPAC syntax:

```bash
.\gradlew.bat :dsldesign.iupac.xtext:parseIupac "-Pfile=path/to/file.iupac"
```

**Features:**
- Syntax validation
- Chain detection and listing
- Parse error reporting

**Limitations:**
- No OCL constraint validation (Eclipse-only feature)

### Web Editor

Open `web-editor/iupac-editor.html` in a browser for a Monaco-based editor with:
- Syntax highlighting (numbers, keywords, delimiters)
- Live parsing and validation
- Chain detection panel
- Save/load functionality
- Command-line integration hints

**No installation required** - works completely in the browser.

### Eclipse IDE (Optional)

For detailed Eclipse integration and the complete Xtext tutorial workflow, refer to the **Xtext tutorial PDF** from the book *Domain-Specific Languages* by Wąsowski & Berger.

**Basic Eclipse Usage:**
- Launch Runtime: Right-click `dsldesign.iupac.xtext` → `Run As → Eclipse Application`
- This opens a new Eclipse with your DSL editor installed
- Create `.iupac` files with syntax highlighting and auto-completion

**Note:** The Gradle-based workflow (described in this README) is the recommended approach for this project setup. For Eclipse-specific development patterns, consult the tutorial PDF.

---

## Development Workflow

### Ecore Model Changes

1. **Edit the model:**
   - Modify `dsldesign.iupac/model/iupac.ecore`

2. **Regenerate model code:**
   ```bash
   .\gradlew.bat :dsldesign.iupac:iupacModelCode
   ```

3. **Build:**
   ```bash
   .\gradlew.bat build
   ```

### Xtext Grammar Changes

1. **Edit the grammar:**
   - Open `dsldesign.iupac.xtext/src/org/xtext/example/mydsl/MyDsl.xtext`
   - Make your changes in any text editor

2. **Regenerate parser infrastructure:**
   ```bash
   .\gradlew.bat :dsldesign.iupac.xtext:generateXtextLanguage
   ```

3. **Build:**
   ```bash
   .\gradlew.bat clean build
   ```

### Normal Code Changes

```bash
# Edit Java code
# Then build:
.\gradlew.bat build
```

---

**For Eclipse-based workflow:** Refer to the [Xtext_Tutorial.pdf](https://github.com/Masu98s/Dsldesign/blob/main/Xtext_Tutorial.pdf) from this repository.

---

## Troubleshooting


**Parse Error: "loop did not match anything"**
- Ensure your `.iupac` file contains at least one valid chain
- Check grammar syntax in `MyDsl.xtext`

**Eclipse Shows Errors but Gradle Builds Successfully**
- Eclipse errors are IDE configuration issues, not code problems
- These don't affect Gradle builds
- Can be safely ignored if using Gradle-only workflow

**OCL Constraints Not Validated**
- OCL requires Eclipse Runtime environment
- Not available in standalone Gradle parser
- Use Eclipse Application launch for full validation

**Parser Can't Find Input File**
- Use absolute path: `-Pfile=C:\full\path\to\file.iupac`
- Or ensure working directory is project root

---

## Gradle Tasks

```bash
# Build everything
.\gradlew.bat build

# Clean build artifacts
.\gradlew.bat clean

# Generate EMF code only
.\gradlew.bat :dsldesign.iupac:iupacModelCode

# Generate Xtext infrastructure
.\gradlew.bat :dsldesign.iupac.xtext:generateXtextLanguage

# Parse IUPAC file
.\gradlew.bat :dsldesign.iupac.xtext:parseIupac "-Pfile=examples/test.iupac"

# List all tasks
.\gradlew.bat tasks
```

---

## Contributing

1. Fork the repository
2. Create feature branch: `git checkout -b feature-name`
3. Make changes
4. Test: `.\gradlew.bat build`
5. Commit with meaningful message
6. Push to your fork
7. Create Pull Request

---

## References

- Andrzej Wąsowski & Thorsten Berger (2023):  
  *Domain-Specific Languages: Effective Modeling, Automation, and Reuse.* Springer Nature.  
  [Website](http://dsl.design) | [Supplementary Material](https://bitbucket.org/dsldesign/dsldesign)
- Xtext Documentation: [https://www.eclipse.org/Xtext/documentation/](https://www.eclipse.org/Xtext/documentation/)
