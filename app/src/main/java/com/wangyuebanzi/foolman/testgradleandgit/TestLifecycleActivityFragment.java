package com.wangyuebanzi.foolman.testgradleandgit;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class TestLifecycleActivityFragment extends Fragment {
private static final String TAG = TestLifecycleActivityFragment.class.getSimpleName()+"test";
    public TestLifecycleActivityFragment() {
    }

    @Override
    public void onAttach(Activity activity) {
        Log.i(TAG,"onAttach activity");
        super.onAttach(activity);
    }

    @Override
    public void onAttach(Context context) {
        Log.i(TAG,"onAttach context");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i(TAG,"onCreate");
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG,"onCreateView");
        return inflater.inflate(R.layout.fragment_test_lifecycle, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Log.i(TAG,"onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i(TAG,"onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i(TAG,"onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i(TAG,"onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i(TAG,"onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i(TAG,"onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i(TAG,"onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG,"onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i(TAG,"onDetach");
        super.onDetach();
    }
}
