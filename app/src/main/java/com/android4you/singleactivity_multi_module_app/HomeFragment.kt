package com.android4you.singleactivity_multi_module_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.android4you.core.Screen1RouteContract
import com.android4you.core.Screen2RouteContract
import com.android4you.singleactivity_multi_module_app.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    @Inject lateinit var feature1RouteContractImpl: Screen1RouteContract
    @Inject lateinit var feature2RouteContractImpl: Screen2RouteContract
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("here too")
        binding.buttonNavigateFeature1.setOnClickListener {
            feature1RouteContractImpl.show("abc", findNavController())
        }
        binding.buttonNavigateFeature2.setOnClickListener {
            feature2RouteContractImpl.show("def", findNavController())
        }
    }
}
