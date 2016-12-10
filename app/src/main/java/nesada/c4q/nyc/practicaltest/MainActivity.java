package nesada.c4q.nyc.practicaltest;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import nesada.c4q.nyc.practicaltest.adapter.DataAdapter;

public class MainActivity extends AppCompatActivity {


    RecyclerView mRvSavedResuslts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},   //request specific permission from user
                    10);
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.INTERNET},   //request specific permission from user
                    10);

            return;
        }

        mRvSavedResuslts = (RecyclerView) findViewById(R.id.rv_saved_results);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRvSavedResuslts.setLayoutManager(manager);
        mRvSavedResuslts.setAdapter(new DataAdapter(this));



//        mId = (TextView)findViewById(R.id.id);
//        mTitle = (TextView)findViewById(R.id.title);
//        mExcerpt = (TextView)findViewById(R.id.excerpt);
//        mDate = (TextView)findViewById(R.id.date);

    }

//   public void onClickbtn() {
//        Download.Factory.getInstance().getWP().enqueue(new Callback<WP>() {
//            @Override
//            public void onResponse(Call<WP> call, Response<WP> response) {
//                mId.setText(response.body().getPosts().get(0).getId()+"");
//                mTitle.setText(response.body().getPosts().get(0).getTitle());
//                mExcerpt.setText(response.body().getPosts().get(0).getExcerpt());
//                mDate.setText(response.body().getPosts().get(0).getDate());
//
//            }
//
//            @Override
//            public void onFailure(Call<WP> call, Throwable t) {
//                Log.e("test","Failed");
//            }
//        });
//    }

    @Override
    protected void onResume() {
        super.onResume();
//        onClickbtn();
    }
}
