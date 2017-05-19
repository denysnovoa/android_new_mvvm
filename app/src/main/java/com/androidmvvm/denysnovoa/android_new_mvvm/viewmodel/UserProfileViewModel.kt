package com.androidmvvm.denysnovoa.android_new_mvvm.viewmodel

import android.arch.lifecycle.ViewModel
import com.androidmvvm.denysnovoa.android_new_mvvm.model.User

class UserProfileViewModel : ViewModel() {
    lateinit var userId: String
    lateinit var user: User
}
