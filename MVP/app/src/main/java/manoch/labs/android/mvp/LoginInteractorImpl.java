package manoch.labs.android.mvp;

import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by Manoch Richard on 06-Nov-17.
 */

public class LoginInteractorImpl extends AsyncTask<String, Void, String> implements LoginInteractor {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener)
    {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                    return;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }

    @Override
    protected void onPreExecute()
    {

    }

    @Override
    protected void onPostExecute(String s)
    {

    }

    @Override
    protected String doInBackground(String... strings) {
        return null;
    }
}
