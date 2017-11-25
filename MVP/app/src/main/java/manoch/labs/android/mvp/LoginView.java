package manoch.labs.android.mvp;

/**
 * Created by Manoch Richard on 06-Nov-17.
 */

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
