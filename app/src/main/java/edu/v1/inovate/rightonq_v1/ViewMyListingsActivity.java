package edu.v1.inovate.rightonq_v1;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import edu.v1.inovate.rightonq_v1.objects.Post;
import edu.v1.inovate.rightonq_v1.objects.PostsAdapter;

public class ViewMyListingsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PostsAdapter adapter;
    private List<Post> postList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_my_listings);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        postList = new ArrayList<>();
        adapter = new PostsAdapter(this, postList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        preparePosts();

    }

    /**
     * Adding few albums for testing
     */
    private void preparePosts() {

        postList.add(new Post(
                "Reserve table",
                "Get table at 10:00 PM",
                "John Doe",
                500,
                false
        ));

        postList.add(new Post(
                "Appointment schedule",
                "Schedule appointment for 11:00 AM.",
                "Eliza Schuyler",
                300,
                true
        ));


        postList.add(new Post(
                "Buy tickets",
                "Buy tickets for Comic Con 2018 today.",
                "Lettie Lutz",
                500,
                false
        ));

        adapter.notifyDataSetChanged();
    }

}
