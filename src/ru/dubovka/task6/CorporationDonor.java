package ru.dubovka.task6;

public class CorporationDonor extends Fundrising {

    private String expertsCorporationDonations;

    public CorporationDonor(String name, String comments, int sumDonations, String expertsCorporationDonations) {
        super(name, comments, sumDonations);
        this.expertsCorporationDonations = expertsCorporationDonations;
    }


    public String getExpertsCorporationDonations() {
        return expertsCorporationDonations;
    }

    public void setExpertsCorporationDonations(String expertsCorporationDonations) {
        this.expertsCorporationDonations = expertsCorporationDonations;
    }

    @Override
    public String toString() {
        return "CorporationDonor{" +
                "expertsCorporationDonations='" + expertsCorporationDonations + '\'' +
                '}';
    }
}
