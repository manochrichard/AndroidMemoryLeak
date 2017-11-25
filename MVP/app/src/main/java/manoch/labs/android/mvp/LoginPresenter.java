package manoch.labs.android.mvp;

/**
 * Created by Manoch Richard on 06-Nov-17.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
