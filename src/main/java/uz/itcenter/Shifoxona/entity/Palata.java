package uz.itcenter.Shifoxona.entity;


import javax.persistence.*;

@Entity
public class Palata {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "palata_id")
    private Long id;
    private String nom;
    private String tur;
    private int sigim;
    private int nomer;
    private String info;
    public Palata(){}

    public Palata(Long id, String nom, String tur, int sigim, int nomer, String info) {
        this.id = id;
        this.nom = nom;
        this.tur = tur;
        this.sigim = sigim;
        this.nomer = nomer;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getSigim() {
        return sigim;
    }

    public void setSigim(int sigim) {
        this.sigim = sigim;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}