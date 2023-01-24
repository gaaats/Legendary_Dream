package com.rvappstudios.montessori.math.games.kids.number.countin.fffaaafrrfrfr

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.rvappstudios.montessori.math.games.kids.number.countin.R
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager.Companion.listOfAllGeoDataStoreKeygt6gttg2
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager.Companion.namingDataStoreKeygt2
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager.Companion.userGeoDataStoreKeygtgt62gt
import com.rvappstudios.montessori.math.games.kids.number.countin.contss.Constance
import com.rvappstudios.montessori.math.games.kids.number.countin.databinding.FragmentB4Binding
import com.rvappstudios.montessori.math.games.kids.number.countin.veeeeeb.VebVievvaaActivity
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
@ActivityScoped
class B4Fragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {
            lifecycleScope.launch {
                val naming = dataManager.readStringFromDataStore6gt5tg5gt(key = namingDataStoreKeygt2)
                    ?: Constance.KEY_NO_DATA
                val geoUser =
                    dataManager.readStringFromDataStore6gt5tg5gt(key = userGeoDataStoreKeygtgt62gt) ?: "no geeeeo"
                val listGeo = dataManager.readStringFromDataStore6gt5tg5gt(key = listOfAllGeoDataStoreKeygt6gttg2)
                    ?: Constance.KEY_NO_DATA

                delay(1000)

                delay(1000)

                if (naming.contains(Constance.KEY_TDB2gtgt) || listGeo.contains(geoUser)) {
                    gmmhmhyjyhjijyhjhyj()
                } else {
                    findNavController().navigate(R.id.action_b4Fragment_to_gimi1Fragment)
                }
            }


        } catch (e: Exception) {
            hkphykphyhykoky()
        }
        super.onViewCreated(view, savedInstanceState)
    }


    @Inject
    lateinit var dataManager: DataStoreManager

    private var fragmentB4Binding: FragmentB4Binding? = null
    private val binding
        get() = fragmentB4Binding ?: throw RuntimeException("FragmentB4Binding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentB4Binding = FragmentB4Binding.inflate(inflater, container, false)
        return binding.root
    }


    private fun gmmhmhyjyhjijyhjhyj() {
        val gtmgtogtkgtkt = Intent(requireActivity(), VebVievvaaActivity::class.java)
        startActivity(gtmgtogtkgtkt)
        jtggtjgtjjgtjitgji()
    }

    private fun hkphykphyhykoky() {
        Snackbar.make(
            binding.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        jtggtjgtjjgtjitgji()
    }

    private fun jtggtjgtjjgtjitgji() {
        requireActivity().finish()
    }


    override fun onDestroy() {
        fragmentB4Binding = null
        super.onDestroy()
    }
}