class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;
    private boolean isGood;
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public Book(String title, int numberOfPages, int publicationYear, boolean isGood) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
        this.isGood = isGood;
    }

    public String getTitle() {
        return title;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return "Title: " + title + ", Pages: " + numberOfPages + ", Publication Year: " + publicationYear;
    }
}