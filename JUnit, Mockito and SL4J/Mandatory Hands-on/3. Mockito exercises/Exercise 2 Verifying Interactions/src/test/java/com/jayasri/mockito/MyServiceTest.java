package com.jayasri.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    void verifyInteractionWithDependency() {
        ExternalApi apiMock = Mockito.mock(ExternalApi.class);

        when(apiMock.fetchInformation()).thenReturn("Mockito");

        MyService service = new MyService(apiMock);

        service.fetchData();

        verify(apiMock, times(1)).fetchInformation();
    }
}
