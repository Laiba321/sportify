package com.sportify;

import com.sportify.DAO.Profile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViMo extends ViewModel {

    private final MutableLiveData<Profile> profile = new MutableLiveData<>();

    public LiveData<Profile> getProfile() {
        return profile;
    }

    public void setProfile(Profile pProfile) {
        profile.setValue(pProfile);
    }
}
