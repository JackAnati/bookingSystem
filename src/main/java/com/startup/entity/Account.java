package com.startup.entity;

import java.io.Serializable;

public class Account {

    private String name, surname, username, password, cellNo;

    private Account(){};

    private Account(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.username = builder.username;
        this.password = builder.password;
        this.cellNo = builder.cellNo;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getCellNo(){
        return cellNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", cellNo=" + cellNo +
                '}';
    }

    public static class Builder{
        private String name, surname, username, password, cellNo;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password){
            this.password = password;
            return this;
        }

        public Builder setCellNo(String cellNo){
            this.cellNo = cellNo;
            return this;
        }

        public Builder copy(Account account){
            this.name = account.name;
            this.surname = account.surname;
            this.username = account.username;
            this.password = account.password;
            this.cellNo = account.cellNo;

            return this;
        }

        public Account build(){
            return new Account(this);
        }

    }
}
