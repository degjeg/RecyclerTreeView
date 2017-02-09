package tellh.com.recyclertreeview_lib;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2017/2/9.
 */

public abstract class AbstractTreeViewHolder extends RecyclerView.ViewHolder {
    public AbstractTreeViewHolder(View itemView) {
        super(itemView);
        itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    public abstract void bindData(TreeNode node);
}
