package crud.unlocked.inboxgmail.network;

import java.util.List;

import crud.unlocked.inboxgmail.model.Message;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Irelia on 3/6/2017.
 */

public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
