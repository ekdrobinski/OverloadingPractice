public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;
    private boolean isOnNetflix;

    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    public TvShow(String showName, int numberOfEpisodes, String genre, boolean isOnNetflix) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
        this.isOnNetflix = isOnNetflix;
    }

    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "The name of the show is " + showName + " with " + numberOfEpisodes + " episodes. The genre is " + genre;
    }
}
