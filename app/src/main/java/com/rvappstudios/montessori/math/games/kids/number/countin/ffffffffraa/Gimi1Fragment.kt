package com.rvappstudios.montessori.math.games.kids.number.countin.ffffffffraa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.rvappstudios.montessori.math.games.kids.number.countin.R
import com.rvappstudios.montessori.math.games.kids.number.countin.databinding.FragmentGimi1Binding


class Gimi1Fragment : Fragment() {
    private fun gthyhuyjuju() {
        Snackbar.make(
            ssskkaa.root,
            "Error 505...reloading...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var nhnhnh: FragmentGimi1Binding? = null
    private val ssskkaa get() = nhnhnh ?: throw RuntimeException("FragmentInitBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        nhnhnh = FragmentGimi1Binding.inflate(inflater, container, false)
        return ssskkaa.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            ssskkaa.clooose.setOnClickListener {
                requireActivity().finish()
            }

            ssskkaa.imgNext.setOnClickListener {
                findNavController().navigate(R.id.action_gimi1Fragment_to_gimmi2Fragment)
            }
            ssskkaa.imgPrevious.setOnClickListener {
                requireActivity().finish()
            }

            ssskkaa.imgsettings.setOnClickListener {
                findNavController().navigate(R.id.action_gimi1Fragment_to_gimiSettingsFragment)
            }
            ssskkaa.imgInfo.setOnClickListener {
                Toast.makeText(requireContext(), "Play more to be a LEADER!", Toast.LENGTH_SHORT).show()
            }

        } catch (e: Exception) {
            gthyhuyjuju()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        nhnhnh = null
        super.onDestroy()
    }

}