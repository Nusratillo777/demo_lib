package uz.nusratillo.draganddropdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MotionChangeListener {

    private val adapter = MainAdapter(this)

    override fun motionChanged(view: View, x: Float, y: Float) {


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        main_rv.addItemDecoration(OffsetHorizontalItemDecoration())
        PagerSnapHelper().attachToRecyclerView(main_rv)
        main_rv.adapter = adapter
//        main_rv.
    }
}

interface MotionChangeListener {

    fun motionChanged(x: Int, y: Int)
}
