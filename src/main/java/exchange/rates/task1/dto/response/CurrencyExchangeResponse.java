package exchange.rates.task1.dto.response;

public class CurrencyExchangeResponse {

    private String from_Currency;
    private String to_Currency;
    private double from_amount;
    private double to_amount;
    private double exchange_rate;

    public CurrencyExchangeResponse() {
    }

    public CurrencyExchangeResponse(String from_Currency, String to_Currency, double from_amount, double to_amount, double exchange_rate) {
        this.from_Currency = from_Currency;
        this.to_Currency = to_Currency;
        this.from_amount = from_amount;
        this.to_amount = to_amount;
        this.exchange_rate = exchange_rate;
    }

    public String getFrom_Currency() {
        return from_Currency;
    }

    public void setFrom_Currency(String from_Currency) {
        this.from_Currency = from_Currency;
    }

    public String getTo_Currency() {
        return to_Currency;
    }

    public void setTo_Currency(String to_Currency) {
        this.to_Currency = to_Currency;
    }

    public double getFrom_amount() {
        return from_amount;
    }

    public void setFrom_amount(double from_amount) {
        this.from_amount = from_amount;
    }

    public double getTo_amount() {
        return to_amount;
    }

    public void setTo_amount(double to_amount) {
        this.to_amount = to_amount;
    }

    public double getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(double exchange_rate) {
        this.exchange_rate = exchange_rate;
    }
}
