package cn.xhl.decoration

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import cn.xhl.decoration.activity.ImageStickyActivity
import cn.xhl.decoration.activity.NormalActivity
import cn.xhl.decoration.activity.StickyActivity
import cn.xhl.decoration.adapter.MainAdapter
import cn.xhl.decoration.entity.MainEntity
import com.chad.library.adapter.base.BaseQuickAdapter
import java.util.*

class MainActivity : AppCompatActivity() {
    private val mRecyclerData = ArrayList<MainEntity>()
    private val mRecyclerAdapter = MainAdapter(mRecyclerData)
    private val activities = Arrays.asList(NormalActivity::class.java,
            StickyActivity::class.java, ImageStickyActivity::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_activity_main)
        recyclerView.adapter = mRecyclerAdapter
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        mRecyclerData.add(MainEntity().apply { text = "normal" })
        mRecyclerData.add(MainEntity().apply { text = "sticky" })
        mRecyclerData.add(MainEntity().apply { text = "image" })
        mRecyclerAdapter.notifyDataSetChanged()
        mRecyclerAdapter.onItemClickListener = BaseQuickAdapter
                .OnItemClickListener { _: BaseQuickAdapter<*, *>?, _: View?, position: Int ->
                    val intent = Intent(this@MainActivity, activities[position])
                    ActivityCompat.startActivity(this@MainActivity, intent, null)
                }
    }
}
