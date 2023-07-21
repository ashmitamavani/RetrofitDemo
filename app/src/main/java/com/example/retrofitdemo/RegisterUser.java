package com.example.retrofitdemo;

public class RegisterUser
{
    int connection;
    int result;

    public int getConnection() {
        return connection;
    }

    public void setConnection(int connection) {
        this.connection = connection;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "RegisterUser{" +
                "connection=" + connection +
                ", result=" + result +
                '}';
    }
}
