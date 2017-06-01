package fs.categories;

import com.google.gson.Gson;
import json.Json;

import java.io.IOException;

public class GetCategories {

    public static Categ getCategories (){
        String json = Json.getJson("https://api.foursquare.com/v2/venues/categories?client_id=L3GEPMI5H2GUJSRWQHINPJ4SFLLS00CNJ1NVHAWALWRGJZF1&client_secret=0PL2QESHHH1TGDQZWHMPRRDGFGNHZEQVSOEQKM0II1OVSWOY&v=20170510");
        Gson gson = new Gson();

        Categ categories = gson.fromJson(json, Categ.class);

        return categories;
    }
}
