package uz.nusratillo.draganddropdemo

import android.graphics.Rect
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Позволяет центрировать первый и последний элемент в [RecyclerView]
 * Размер элемента должен быть строго указан.
 */
class OffsetHorizontalItemDecoration : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)

        val offset = parent.measuredWidth / 2 - view.layoutParams.width / 2
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.left = offset - (
                    (view.layoutParams as? ViewGroup.MarginLayoutParams)?.leftMargin
                        ?: 0)
        } else if (parent.getChildAdapterPosition(view) == state.itemCount - 1) {
            outRect.right = offset - (
                    (view.layoutParams as? ViewGroup.MarginLayoutParams)?.rightMargin
                        ?: 0)
        }
    }
}