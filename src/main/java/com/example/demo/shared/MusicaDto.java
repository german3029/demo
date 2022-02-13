package com.example.demo.shared;

public class MusicaDto {
    private String Id;
    private String titulo;
    private String artita;
    private String album;
    private String genero;
    private Integer ano;
    
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtita() {
        return artita;
    }
    public void setArtita(String artita) {
        this.artita = artita;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
    
}
