# Application de Gestion des Employés avec JSF, Hibernate 
## Description

Cette application de gestion des employés est une solution complète permettant de gérer les données relatives aux employés d'une entreprise. Elle est construite en utilisant les technologies suivantes :
- **JSF (JavaServer Faces)** : Pour le développement de l'interface utilisateur.
- **Hibernate** : Pour la couche d'accès aux données et la gestion de la persistance.
- **JDBC (Java Database Connectivity)** : Pour les opérations de base de données.
- ## Fonctionnalités

### 1. Ajout d'un Employé

- L'utilisateur peut ajouter un nouvel employé en fournissant les détails suivants :
  - Nom et prénom de l'employé.
  - Poste occupé.
  - Salaire.
  - Date d'embauche, etc.

### 2. Modification d'un Employé

- Les informations d'un employé existant peuvent être modifiées à tout moment. L'utilisateur peut mettre à jour les champs tels que le salaire, le poste, etc.

### 3. Suppression d'un Employé

- L'application permet à l'utilisateur de supprimer un employé de la base de données.

### 4. Consultation des Employés

- L'utilisateur peut afficher la liste complète des employés enregistrés dans l'application, avec la possibilité de trier ou filtrer les résultats.

### 5. Gestion des Services

- En plus de la gestion des employés, l'application inclut un module de gestion des services.
- Les services peuvent être associés à chaque employé, et l'utilisateur peut consulter les détails des services fournis par les employés.
## Configuration

### 1. Base de Données

- Configurer les paramètres de connexion à la base de données dans le fichier `hibernate.cfg.xml`.
  
![0](https://github.com/Samia-Kouame/JSF/assets/147660832/c5887588-bd36-4bb9-8fc9-7dfd336275df)

-G.Employe:
------------

![employe](https://github.com/Samia-Kouame/JSF/assets/147660832/3537ca59-d087-4340-bc19-6bb8e74ea236)


![12](https://github.com/Samia-Kouame/JSF/assets/147660832/38e3019a-338e-44a2-9dba-1a0d1dc1e79f)


![ajout employe](https://github.com/Samia-Kouame/JSF/assets/147660832/47f006d3-a89c-4338-8f89-db8bf1d6b5b3)


![suppression d employe](https://github.com/Samia-Kouame/JSF/assets/147660832/eb16806d-d2fd-4cc3-8c9d-7daa00b573bb)


**liste des employes apres l'ajout de l'employe "Laoui Majda" et la supression de "Alaoui Ghita" :


![liste employe](https://github.com/Samia-Kouame/JSF/assets/147660832/0087b42e-4c20-45f8-a8f1-1e866f9b8ec3)


![modification d employe](https://github.com/Samia-Kouame/JSF/assets/147660832/d7411bd4-142f-49c7-8fa0-99ae2248619b)


-G.Service : 
-------------

![service](https://github.com/Samia-Kouame/JSF/assets/147660832/63d7e6fa-a34d-42a7-a673-9ac700c2e88f)


![supp service](https://github.com/Samia-Kouame/JSF/assets/147660832/74046e7b-029f-408a-9aa3-c2f1ac73f4b3)


![modif service](https://github.com/Samia-Kouame/JSF/assets/147660832/2202d38a-4011-4fb2-ad64-767c2549f193)

**Modification de service "Arabe" par "Philosophie" :

![modif arabe par philo](https://github.com/Samia-Kouame/JSF/assets/147660832/be885adc-5ab0-4e9f-a8c6-2c54ff6ace42)


![fltrer par code](https://github.com/Samia-Kouame/JSF/assets/147660832/b32ae360-a951-4767-9f52-41820eaff57c)


-Statistiques : 
---------------

Graphe qui represente le nombre d'employes par service:


![graphe](https://github.com/Samia-Kouame/JSF/assets/147660832/ca481b17-f15d-455a-9137-ee5753d567fc)


### Configuration:
-Cloner le projet à partir du référentiel GitHub.
-Configurer la base de données dans le fichier persistence.xml.
-Construire le projet à l'aide de Maven : mvn clean install.
-Déployer le fichier WAR généré sur votre serveur d'application.

### Technologies Utilisées :
*JavaServer Faces (JSF)

*Hibernate (ORM)

*Base de données (MySQL)
