package org.example.models;

public class Celda {
    private TipoCelda content;

    public Celda(TipoCelda content) {
        this.content = content;
    }

    public TipoCelda getContent() {
        return content;
    }

    public void setContent(TipoCelda content) {
        this.content = content;
    }
}
