#  Gestion simplifiée d'une bibliothèque

Projet réalisé dans le cadre de notre examen **Langages & Frameworks Backend 1**.  
Ce projet consiste à développer une API REST en Java avec **Spring Boot** pour gérer des livres et leurs auteurs au sein d'une bibliothèque.

---

##  Objectifs pédagogiques

- Manipulation des entités JPA (Hibernate)
- Compréhension des relations `@OneToMany` et `@ManyToOne`
- Creation d’une API REST (GET, POST, PUT, DELETE)
- Structuration d’un projet Sprig Boot (packages : controller, service, repository, model)
- (Optionnel) Validation, pagination, documentation Swagger
---

##  Stack technique

- Java 17+
- Spring Boot 3+
- Spring Data JPA
- Spring Web
- Base de donnees H2 (ou MySQL)
- Maven
- Lombok *(optionnel)*
- Swagger *(optionnel)*
- Spring Security *(optionnel)*

---

##  Structure du projet

src/
└── main/
├── java/com/exmaple/bibliotheque
│ ├── controller/
│ ├── service/
│ ├── repository/
│ ├── model/
│ └── BibliothequeApplication.java
└── resources/
└── application.properties



---

## ✅ Fonctionnalités implémentées

1. ✅ Créer un auteur  
2. ✅ Lister tous les auteurs  
3. ✅ Créer un livre lié à un auteur  
4. ✅ Lister tous les livres  
5. ✅ Afficher les livres d’un auteur donné  
6. ✅ Modifier un livre  
7. ✅ Supprimer un livre  

---

## ⭐ Bonus réalisés (si implémentés)

- [ ] Validation des champs (`@NotBlank`, `@Size`, etc.)
- [ ] Documentation Swagger (`springdoc-openapi`)
- [ ] Pagination des livres (`Pageable`)
- [ ] Tests unitaires (`@WebMvcTest` ou `@DataJpaTest`)
- [ ] Sécurité avec Spring Security (JWT ou Basic Auth)

---

####  Instructions d'exécution

### Prérequis

- Java 17+
- Maven

### Étapes

1. Cloner ou décompresser le projet :
2. Lancer le projet :
./mvnw spring-boot:run

L'application sera accessible à : http://localhost:8080

3. Accéder à la console H2  :
http://localhost:8080/h2-console
(JDBC URL : jdbc:h2:mem:bibliothequedb)

(Optionnel) Accéder à Swagger UI :
http://localhost:8080/swagger-ui.html



#### Exemple d’appel d’API

➕ Créer un auteur
curl -X POST http://localhost:8080/api/auteurs \
-H "Content-Type: application/json" \
-d '{"nom": "Victor Hugo"}'

📖 Créer un livre pour un auteur
curl -X POST http://localhost:8080/api/livres \
-H "Content-Type: application/json" \
-d '{"titre": "Les Misérables", "auteurId": 1}'


📚 Lister tous les livres
curl http://localhost:8080/api/livres


#### Pagination sur la liste des livres
curl "http://localhost:8080/api/livres/paged?page=0&size=5"





"# Projet-Webservice-Mohammed-THIONGANE-et-Aida-LO" 
