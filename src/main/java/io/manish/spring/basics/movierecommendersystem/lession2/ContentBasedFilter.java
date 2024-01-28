package io.manish.spring.basics.movierecommendersystem.lession2;

public class ContentBasedFilter implements Filter{

    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
