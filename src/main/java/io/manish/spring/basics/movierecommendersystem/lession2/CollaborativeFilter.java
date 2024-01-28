package io.manish.spring.basics.movierecommendersystem.lession2;

public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Lession 2 Loose coupling","Happy Feet", "Ice Age", "Shark Tale"};
    }
}
