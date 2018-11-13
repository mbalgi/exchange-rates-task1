package exchange.rates.task1.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import exchange.rates.task1.dto.response.CurrencyExchangeResponse;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;

import javax.inject.Inject;
import java.io.IOException;
import java.util.Map;


@Controller("/api")
public class CurrencyExchangeController {

    @Client("https://free.currencyconverterapi.com/api/v6")
    @Inject
    RxHttpClient currencyExchangeExternalClient;

    @Get("/v1/{from_currency}/{to_currency}/{from_amount}")
    public CurrencyExchangeResponse getCurrencyExchangeRate(String from_currency, String to_currency, double from_amount) throws IOException {

        String fromToCurrency = from_currency +"_" + to_currency;
        String body = currencyExchangeExternalClient.toBlocking().retrieve(HttpRequest.GET("/convert?q=" + fromToCurrency + "&compact=y"));

        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> responseMap = (Map<String, Object>) mapper.readValue(body, Map.class).get(fromToCurrency);
        double exchangeRate = (double) responseMap.get("val");

        return new CurrencyExchangeResponse(from_currency, to_currency, from_amount, from_amount*exchangeRate, exchangeRate);
    }
}
