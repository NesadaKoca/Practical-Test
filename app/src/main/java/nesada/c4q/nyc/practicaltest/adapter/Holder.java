package nesada.c4q.nyc.practicaltest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nesada.c4q.nyc.practicaltest.R;


public class Holder extends RecyclerView.ViewHolder {

    TextView mLiked, mUsername;
    View mColor;

    public Holder(View itemView) {
        super(itemView);
        mLiked = (TextView)itemView.findViewById(R.id.liked);
       mUsername = (TextView)itemView.findViewById(R.id.username);
        mColor = itemView.findViewById(R.id.layoutId);
    }

}


