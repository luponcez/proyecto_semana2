package com.duoc.proyecto_semana2;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int year;
    private String director;
    private String genre;
    private String synopsis;


    public Movie() {
    }


    public Movie(int id, String title, int year, String director, String genre, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public int getId() {
        return id;
    }

    public String getTitle() { 
        return title; 
    }

    public int getYear() { 
        return year;
    }

    public String getDirector() { 
        return director; 
    }

    public String getGenre() { 
        return genre; 
    }

    public String getSynopsis() { 
        return synopsis; 
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public void setTitle(String title) { 
        this.title = title; 
    }

    public void setYear(int year) { 
        this.year = year; 
    }

    public void setDirector(String director) { 
        this.director = director; 
    }

    public void setGenre(String genre) { 
        this.genre = genre; 
    }

    public void setSynopsis(String synopsis) { 
        this.synopsis = synopsis; 
    }
}
