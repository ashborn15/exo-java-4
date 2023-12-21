package tp1;

import java.time.LocalDate;
import java.time.Period;

class Person {

    private String nom;
    private String prenom;
    private String matricule;
    private int age;
    private LocalDate dateNaissance;

    public Person(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.matricule = generateMatricule();
        this.age = calculateAge();
    }
    private String generateMatricule() {
        String matricule = (prenom.substring(0, 1) + nom.substring(0, 1)).toUpperCase();
        matricule += String.format("%04d", hashCode() % 10000);
        return matricule;
    }

    private int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateNaissance, currentDate).getYears();
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }
}

