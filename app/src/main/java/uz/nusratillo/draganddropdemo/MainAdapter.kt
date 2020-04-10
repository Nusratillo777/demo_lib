package uz.nusratillo.draganddropdemo

import android.util.Log
import android.view.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_main.view.*

class MainAdapter(
    private val listener: MotionChangeListener
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_main, parent, false)

        val context = parent.context
        val layoutParam = ViewGroup.MarginLayoutParams(
            (context.resources.displayMetrics.widthPixels - 80 * context.resources.displayMetrics.density).toInt(),
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        layoutParam.marginEnd = (8 * context.resources.displayMetrics.density).toInt()
        layoutParam.marginStart = (8 * context.resources.displayMetrics.density).toInt()
        view.layoutParams = layoutParam

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 4

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind() {
            val adapter = ListAdapter(listener)
            adapter.addData(
                listOf(
                    "A",
                    "B",
                    "C",
                    "D",
                    "E",
                    "F",
                    "G",
                    "H",
                    "I",
                    "J",
                    "K",
                    "L",
                    "M",
                    "N",
                    "O"
                )
            )
            itemView.list_rv.adapter = adapter
            itemView.list_rv.setOnDragListener { view, dragEvent ->
                Log.v("Drag", "x -> ${dragEvent.x}, y -> ${dragEvent.y}")
                true
            }
        }
    }
}