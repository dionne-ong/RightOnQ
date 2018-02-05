package edu.v1.inovate.rightonq_v1.objects;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import edu.v1.inovate.rightonq_v1.R;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {

    private Context mContext;
    private List<Post> postList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, desc, status, price;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.post_title);
            desc = (TextView) view.findViewById(R.id.post_desc);
            status = (TextView) view.findViewById(R.id.post_status);
            price = (TextView) view.findViewById(R.id.post_price);
        }
    }


    public PostsAdapter(Context mContext, List<Post> postList) {
        this.mContext = mContext;
        this.postList = postList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_posts, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.title.setText(post.getJobListing());
        holder.desc.setText(post.getJobDescription());
        holder.status.setText(post.getStatus());
        holder.price.setText("PHP " + post.getPrice());
    }


    @Override
    public int getItemCount() {
        return postList.size();
    }
}