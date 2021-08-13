package app.with.pojo.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;

import java.nio.charset.StandardCharsets;

public class UserDeserializer   {

    private Gson gson =
            new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();


    public String Test(User user)

    {
        return "";
    }

    public User deserialize(byte[] bytes) {
        if (bytes == null) return null;
        return gson.fromJson(new String(bytes, StandardCharsets.UTF_8), User.class);
    }
}
