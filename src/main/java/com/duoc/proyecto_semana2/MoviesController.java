package com.duoc.proyecto_semana2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class MoviesController {

    private List<Movie> movies = new ArrayList<>();

    public MoviesController() {
        movies.add(new Movie(1, "Shrek", 2001, "Andrew Adamson", "Animación", "Un ogro llamado Shrek emprende una misión para rescatar a una princesa."));
        movies.add(new Movie(2, "Megamente", 2010, "Tom McGrath", "Animación", "Un supervillano descubre su propósito cuando finalmente derrota a su rival."));
        movies.add(new Movie(3, "El Rey León", 1994, "Roger Allers", "Animación", "Simba, un joven león, lucha por reclamar su lugar como rey."));
        movies.add(new Movie(4, "Buscando a Nemo", 2003, "Andrew Stanton", "Animación", "Un pez payaso cruza el océano para encontrar a su hijo perdido."));
        movies.add(new Movie(5, "Bichos", 1998, "John Lasseter", "Animación", "Una hormiga busca ayuda para salvar a su colonia de unos saltamontes."));
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movies;
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null; 
    }
}
