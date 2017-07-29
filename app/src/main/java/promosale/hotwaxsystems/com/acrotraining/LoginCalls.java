package promosale.hotwaxsystems.com.acrotraining;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by lalitkushwah on 28/07/17.
 */

public interface LoginCalls {

    @FormUrlEncoded
    @POST("connectus/login.php")
    Call<Login> authorizeUser(@Field("mobile") String mobile, @Field("password") String password);



}
