package com.duoc.proyecto_semana2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/peliculas")
public class MoviesController {

    @Autowired
    private MovieRepository movieRepository;

    // Endpoint para obtener todas las películas
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    // Endpoint para obtener una película por ID
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable int id) {
        return movieRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable int id) {
        movieRepository.deleteById(id);
    }
}
