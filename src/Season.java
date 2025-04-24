import java.util.*;
public class Season implements Iterable<Episode> {
    private List<Episode> episodes;

    public Season() {
        episodes = new ArrayList<>();
    }

    public void addEpisode(Episode e) {
        episodes.add(e);
    }
    public List<Episode> getEpisodes() {
        return episodes;
    }
    @Override
    public Iterator<Episode> iterator() {
        return new SeasonIterator(episodes);
    }
}