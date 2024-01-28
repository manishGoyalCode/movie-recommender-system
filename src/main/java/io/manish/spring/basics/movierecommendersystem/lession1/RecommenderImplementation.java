package io.manish.spring.basics.movierecommendersystem.lession1;

public class RecommenderImplementation {
    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        //return the results
        ContentBasedFilter contentBasedFilter = new ContentBasedFilter();
        String[] results = contentBasedFilter.getRecommendations(movie);
        return results;
    }
}
