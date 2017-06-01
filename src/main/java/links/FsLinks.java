package links;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class FsLinks {

    public static String getLinkPlace(String coordinats, String name) {
        String Ename = null;
        String Ecoordinats = coordinats.replace(" ", ",");
        System.out.println(Ecoordinats + "....." + name);
        try {
            Ename = URLEncoder.encode(name, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "https://api.foursquare.com/v2/venues/search?ll=" + Ecoordinats + "&query=" + Ename + "&radius=2000&client_id=L3GEPMI5H2GUJSRWQHINPJ4SFLLS00CNJ1NVHAWALWRGJZF1&client_secret=0PL2QESHHH1TGDQZWHMPRRDGFGNHZEQVSOEQKM0II1OVSWOY&v=20170510";
    }

    public static String getLinkExplore(String coordinats, String selection) {
        String Ecoordinats = coordinats.replace(" ", ",");

        return "https://api.foursquare.com/v2/venues/explore?ll=" + Ecoordinats + "&section=" + selection + "&limit=3&radius=1000&client_id=L3GEPMI5H2GUJSRWQHINPJ4SFLLS00CNJ1NVHAWALWRGJZF1&client_secret=0PL2QESHHH1TGDQZWHMPRRDGFGNHZEQVSOEQKM0II1OVSWOY&v=20170510";
    }
}
