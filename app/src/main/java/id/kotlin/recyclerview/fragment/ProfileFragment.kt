package id.kotlin.recyclerview.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import id.kotlin.recyclerview.MainActivity
import id.kotlin.recyclerview.R
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {


    private lateinit var buttonKeluar: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_profile, container, false)

        init(view)


        buttonKeluar.setOnClickListener {
            val i = Intent(activity, MainActivity::class.java)
            startActivity(i)
            Toast.makeText(activity, "Anda Berhasil Logout !", Toast.LENGTH_SHORT).show()
            activity?.finish()
        }
        return view
    }

    private fun init(view: View) {
        buttonKeluar = view.findViewById<Button>(R.id.btn_logout)
    }
}