package cn.xhl.decoration.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import cn.xhl.decoration.R
import cn.xhl.decoration.adapter.MainAdapter
import cn.xhl.decoration.decoration.normal.NormalItemDecoration
import cn.xhl.decoration.entity.MainEntity
import java.util.ArrayList

class NormalActivity : AppCompatActivity() {
    private val mRecyclerData = ArrayList<MainEntity>()
    private val mRecyclerAdapter = MainAdapter(mRecyclerData)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        initData()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = mRecyclerAdapter
        recyclerView.layoutManager = LinearLayoutManager(this@NormalActivity)
        recyclerView.addItemDecoration(NormalItemDecoration(this@NormalActivity))
    }

    private fun initData() {
        val c = arrayOf("北京", "上海", "深圳", "杭州", "广州", "香港", "武汉", "成都",
                "纽约", "波士顿", "华盛顿", "洛杉矶", "阿拉斯加", "圣地亚哥",
                "伦敦", "苏格兰", "巴黎", "波兰", "德国", "希腊",
                "悉尼",
                "东京", "大阪", "京都", "长野")
        var entity: MainEntity
        for (i in c.indices) {
            entity = MainEntity()
            entity.text = c[i]
            mRecyclerData.add(entity)
        }
    }
}
