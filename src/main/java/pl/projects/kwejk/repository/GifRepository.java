package pl.projects.kwejk.repository;

import pl.projects.kwejk.model.Gif;
import java.util.ArrayList;
import java.util.List;

public class GifRepository {
    private static List<Gif> ALL_GIFS = new ArrayList<>();

    static{
        ALL_GIFS.add(new Gif("android-explosion"));
        ALL_GIFS.add(new Gif("ben-and-mike"));
        ALL_GIFS.add(new Gif("book-dominos"));
        ALL_GIFS.add(new Gif("compiler-bot"));
        ALL_GIFS.add(new Gif("cowboy-coder"));
        ALL_GIFS.add(new Gif("infinite-andrew"));
    }

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }
}
