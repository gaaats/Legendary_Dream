package com.rvappstudios.montessori.math.games.kids.number.countin.ffffffffraa

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.google.android.material.snackbar.Snackbar
import com.rvappstudios.montessori.math.games.kids.number.countin.R
import com.rvappstudios.montessori.math.games.kids.number.countin.databinding.FragmentGimmi2Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class Gimmi2Fragment : Fragment() {

    val ooooo by lazy {
        mapOf(
            "one" to ContextCompat.getDrawable(requireActivity(), R.drawable.a1),
            "tvo" to ContextCompat.getDrawable(requireActivity(), R.drawable.a2),
            "three" to ContextCompat.getDrawable(requireActivity(), R.drawable.a3),
            "four" to ContextCompat.getDrawable(requireActivity(), R.drawable.a4),
        )
    }


    private fun createAnimatorSetBack(): AnimatorSet {
        return AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.back_animator
        ) as AnimatorSet
    }

    private fun createAnimatorSetFront(): AnimatorSet {
        return AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.front_animator
        ) as AnimatorSet
    }

    private val bgbgvvfv by lazy {
        createAnimatorSetFront()
    }

    private val xcvvvv by lazy {
        createAnimatorSetBack()
    }

    private fun fanka(
        frontAnim: AnimatorSet,
        backAnim: AnimatorSet,
        elemFront: ImageView,
        elemBack: ImageView
    ) {
        frontAnim.setTarget(elemBack)
        backAnim.setTarget(elemFront)
        frontAnim.start()
        backAnim.start()
    }

    private fun mashaa() {
        fanka(
            bgbgvvfv,
            xcvvvv,
            binding.imgElem1,
            binding.imgElem1Back
        )
    }

    private fun mashaa1() {
        fanka(
            bgbgvvfv,
            xcvvvv,
            binding.imgElem2,
            binding.imgElem2Back
        )
    }


    private var fragmentGimmi2Binding: FragmentGimmi2Binding? = null
    private val binding
        get() = fragmentGimmi2Binding ?: throw RuntimeException("FragmentGimmi2Binding = null")

    private fun manka() {
        bvbvbbvvbvbvb(
            bgbgvvfv, xcvvvv, binding.imgElem1, binding.imgElem1Back
        )
    }

    private fun bvbvbbvvbvbvb(
        frontAnim: AnimatorSet,
        backAnim: AnimatorSet,
        elemFront: ImageView,
        elemBack: ImageView
    ) {
        frontAnim.setTarget(elemFront)
        backAnim.setTarget(elemBack)
        frontAnim.start()
        backAnim.start()
    }

    private val vfvfvffv by lazy {
        createAnimatorSetFront()
    }

    private val nhbbbbggb by lazy {
        createAnimatorSetBack()
    }


    private fun bgbgbgffff() {
        bvbvbbvvbvbvb(
            vfvfvffv, nhbbbbggb, binding.imgElem2, binding.imgElem2Back
        )
    }

    private fun pasha() {
        fanka(
            vfvfvffv,
            nhbbbbggb,
            binding.imgElem2,
            binding.imgElem2Back
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGimmi2Binding = FragmentGimmi2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnGame.isEnabled = true

        binding.btnGame.setOnClickListener {
            val user22 = ooooo.keys.random()
            val comppp222 = ooooo.keys.random()
            binding.imgElem1Back.setImageDrawable(ooooo.get(comppp222))
            binding.imgElem2Back.setImageDrawable(ooooo.get(user22))

            binding.btnGame.isEnabled = false
            manka()
            bgbgbgffff()
            lifecycleScope.launch {
                delay(2000)
                mashaa()
                pasha()
                binding.btnGame.isEnabled = true

                if (user22 == comppp222){
                    val vin  = Random.nextInt(from = 100, until = 500)

                    Toast.makeText(requireContext(), "You vin ${vin} points!!!", Toast.LENGTH_SHORT).show()
                } else {
                    val lose  = Random.nextInt(from = 100, until = 500)
                    Snackbar.make(
                        binding.root,
                        "You lose ${lose}$",
                        Snackbar.LENGTH_LONG
                    ).show()
                }
            }
        }
        initExitBtnbgbg()

        super.onViewCreated(view, savedInstanceState)
    }


    private fun initExitBtnbgbg() {

    }


    override fun onDestroy() {
        fragmentGimmi2Binding = null
        super.onDestroy()
    }


}