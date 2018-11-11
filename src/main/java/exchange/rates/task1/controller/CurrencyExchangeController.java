package exchange.rates.task1.controller;

import exchange.rates.task1.dto.response.CurrencyExchangeResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;


@Controller("/api/v1")
public class CurrencyExchangeController {

    @Get("/{from_currency}/{to_currency}/{from_amount}")
    public CurrencyExchangeResponse getCurrencyExchangeRate(String from_currency, String to_currency, double from_amount) {

        return new CurrencyExchangeResponse("AED", "INR", 1.0, 19.78, 19.79);
    }
}
