package practice.katienza.niceday;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by katienza on 7/5/2016.
 */
public class OverlapDecoration extends RecyclerView.ItemDecoration {

    private final static int leftOverlap = -90;

    @Override
    public void getItemOffsets (Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        outRect.set(leftOverlap, 0, 0, 0);

    }
}
