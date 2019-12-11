package eu.kardzys.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

public class Application {

    private static final int PORT = 8089;

    public static void main(String[] args) {
        WireMockConfiguration config = wireMockConfig()
                .port(PORT)
                .usingFilesUnderClasspath("wiremock")
                .extensions(new ResponseTemplateTransformer(true));
        WireMockServer wireMockServer = new WireMockServer(config);
        wireMockServer.start();
    }

}
