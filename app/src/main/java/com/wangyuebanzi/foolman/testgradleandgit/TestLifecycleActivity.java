package com.wangyuebanzi.foolman.testgradleandgit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class TestLifecycleActivity extends AppCompatActivity {
private static final String TAG = TestLifecycleActivity.class.getSimpleName()+"test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_lifecycle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        Log.i(TAG,"onPostCreate");
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.i(TAG,"onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG,"onResume");
        super.onResume();
    }

    @Override
    protected void onPostResume() {
        Log.i(TAG,"onPostResume");
        super.onPostResume();
    }

    @Override
    public void onContentChanged() {
        Log.i(TAG,"onContentChanged");
        super.onContentChanged();
    }

    @Override
    protected void onResumeFragments() {
        Log.i(TAG,"onResumeFragments");
        super.onResumeFragments();
    }

    @Override
    protected void onPause() {
        Log.i(TAG,"onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG,"onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,"onDestroy");
        super.onDestroy();
    }

}
