#  Smart Campus Company Service

##  Overview
This microservice manages company recruitment rules such as CGPA cutoff, branch eligibility, and backlog constraints. It calculates eligible students and supports dynamic updates across the Smart Campus ecosystem.

---

##  Tech Stack
- Java 17+
- Spring Boot
- Spring Data JPA
- OpenFeign
- MySQL
- REST APIs

---

##  Responsibilities
- Manage company data (criteria-based)
- Define eligibility rules
- Provide eligible company list for students
- Trigger updates to student eligibility

---

##  Dependencies
- Student Service (Feign Client)

---

##  API Endpoints

### ➤ Add Company
`POST /campus/addcompany`

### ➤ Get All Companies
`GET /campus/getcompany`

### ➤ Update Company
`PUT /campus/updatecomp/{name}`

### ➤ Delete Company
`DELETE /campus/dltcomp/{name}`

### ➤ Get Company by ID
`GET /campus/companybyid/{id}`

---

<img width="1366" height="728" alt="CompanyController" src="https://github.com/user-attachments/assets/8d7463f8-2f55-4538-be25-c2e9fb770bae" />

---

##  Microservice Communication Flow

- Evaluates students via Student Service
- Updates student eligibility after company changes
- Ensures real-time mapping of students ↔ companies

---

##  Key Feature
 Real-time eligibility recalculation across services

---

## Microservice Architecture

<img width="1591" height="694" alt="mermaid-diagram" src="https://github.com/user-attachments/assets/8e2289bf-a49d-42ea-b98d-01e7ec2b7959" />

