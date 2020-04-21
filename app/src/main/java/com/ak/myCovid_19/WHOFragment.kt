package com.ak.myCovid_19

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.fragment_track.*
import kotlinx.android.synthetic.main.fragment_w_h_o.*
import kotlinx.android.synthetic.main.fragment_w_h_o.adView

/**
 * A simple [Fragment] subclass.
 */
class WHOFragment : Fragment() {
    var interstitialAd: InterstitialAd? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?= inflater.inflate(R.layout.fragment_w_h_o, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


       // val webView: WebView = findViewById<WebView>(R.id.web)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019")




        MobileAds.initialize(context, "ca-app-pub-7871508675897675~1505133410")

        val adRequest =
            AdRequest.Builder().build()
        adView.loadAd(adRequest)

        interstitialAd = InterstitialAd(context)
        interstitialAd!!.adUnitId = "ca-app-pub-7871508675897675/6137108027"
        interstitialAd!!.loadAd(AdRequest.Builder().build())
        interstitialAd!!.show()





    }
}
