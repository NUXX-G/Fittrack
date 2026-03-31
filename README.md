#  FitTrack — Backend

Backend of a personalized fitness and nutrition application, built with Java and Spring Boot.

> This project was born from the combination of two of our passions: training and programming.

---

##  What is FitTrack?

FitTrack is a REST API that combines training and nutrition in a single platform:

- **Training** — Track routines, exercises, sets and reps, inspired by Strava and Strong
- **HIIT & Timer** — Interval training mode with rest timer between sets
- **Ranking system** — Muscle group ranking based on lifted weights, inspired by Valorant and League of Legends
- **Nutrition** — Track macros and nutritional values, log meals and plan your week
- **Custom recipes** — Create your own recipes and meals with their macros
- **Food database** — Search foods and their nutritional values
- **AI training** — Technique analysis via video and routine consultation
- **AI nutrition** — Food identification via photo and recipe consultation

---

##  Tech Stack

| Technology | Version | Purpose |
|---|---|---|
| Java | 21 | Main language |
| Spring Boot | 4.0.5 | Backend framework |
| Spring Security + JWT | 7.x | Authentication & authorization |
| Spring Data JPA | 4.x | Database access |
| Hibernate | 7.x | ORM |
| PostgreSQL | 16 | Database |
| Maven | 3.x | Dependency management |
| Lombok | 1.18.x | Boilerplate reduction |
| Gemini API | - | Artificial intelligence |

---

##  Architecture

The project follows a standard Spring Boot layered architecture:

```
Controller → Service → Repository → Database
```

```
src/main/java/com/gymnos/fittrack/
├── controller/       # REST endpoints
├── service/          # Business logic
├── repository/       # Data access
├── model/            # JPA entities
│   └── dto/          # Data transfer objects
├── config/           # Security and JWT configuration
└── exception/        # Error handling
```

---

##  Getting Started

### Prerequisites

- Java 21
- PostgreSQL 16
- Maven 3.x
- IntelliJ IDEA (recommended)

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/NUXX-G/Fittrack.git
cd Fittrack
git checkout develop
```

**2. Create the database**
```sql
CREATE DATABASE fittrack_db;
```

**3. Set up credentials**
```bash
cp src/main/resources/application-example.properties src/main/resources/application.properties
# Edit application.properties with your PostgreSQL credentials
```

**4. Run the application**
```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`

---

##  Available Endpoints

### Authentication
| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Login and get JWT token |

### Exercises _(in progress)_
| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/exercises` | List all exercises |
| GET | `/api/exercises/{id}` | Get exercise by ID |
| POST | `/api/exercises` | Create new exercise |

> More endpoints will be added as development progresses.

---

##  Roadmap

### Month 1 — Core ⚙️ In progress
- [x] Project setup
- [x] User entity
- [ ] Register & login with JWT
- [ ] Exercise module

### Month 2 — Advanced features
- [ ] Muscle group ranking system
- [ ] HIIT & rest timer
- [ ] Nutrition & macros module
- [ ] Food database

### Month 3 — AI & deployment
- [ ] AI nutrition (photo → identify food)
- [ ] AI training (routine consultation)
- [ ] Swagger documentation
- [ ] VPS deployment

---

##  Team

| Developer | Module |
|---|---|
| NUXX-G | Authentication, security, ranking system |
| Petter | Exercises, nutrition, food database |
