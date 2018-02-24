package cn.xhl.decoration.adapter

import cn.xhl.decoration.R
import cn.xhl.decoration.entity.MainEntity
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

/**
 * <pre>
 *     author : xiuhaoli
 *     e-mail : xiuhaoli@outlook.com
 *     time   : 2018/02/24
 *     version: 1.0
 * </pre>
 */
class MainAdapter(data: ArrayList<MainEntity>) :
        BaseQuickAdapter<MainEntity, BaseViewHolder>(R.layout.item_main, data) {
    override fun convert(helper: BaseViewHolder?, item: MainEntity?) {
        helper!!.setText(R.id.text_item_main, item?.text)
    }
}