import java.util.*;
import java.io.*;

 public class Employee {
    String name;
    String jobDescription;
    String contact;
    String email;
    double salary;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getJobDescription() {
         return jobDescription;
     }

     public void setJobDescription(String jobDescription) {
         this.jobDescription = jobDescription;
     }

     public String getContact() {
         return contact;
     }

     public void setContact(String contact) {
         this.contact = contact;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     public Employee(String name, String jobDescription, String contact, String email, double salary) {
        this.name = name;
        this.jobDescription = jobDescription;
        this.contact = contact;
        this.email = email;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Job Description: " + jobDescription + ", Contact: " + contact +
                ", Email: " + email + ", Salary: " + salary;
    }
}

