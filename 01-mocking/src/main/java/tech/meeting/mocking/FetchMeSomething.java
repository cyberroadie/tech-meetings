package tech.meeting.mocking;

/**
 * @author cyberroadie
 *         Date: 15/06/11
 */
public class FetchMeSomething {

    private Fetcher fetcher;

    public String fetching() {
//        fetcher.getMeAString(1);
        return doSomething(fetcher.getMeAString("string"));
//        return doSomething(fetcher.getMeAString(1));

    }

    public Fetcher getFetcher() {
        return fetcher;
    }

    public void setFetcher(Fetcher fetcher) {
        this.fetcher = fetcher;
    }

    public String doSomething(String s) {
        return s.substring(2);
    }
}
