package com.example.springOne;

import lombok.*;


@ToString
@Getter
@Builder
@Data
@Setter
public class Bed {
        private String ward;
        private int totalBeds;
        private int occupiedBeds;
        private int availableBeds;

        public Bed(String ward, int totalBeds, int occupiedBeds, int availableBeds) {
            this.ward = ward;
            this.totalBeds = totalBeds;
            this.occupiedBeds = occupiedBeds;
            this.availableBeds = availableBeds;
        }

        // Getters and setters


    }



