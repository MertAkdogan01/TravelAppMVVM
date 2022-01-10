package com.sisifos.travelmvvm.ui.fragment

import androidx.fragment.app.Fragment
import com.sisifos.travelmvvm.MainActivity

abstract class BaseFreagment: Fragment() {

    protected val navController by lazy {
        (activity as MainActivity).navController
    }
}