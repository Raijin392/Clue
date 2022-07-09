package android.example.helpproject

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView: TextView = view.findViewById(R.id.tv_mode)
        val text = arguments?.getString("mode")
        textView.text = text
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}