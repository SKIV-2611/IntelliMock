import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.mockserver.client.MockServerClient;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.matchers.MatchType;
import org.mockserver.model.HttpStatusCode;
//import org.mockserver.model.JsonBody.json;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;
import static org.mockserver.model.JsonBody.json;
import static org.mockserver.stop.Stop.stopQuietly;


public class SmartMock {
    private static ClientAndServer proxy;
    private static ClientAndServer mockServer;

    @BeforeClass
    public static void startIntelliMock() {
        proxy = ClientAndServer.startClientAndServer();
        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", String.valueOf(proxy.getPort()));
        mockServer = ClientAndServer.startClientAndServer();
        System.setProperty("", String.valueOf(mockServer.getPort()));
    }
    @AfterClass
    public static void stopIntelliMock() {
        stopQuietly(mockServer);
        stopQuietly(proxy);
        System.clearProperty("http.proxyHost");
        System.clearProperty("http.proxyPort");
    }

    public static void main(String[] args) {
        

    }
}
