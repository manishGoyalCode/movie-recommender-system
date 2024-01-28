package io.manish.spring.basics.movierecommendersystem.lession2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommenderImplementation = new RecommenderImplementation(new ContentBasedFilter());
		String[] result = recommenderImplementation.recommendMovies("Finding dora");
		System.out.println(Arrays.toString(result));
//		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
	}

}
