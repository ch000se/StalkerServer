# 🌐 StalkerServer

The server-side backend for the **StalkerApp**, providing dynamic data and secure communication for the mobile app. This server manages and delivers up-to-date mutant information and user-specific data for the **S.T.A.L.K.E.R.** game universe companion application.

---

## 📝 Project Overview

**StalkerServer** is a backend application designed to:

- Serve dynamic data about mutants in the S.T.A.L.K.E.R. universe.
- Handle user-specific preferences and data securely.
- Integrate seamlessly with the **StalkerApp** mobile client.

Built using **Ktor**, it provides a lightweight and asynchronous architecture for API endpoints and data management.

---

## 🚀 Getting Started

### ⚙️ Requirements

Before running the server, ensure you have the following installed:

- **Kotlin** version 1.5 or above
- **Ktor** framework
- **PostgreSQL** (or another database, if configured)

### 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ch000se/StalkerServer.git
   cd StalkerServer
   ```

2. Configure the database connection in `application.conf`:
   ```hocon
   ktor {
       deployment {
           port = 8080
       }
       database {
           url = "jdbc:postgresql://localhost:5432/stalkerdb"
           driver = "org.postgresql.Driver"
           user = "your_username"
           password = "your_password"
       }
   }
   ```

3. Run the server:
   ```bash
   ./gradlew run
   ```

The server will start and listen on `http://localhost:8080` by default.

---

## 📂 Project Structure

- `src/` — Main source code directory.
- `resources/` — Configuration files and static resources.
- `build.gradle.kts` — Gradle configuration file.

---

## 🌟 Features

- **API for Mutant Data**: Serve detailed information about mutants, including:
  - Names, behaviors, and habitats
  - Strengths, weaknesses, and combat strategies
- **Secure User Data Handling**: Manage user preferences and account data.
- **Integration with StalkerApp**: Backend for the **StalkerApp** mobile client.

---

## 🔗 API Endpoints

### Mutant Data
- `GET /stalker/heroes` — Retrieve a paginated list of heroes. Requires `page` query parameter (1-5).
  - Example: `GET /stalker/heroes?page=1`
- `GET /stalker/heroes/search` — Search for heroes by name. Requires `name` query parameter.
  - Example: `GET /stalker/heroes/search?name=Bloodsucker`

---

## 🧪 Testing

1. Run tests using Gradle:
   ```bash
   ./gradlew test
   ```

2. Verify endpoints using tools like **Postman** or **cURL**:
   ```bash
   curl -X GET "http://localhost:8080/stalker/heroes?page=1"
   curl -X GET "http://localhost:8080/stalker/heroes/search?name=Bloodsucker"
   ```

---

## 🤝 Contributions

We welcome contributions to improve **StalkerServer**! To contribute:

1. Fork this repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-your-feature-name
   ```
3. Make your changes and commit them:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to your branch:
   ```bash
   git push origin feature-your-feature-name
   ```
5. Open a **Pull Request**.

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

---

## 📞 Contact

For feedback, suggestions, or questions, reach out:

- **Author**: ch000se
- **Email**: svyatikchaykivskiy@gmail.com
- **Telegram**: [@ch000se](https://t.me/ch000se)
