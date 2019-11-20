package com.habapps;

import org.robovm.apple.foundation.NSBundle;

import libgdx.constants.GameIdEnum;

public enum GameProperties {

    lettersgame(
            GameIdEnum.lettersgame,
            NSBundle.getMainBundle().getLocalizedString("language", "en", "InfoPlist"),
            NSBundle.getMainBundle().getLocalizedString("CFBundleDisplayName", "en", "InfoPlist"),
            "ca-app-pub-9432399956064043~8509227092",
            "ca-app-pub-9432399956064043/5830081101",
            "ca-app-pub-9432399956064043/5773831666",
            "ca-app-pub-9432399956064043/1643424089",
            "1469442492",
            "1486415363"),


    lettersgame_pro(
            GameIdEnum.lettersgame,
            NSBundle.getMainBundle().getLocalizedString("language", "en", "InfoPlist"),
            NSBundle.getMainBundle().getLocalizedString("CFBundleDisplayName", "en", "InfoPlist"),
            "ca-app-pub-9432399956064043~8509227092",
            "ca-app-pub-9432399956064043/5830081101",
            "ca-app-pub-9432399956064043/5773831666",
            "ca-app-pub-9432399956064043/1643424089",
            "1486415363",
            "1486415363");

    private GameIdEnum gameIdEnum;
    private String language;
    private String appName;
    private String adMobAppId;
    private String bannerAdId;
    private String interstitialAdId;
    private String rewardAdId;
    private String storeAppId;
    private String proVersionStoreAppId;

    GameProperties(GameIdEnum gameIdEnum,
                   String language,
                   String appName,
                   String adMobAppId,
                   String bannerAdId,
                   String interstitialAdId,
                   String rewardAdId,
                   String storeAppId,
                   String proVersionStoreAppId) {
        this.gameIdEnum = gameIdEnum;
        this.language = language;
        this.appName = appName;
        this.adMobAppId = adMobAppId;
        this.bannerAdId = bannerAdId;
        this.interstitialAdId = interstitialAdId;
        this.rewardAdId = rewardAdId;
        this.storeAppId = storeAppId;
        this.proVersionStoreAppId = proVersionStoreAppId;
    }

    public GameIdEnum getGameIdEnum() {
        return gameIdEnum;
    }

    public String getLanguage() {
        return language;
    }

    public String getAppName() {
        return appName;
    }

    public String getAdMobAppId() {
        return adMobAppId;
    }

    public String getBannerAdId() {
        return bannerAdId;
    }

    public String getInterstitialAdId() {
        return interstitialAdId;
    }

    public String getRewardAdId() {
        return rewardAdId;
    }

    public String getStoreAppId() {
        return storeAppId;
    }

    public String getProVersionStoreAppId() {
        return proVersionStoreAppId;
    }
}
