package ru.dubovka.task6;

public class SaveNotreDameDeParis {

    public static void main(String[] args) {
        CorporationDonor vatican = new CorporationDonor("Vatican", "For the dome and apostles' statues",
                100000, "Maria Bagiolly");

        vatican.setExpertsCorporationDonations("Maria Bagiolly");

        Cathedral apostlesStatues = new Cathedral("Apostles' Statues = 12",
                30, 569);

        Restoration group1 = new Restoration(30, new Cathedral[]{apostlesStatues},
                "sculptors", 1500);


        System.out.println(group1);
    }
}

