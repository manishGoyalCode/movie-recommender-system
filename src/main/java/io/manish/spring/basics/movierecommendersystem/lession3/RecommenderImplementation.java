package io.manish.spring.basics.movierecommendersystem.lession3;

public class RecommenderImplementation {

    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        //return the results
        System.out.println("Name of the filter in use: " + filter + "\n");
       // ContentBasedFilter contentBasedFilter = new ContentBasedFilter();
        return filter.getRecommendations(movie);
    }
}
