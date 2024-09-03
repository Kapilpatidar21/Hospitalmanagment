package com.example.springOne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HospitalController {

        @GetMapping("/api/opd")
        public List<Patient> getOpdData() {
            return Arrays.asList(
                    new Patient(1, "John Doe", "10:00 AM", "Waiting"),
                    new Patient(2, "Jane Smith", "10:30 AM", "In Consultation")
            );
        }

        @GetMapping("/api/beds")
        public List<Bed> getBedsData() {
           Bed obj =new Bed("kapil",5,2,7);
          // obj.settotalBeds(2);
           return null;
//                    new Bed("General", 50, 45, 5),
//                    new Bed("ICU", 20, 18, 2)

        }

        @GetMapping("/api/admissions")
        public List<Admission> getAdmissionsData() {
            return Arrays.asList(
                    new Admission(101, "Michael Brown", "2024-09-01", "General"),
                    new Admission(102, "Emily White", "2024-09-02", "ICU")
            );
        }

        @GetMapping("/api/inventory")
        public List<InventoryItem> getInventoryData() {
            return Arrays.asList(
                    new InventoryItem(1, "Paracetamol", 500, "In Stock"),
                    new InventoryItem(2, "Syringes", 200, "Low Stock")
            );
        }
    }


