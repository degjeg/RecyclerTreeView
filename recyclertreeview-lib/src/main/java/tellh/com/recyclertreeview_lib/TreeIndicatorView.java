package tellh.com.recyclertreeview_lib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/2/9.
 */

public class TreeIndicatorView extends View {
    TreeNode node;
    int indSize = 50;
    Paint paint;

    public TreeIndicatorView(Context context) {
        super(context);
        init(context, null);
    }

    public TreeIndicatorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }


    public TreeIndicatorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        paint = new Paint();
        paint.setColor(0xff000000);

    }

    public void setNode(TreeNode node) {
        this.node = node;
        getLayoutParams().width = node.getHeight() * indSize;
        requestLayout();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (node == null) {
            return;
        }

        TreeNode tmp = node;
        int depth = 0;
        int x;
        while (tmp != null && !tmp.isRoot()) {
            TreeNode parent = tmp.getParent();
            if (parent == null) {
                return;
            }
            x = parent.getHeight() * indSize + indSize / 2;



            if (depth == 0) {
                // 中上到中间
                canvas.drawLine(x, 0, x, getHeight() / 2, paint);

                // 中间到右中
                canvas.drawLine(x, getHeight() / 2, x + indSize / 2, getHeight() / 2, paint);



                if (tmp.isHasSibling()) {
                    // 中间到中下
                    canvas.drawLine(x, getHeight() / 2, x, getHeight(), paint);
                }
            } else {
                if (tmp.isHasSibling()) {
                    // 中上到中间
                    canvas.drawLine(x, 0, x, getHeight() / 2, paint);

                    // 中间到中下
                    canvas.drawLine(x, getHeight() / 2, x, getHeight(), paint);
                }
            }

            depth++;
            tmp = tmp.getParent();
        }


    }
}
