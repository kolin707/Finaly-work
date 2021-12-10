package com.kolin.applicationfragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AboutmoneyFragment : Fragment() {
    lateinit var aboutmoneyRecyclerView: RecyclerView
    lateinit var showWebSiteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_aboutmoney, container, false)

        val MoneyNames: List<String> = listOf(
            "1. U.S. Dollar (USD)",
            "2. European Euro (EUR)",
            "3. Japanese Yen (JPY)",
            "4. British Pound (GBP)",
            "5. Swiss Franc (CHF)",
            "6. Canadian Dollar (CAD)",
            "7. Australian/New Zealand Dollar",
            "8. South African Rand (ZAR)"
        )

        showWebSiteButton=view.findViewById(R.id.go_odin)
        aboutmoneyRecyclerView = view.findViewById(R.id.about_money_recycler)
        aboutmoneyRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        aboutmoneyRecyclerView.adapter = MoneyAdapter(MoneyNames)

        showWebSiteButton.setOnClickListener {
            val link = Uri.parse("https://odin.study/connect")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }
}
