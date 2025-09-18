package com.huawei.hms.hatool;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.hms.hatool.x0 */
/* loaded from: classes.dex */
public class C2191x0 extends AbstractC2170o {
    /* renamed from: c */
    public static String m12298c() {
        String str;
        String str2;
        String str3 = "";
        try {
            str2 = (String) Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", null).invoke(null, null);
        } catch (AndroidRuntimeException unused) {
        } catch (ClassNotFoundException unused2) {
        } catch (IllegalAccessException unused3) {
        } catch (IllegalArgumentException unused4) {
        } catch (NoSuchMethodException unused5) {
        } catch (InvocationTargetException unused6) {
        }
        try {
            C2186v.m12271c("hmsSdk", "getUDID success");
            return str2;
        } catch (AndroidRuntimeException unused7) {
            str3 = str2;
            str = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
            C2186v.m12276f("hmsSdk", str);
            return str3;
        } catch (ClassNotFoundException unused8) {
            str3 = str2;
            str = "getUDID method invoke failed";
            C2186v.m12276f("hmsSdk", str);
            return str3;
        } catch (IllegalAccessException unused9) {
            str3 = str2;
            str = "getUDID method invoke failed : Illegal AccessException";
            C2186v.m12276f("hmsSdk", str);
            return str3;
        } catch (IllegalArgumentException unused10) {
            str3 = str2;
            str = "getUDID method invoke failed : Illegal ArgumentException";
            C2186v.m12276f("hmsSdk", str);
            return str3;
        } catch (NoSuchMethodException unused11) {
            str3 = str2;
            str = "getUDID method invoke failed : NoSuchMethodException";
            C2186v.m12276f("hmsSdk", str);
            return str3;
        } catch (InvocationTargetException unused12) {
            str3 = str2;
            str = "getUDID method invoke failed : InvocationTargetException";
            C2186v.m12276f("hmsSdk", str);
            return str3;
        }
    }

    /* renamed from: e */
    public static Pair<String, String> m12299e(Context context) {
        if (C2135c0.m11944a(context, "android.permission.READ_PHONE_STATE")) {
            C2186v.m12276f("hmsSdk", "getMccAndMnc() Pair value is empty");
            return new Pair<>("", "");
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            String networkOperator = telephonyManager.getNetworkOperator();
            return (TextUtils.isEmpty(networkOperator) || TextUtils.equals(networkOperator, "null")) ? new Pair<>("", "") : networkOperator.length() > 3 ? new Pair<>(networkOperator.substring(0, 3), networkOperator.substring(3)) : new Pair<>("", "");
        }
        return new Pair<>("", "");
    }
}
