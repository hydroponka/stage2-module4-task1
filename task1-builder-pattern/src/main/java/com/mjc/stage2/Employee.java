package com.mjc.stage2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Employee {
    private String name;
    private String lastName;
    private String position;
    private String phone;
    private String email;
    private String carNumber;

    public Employee() {
    }
    private Employee(EmployeeBuilder builder){
        this.name = builder.name;
        this.lastName = builder.name;
        this.phone = builder.phone;
        this.email = builder.email;
        this.position = builder.position;
        this.carNumber = builder.carNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
            private String name;
            private String lastName;
            private String position;
            private String phone;
            private String email;
            private String carNumber;

            public EmployeeBuilder setName(String name){
                this.name = name;
                return this;
            }
            public EmployeeBuilder setLastName(String lastName){
                this.lastName = lastName;
                return this;
            }
            public EmployeeBuilder setPosition(String position){
                this.position = position;
                return this;
            }
            public EmployeeBuilder setPhone(String phone){
                this.phone = phone;
                return this;
            }
            public EmployeeBuilder setEmail(String email){
                this.email = email;
                return this;
            }
            public EmployeeBuilder setCarNumber(String carNumber){
                this.carNumber = carNumber;
                return this;
            }
            public Employee build(){
                return new Employee(this);
            }

    }
}
