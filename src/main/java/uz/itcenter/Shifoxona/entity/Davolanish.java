package uz.itcenter.Shifoxona.entity;


import javax.persistence.*;

@Entity
public class Davolanish {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Bemor bemor;
    @ManyToOne
    private Shifokor shifokor;
    @ManyToOne
    private Kasallik kasallik;
    @ManyToOne
    private Palata palata;

    public Davolanish() {

    }

    public Davolanish(Long id, Bemor bemor, Shifokor shifokor, Kasallik kasallik, Palata palata) {
        this.id = id;
        this.bemor = bemor;
        this.shifokor = shifokor;
        this.kasallik = kasallik;
        this.palata = palata;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bemor getBemor() {
        return bemor;
    }

    public void setBemor(Bemor bemor) {
        this.bemor = bemor;
    }

    public Shifokor getShifokor() {
        return shifokor;
    }

    public void setShifokor(Shifokor shifokor) {
        this.shifokor = shifokor;
    }

    public Kasallik getKasallik() {
        return kasallik;
    }

    public void setKasallik(Kasallik kasallik) {
        this.kasallik = kasallik;
    }

    public Palata getPalata() {
        return palata;
    }

    public void setPalata(Palata palata) {
        this.palata = palata;
    }
}
