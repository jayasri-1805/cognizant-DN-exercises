package com.example;

public class MyService {

    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        String value = externalApi.fetchRemoteValue();
        return value == null ? "" : value.trim();
    }
}
