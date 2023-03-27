package interfacesAndAbstractions.telephony;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        urls.stream().forEach(url -> {
            Matcher matcher = Pattern.compile("[\\d]").matcher(url);
            if (matcher.find()) {
                sb.append("Invalid URL!").append(System.lineSeparator());
            } else {
                sb.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            }
        });
        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        numbers.stream().forEach(n -> {
            Matcher matcher = Pattern.compile("[\\D]").matcher(n);
            if (matcher.find()) {
                sb.append("Invalid number!").append(System.lineSeparator());
            } else {
                sb.append("Calling... ").append(n).append(System.lineSeparator());
            }
        });
        return sb.toString().trim();
    }
}
