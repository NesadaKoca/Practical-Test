package nesada.c4q.nyc.practicaltest.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nesada.c4q.nyc.practicaltest.Download;
import nesada.c4q.nyc.practicaltest.R;
import nesada.c4q.nyc.practicaltest.models.WP;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class DataAdapter extends RecyclerView.Adapter<Holder> {
    private LayoutInflater mInflater;
    public Context mContext;

    public DataAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
    }


    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.single_item_rv, parent, false);
        Holder holder = new Holder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(final Holder holder, final int position) {

        Download.Factory.getInstance().getWP().enqueue(new Callback<WP>() {
            @Override
            public void onResponse(Call<WP> call, Response<WP> response) {
                Log.e("TESTTT", response.body().getData().getCount() + "");
                holder.mLiked.setText(response.body().getData().getRecords().get(position).getLiked());
                holder.mUsername.setText(response.body().getData().getRecords().get(position).getUsername());
             holder.mColor.setBackground(Drawable.createFromPath(response.body().getData().getRecords().get(position).getProfileBackground() + ""));


            }

            @Override
            public void onFailure(Call<WP> call, Throwable t) {
                Log.e("test","Failed");
            }
        });

    }

    @Override
    public int getItemCount() {
        return 9;
    }
}
