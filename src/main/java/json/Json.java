package json;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class Json {

    private static OkHttpClient client = new OkHttpClient();

    private static String getConn(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String getJson(String url) {
        String json;
        while (true) {
            try {
                json = Json.getConn(url);
                break;
            } catch (IOException e) {}
        }
        return json;
    }
}
