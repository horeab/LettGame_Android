package com.habapps.service;


import com.habapps.IOSLauncher;

import libgdx.game.external.AppInfoService;

public class LettersGameAppInfoServiceImpl implements AppInfoService {

    private IOSLauncher iosLauncher;

    public LettersGameAppInfoServiceImpl(IOSLauncher iosLauncher) {
        this.iosLauncher = iosLauncher;
    }

    @Override
    public String getGameIdPrefix() {
        return iosLauncher.getGameProperties().getGameIdEnum().name();
    }

    @Override
    public boolean isProVersion() {
        return false;
    }

    @Override
    public String proVersionStoreAppId() {
        return null;
    }

    @Override
    public String getAppName() {
        return iosLauncher.getGameProperties().getAppName();
    }

    @Override
    public String getStoreAppId() {
        return iosLauncher.getGameProperties().getStoreAppId();
    }

    @Override
    public void showPopupAd() {
        iosLauncher.showPopupAd();
    }

    @Override
    public void showRewardedVideoAd() {
//        activity.showRewardedVideoAd();
    }

    @Override
    public String getLanguage() {
        return iosLauncher.getGameProperties().getLanguage();
    }

    @Override
    public boolean screenShotMode() {
        return true;
    }

    @Override
    public boolean googleFacebookLoginEnabled() {
        return false;
    }

    @Override
    public String getImplementationGameResourcesFolder() {
        return "";
    }

    @Override
    public String getResourcesFolder() {
        return "";
    }

    @Override
    public String getMainResourcesFolder() {
        return "";
    }

    @Override
    public float gameScreenTopMargin() {
        if (screenShotMode()) {
            return 0;
        }
        return iosLauncher.getSafeAreaInsets() + iosLauncher.getBannerAdHeight();
    }
}
