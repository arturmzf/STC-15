/**
 * Занятие № 20 [от 29.05.2019 (Ср)]
 * Темы:
 * - Сериализация
 * - Передача данных в формате XML
 * - Передача данных в формате JSON
 *
 * Музафаров Артур Ринатович
 */

package ru.muzafarov.task20date20190529;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;

public class Task20App {

    public static void main(String[] args) {

        System.out.println();
//      ChuckNorrisJokes chucky = new ChuckNorrisJokes(70, "success", "Ha-ha-ha", new String[] {"category1", "category2", "category3"});
//      ChuckNorrisJokes chucky = new ChuckNorrisJokes();
//
//      ObjectMapper objectMapper = new ObjectMapper();
//      objectMapper.writeValue(System.out, chucky);

        try {
            //URL url = new URL("https://cat-fact.herokuapp.com");
            //URL url = new URL("https://api.oceandrivers.com:443/v1.0/getWeatherDisplay/cnarenal/?period=latestdata");
            URL url = new URL("http://api.icndb.com/jokes/random");
            try (InputStream is = url.openStream();
                 Reader reader = new InputStreamReader(is);
                 BufferedReader br = new BufferedReader(reader);
            ){

                ObjectMapper objectMapper = new ObjectMapper();
                ChuckNorrisJokes chucky = objectMapper.readValue(reader, ChuckNorrisJokes.class);
//              ChuckNorrisJokes chucky = objectMapper.readValue(reader, ChuckNorrisJokes.class);



//              ObjectMapper objectMapper = new ObjectMapper();
//              objectMapper.writeValue(System.out, chucky);

                System.out.println(chucky);
//              chucky.toString();
//              System.out.println(br.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
