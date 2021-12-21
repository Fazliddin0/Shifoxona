package uz.itcenter.Shifoxona.entity;



import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Shifokor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Shifokor_id ")
    private long id;
    @Column(nullable = false, length = 50)
    private String ism;
    private String familiya;
    private String sharif;
    private String mutaxasislik;
    @NotNull
    private String tugKun;
    private long telNomer;
    private String info;

    public Shifokor(){}

    public Shifokor(long id, String ism, String familiya,
                    String sharif, String mutaxasislik,
                    @NotNull String tugKun,
                    long telNomer, String info) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.sharif = sharif;
        this.mutaxasislik = mutaxasislik;
        this.tugKun = tugKun;
        this.telNomer = telNomer;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getSharif() {
        return sharif;
    }

    public void setSharif(String sharif) {
        this.sharif = sharif;
    }

    public String getMutaxasislik() {
        return mutaxasislik;
    }

    public void setMutaxasislik(String mutaxasislik) {
        this.mutaxasislik = mutaxasislik;
    }

    public String getTugKun() {
        return tugKun;
    }

    public void setTugKun(String tugKun) {
        this.tugKun = tugKun;
    }

    public long getTelNomer() {
        return telNomer;
    }

    public void setTelNomer(long telNomer) {
        this.telNomer = telNomer;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}