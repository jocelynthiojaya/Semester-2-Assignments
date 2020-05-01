public class Genus {
    private String genusName;

    public Genus(String g){ setGenusName(g); }

    public String getGenusName() {
        return genusName;
    }

    public void setGenusName(String genusName) {
        this.genusName = genusName;
    }

    public String toString() {
        return "Genus{" +
                "genusName='" + genusName + '\'' +
                '}';
    }
}
