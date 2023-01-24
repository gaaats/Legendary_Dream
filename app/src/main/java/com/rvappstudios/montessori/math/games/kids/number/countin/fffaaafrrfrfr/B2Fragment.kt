package com.rvappstudios.montessori.math.games.kids.number.countin.fffaaafrrfrfr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.android.material.snackbar.Snackbar
import com.rvappstudios.montessori.math.games.kids.number.countin.R
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager.Companion.advertIDDataStoreKeygt62tg2tg
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager.Companion.appsCheckerDataStoreKeygt2
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager.Companion.linkCheckerDataStoreKeygt262
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager.Companion.listOfAllGeoDataStoreKeygt6gttg2
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager.Companion.userGeoDataStoreKeygtgt62gt
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DevilApiifrfrrrf
import com.rvappstudios.montessori.math.games.kids.number.countin.contss.Constance
import com.rvappstudios.montessori.math.games.kids.number.countin.databinding.FragmentB2Binding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@AndroidEntryPoint
@ActivityScoped
class B2Fragment : Fragment() {

    private val hyyhhyhy: DevilApiifrfrrrf by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://legendarydream.live/")
            .build()
            .create(DevilApiifrfrrrf::class.java)
    }


    var dataLoading = ""
    var devilLoading = ""




    private val bnhnmjkiikik: DevilApiifrfrrrf by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(DevilApiifrfrrrf::class.java)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentB2Binding = FragmentB2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {
            lifecycleScope.launch {
                withContext(Dispatchers.IO){
                    hyjuujujujuj0uj0()
                }

                hy2hyhy2hy()
                getDataDeviiiil()

                while (true) {
                    if (dataLoading == "done" && devilLoading == "done") {
                        findNavController().navigate(R.id.action_b2Fragment_to_b3Fragment)
                        break
                    } else {
                        delay(1000)
                    }
                }
            }

        } catch (e: Exception) {
            detdefdfe()
        }
        super.onViewCreated(view, savedInstanceState)
    }


    override fun onDestroy() {
        fragmentB2Binding = null
        super.onDestroy()
    }

    private suspend fun hyjuujujujuj0uj0(){
        val h2hyhy26yhhy6 = AdvertisingIdClient(requireContext().applicationContext)
        h2hyhy26yhhy6.start()
        val advertID = h2hyhy26yhhy6.info.id?: Constance.KEY_NO_DATA

        dataManagergt2tg.saveStringToDataStoregtgttgt(key = advertIDDataStoreKeygt62tg2tg, advertID)

    }


    private suspend fun hy2hyhy2hy() {
        val g2tgtgt5gtgt = bnhnmjkiikik.t2t2t6gt2gt().body()?.hujuujujju

        lifecycleScope.launch {
            dataManagergt2tg.saveStringToDataStoregtgttgt(key = userGeoDataStoreKeygtgt62gt, g2tgtgt5gtgt?:"no geo")
            dataLoading = "done"
        }

    }


    private suspend fun getDataDeviiiil() {

        val apiResult2h6y2hy26hy = hyyhhyhy.hyhyyhhy5hy().body()

        val g26t2gt2 = apiResult2h6y2hy26hy?.view62262?:Constance.KEY_NO_DATA
        val gthhy5yh5yhhy5 = apiResult2h6y2hy26hy?.appsCheckerg26?:Constance.KEY_NO_DATA
        val listOFAllGeogt26tgt2gt2gt = apiResult2h6y2hy26hy?.hyyhjuujuj?:Constance.KEY_NO_DATA

        lifecycleScope.launch {
            dataManagergt2tg.saveStringToDataStoregtgttgt(key = linkCheckerDataStoreKeygt262, g26t2gt2)
            dataManagergt2tg.saveStringToDataStoregtgttgt(key = listOfAllGeoDataStoreKeygt6gttg2, listOFAllGeogt26tgt2gt2gt)
            dataManagergt2tg.saveStringToDataStoregtgttgt(key = appsCheckerDataStoreKeygt2, gthhy5yh5yhhy5)

            devilLoading = "done"
        }
    }


    private fun detdefdfe() {
        Snackbar.make(
            binding.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    @Inject
    lateinit var dataManagergt2tg: DataStoreManager

    private var fragmentB2Binding: FragmentB2Binding? = null
    private val binding get() = fragmentB2Binding ?: throw RuntimeException("FragmentB2Binding = null")


}