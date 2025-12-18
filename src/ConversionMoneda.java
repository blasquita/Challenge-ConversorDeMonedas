import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversionMoneda {

    private static final String APIKEY = System.getenv("API_KEY");

    public Moneda conversion(String monedaOrigen, String monedaDestino) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+APIKEY+"/pair/" + monedaOrigen + "/" + monedaDestino);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se puedo realizar la conversión");
        }


    }

}
