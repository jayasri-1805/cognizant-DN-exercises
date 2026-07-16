package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class MyServiceTest {

    @Test
    void shouldReturnStubbedResponse() {
        ExternalApi apiStub = Mockito.mock(ExternalApi.class);

        when(apiStub.fetchRemoteValue()).thenReturn("Mock Data");

        MyService service = new MyService(apiStub);

        assertEquals("Mock Data", service.fetchData());
    }
}
