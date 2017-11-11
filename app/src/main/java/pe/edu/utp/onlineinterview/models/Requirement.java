package pe.edu.utp.onlineinterview.models;

/**
 * Created by Cristian on 11/11/2017.
 */

public class Requirement {
    private Postulant postulant;
    private Convocatory convocatory;

    public Postulant getPostulant() {
        return postulant;
    }

    public Requirement setPostulant(Postulant postulant) {
        this.postulant = postulant;
        return this;
    }

    public Convocatory getConvocatory() {
        return convocatory;
    }

    public Requirement setConvocatory(Convocatory convocatory) {
        this.convocatory = convocatory;
        return this;
    }
}
