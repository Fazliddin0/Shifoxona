package uz.itcenter.Shifoxona.entity;


import javax.persistence.*;

@Entity
public class Kasallik {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Kasallik_id" )
    private long id;
    @Column(nullable = false,length = 50)
    private String tur;
    private String nom;
    private String info;

    public Kasallik(){}

    public Kasallik(long id, String tur, String nom, String info) {
        this.id = id;
        this.tur = tur;
        this.nom = nom;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
