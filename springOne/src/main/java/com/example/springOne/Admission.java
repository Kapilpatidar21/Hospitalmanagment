package com.example.springOne;

public class Admission {
        private int id;
        private String name;
        private String admissionDate;
        private String ward;

        public Admission(int id, String name, String admissionDate, String ward) {
            this.id = id;
            this.name = name;
            this.admissionDate = admissionDate;
            this.ward = ward;
        }

        // Getters and setters

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

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    @Override
    public String toString() {
        return "Admission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                ", ward='" + ward + '\'' +
                '}';
    }
}


