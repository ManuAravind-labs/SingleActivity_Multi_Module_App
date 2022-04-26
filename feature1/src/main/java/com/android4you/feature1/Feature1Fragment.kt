package com.android4you.feature1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.android4you.core.Screen2RouteContract
import com.android4you.feature1.databinding.FragmentFeature1Binding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Feature1Fragment : Fragment() {
    private lateinit var binding: FragmentFeature1Binding
    @Inject
    lateinit var featureScreenBRouteContract: Screen2RouteContract

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFeature1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("the passed data to fragment a is ${Feature1FragmentArgs.fromBundle(requireArguments()).argAValue}")
        binding.buttonOpenFeatureScreen2.setOnClickListener {
            featureScreenBRouteContract.show("as", findNavController())
        }
    }
}