package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainMovieStory {
    public static void main(String[] args) {
        MovieStory movieStory = new MovieStory();
        Map<String, List<String>> movieMap = movieStory.getMovies();

        String result = movieMap.entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining(" ! ", "The list: ", "."))
                        .toString();
        System.out.println(result);

         /*System.out.println(movieMap.entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining(" ! ", "The list: ", ".")));*/
    }
}
