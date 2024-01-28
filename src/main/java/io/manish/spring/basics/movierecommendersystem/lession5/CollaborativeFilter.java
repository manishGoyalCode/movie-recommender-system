package io.manish.spring.basics.movierecommendersystem.lession5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Lession 2 Loose coupling","Happy Feet", "Ice Age", "Shark Tale"};
    }
}
