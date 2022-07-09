package android.example.helpproject

import android.example.helpproject.databinding.FragmentMainBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    val bundle = Bundle()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        with(binding) {
            button1.setOnClickListener {
                val mode = "Lite"
                bundle.putString("mode", mode)
                findNavController().navigate(R.id.secondFragment, bundle)
            }
            button2.setOnClickListener {
                val mode = "Hard"
                bundle.putString("mode", mode)
                findNavController().navigate(R.id.secondFragment, bundle)
            }
        }

    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}