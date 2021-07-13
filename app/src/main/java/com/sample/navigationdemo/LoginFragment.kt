package com.sample.navigationdemo

import android.content.Context
import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.sample.navigationdemo.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        binding.btnLogin.setOnClickListener(){
            val inputUsername:String = binding.tfUsername.text.toString()
            val inputPassword:String = binding.tfPassword.text.toString()
            if(inputUsername == "abc" && inputPassword == "123"){
                Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_questionFragment)
            }
            else{
                Toast.makeText(context, "Invalid login", Toast.LENGTH_LONG)
            }
        }
        return binding.root;
    }

}