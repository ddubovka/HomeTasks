package ru.dubovka.task6;

public class Fundrising {
    private String name;
    private String comments;
    int sumDonations;

    public Fundrising(String name, String comments, int sumDonations) {
        this.name = name;
        this.comments = comments;
        this.sumDonations = sumDonations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getSumDonations() {
        return sumDonations;
    }

    public void setSumDonations(int sumDonations) {
        this.sumDonations = sumDonations;
    }

    @Override
    public String toString() {
        return "Fundrising{" +
                "name='" + name + '\'' +
                ", comments='" + comments + '\'' +
                ", sumDonations=" + sumDonations +
                '}';
    }
}

