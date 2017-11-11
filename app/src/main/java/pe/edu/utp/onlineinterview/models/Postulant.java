package pe.edu.utp.onlineinterview.models;

/**
 * Created by Cristian on 10/11/2017.
 */

public class Postulant {
    private int id;
    private String state;
    private String description;


    public int getId() {
        return id;
    }

    public Postulant setId(int id) {
        this.id = id;
        return this;
    }

    public String getState() {
        return state;
    }

    public Postulant setState(String state) {
        this.state = state;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Postulant setDescription(String description) {
        this.description = description;
        return this;
    }
}
