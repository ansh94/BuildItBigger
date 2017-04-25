package com.example.android.libshowjokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ANSHDEEP on 25-04-2017.
 */

public class ShowJokeFragment extends Fragment {

    private String mJoke;
    private TextView mTextJoke;
    private View mRootView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mRootView = inflater.inflate(R.layout.fragment_show_joke, container, false);
        setLayoutViews();
        getJoke();
        mTextJoke.setText(mJoke);


        return mRootView;
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    //getting the joke
    private void getJoke() {

        Intent intent = getActivity().getIntent();
        if (intent != null) {
            mJoke = intent.getStringExtra(ShowJoke.JOKE_MESSAGE);

        } else {
            mJoke = "No Joke";
        }

    }


    //Helper method to localize the views
    private void setLayoutViews() {
        mTextJoke = (TextView) mRootView.findViewById(R.id.textJoke);

    }

}
