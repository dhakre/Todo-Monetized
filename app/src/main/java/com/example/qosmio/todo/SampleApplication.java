package com.example.qosmio.todo;

import android.app.Application;

import com.sumup.merchant.api.SumUpState;

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SumUpState.init(this);
    }

}
