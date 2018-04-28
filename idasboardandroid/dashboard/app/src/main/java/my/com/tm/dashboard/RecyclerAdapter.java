package my.com.tm.dashboard;

/**
 * Created by user on 5/2/2018.
 */


import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import my.com.tm.dashboard.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] details = {"Plan Migrate Today",
            "Total YTD 2018 Migrated Cabinet",
            "Cabinet Under Monitoring by MCC",
            "Migration Progress SUBB",
            "Migration Progress E-Fiberization",
            "Un-Resolved TT",
            "Fault Rate YTD",
            "Total TT YTD 2018"};

    private String[] titles = {"200",
            "100", "10",
            "169", "71",
            "16", "10",
            "16"};

    private int[] images = { R.drawable.dashb,
            R.drawable.dashb,
            R.drawable.dashb,
            R.drawable.dashb,
            R.drawable.dashb,
            R.drawable.dashb,
            R.drawable.dashb,
            R.drawable.dashb,
            R.drawable.dashb};

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);



    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}