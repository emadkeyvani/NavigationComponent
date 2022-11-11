package com.keyvani.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.keyvani.navigationcomponent.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val args:DetailFragmentArgs by navArgs()
    private var info=""



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentDetailBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        info=args.bundleInfo

        binding.tvInfo.text = info
    }


}