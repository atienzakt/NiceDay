package practice.katienza.niceday;

import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by katienza on 7/5/2016.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.RecycleViewHolder> {

    private List<Card> contents;

    public CardAdapter(List<Card> contents) {
        this.contents = contents;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.picture_card, parent, false);
        return new RecycleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
        holder.title.setText(contents.get(position).getTitle());
        holder.guide.setText(contents.get(position).getGuide());
        //holder.src.setImageDrawable(contents.get(position).getSrc());
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder {

        private TextView guide;
        private TextView title;
        private ViewFlipper flips;
        private RecycleViewHolder(View itemView) {
            super(itemView);
            guide = (TextView) itemView.findViewById(R.id.browse_guide);
            title = (TextView) itemView.findViewById(R.id.card_title);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
