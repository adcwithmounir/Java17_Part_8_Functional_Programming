<div align="center">

# ☕ Java SE 17 — Part 8: Functional Programming

### Master lambdas & functional interfaces and prepare for the OCP 1Z0-829 certification

**Source code for the video course by _ADC with Mounir_**

[![Java](https://img.shields.io/badge/Java-SE%2017-58A6FF?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/projects/jdk/17/)
[![YouTube](https://img.shields.io/badge/Watch%20on-YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://tinyurl.com/java17functionalprogramming)

</div>

---

## 📖 About this repository

This repository contains **all the code examples** shown in **Part 8 — Functional Programming** of the *Java SE 17 Full Course* on the **ADC with Mounir** YouTube channel.

Every folder matches one video. Open the folder, follow along with the video, run the code, break it, fix it — that is the fastest way to really learn Java.

All examples are built around a **streaming-platform project** (`Movie`, `Series`, `Episode`, `User`, `Subscription`, `StreamingPlatform`, `ContentType`…) instead of abstract `Foo` / `Bar` examples, so every concept has a real, meaningful context: filtering a catalog with a `Predicate`, building a `Movie` with a `Supplier`, formatting titles with a `Function`, and much more.

---

## 🎯 Who is this for?

| | Profile | How to use this repo |
|---|---|---|
| 🟢 | **Beginners who finished Parts 1–7** — comfortable with classes and interfaces | Follow the folders in order, one video at a time |
| 🔵 | **Developers coming from JavaScript, Python or Kotlin** | Jump to the topics you need — Java's lambda rules have their own quirks |
| 🟠 | **OCP 1Z0-829 candidates** | Focus on the 🎓 exam traps and practice questions in each video — lambda syntax and functional interfaces are heavily tested |

---

## 🗂️ Course content

| # | Folder | Video topic | What you'll learn | Status |
|:-:|---|---|---|:-:|
| 1 | [`Part_8_1_Functional_Programming`](./Part_8_1_Functional_Programming) | **Writing Your First Lambda** | From anonymous classes to lambdas, deferred execution, passing behavior as data | ✅ |
| 2 | [`Part_8_2_Functional_Programming`](./Part_8_2_Functional_Programming) | **Lambda Syntax in Depth** | Parentheses, braces, `return`, parameter types, `var` in lambda parameters, valid vs invalid forms | 🔜 |
| 3 | [`Part_8_3_Functional_Programming`](./Part_8_3_Functional_Programming) | **Coding Functional Interfaces** | The single abstract method rule, `@FunctionalInterface`, `default` / `static` / `private` methods, `Object` methods that don't count | 🔜 |
| 4 | [`Part_8_4_Functional_Programming`](./Part_8_4_Functional_Programming) | **Using Method References** | Static methods, instance methods on a particular object, instance methods on a parameter, constructor references | 🔜 |
| 5 | [`Part_8_5_Functional_Programming`](./Part_8_5_Functional_Programming) | **Built-in Interfaces: Supplier, Consumer & Predicate** | `Supplier`, `Consumer`, `BiConsumer`, `Predicate`, `BiPredicate` from `java.util.function` | 🔜 |
| 6 | [`Part_8_6_Functional_Programming`](./Part_8_6_Functional_Programming) | **Built-in Interfaces: Function & Operators** | `Function`, `BiFunction`, `UnaryOperator`, `BinaryOperator` and how they relate | 🔜 |
| 7 | [`Part_8_7_Functional_Programming`](./Part_8_7_Functional_Programming) | **Convenience Methods on Functional Interfaces** | Chaining with `and()`, `or()`, `negate()`, `andThen()`, `compose()` | 🔜 |
| 8 | [`Part_8_8_Functional_Programming`](./Part_8_8_Functional_Programming) | **Functional Interfaces for Primitives** | `BooleanSupplier`, `IntPredicate`, `ToIntFunction`, `IntUnaryOperator`… avoiding autoboxing | 🔜 |
| 9 | [`Part_8_9_Functional_Programming`](./Part_8_9_Functional_Programming) | **Working with Variables in Lambdas** | Parameter lists, local variables inside the body, effectively final rules, instance & static variables | 🔜 |
| 10 | NO LABS (see the video) | **Chapter Review & Practice Questions** | Summary, exam essentials and OCP-style practice questions | 🔜 |

> ✅ Available · 🔜 Coming soon — the repo is updated as new videos are released.

---

## 🎓 OCP 1Z0-829 objectives covered

- **Working with Streams and Lambda expressions**
  - Implement functional interfaces using lambda expressions, including interfaces from the `java.util.function` package
- **Utilizing Java object-oriented approach**
  - Create and use interfaces, identify functional interfaces, and utilize private, static, and default methods
  - Understand variable scopes, use local variable type inference (including `var` in lambda parameters)

---

## 🧠 Quick reference — the built-in functional interfaces

| Interface | Parameters | Returns | Method | Streaming-platform example |
|---|:-:|:-:|---|---|
| `Supplier<T>` | 0 | `T` | `get()` | `() -> new Movie("Inception")` |
| `Consumer<T>` | 1 (`T`) | `void` | `accept(T)` | `m -> System.out.println(m.getTitle())` |
| `BiConsumer<T, U>` | 2 (`T`, `U`) | `void` | `accept(T, U)` | `(user, movie) -> user.addToWatchlist(movie)` |
| `Predicate<T>` | 1 (`T`) | `boolean` | `test(T)` | `m -> m.getRating() > 8.0` |
| `BiPredicate<T, U>` | 2 (`T`, `U`) | `boolean` | `test(T, U)` | `(user, movie) -> user.canWatch(movie)` |
| `Function<T, R>` | 1 (`T`) | `R` | `apply(T)` | `Movie::getTitle` |
| `BiFunction<T, U, R>` | 2 (`T`, `U`) | `R` | `apply(T, U)` | `(title, year) -> new Movie(title, year)` |
| `UnaryOperator<T>` | 1 (`T`) | `T` | `apply(T)` | `String::toUpperCase` |
| `BinaryOperator<T>` | 2 (`T`, `T`) | `T` | `apply(T, T)` | `(a, b) -> a + b` |

> 🎓 **Exam tip:** memorize this table. Many OCP questions simply ask which interface fits a given lambda — count the parameters and check the return type.

---

## 🛠️ Prerequisites

- **JDK 17** installed ([Eclipse Temurin](https://adoptium.net/) or [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#java17))
- A code editor — the course uses **VS Code** with the *Extension Pack for Java*, but any IDE works (IntelliJ IDEA, Eclipse…)
- Comfort with **interfaces** and **classes** (covered in Parts 6 & 7)

Check your installation:

```bash
javac -version   # should print 17.x
java  -version   # should print 17.x
```

---

## 🚀 Getting started

```bash
# 1. Clone the repository
git clone https://github.com/adcwithmounir/Java17_Part_8_Functional_Programming.git
cd Java17_Part_8_Functional_Programming

# 2. Open the folder of the video you are watching
cd Part_8_1_Functional_Programming
```

Each folder is independent. You can open it directly in VS Code, or compile and run from the terminal:

```bash
# Compile a class
javac StreamingPlatform.java

# Run it (no .class extension!)
java StreamingPlatform

# Java 11+ shortcut for single-file programs
java StreamingPlatform.java
```

> 💡 **Tip:** Try rewriting each lambda as a method reference (and back again). If you can switch between the two forms confidently, you are ready for the exam questions on this topic.

---

## 📺 Watch the course

| Resource | Link |
|---|---|
| 📃 Full Part 8 playlist | [tinyurl.com/java17functionalprogramming](https://tinyurl.com/java17functionalprogramming) |
| 📃 Part 1 playlist (start here if you're new) | [tinyurl.com/java17fundamental](https://tinyurl.com/java17fundamental) |
| 💻 Source code (this repo) | [github.com/adcwithmounir/Java17_Part_8_Functional_Programming](https://github.com/adcwithmounir/Java17_Part_8_Functional_Programming) |

---

## 🧭 Course roadmap

This repository is **Part 8** of a complete Java SE 17 course. Each part has its own repository.

| Part | Topic | Status |
|:-:|---|:-:|
| 1 | [Java Fundamentals / Core Syntax](https://github.com/adcwithmounir/Java17_Part_1_Fundamentals_Core_Syntax) | ✅ |
| 2 | Expressions & Computations | 🔜 |
| 3 | Control Flow & Conditionals | 🔜 |
| 4 | Essential Java Libraries | 🔜 |
| 5 | Functions & Parameters | 🔜 |
| 6 | Object-Oriented Basics | 🔜 |
| 7 | Interfaces & Abstract Types | 🔜 |
| **8** | **Functional Programming** | 🟢 In progress |
| 9 | Data Structures & Type Safety | 🔜 |
| 10 | Data Processing Pipelines | 🔜 |
| 11 | Error Handling & i18n | 🔜 |
| 12 | Java Module System (JPMS) | 🔜 |
| 13 | Multithreading & Parallelism | 🔜 |
| 14 | File & Stream Operations | 🔜 |
| 15 | Database Connectivity | 🔜 |

---

## 📚 Recommended reading

This course is inspired by, and complements, the official study guide:

> **OCP Oracle Certified Professional Java SE 17 Developer Study Guide: Exam 1Z0-829**
> Scott Selikoff & Jeanne Boyarsky — Sybex

The course does not replace the book. All code, explanations and practice questions in this repository are original.

---

## 🤝 Contributing

Found a typo, a bug, or have an idea for a better example?
Feel free to [open an issue](https://github.com/adcwithmounir/Java17_Part_8_Functional_Programming/issues) or submit a pull request. Questions about the videos are welcome in the YouTube comments too.

---

## 📄 License

This project is licensed under the [MIT License](./LICENSE) — use the code freely to learn and practice.

---

<div align="center">

**⭐ If this repository helps you learn Java, give it a star — it helps other learners find it!**

Made with ☕ by **ADC with Mounir**

</div>
