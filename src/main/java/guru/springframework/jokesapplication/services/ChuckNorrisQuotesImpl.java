package guru.springframework.jokesapplication.services;

import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesImpl implements ChuckNorrisQuotes {

    @Override
    public String getRandomQuote() {
        return "from inside getRandomQuote()";
    }

}
