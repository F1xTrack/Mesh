package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.local.model.C2123a;
import com.huawei.hms.framework.network.grs.p007f.C2099b;
import com.huawei.hms.framework.network.grs.p011h.C2117b;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* loaded from: classes.dex */
public class GrsBaseInfo implements Cloneable {
    private static final String TAG = "GrsBaseInfo";
    private String androidVersion;
    private String appName;
    private String countrySource;
    private String deviceModel;
    private String issueCountry;
    private int queryTimeout = -1;
    private String regCountry;
    private String romVersion;
    private String serCountry;
    private String uid;
    private String versionName;

    public @interface CountryCodeSource {
        public static final String APP = "APP";
        public static final String LOCALE_INFO = "LOCALE_INFO";
        public static final String NETWORK_COUNTRY = "NETWORK_COUNTRY";
        public static final String SIM_COUNTRY = "SIM_COUNTRY";
        public static final String UNKNOWN = "UNKNOWN";
        public static final String VENDOR_COUNTRY = "VENDOR_COUNTRY";
    }

    public GrsBaseInfo() {
    }

    private static String getObjSummary(GrsBaseInfo grsBaseInfo) {
        if (grsBaseInfo == null) {
            return "";
        }
        return "serCountry:" + grsBaseInfo.serCountry + "versionName:" + grsBaseInfo.versionName + "appName:" + grsBaseInfo.appName + "uid:" + grsBaseInfo.uid + "regCountry:" + grsBaseInfo.regCountry + "issueCountry:" + grsBaseInfo.issueCountry + "androidVersion:" + grsBaseInfo.androidVersion + "romVersion:" + grsBaseInfo.romVersion + "deviceModel:" + grsBaseInfo.deviceModel + "countrySource:" + grsBaseInfo.countrySource;
    }

    private StringBuffer getStringBuffer(StringBuffer stringBuffer, boolean z, Context context) {
        String androidVersion = getAndroidVersion();
        if (!TextUtils.isEmpty(androidVersion)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            }
            stringBuffer.append("android_version");
            stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
            stringBuffer.append(getUrlEncodedStr(androidVersion));
        }
        String romVersion = getRomVersion();
        if (!TextUtils.isEmpty(romVersion)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            }
            stringBuffer.append("rom_version");
            stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
            stringBuffer.append(getUrlEncodedStr(romVersion));
        }
        String deviceModel = getDeviceModel();
        if (!TextUtils.isEmpty(deviceModel)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            }
            stringBuffer.append(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL);
            stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
            stringBuffer.append(getUrlEncodedStr(deviceModel));
        }
        String countrySource = getCountrySource();
        if (!TextUtils.isEmpty(countrySource)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            }
            stringBuffer.append("country_source");
            stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
            stringBuffer.append(getUrlEncodedStr(countrySource));
        }
        if (!TextUtils.isEmpty(stringBuffer.toString())) {
            stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
        }
        stringBuffer.append(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME);
        stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
        stringBuffer.append(getUrlEncodedStr(context.getPackageName()));
        return stringBuffer;
    }

    /* renamed from: clone */
    public GrsBaseInfo m26665clone() {
        return (GrsBaseInfo) super.clone();
    }

    public boolean compare(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GrsBaseInfo.class != obj.getClass()) {
            return false;
        }
        return getObjSummary(this).equals(getObjSummary((GrsBaseInfo) obj));
    }

    public GrsBaseInfo copy() {
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setAppName(this.appName);
        grsBaseInfo.setSerCountry(this.serCountry);
        grsBaseInfo.setRegCountry(this.regCountry);
        grsBaseInfo.setIssueCountry(this.issueCountry);
        grsBaseInfo.setCountrySource(this.countrySource);
        grsBaseInfo.setAndroidVersion(this.androidVersion);
        grsBaseInfo.setDeviceModel(this.deviceModel);
        grsBaseInfo.setRomVersion(this.romVersion);
        grsBaseInfo.setUid(this.uid);
        grsBaseInfo.setVersionName(this.versionName);
        grsBaseInfo.setQueryTimeout(this.queryTimeout);
        return grsBaseInfo;
    }

    public String getAndroidVersion() {
        return this.androidVersion;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getCountrySource() {
        return this.countrySource;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getGrsParasKey(boolean z, boolean z2, Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        C2099b c2099bM11767a = C2099b.m11767a(context.getPackageName());
        C2123a c2123aM11769a = c2099bM11767a != null ? c2099bM11767a.m11769a() : null;
        String grsReqParamJoint = getGrsReqParamJoint(z, z2, c2123aM11769a != null ? c2123aM11769a.m11877a() : "", context);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            }
            stringBuffer.append(grsReqParamJoint);
        }
        return stringBuffer.toString();
    }

    public String getGrsReqParamJoint(boolean z, boolean z2, String str, Context context) {
        String strM11862a;
        StringBuffer stringBuffer = new StringBuffer();
        if ("1.0".equals(str)) {
            Logger.m11687v(TAG, "1.0 interface has no query param appname");
        } else {
            if (!TextUtils.isEmpty(str)) {
                stringBuffer.append("app_name=");
            } else if (!TextUtils.isEmpty(getAppName())) {
                stringBuffer.append("app_name=");
                str = getAppName();
            }
            stringBuffer.append(getUrlEncodedStr(str));
        }
        String versionName = getVersionName();
        if (!TextUtils.isEmpty(versionName)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            }
            stringBuffer.append("app_version=");
            stringBuffer.append(getUrlEncodedStr(versionName));
        }
        String uid = getUid();
        if (!TextUtils.isEmpty(uid)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            }
            stringBuffer.append("uid=");
            if (z) {
                strM11862a = C2117b.m11865b(uid);
            } else if (z2) {
                strM11862a = C2117b.m11862a(uid);
            } else {
                stringBuffer.append(uid);
            }
            stringBuffer.append(strM11862a);
        }
        String regCountry = getRegCountry();
        if (!TextUtils.isEmpty(regCountry) && !CountryCodeSource.UNKNOWN.equals(regCountry)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            }
            stringBuffer.append("reg_country=");
            stringBuffer.append(getUrlEncodedStr(regCountry));
        }
        String serCountry = getSerCountry();
        if (!TextUtils.isEmpty(serCountry) && !CountryCodeSource.UNKNOWN.equals(serCountry)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            }
            stringBuffer.append("ser_country=");
            stringBuffer.append(getUrlEncodedStr(serCountry));
        }
        String issueCountry = getIssueCountry();
        if (!TextUtils.isEmpty(issueCountry) && !CountryCodeSource.UNKNOWN.equals(issueCountry)) {
            if (!TextUtils.isEmpty(stringBuffer.toString())) {
                stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            }
            stringBuffer.append("issue_country=");
            stringBuffer.append(getUrlEncodedStr(issueCountry));
        }
        return getStringBuffer(stringBuffer, z2, context).toString();
    }

    public String getIssueCountry() {
        return this.issueCountry;
    }

    public int getQueryTimeout() {
        return this.queryTimeout;
    }

    public String getRegCountry() {
        return this.regCountry;
    }

    public String getRomVersion() {
        return this.romVersion;
    }

    public String getSerCountry() {
        return this.serCountry;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUrlEncodedStr(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            Logger.m11682e(TAG, "UnsupportedEncodingException, Please check the params!");
            return "";
        }
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setAndroidVersion(String str) {
        this.androidVersion = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setCountrySource(String str) {
        this.countrySource = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    @Deprecated
    public void setIssueCountry(String str) {
        this.issueCountry = str != null ? str.toUpperCase(Locale.ENGLISH) : "";
    }

    public void setQueryTimeout(int i) {
        this.queryTimeout = i;
    }

    public void setRegCountry(String str) {
        this.regCountry = str != null ? str.toUpperCase(Locale.ENGLISH) : "";
    }

    public void setRomVersion(String str) {
        this.romVersion = str;
    }

    public void setSerCountry(String str) {
        this.serCountry = str != null ? str.toUpperCase(Locale.ENGLISH) : "";
    }

    @Deprecated
    public void setUid(String str) {
        this.uid = str;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public int uniqueCode() {
        return (this.appName + "#" + this.serCountry + "#" + this.regCountry + "#" + this.issueCountry).hashCode();
    }

    public GrsBaseInfo(Context context) {
        this.issueCountry = GrsApp.getInstance().getIssueCountryCode(context);
    }
}
