//package tellh.com.recyclertreeview.viewbinder;
//
//import android.content.Context;
//import android.view.View;
//import android.widget.TextView;
//
//import tellh.com.recyclertreeview.R;
//import tellh.com.recyclertreeview.bean.File;
//import tellh.com.recyclertreeview_lib.TreeNode;
//import tellh.com.recyclertreeview_lib.TreeViewBinder;
//
///**
// * Created by tlh on 2016/10/1 :)
// */
//
//public class FileNodeBinder extends TreeViewBinder<FileNodeBinder.ViewHolder> {
//    /*@Override
//    public ViewHolder provideViewHolder(View itemView) {
//        return new ViewHolder(itemView);
//    }*/
//
//    @Override
//    public ViewHolder provideViewHolder(Context context, int viewType) {
//        return null;
//    }
//
//    @Override
//    public void bindView(ViewHolder holder, int position, TreeNode node) {
//        File fileNode = (File) node.getContent();
//        holder.tvName.setText(fileNode.fileName);
//    }
//
//    @Override
//    public int getItemViewType(int position, TreeNode treeNode) {
//        return 0;
//    }
//
//    @Override
//    public int getLayoutId() {
//        return R.layout.item_file;
//    }
//
//    public class ViewHolder extends TreeViewBinder.ViewHolder {
//        public TextView tvName;
//
//        public ViewHolder(View rootView) {
//            super(rootView);
//            this.tvName = (TextView) rootView.findViewById(R.id.tv_name);
//        }
//
//    }
//}
