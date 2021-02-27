package sk.ivanmolcan.model;

import javax.persistence.*;
import java.util.Date;

//Mohol by som zmazat anotacie pre table a columns, lebo nazvy suhlasia s tym co je v db
@Entity
@Table(name="Message")
public class Message {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "MESSAGE")
    private String message;

    //nemusim davat anotaciu column, lebo ma to iste meno ako v db
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CREATE_DATE")
    private Date create_date;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCREATE_DATE() {
        return create_date;
    }

    public void setCREATE_DATE(Date create_date) {
        this.create_date = create_date;
    }
}
