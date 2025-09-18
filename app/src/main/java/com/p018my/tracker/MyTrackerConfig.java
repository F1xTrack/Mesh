package com.p018my.tracker;

import android.content.pm.PackageInfo;
import com.p018my.tracker.config.AntiFraudConfig;
import com.p018my.tracker.obfuscated.C2395z2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import p000.C10585ox0;

/* loaded from: classes2.dex */
public final class MyTrackerConfig {
    private final C2395z2 trackerConfig;

    public interface InstalledPackagesProvider {
        List<PackageInfo> getInstalledPackages();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationTrackingMode {
        public static final int ACTIVE = 2;
        public static final int CACHED = 1;
        public static final int NONE = 0;
    }

    public interface OkHttpClientProvider {
        C10585ox0 getOkHttpClient();
    }

    private MyTrackerConfig(C2395z2 c2395z2) {
        this.trackerConfig = c2395z2;
    }

    public static MyTrackerConfig newConfig(C2395z2 c2395z2) {
        return new MyTrackerConfig(c2395z2);
    }

    public AntiFraudConfig getAntiFraudConfig() {
        return this.trackerConfig.m13584a();
    }

    public String getApkPreinstallParams() {
        return this.trackerConfig.m13592b();
    }

    public int getBufferingPeriod() {
        return this.trackerConfig.m13603e();
    }

    public int getForcingPeriod() {
        return this.trackerConfig.m13606f();
    }

    public String getId() {
        return this.trackerConfig.m13607g();
    }

    public int getLaunchTimeout() {
        return this.trackerConfig.m13609i();
    }

    public int getLocationTrackingMode() {
        return this.trackerConfig.m13610j();
    }

    @Deprecated
    public String getVendorAppPackage() {
        return this.trackerConfig.m13618r();
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.trackerConfig.m13619s();
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.trackerConfig.m13620t();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.trackerConfig.m13621u();
    }

    @Deprecated
    public boolean isTrackingLocationEnabled() {
        int iM13610j = this.trackerConfig.m13610j();
        return iM13610j == 1 || iM13610j == 2;
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.trackerConfig.m13622v();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.trackerConfig.m13623w();
    }

    public void setAntiFraudConfig(AntiFraudConfig antiFraudConfig) {
        this.trackerConfig.m13589a(antiFraudConfig);
    }

    public MyTrackerConfig setApkPreinstallParams(String str) {
        this.trackerConfig.m13590a(str);
        return this;
    }

    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z) {
        this.trackerConfig.m13591a(z);
        return this;
    }

    public MyTrackerConfig setBufferingPeriod(int i) {
        this.trackerConfig.m13585a(i);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.trackerConfig.m13624z();
        return this;
    }

    public MyTrackerConfig setForcingPeriod(int i) {
        this.trackerConfig.m13593b(i);
        return this;
    }

    public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {
        this.trackerConfig.m13587a(installedPackagesProvider);
        return this;
    }

    public MyTrackerConfig setLaunchTimeout(int i) {
        this.trackerConfig.m13597c(i);
        return this;
    }

    public MyTrackerConfig setLocationTrackingMode(int i) {
        this.trackerConfig.m13601d(i);
        return this;
    }

    public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {
        this.trackerConfig.m13588a(okHttpClientProvider);
        return this;
    }

    public MyTrackerConfig setProxyHost(String str) {
        this.trackerConfig.m13598c(str);
        return this;
    }

    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z) {
        this.trackerConfig.m13595b(z);
        return this;
    }

    public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {
        this.trackerConfig.m13599c(z);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setTrackingLocationEnabled(boolean z) {
        C2395z2 c2395z2;
        int i;
        if (z) {
            c2395z2 = this.trackerConfig;
            i = 1;
        } else {
            c2395z2 = this.trackerConfig;
            i = 0;
        }
        c2395z2.m13601d(i);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {
        this.trackerConfig.m13602d(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.trackerConfig.m13605e(z);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setVendorAppPackage(String str) {
        this.trackerConfig.m13604e(str);
        return this;
    }
}
