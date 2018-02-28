package cn.xhl.decoration.adapter

import cn.xhl.decoration.R
import cn.xhl.decoration.entity.ImageStickyEntity
import cn.xhl.decoration.entity.MainEntity
import cn.xhl.decoration.entity.StickyEntity
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
class ImageStickyAdapter(data: ArrayList<ImageStickyEntity>) :
        BaseQuickAdapter<ImageStickyEntity, BaseViewHolder>(R.layout.item_main, data) {
    override fun convert(helper: BaseViewHolder?, item: ImageStickyEntity?) {
        helper!!.setText(R.id.text_item_main, item?.city)
    }
}