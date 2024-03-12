package com.mytests.springmvc.javaonly.jspViewRes.data;

/**
 * by Irina.Petrovskaya, on 13.11.12, 18:53
 */
public class Tester {
    private String firstname;
        private String lastname;

        public Tester() {
        }

        public Tester(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;

        }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
