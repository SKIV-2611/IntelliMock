import org.mockserver.client.MockServerClient;

import static org.mockserver.model.HttpRequest.request;

public class SmartMock {
    public static void main(String[] args) {
        MockServerClient mockServerClient = new MockServerClient("localhost", 1080)
                .when(
                        request()
                                .withMethod("POST")
                                .withPath("")
                                .withBody(
                                        json("{" + System.lineSeparator() +
                                                "    id:"
                                        )
                                )
                );

    }
}
