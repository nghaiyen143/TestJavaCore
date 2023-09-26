package qlnv.model;

public class Certification {
    protected static int INDEX=0;
    protected int id;
    protected String name;
    protected int rank;

    public Certification() {
    }

    public Certification(String name, int rank) {
        this.id = ++INDEX;
        this.name = name;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
