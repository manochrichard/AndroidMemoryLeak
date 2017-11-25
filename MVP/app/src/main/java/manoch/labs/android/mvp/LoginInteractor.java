package manoch.labs.android.mvp;

import android.os.AsyncTask;

/**
 * Created by Manoch Richard on 06-Nov-17.
 */

public interface LoginInteractor   {

    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
