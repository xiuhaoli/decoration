package cn.xhl.decoration.decoration.normal

import android.content.Context
import android.graphics.Rect
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * <pre>
 *     author : xiuhaoli
 *     e-mail : xiuhaoli@outlook.com
 *     time   : 2018/02/24
 *     version: 1.0
 * </pre>
 */
class NormalItemDecoration(context: Context):  DividerItemDecoration(context, VERTICAL) {
    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        outRect?.bottom = 1
    }
}