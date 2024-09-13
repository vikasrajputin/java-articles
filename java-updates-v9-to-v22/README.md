
# Java Updates (Version 9 to Version 22)

This repository contains code examples demonstrating the key feature updates introduced across Java versions 9 through 22. Each package contains Java files that showcase the functionality, usage, and improvements of features introduced in the corresponding version. Below is a detailed breakdown of the packages and the Java files in them.

## Table of Contents
- [NullPointerExceptions (Java 14)](src/main/java/org/example/npe)
- [Pattern Matching (Java 16 & 17)](src/main/java/org/example/patternmatching)
- [Records (Java 14)](src/main/java/org/example/records)
- [Sealed Classes (Java 15 & 17)](src/main/java/org/example/sealedclass)
- [String Templates (Java 21)](src/main/java/org/example/stringtemplate)
- [Switch Expressions (Java 12 & 14)](src/main/java/org/example/switchexpression)
- [Unnamed Variables (Java 22)](src/main/java/org/example/unnamedvariable)
- [Var Keyword (Java 10)](src/main/java/org/example/varkeyword)
- [Virtual Threads (Java 19)](src/main/java/org/example/virtualthread)

---

## NullPointerExceptions (Java 14)

Java 14 introduced helpful NullPointerException messages. The following files demonstrate the difference before and after this feature was added.

- **Before NPE Messages (Java < 14)**:
    - `NullPointerBefore.java`: Demonstrates how Java would previously throw NullPointerExceptions without clear messages.
- **After NPE Messages (Java 14)**:
    - `NullPointerAfter.java`: Demonstrates improved error messages for NullPointerExceptions.
- **Other Classes**:
    - `Person.java` and `Address.java`: Supporting classes used in the above examples.

---

## Pattern Matching (Java 16 & 17)

This package showcases pattern matching introduced for `instanceof` and `switch` expressions in Java 16 and 17.

- **Single Condition Pattern Matching**:
    - `PatternMatchingSingleBefore.java`: Example of how pattern matching was done before Java 16.
    - `PatternMatchingSingleAfter.java`: Demonstrates pattern matching after Java 16 for simpler type checks.

- **Multiple Conditions Pattern Matching**:
    - `PatternMatchingMultiBefore.java`: Shows how complex conditions were written before pattern matching.
    - `PatternMatchingMultiAfter.java`: Simplifies the same using pattern matching.

- **Pattern Matching with Switch**:
    - `PatternMatchingWithSwitch.java`: Demonstrates the use of pattern matching with `switch` statements.

---

## Records (Java 14)

Java 14 introduced the `record` keyword, a new type of class for immutable data.

- **Before Records**:
    - `PersonBefore.java`: Demonstrates how boilerplate code was written to create immutable data objects before Java 14.

- **After Records**:
    - `PersonAfter.java`: Demonstrates how records simplify creating immutable data objects.

- **Additional Record Features**:
    - `PersonRecordArgConstructor.java`: Shows how to define an argument constructor in records.
    - `PersonRecordCustomConstructor.java`: Demonstrates custom constructors in records.
    - `PersonRecordEquals.java`: Illustrates how `equals()` method works in records.
    - `PersonRecordToString.java`: Shows how `toString()` is auto-generated in records.

---

## Sealed Classes (Java 15 & 17)

Sealed classes provide a way to control which classes can extend or implement a superclass or interface.

- **Sealed Class and Subclasses**:
    - `Employee.java`: A sealed class defining types of employees.
    - `FullTimeEmployee.java`, `ContractualEmployee.java`, `Freelancer.java`: Final and non-sealed subclasses extending the sealed class.

- **Remote Subclass**:
    - `RemoteContractualEmployee.java`: Demonstrates the extension of sealed classes across packages.

- **Demo**:
    - `EmployeeDemo.java`: A main class to demonstrate the usage of sealed classes.

---

## String Templates (Java 21)

String Templates introduced in Java 21 allow easier string interpolation.

- **Before String Templates**:
    - `JsonBeforeJava13.java`: Demonstrates how string formatting and concatenation was done before templates.

- **After String Templates (Java 13)**:
    - `JsonAfterJava13.java`: Demonstrates improvements using text blocks for multi-line strings.

- **After String Templates (Java 21)**:
    - `JsonAfterJava21.java`: Shows the full potential of string templates with embedded expressions.

---

## Switch Expressions (Java 12 & 14)

Switch expressions in Java 12 and 14 allow `switch` statements to return values.

- **Switch Example**:
    - `SwitchExample.java`: Demonstrates how the new switch expression works, making code more concise.

---

## Unnamed Variables (Java 22)

Java 22 introduces unnamed variables, allowing developers to ignore certain results in a more readable way.

- **Unnamed Variable Demo**:
    - `UnNamedVariableDemo.java`: Shows how unnamed variables can be used in places where a result is not needed.

---

## Var Keyword (Java 10)

Java 10 introduced `var` for local variable type inference.

- **Var Keyword Demo**:
    - `VarKeywordDemo.java`: Demonstrates the use of `var` for simplifying code.
    - `Book.java`: A supporting class used in the demo.

---

## Virtual Threads (Java 19)

Virtual Threads, introduced as part of Project Loom in Java 19, make concurrency simpler and more scalable.

- **Basic Virtual Thread Example**:
    - `VirtualThreadExample.java`: Demonstrates how to create virtual threads.

- **Virtual Thread with Executor Service**:
    - `VirtualThreadExecutorServiceExample.java`: Shows how virtual threads can be used with an executor service.

---

## How to Run the Examples

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd java-updates-v9-to-v22
   ```

2. **Compile and run the examples**:
   Each package has a main class you can execute, for example:
   ```bash
   javac org/example/npe/NullPointerAfter.java
   java org.example.npe.NullPointerAfter
   ```

---

## Contribution

Feel free to open issues or submit pull requests to add more examples or improve the existing ones!

Refer [Contributing guide](./CONTRIBUTING.md) for more details
---
