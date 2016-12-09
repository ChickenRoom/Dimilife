package chickens.org.dimilife.HTTPConnection;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by JunHyeok on 2016. 12. 9..
 */

public interface LoginService {
    @GET("v1/users/identify")
    Call<User> basicLogin(@Query("username") String id,
                          @Query("password") String password);
}
