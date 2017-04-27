package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Created by ANSHDEEP on 27-04-2017.
 */

@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskJokeTest {

    @Test
    public void TestAsyncTask() throws Exception {

        final String LOG_TAG = "TC TestAsyncTask";

        try {

            MainActivity mainActivity = new MainActivity();
            EndPointAsyncTaskJoke endPointAsyncTaskJoke = new EndPointAsyncTaskJoke(mainActivity);
            endPointAsyncTaskJoke.execute();
            String joke = endPointAsyncTaskJoke.get(30, TimeUnit.SECONDS);

            Log.e(LOG_TAG, joke);

            assertNotNull(joke);
            assertFalse(TextUtils.isEmpty(joke));

        } catch (Exception e) {
            Log.e(LOG_TAG, e.getMessage());

        }


    }

}