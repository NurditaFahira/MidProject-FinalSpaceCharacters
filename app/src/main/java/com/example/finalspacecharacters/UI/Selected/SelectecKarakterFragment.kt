package com.example.finalspacecharacters.UI.Selected

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalspacecharacters.R
import com.example.finalspacecharacters.Utilities.StatikData
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_selectec_karakter.*


class SelectecKarakterFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selectec_karakter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Picasso.get()
            .load(StatikData.img_url)
            .into(karakter_detail_img)

        karakter_name.text = StatikData.name.uppercase()
        karakter_species.text = "Spesies : " + StatikData.species
        karakter_status.text =  "Status : " + StatikData.status
        karakter_gender.text = StatikData.gender
        karakter_hair.text = "Hair : "+ StatikData.hair
        karakter_origin.text = "Origin : " + StatikData.origin
        karakter_abilities.text = "Abilities : " + StatikData.abilities.toString()
        karakter_alias.text = "Alias : " + StatikData.alias.toString()

        btn_share.setOnClickListener{
            val name = StatikData.name.uppercase()
            val species = StatikData.species
            val status = StatikData.status
            val sendIntent:Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Nama Karakter : $name \nSpesies : $species \nStatus : $status")
                type="text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent,null)
            startActivity(shareIntent)
        }


    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) = SelectecKarakterFragment()
    }
}