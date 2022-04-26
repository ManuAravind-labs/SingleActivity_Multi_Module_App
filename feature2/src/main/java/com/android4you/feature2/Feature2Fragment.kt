package com.android4you.feature2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.android4you.core.Screen1RouteContract
import com.android4you.feature2.databinding.FragmentFeature2Binding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Feature2Fragment : Fragment() {
    private lateinit var binding: FragmentFeature2Binding
    @Inject lateinit var featureScreenARouteContract: Screen1RouteContract

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFeature2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("the passed data to fragment b is ${Feature2FragmentArgs.fromBundle(requireArguments()).argBValue}")
        binding.buttonOpenFeatureScreen1.setOnClickListener {
            featureScreenARouteContract.show("asa", findNavController())
        }
    }
}
