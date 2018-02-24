package cn.xhl.decoration.entity

import cn.xhl.decoration.decoration.sticky.IStickyEntity

/**
 * <pre>
 *     author : xiuhaoli
 *     e-mail : xiuhaoli@outlook.com
 *     time   : 2018/02/24
 *     version: 1.0
 * </pre>
 */
class StickyEntity : IStickyEntity {
    var tag: String = ""
    var city: String = ""

    override fun setStickyText(text: String) {

    }

    override fun getStickyText(): String {
        return tag
    }
}