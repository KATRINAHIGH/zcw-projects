import okhttp3.*;

import java.io.IOException;

public class YouAreEll {

    private final static String ENDPOINT = "http://zipcode.rocks:8085";

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public String MakeURLCall(String path, String method, String jpayload) {
        String url = ENDPOINT + path;

        OkHttpClient client = new OkHttpClient();
        Request.Builder builder = new Request.Builder().url(url);

        if (method.equals("POST")) {
            RequestBody body = RequestBody.create(JSON, jpayload);
            builder = builder.post(body);
        } else if (method.equals("PUT")) {
            RequestBody body = RequestBody.create(JSON, jpayload);
            builder = builder.put(body);
        }

        Request request = builder.build();

        try {
            // here is where the request is being sent
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String get_ids() {
        return MakeURLCall("/ids", "GET", "");
    }

    public String get_messages() {
        return MakeURLCall("/messages", "GET", "");
    }

    public String post_id(String payload) {
        return MakeURLCall("/ids", "POST", payload);
    }

    public String post_message(String payload) {
        return MakeURLCall("/messages", "POST", payload);
    }

    public String put_id(String payload) {
        return MakeURLCall("/ids", "PUT", payload);
    }

    public String put_message(String payload) {
        return MakeURLCall("/messages", "PUT", payload);
    }

    public static void main(String[] args) {
        YouAreEll urlhandler = new YouAreEll();
//        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
//        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
        System.out.println(urlhandler.MakeURLCall("/ids", "POST", "{\"userid\":\"-\",\"name\":\"kat\",\"github\":\"KATRINAHIGH\"}"));
    }
}

//Class that serves as an http client. There's different types of clients ex kafka, http, database..... This
//is a way of hiding away all of the details of the network in one class.
//This class is going to make requests and return responses.


/**You're going to create a series of REST API handlers that will each perform a specific command.(Done on the server)
 * Each one of the command methods will then call a even lower-level method that makes a certain kind
 * of HTTP request (GET, POST, PUT) to specific filled-in URL.
 * All we are doing making a request and returning responses.*/