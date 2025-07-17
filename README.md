# 🏥 ML-Enhanced Hospital Management System – Java + Gradle

A comprehensive Java-based Hospital Management System that automates patient management, doctor scheduling, and medicine inventory, while also integrating ML-based myocarditis prediction. Built with modular design principles and powered by Gradle for efficient build and dependency handling.

## ✨ Features

- 🧾 **Patient Record Management** with doubly linked lists for efficient addition, deletion, and traversal
- 🩺 **Doctor Scheduling System** using priority queues for optimized appointment allocation
- 💊 **Medicine Inventory Tracker** using structured text files with search/sort using array-based logic
- 🔍 **ML-Based Myocarditis Risk Prediction** using logistic regression (Python-trained, integrated via API/file communication)
- 📁 File-based data management (`pdata.txt`, `ddata.txt`, `mdata.txt`) with CRUD operations
- 🧩 Modular OOP-based architecture with strong encapsulation and data abstraction

## 🔢 Data Structures & Algorithms Used

- ✅ **Doubly Linked List** – Patient history management
- ✅ **Priority Queue** – Doctor appointment prioritization
- ✅ **Binary Search & Sorting** – Inventory search optimization
- ✅ **File I/O with Buffering** – Data persistence and integrity

## 🧠 ML Component

- Developed separately in Python (Logistic Regression)
- Predicts **myocarditis risk** based on patient vitals and history
- Java app consumes model output through:
  - File-based integration (CSV or TXT-based prediction result)
  - Optionally REST API if extended

## 🛠 Tech Stack

| Layer             | Technology                     |
|------------------|--------------------------------|
| Language          | Java (Core)                    |
| Build Tool        | Gradle                         |
| IDE               | NetBeans / Eclipse             |
| ML Integration    | Python (Logistic Regression)   |
| DSA               | Doubly Linked List, Priority Queue, Binary Search |
| Storage           | Structured Text Files          |



