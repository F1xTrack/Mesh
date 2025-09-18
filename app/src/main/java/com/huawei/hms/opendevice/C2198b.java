package com.huawei.hms.opendevice;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.util.UUID;
import p000.C8079Os1;

/* renamed from: com.huawei.hms.opendevice.b */
/* loaded from: classes.dex */
public class C2198b {
    /* renamed from: a */
    public static DeleteTokenReq m12330a(Context context, String str, String str2, String str3, String str4) {
        DeleteTokenReq deleteTokenReq = new DeleteTokenReq();
        deleteTokenReq.setAppId(str);
        deleteTokenReq.setScope(str4);
        deleteTokenReq.setProjectId(str2);
        deleteTokenReq.setPkgName(context.getPackageName());
        deleteTokenReq.setSubjectId(str3);
        if (TextUtils.isEmpty(str)) {
            deleteTokenReq.setAppId(Util.getAppId(context));
        }
        if (TextUtils.isEmpty(str4)) {
            deleteTokenReq.setScope("HCM");
        }
        if (TextUtils.isEmpty(str2)) {
            deleteTokenReq.setProjectId(m12335c(context));
        }
        return deleteTokenReq;
    }

    /* renamed from: b */
    public static TokenReq m12332b(Context context, String str, String str2) {
        return m12333b(context, str, null, null, str2);
    }

    /* renamed from: c */
    public static String m12335c(Context context) {
        return C8079Os1.m6176c(context).getString("client/project_id");
    }

    /* renamed from: d */
    public static boolean m12336d(Context context) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                if (!TextUtils.isEmpty(bundle.getString("com.huawei.hms.client.service.name:base"))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m12620e(HmsInstanceId.TAG, "isIntegratedBaseSdk failed.");
            return true;
        }
    }

    /* renamed from: b */
    public static TokenReq m12331b(Context context, String str) {
        return m12333b(context, null, null, str, null);
    }

    /* renamed from: b */
    public static TokenReq m12333b(Context context, String str, String str2, String str3, String str4) {
        TokenReq tokenReq = new TokenReq();
        tokenReq.setPackageName(context.getPackageName());
        tokenReq.setAppId(str);
        tokenReq.setScope(str4);
        tokenReq.setProjectId(str2);
        tokenReq.setSubjectId(str3);
        tokenReq.setMultiSender(false);
        if (TextUtils.isEmpty(str)) {
            tokenReq.setAppId(Util.getAppId(context));
        }
        if (TextUtils.isEmpty(str2)) {
            tokenReq.setProjectId(m12335c(context));
        }
        if (TextUtils.isEmpty(str4)) {
            tokenReq.setScope("HCM");
        }
        C2205i c2205iM12355a = C2205i.m12355a(context);
        if (!c2205iM12355a.getBoolean("hasRequestAgreement")) {
            tokenReq.setFirstTime(true);
            c2205iM12355a.saveBoolean("hasRequestAgreement", true);
        } else {
            tokenReq.setFirstTime(false);
        }
        return tokenReq;
    }

    /* renamed from: a */
    public static DeleteTokenReq m12329a(Context context, String str, String str2) {
        return m12330a(context, str, null, null, str2);
    }

    /* renamed from: a */
    public static DeleteTokenReq m12328a(Context context, String str) {
        return m12330a(context, null, null, str, null);
    }

    /* renamed from: a */
    public static DeleteTokenReq m12327a(Context context) {
        return m12330a(context, null, null, null, null);
    }

    /* renamed from: b */
    public static synchronized String m12334b(Context context) {
        String string;
        try {
            PushPreferences pushPreferences = new PushPreferences(context, "aaid");
            if (pushPreferences.containsKey("aaid")) {
                string = pushPreferences.getString("aaid");
            } else {
                string = UUID.randomUUID().toString();
                pushPreferences.saveString("aaid", string);
                pushPreferences.saveLong("creationTime", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return string;
    }
}
