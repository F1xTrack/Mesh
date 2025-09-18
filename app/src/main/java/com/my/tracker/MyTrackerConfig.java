package com.my.tracker;

import android.content.pm.PackageInfo;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.z2;
import defpackage.C6363ox0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes2.dex */
public final class MyTrackerConfig {
    private final z2 trackerConfig;

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
        C6363ox0 getOkHttpClient();
    }

    private MyTrackerConfig(z2 z2Var) {
        this.trackerConfig = z2Var;
    }

    public static MyTrackerConfig newConfig(z2 z2Var) {
        return new MyTrackerConfig(z2Var);
    }

    public AntiFraudConfig getAntiFraudConfig() {
        return this.trackerConfig.a();
    }

    public String getApkPreinstallParams() {
        return this.trackerConfig.b();
    }

    public int getBufferingPeriod() {
        return this.trackerConfig.e();
    }

    public int getForcingPeriod() {
        return this.trackerConfig.f();
    }

    public String getId() {
        return this.trackerConfig.g();
    }

    public int getLaunchTimeout() {
        return this.trackerConfig.i();
    }

    public int getLocationTrackingMode() {
        return this.trackerConfig.j();
    }

    @Deprecated
    public String getVendorAppPackage() {
        return this.trackerConfig.r();
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.trackerConfig.s();
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.trackerConfig.t();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.trackerConfig.u();
    }

    @Deprecated
    public boolean isTrackingLocationEnabled() {
        int iJ = this.trackerConfig.j();
        return iJ == 1 || iJ == 2;
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.trackerConfig.v();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.trackerConfig.w();
    }

    public void setAntiFraudConfig(AntiFraudConfig antiFraudConfig) {
        this.trackerConfig.a(antiFraudConfig);
    }

    public MyTrackerConfig setApkPreinstallParams(String str) {
        this.trackerConfig.a(str);
        return this;
    }

    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z) {
        this.trackerConfig.a(z);
        return this;
    }

    public MyTrackerConfig setBufferingPeriod(int i) {
        this.trackerConfig.a(i);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.trackerConfig.z();
        return this;
    }

    public MyTrackerConfig setForcingPeriod(int i) {
        this.trackerConfig.b(i);
        return this;
    }

    public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {
        this.trackerConfig.a(installedPackagesProvider);
        return this;
    }

    public MyTrackerConfig setLaunchTimeout(int i) {
        this.trackerConfig.c(i);
        return this;
    }

    public MyTrackerConfig setLocationTrackingMode(int i) {
        this.trackerConfig.d(i);
        return this;
    }

    public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {
        this.trackerConfig.a(okHttpClientProvider);
        return this;
    }

    public MyTrackerConfig setProxyHost(String str) {
        this.trackerConfig.c(str);
        return this;
    }

    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z) {
        this.trackerConfig.b(z);
        return this;
    }

    public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {
        this.trackerConfig.c(z);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setTrackingLocationEnabled(boolean z) {
        z2 z2Var;
        int i;
        if (z) {
            z2Var = this.trackerConfig;
            i = 1;
        } else {
            z2Var = this.trackerConfig;
            i = 0;
        }
        z2Var.d(i);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {
        this.trackerConfig.d(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.trackerConfig.e(z);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setVendorAppPackage(String str) {
        this.trackerConfig.e(str);
        return this;
    }
}
