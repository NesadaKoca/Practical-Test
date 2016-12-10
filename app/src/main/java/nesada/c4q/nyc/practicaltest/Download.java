package nesada.c4q.nyc.practicaltest;

import nesada.c4q.nyc.practicaltest.models.WP;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface Download {

    String BASE_URL = "https://vine.co/";


    @GET("api/timelines/users/918753190470619136")
    Call<WP> getWP();



    class Factory {
        private static Download service;

        public static Download getInstance() {

            if (service == null) {
                Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(BASE_URL)
                        .build();

                service = retrofit.create(Download.class);
                return service;
            } else {
                return service;
            }

        }
    }

}

