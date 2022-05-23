package za.ac.cput.domain.user;

/* Secretary.java
   Entity for the Secretary
   Author: Joshua Daniel Jonkers(215162668)
   Date: 22/05/2022
 */

public class Secretary {
    private String secretaryID;
    private String firstName;
    private String lastName;
    private String dob;

    private Secretary(Builder builder) {
        this.secretaryID =builder.secretaryID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dob = builder.dob;
    }

    public String getSecretaryID() {
        return secretaryID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "secretaryID='" + secretaryID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }

    public static class Builder {
        private String secretaryID;
        private String firstName;
        private String lastName;
        private String dob;

        public Builder setSecretaryID(String secretaryID) {
            this.secretaryID = secretaryID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return  this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setDob(String dob) {
            this.dob = dob;
            return this;
        }

        public Builder copy(Secretary secretary) {
            this.secretaryID = secretary.secretaryID;
            this.firstName = secretary.firstName;
            this.lastName = secretary.lastName;
            this.dob = secretary.dob;
            return this;
        }

        public Secretary build() {
            return new Secretary(this);
        }
    }
}
