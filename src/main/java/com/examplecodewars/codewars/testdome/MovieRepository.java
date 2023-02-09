package com.examplecodewars.codewars.testdome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.util.LinkedCaseInsensitiveMap;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
// 10 min
class Movie {
    public String name;
    public int year;
    public int rating;

    public Movie(String name, int year, int rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }
}
@Configuration
@Import(MovieRepository.class)
class Config {
    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
        return ds;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DriverManagerDataSource ds) {
        return new JdbcTemplate(ds);
    }
}
@Repository
public class MovieRepository {

    @Autowired
    private JdbcTemplate template;

    @PostConstruct
    public void createTable() {
        template.execute("CREATE TABLE movies (id bigint auto_increment primary key, name VARCHAR(50), year int, rating int)");
    }

    public void createMovie(String name, int year, int rating) {
        template.update(
                "INSERT INTO movies(name, year, rating) VALUES (?, ?, ?)",
                name, year, rating
        );

//        template.execute("INSERT INTO movies VALUES (100, " + name + "," + year + "," +  rating + ")");
    }

    public List<Movie> findMoviesByName(String likeName) {
        List<Movie> movies = new ArrayList<>();
        String query = "SELECT * FROM movies where name like '" + likeName +"'";
        final List<Map<String, Object>> results = template.queryForList(query);

        System.out.println(results.get(0));


        for (Object result : results) {
            LinkedCaseInsensitiveMap map =  (LinkedCaseInsensitiveMap )result;
            System.out.println(result.getClass());

            String name = (String)map.get("name");
            int year = (int)map.get("year");
//
            int rating = (int)map.get("rating");


            Movie movie = new Movie(name, year, rating);
//            Movie movie = new Movie("fwer", 99, 9);
            movies.add(movie);

        }

        return movies;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext();
        config.register(Config.class);
        config.refresh();
        MovieRepository repository = config.getBean(MovieRepository.class);

        repository.createMovie("Some movie", 1974, 3);
        repository.createMovie("Some other movie", 1993, 2);

        List<Movie> movies = repository.findMoviesByName("Some%");
        for(Movie movie : movies) {
            System.out.println(movie.name + " - " + movie.year + " - " + movie.rating);
        }
    }
}

