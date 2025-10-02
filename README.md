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

- **Xtext Grammar**  
  Defines the concrete textual syntax for the IUPAC DSL.
  
- **Ecore Model**  
  Represents the abstract syntax/metamodel of molecules.

- **Generated Editor**  
  Provides a text editor for writing molecule descriptions with autocomplete and validation.

- **OCL Constraints**  
  Add static semantic checks (e.g., branch names cannot be identical).

- **Use Cases**  
  - Validation of IUPAC names  
  - Categorization/grouping of IUPAC names
    
---

## Requirements

- **Eclipse Modeling Tools**
  [https://www.eclipse.org/downloads/packages/](https://www.eclipse.org/downloads/packages/)
- **OCL plugin** (install manually via update site):  
  [https://download.eclipse.org/modeling/mdt/ocl/builds/release/6.20.0](https://download.eclipse.org/modeling/mdt/ocl/builds/release/6.20.0)
  - `Help → Install new Software`  
- **Xtext SDK** (install via Eclipse update site, note that Eclipse will restart):
  [https://download.eclipse.org/releases/2021-09/](https://download.eclipse.org/releases/2021-09/)
  - Search for xtext
  - `Help → Install new Software`   
- Java 11 or newer  
- Maven (optional, for build integration)
---

## Installation & Usage

1. **Clone the repository**  
   ```bash
   git clone https://github.com/Masu98s/Dsldesign.git
   ```

2. **Import the project into Eclipse**  
   - `File → Import → Existing Projects into Workspace`  
   - Select the project folder `dsldesign.iupac` and `dsldesign.iupac.xtext`

3. **Generate model code**  
   - Navigate to the folder **`model/`**  
   - Right-click the file **`iupac.genmodel`** → *Generate Model Code*

4. **Create the Xtext project**  
   - `File → New → Project → Xtext Project From Existing Ecore Models`  
   - Add the `.genmodel` file from the **`model/`** folder  
   - Select the correct entry rule (root class, e.g. `IUPAC`)

5. **Generate Xtext artifacts**  
   - Navigate to **`src/`**  
   - Right-click the DSL grammar file **`iupac.xtext`** → *Run As → Generate Xtext Artifacts*

6. **Launch the DSL editor**  
   - Right-click the Xtext project → *Run As → Eclipse Application*  
   - A new Eclipse instance will open with the DSL editor installed

7. **Create and test DSL files**  
   - In the new Eclipse instance, create a new project  
   - Add a file with the extension `.mydsl` (e.g., `test.mydsl`)  
   - Start writing IUPAC-style names such as:  
     ```
     2-MonoMethylButan
     ```  
   - Use **Ctrl+Space** for autocompletion  
   - Errors will be highlighted if the syntax or semantics are incorrect

---

## Example

**Input:**
```
2-MonoMethylButan
```

**Meaning:**
- 4-carbon chain (*Butan*)  
- 1 methyl branch at position 2  

The editor automatically checks whether the syntax and semantics (e.g., prefixes, branch names, positions) are correct.

### Example Screenshots

**Metamodel of the IUPAC DSL**  
![Metamodel](img/metamodel_iupac.png)

**Validation of semantic errors in the editor**  
![Validation](img/dsl_editor_ocl_constraint_branch_names.png)

## References

- Andrzej Wąsowski & Thorsten Berger (2023):  
  *Domain-Specific Languages: Effective Modeling, Automation, and Reuse.* Springer Nature.  
  [Website](http://dsl.design) | [Supplementary Material](https://bitbucket.org/dsldesign/dsldesign)
- Xtext Documentation: [https://www.eclipse.org/Xtext/documentation/](https://www.eclipse.org/Xtext/documentation/)
