package com.jwt.sample.models;

public class JwtResponse {

    private String jwtToken;
    private String user;

    // Constructor
    public JwtResponse(String jwtToken, String user) {
        this.jwtToken = jwtToken;
        this.user = user;
    }

    // Getters and Setters
    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
