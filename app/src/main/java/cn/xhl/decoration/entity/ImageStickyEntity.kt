package cn.xhl.decoration.entity

import cn.xhl.decoration.decoration.image.IImageStickyEntity
import cn.xhl.decoration.decoration.sticky.IStickyEntity

/**
 * <pre>
 *     author : xiuhaoli
 *     e-mail : xiuhaoli@outlook.com
 *     time   : 2018/02/24
 *     version: 1.0
 * </pre>
 */
class ImageStickyEntity : IImageStickyEntity {
    var city: String = ""
    var tag: String = ""
    var img: Int = 0

    override fun getImage(): Int {
        return img
    }

    override fun getStickyText(): String {
        return tag
    }
}