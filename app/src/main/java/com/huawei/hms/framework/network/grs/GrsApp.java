package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import p000.AbstractC7222ym;

/* loaded from: classes.dex */
public class GrsApp {
    private static final String BRAND;
    private static final GrsApp INSTANCE = new GrsApp();
    private static final String TAG = "GrsApp";
    private String appConfigName;

    static {
        String str;
        String name = GrsApp.class.getPackage().getName();
        if ("com.huawei.hms.framework.network.grs".equals(name)) {
            str = "";
        } else {
            String[] strArrSplit = name.split("\\.");
            Logger.m11687v(TAG, "current brand is: " + strArrSplit[1]);
            str = strArrSplit[1];
        }
        BRAND = str;
    }

    private GrsApp() {
    }

    public static GrsApp getInstance() {
        return INSTANCE;
    }

    public String getAppConfigName() {
        return this.appConfigName;
    }

    public String getBrand(String str) {
        String str2 = BRAND;
        return TextUtils.isEmpty(str2) ? "" : AbstractC7222ym.m26232i(str2, str);
    }

    public String getIssueCountryCode(Context context) {
        return C2091a.m11692a(context, false).getCountryCode();
    }

    public void setAppConfigName(String str) {
        this.appConfigName = str;
    }
}
