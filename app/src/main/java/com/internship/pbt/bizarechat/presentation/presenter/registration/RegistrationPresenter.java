package com.internship.pbt.bizarechat.presentation.presenter.registration;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.internship.pbt.bizarechat.presentation.model.InformationOnCheck;
import com.internship.pbt.bizarechat.presentation.presenter.Presenter;
import com.internship.pbt.bizarechat.presentation.view.fragment.register.RegistrationView;

public interface RegistrationPresenter extends Presenter {

    void showErrorInvalidPassword();

    void setRegistrationView(RegistrationView registerView);

    void showErrorInvalidEmail();

    void showErrorInvalidPhoneNumber();

    void hideErrorsInvalid();

    void validateInformation(InformationOnCheck informationOnCheck);

    void onRegistrationSuccess();

    void facebookLink();

    void registrationRequest(InformationOnCheck informationOnCheck);

    void showErrorPasswordLength();

    void verifyAndLoadAvatar(Context context, Uri uri);

    void showErrorPasswordConfirm();

    void createFormatWatcher();

    void loadAvatar(ImageView imageView);
}