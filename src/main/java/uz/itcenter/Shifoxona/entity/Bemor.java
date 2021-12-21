package uz.itcenter.Shifoxona.entity;



import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Bemor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "bemor_id ")
    private Long id;
    @Column(nullable = false, length = 50)
    private String ism;
    private String familiya;
    private String sharif;
    private LocalDate TugKun;
    private Long telNomer;
    private LocalDateTime bemorKelganVaqt;
    private LocalDateTime bemorKetganVaqt;
   public Bemor(){}
    public Bemor(Long id, String ism, String familiya,
                 String sharif, LocalDate tugKun, Long telNomer,
                 LocalDateTime bemorKelganVaqt, LocalDateTime bemorKetganVaqt,
                 String info) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.sharif = sharif;
        TugKun = tugKun;
        this.telNomer = telNomer;
        this.bemorKelganVaqt = bemorKelganVaqt;
        this.bemorKetganVaqt = bemorKetganVaqt;
        this.info = info;
    }

    private String info;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public LocalDate getTugKun() {
        return TugKun;
    }

    public void setTugKun(LocalDate tugKun) {
        TugKun = tugKun;
    }


    public Long getTelNomer() {
        return telNomer;
    }

    public void setTelNomer(Long telNomer) {
        this.telNomer = telNomer;
    }

    public LocalDateTime getBemorKelganVaqt() {
        return bemorKelganVaqt;
    }

    public void setBemorKelganVaqt(LocalDateTime bemorKelganVaqt) {
        this.bemorKelganVaqt = bemorKelganVaqt;
    }

    public LocalDateTime getBemorKetganVaqt() {
        return bemorKetganVaqt;
    }

    public void setBemorKetganVaqt(LocalDateTime bemorKetganVaqt) {
        this.bemorKetganVaqt = bemorKetganVaqt;
    }
}
