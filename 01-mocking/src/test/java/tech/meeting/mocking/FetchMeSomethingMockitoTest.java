package tech.meeting.mocking;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author cyberroadie
 *         Date: 15/06/11
 */
@RunWith(MockitoJUnitRunner.class)
public class FetchMeSomethingMockitoTest {

    @Mock
    Fetcher fetcher;

    @InjectMocks
    FetchMeSomething fetchMeSomething = new FetchMeSomething();

    @Test
    public void testFetching() throws Exception {
        when(fetcher.getMeAString("string")).thenReturn("okok");

        String result = fetchMeSomething.fetching();
        assertEquals("ok", result);

    }


}
