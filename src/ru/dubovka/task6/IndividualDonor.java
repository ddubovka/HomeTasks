package ru.dubovka.task6;

public class IndividualDonor extends Fundrising {
    private String expIndividualDonations;

    public IndividualDonor(String name, String comments, int sumDonations, String expIndividualDonations) {
        super(name, comments, sumDonations);
        this.expIndividualDonations = expIndividualDonations;
    }


    public String getExpIndividualDonations() {
        return expIndividualDonations;
    }

    public void setExpIndividualDonations(String expIndividualDonations) {
        this.expIndividualDonations = expIndividualDonations;
    }

    @Override
    public String toString() {
        return "IndividualDonor{" +
                "expIndividualDonations='" + expIndividualDonations + '\'' +
                '}';
    }
}
