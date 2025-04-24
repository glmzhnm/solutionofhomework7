 import java.util.*;

public class ReverseSeasonIterator implements EpisodeIterator {
    private List<Episode> episodes;
    private int index;

    public ReverseSeasonIterator(List<Episode> episodes) {
        this.episodes = episodes;
        this.index = episodes.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Episode next() {
        if (hasNext()) {
            return episodes.get(index--);
        }
        return null;
    }
}
