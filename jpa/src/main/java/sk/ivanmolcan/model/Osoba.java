package sk.ivanmolcan.model;

import sk.ivanmolcan.converters.PohlavieConverter;
import sk.ivanmolcan.model.enums.Pohlavie;

import javax.persistence.*;

@Entity
public class Osoba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = PohlavieConverter.class)
    private Pohlavie pohlavie;

    public Osoba(){

    }

    public Osoba(Pohlavie pohlavie) {
        this.pohlavie = pohlavie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pohlavie getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(Pohlavie pohlavie) {
        this.pohlavie = pohlavie;
    }
}
