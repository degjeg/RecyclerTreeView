package tellh.com.recyclertreeview_lib;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;


public abstract class TreeViewBinder<VH extends RecyclerView.ViewHolder> implements LayoutItemType {
    public abstract VH provideViewHolder(Context context, int viewType);

    public abstract void bindView(VH holder, int position, TreeNode node);

    public abstract int getItemViewType(int position, TreeNode treeNode);

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View rootView) {
            super(rootView);
        }

        protected <T extends View> T findViewById(@IdRes int id) {
            return (T) itemView.findViewById(id);
        }
    }

}