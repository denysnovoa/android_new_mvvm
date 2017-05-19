package com.androidmvvm.denysnovoa.android_new_mvvm.ui

import android.arch.lifecycle.LifecycleFragment
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.androidmvvm.denysnovoa.android_new_mvvm.R.layout.user_profile
import com.androidmvvm.denysnovoa.android_new_mvvm.viewmodel.UserProfileViewModel

class UserProfileFragment : LifecycleFragment() {
    val UID_KEY = "uid"
    lateinit var userProfileViewModel: UserProfileViewModel


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var userId = arguments.getString(UID_KEY)

        userProfileViewModel = ViewModelProviders.of(this).get(UserProfileViewModel::class.java)
        userProfileViewModel.userId = userId
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(user_profile, container, false)
    }
}