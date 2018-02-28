package cn.xhl.decoration.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import cn.xhl.decoration.R
import cn.xhl.decoration.adapter.ImageStickyAdapter
import cn.xhl.decoration.decoration.image.ImageStickyItemDecoration
import cn.xhl.decoration.entity.ImageStickyEntity
import java.util.ArrayList

class ImageStickyActivity : AppCompatActivity() {
    private val mRecyclerData = ArrayList<ImageStickyEntity>()
    private val mRecyclerAdapter = ImageStickyAdapter(mRecyclerData)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        initData()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = mRecyclerAdapter
        recyclerView.layoutManager = LinearLayoutManager(this@ImageStickyActivity)
        recyclerView.addItemDecoration(ImageStickyItemDecoration(this@ImageStickyActivity,
                mRecyclerData))
        mRecyclerAdapter.notifyDataSetChanged()
    }

    private fun initData() {
        val c = arrayOf("北京", "上海", "深圳", "杭州", "广州", "香港", "武汉", "成都",
                "纽约", "波士顿", "华盛顿", "洛杉矶", "阿拉斯加", "圣地亚哥",
                "伦敦", "苏格兰", "巴黎", "波兰", "德国", "希腊",
                "悉尼",
                "东京", "大阪", "京都", "长野")
        val cty = arrayOf("China", "China", "China", "China", "China", "China", "China", "China",
                "The USA", "The USA", "The USA", "The USA", "The USA", "The USA",
                "Europe", "Europe", "Europe", "Europe", "Europe", "Europe",
                "Australia",
                "Japan", "Japan", "Japan", "Japan")
        val img = arrayOf(R.mipmap.china, R.mipmap.china, R.mipmap.china, R.mipmap.china, R.mipmap.china, R.mipmap.china, R.mipmap.china, R.mipmap.china,
                R.mipmap.america, R.mipmap.america, R.mipmap.america, R.mipmap.america, R.mipmap.america, R.mipmap.america,
                R.mipmap.europe, R.mipmap.europe, R.mipmap.europe, R.mipmap.europe, R.mipmap.europe, R.mipmap.europe,
                R.mipmap.australia,
                R.mipmap.japan, R.mipmap.japan, R.mipmap.japan, R.mipmap.japan)
        var entity: ImageStickyEntity
        for (i in c.indices) {
            entity = ImageStickyEntity()
            entity.city = c[i]
            entity.tag = cty[i]
            entity.img = img[i]
            mRecyclerData.add(entity)
        }
    }
}
