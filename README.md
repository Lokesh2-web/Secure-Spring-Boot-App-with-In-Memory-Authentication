# 🔐 Spring Boot Security – Role-Based Access Control (RBAC)

This is a Spring Boot application demonstrating how to implement **role-based access control** (RBAC) using **Spring Security** with:

- ✅ Custom roles (`PUBLIC`, `USER`, `ADMIN`)
- ✅ In-memory authentication with encoded passwords
- ✅ Spring Security's default login page
- ✅ URL access restrictions based on roles

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3+
- Spring Security
- Maven

---

## 📂 Features

- 👥 Three user roles: `PUBLIC`, `USER`, and `ADMIN`
- 🔐 Each role can access specific URL endpoints:
  - `/` → accessible by `PUBLIC`
  - `/user` → accessible by `USER`
  - `/admin` → accessible by `ADMIN`
- 🧾 In-memory user details with encrypted (BCrypt) passwords
- ✅ Uses Spring Security’s default login UI

---

## 🔐 User Credentials

| Username | Password     | Role    |
|----------|--------------|---------|
| lokesh   | Lokesh@2004  | USER    |
| admin    | Loki@123     | ADMIN   |
| MDU      | MDU@123      | PUBLIC  |

> 📌 All passwords are BCrypt-encoded internally for security

---

## 🚀 How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/LokeshChhara/spring-security-role-based-auth.git
   cd spring-security-role-based-auth
