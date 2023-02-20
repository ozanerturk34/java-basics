package EnumsAdvancedUsage;

public enum Color {
    RED("nice"), GREEN("boise"), BLUE("juice");

    private String meaning;

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    Color(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        // .name() gets the name value of enum
        return this.name()+"{" +
                "meaning='" + meaning + '\'' +
                '}';
    }
}
