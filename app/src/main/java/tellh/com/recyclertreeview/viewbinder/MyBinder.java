package tellh.com.recyclertreeview.viewbinder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import tellh.com.recyclertreeview.R;
import tellh.com.recyclertreeview.bean.Dir;
import tellh.com.recyclertreeview.bean.File;
import tellh.com.recyclertreeview_lib.AbstractTreeViewHolder;
import tellh.com.recyclertreeview_lib.TreeIndicatorView;
import tellh.com.recyclertreeview_lib.TreeNode;
import tellh.com.recyclertreeview_lib.TreeViewBinder;

/**
 * Created by Administrator on 2017/2/9.
 */

public class MyBinder extends TreeViewBinder<AbstractTreeViewHolder> {
    @Override
    public AbstractTreeViewHolder provideViewHolder(Context context, int viewType) {
        if (viewType == R.layout.item_dir) {
            return new ViewHolderDir(View.inflate(context, viewType, null));
        }
        return new ViewHolderFile(View.inflate(context, viewType, null));
    }

    @Override
    public void bindView(AbstractTreeViewHolder holder, int position, TreeNode node) {
        holder.bindData(node);
    }

    @Override
    public int getItemViewType(int position, TreeNode treeNode) {
        if (treeNode.getContent() instanceof Dir) {
            return R.layout.item_dir;
        }
        return R.layout.item_file;
    }

    @Override
    public int getLayoutId() {
        return 0;
    }

    public static class ViewHolderDir extends AbstractTreeViewHolder {
        // private ImageView ivArrow;
        private TextView tvName;
        TreeIndicatorView ind;

        public ViewHolderDir(View rootView) {
            super(rootView);
            // this.ivArrow = (ImageView) rootView.findViewById(R.id.iv_arrow);
            this.tvName = (TextView) rootView.findViewById(R.id.tv_name);
            this.ind = (TreeIndicatorView) rootView.findViewById(R.id.ind);
        }

        @Override
        public void bindData(TreeNode node) {
            Dir dirNode = (Dir) node.getContent();

//            ivArrow.setRotation(0);
//            ivArrow.setImageResource(R.drawable.ic_keyboard_arrow_right_black_18dp);
//            int rotateDegree = node.isExpand() ? 90 : 0;
//            ivArrow.setRotation(rotateDegree);
//
//
//            if (node.isLeaf())
//                ivArrow.setVisibility(View.INVISIBLE);
//            else ivArrow.setVisibility(View.VISIBLE);


            tvName.setText(dirNode.dirName);
            ind.setNode(node);
        }

       /* public ImageView getIvArrow() {
            return ivArrow;
        }*/

        public TextView getTvName() {
            return tvName;
        }
    }

    public class ViewHolderFile extends AbstractTreeViewHolder {
        public TextView tvName;
        TreeIndicatorView ind;

        public ViewHolderFile(View rootView) {
            super(rootView);
            this.tvName = (TextView) rootView.findViewById(R.id.tv_name);
            this.ind = (TreeIndicatorView) rootView.findViewById(R.id.ind);
        }

        @Override
        public void bindData(TreeNode node) {
            File fileNode = (File) node.getContent();
            tvName.setText(fileNode.fileName);
            ind.setNode(node);
        }

    }
}
