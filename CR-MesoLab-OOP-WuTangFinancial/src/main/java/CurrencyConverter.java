import java.text.NumberFormat;
import java.util.HashMap;

public class CurrencyConverter {


    private HashMap<String, Float> converter;


    public CurrencyConverter() {
        converter = new HashMap<String, Float>();
        converter.put("USD", 1.00F);
        converter.put("EUR", 0.94F);
        converter.put("GBP", 0.82F);
        converter.put("INR", 68.32F);
        converter.put("AUD", 1.35F);
        converter.put("CAD", 1.32F);
        converter.put("SGD", 1.43F);
        converter.put("CHF", 1.01F);
        converter.put("MYR", 4.47F);
        converter.put("JPY", 115.84F);
        converter.put("CNY", 6.92F);
    }

    public String makeConversion(String fromCurrencyCode, String toCurrencyCode, Float amountToConvert) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        String result = currencyFormatter.format(converter.get(toCurrencyCode) / (converter.get(fromCurrencyCode)) * amountToConvert);
        return result;
    }


    public static void main(String[] args) {
        CurrencyConverter test = new CurrencyConverter();
        System.out.println(test.makeConversion("CAD", "CHF", 200.00F));
    }
}