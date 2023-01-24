package com.rvappstudios.montessori.math.games.kids.number.countin.ffffffffraa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.rvappstudios.montessori.math.games.kids.number.countin.R
import com.rvappstudios.montessori.math.games.kids.number.countin.databinding.FragmentGimiSettingsBinding


class GimiSettingsFragment : Fragment() {
    override fun onDestroy() {
        settingsBinding = null
        super.onDestroy()
    }

    private fun gtgtgt() {
        Snackbar.make(
            binding.root,
            "Error 505...reloading...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var settingsBinding: FragmentGimiSettingsBinding? = null
    private val binding get() = settingsBinding ?: throw RuntimeException("FragmentGimiSettingsBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        settingsBinding = FragmentGimiSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.btnImgExitInfo.setOnClickListener {
                findNavController().navigate(R.id.action_gimiSettingsFragment_to_gimi1Fragment)
            }
            binding.btnUnderstandGameRules.setOnClickListener {
                findNavController().navigate(R.id.action_gimiSettingsFragment_to_gimi1Fragment)
            }



        } catch (e: Exception) {
            gtgtgt()
        }


        super.onViewCreated(view, savedInstanceState)
    }



}