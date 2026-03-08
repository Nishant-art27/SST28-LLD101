package com.example.reports;

/**
 * CampusVault demo using Proxy pattern.
 */
public class App {

    public static void main(String[] args) {
        User student = new User("Jasleen", "STUDENT");
        User faculty = new User("Prof. Noor", "FACULTY");
        User admin = new User("Kshitij", "ADMIN");

        // Use proxies instead of direct ReportFile
        Report publicReport = new ReportProxy("R-101", "Orientation Plan", "PUBLIC");
        Report facultyReport = new ReportProxy("R-202", "Midterm Review", "FACULTY");
        Report adminReport = new ReportProxy("R-303", "Budget Audit", "ADMIN");

        ReportViewer reportViewer = new ReportViewer();

        System.out.println("=== CampusVault Demo ===\n");

        reportViewer.open(publicReport, student);
        System.out.println();

        reportViewer.open(facultyReport, student);
        System.out.println();

        reportViewer.open(facultyReport, faculty);
        System.out.println();

        reportViewer.open(adminReport, admin);
        System.out.println();

        reportViewer.open(adminReport, admin);
    }
}