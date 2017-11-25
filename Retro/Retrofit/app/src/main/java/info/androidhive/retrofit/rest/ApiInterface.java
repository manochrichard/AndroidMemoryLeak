package info.androidhive.retrofit.rest;

import org.json.JSONObject;

import info.androidhive.retrofit.model.MoviesResponse;
import info.androidhive.retrofit.model.ServerResponse;
import info.androidhive.retrofit.model.ServerValue;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

    @POST("handler1.ashx")
    @Headers({
            "interface:RestAPI",
            "method:getCustomers",
            "parameters:{}"
    })

    Call<ServerResponse> getCustomers();
}
