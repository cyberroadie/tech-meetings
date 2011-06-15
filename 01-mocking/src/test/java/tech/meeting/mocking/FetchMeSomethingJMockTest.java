package tech.meeting.mocking;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

/**
 * @author cyberroadie
 *         Date: 15/06/11
 */
@RunWith(JMock.class)
public class FetchMeSomethingJMockTest {

    Mockery context = new JUnit4Mockery();

    final Fetcher fetcher = context.mock(Fetcher.class);

    @Test
    public void testFetching() {
        FetchMeSomething fetchMeSomething = new FetchMeSomething();
        fetchMeSomething.setFetcher(fetcher);

        context.checking(new Expectations() {{
            oneOf (fetcher).getMeAString("string");
            will(returnValue("okok"));
        }});

        String result = fetchMeSomething.fetching();
        assertEquals("ok", result);

    }

}
