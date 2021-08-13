package app.with.pojo.serialization;

import com.google.gson.Gson;

import java.nio.charset.StandardCharsets;

public class UserSerializer {

    private Gson gson = new Gson();


    public byte[] serialize(User user) {
        if (user == null) return null;
        return gson.toJson(user).getBytes(StandardCharsets.UTF_8);
    }
}
