package uz.nusratillo.draganddropdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
//        main_rv.addItemDecoration(OffsetHorizontalItemDecoration())
//        PagerSnapHelper().attachToRecyclerView(main_rv)
        main_rv.adapter = adapter
    }
}
