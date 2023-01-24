package com.rvappstudios.montessori.math.games.kids.number.countin.fffaaafrrfrfr

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.rvappstudios.montessori.math.games.kids.number.countin.R
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager.Companion.appsCheckerDataStoreKeygt2
import com.rvappstudios.montessori.math.games.kids.number.countin.apppiii.DataStoreManager.Companion.namingDataStoreKeygt2
import com.rvappstudios.montessori.math.games.kids.number.countin.contss.Constance
import com.rvappstudios.montessori.math.games.kids.number.countin.databinding.FragmentB3Binding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
@ActivityScoped
class B3Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentB3Binding = FragmentB3Binding.inflate(inflater, container, false)
        return binding.root
    }

    var temNaming2hy2hy = "loading"

    @Inject
    lateinit var dataManager: DataStoreManager

    private var fragmentB3Binding: FragmentB3Binding? = null
    private val binding
        get() = fragmentB3Binding ?: throw RuntimeException("FragmentB3Binding = null")




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {
            lifecycleScope.launch {
                val isAppsLaunched =
                    dataManager.readStringFromDataStore6gt5tg5gt(key = appsCheckerDataStoreKeygt2)
                        ?: Constance.KEY_NO_DATA

                delay(500)

                when (isAppsLaunched) {
                    "1" -> {
                        gttgjgtgtjijgt()
                        launchApps()
                    }
                    "0" -> {
                        gthuhgt()

                    }
                    Constance.KEY_NO_DATA -> {
                        tggtjtgigtjtgjtgi()
                    }

                }

            }


        } catch (e: Exception) {
            detdefdfe()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun tggtjtgigtjtgjtgi() {
        findNavController().navigate(R.id.action_b3Fragment_to_gimi1Fragment)
    }

    private fun gttgjgtgtjijgt() {
        Log.d("lolo", "launchApps")
    }

    private suspend fun launchApps() {
        initAppsFlyerLibeer(context = requireActivity())

        val preNaming = dataManager.readStringFromDataStore6gt5tg5gt(namingDataStoreKeygt2)

        while (true) {
            if (temNaming2hy2hy != "loading") {
                delay(1000)
                if (preNaming == null) {
                    dataManager.saveStringToDataStoregtgttgt(key = namingDataStoreKeygt2, value = temNaming2hy2hy)
                }
                delay(500)
                gthuhgt()
                break
            } else {
                delay(1000)
            }
        }
    }

    private fun gthuhgt() {
        findNavController().navigate(R.id.action_b3Fragment_to_b4Fragment)
    }


    override fun onDestroy() {
        fragmentB3Binding = null
        super.onDestroy()
    }

    private fun detdefdfe() {
        Snackbar.make(
            binding.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().finish()
    }

    private fun initAppsFlyerLibeer(context: Context) {
        AppsFlyerLib.getInstance()
            .init(Constance.KEY_APPS_ID, conversionDataListener, context)
        AppsFlyerLib.getInstance().start(context)
    }

    private val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString().apply {
                temNaming2hy2hy = this

            }
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


}