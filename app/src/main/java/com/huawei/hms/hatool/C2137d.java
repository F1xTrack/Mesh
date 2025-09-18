package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import p000.AbstractC1374Vq;
import p000.F91;

@SuppressLint({"ApplySharedPref"})
/* renamed from: com.huawei.hms.hatool.d */
/* loaded from: classes.dex */
public class C2137d {
    /* renamed from: a */
    public static long m11954a(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C2186v.m12276f("hmsSdk", "context is null or spName empty or spkey is empty");
            return j;
        }
        SharedPreferences sharedPreferencesM11958b = m11958b(context, str);
        return sharedPreferencesM11958b != null ? sharedPreferencesM11958b.getLong(str2, j) : j;
    }

    /* renamed from: b */
    private static SharedPreferences m11958b(Context context, String str) {
        return context.getSharedPreferences(m11961c(context, str), 0);
    }

    /* renamed from: c */
    public static String m11961c(Context context, String str) {
        String packageName = context.getPackageName();
        String strM11918n = AbstractC2130a1.m11918n("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(strM11918n)) {
            return AbstractC1374Vq.m8590i("hms_", str, "_", packageName);
        }
        StringBuilder sbM2541x = F91.m2541x("hms_", str, "_", packageName, "_");
        sbM2541x.append(strM11918n);
        return sbM2541x.toString();
    }

    /* renamed from: a */
    public static String m11955a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C2186v.m12276f("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences sharedPreferencesM11958b = m11958b(context, str);
        return sharedPreferencesM11958b != null ? sharedPreferencesM11958b.getString(str2, str3) : str3;
    }

    /* renamed from: b */
    public static void m11959b(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C2186v.m12276f("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences sharedPreferencesM11958b = m11958b(context, str);
        if (sharedPreferencesM11958b != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesM11958b.edit();
            editorEdit.putLong(str2, j);
            editorEdit.commit();
        }
    }

    /* renamed from: a */
    public static Map<String, ?> m11956a(Context context, String str) {
        return m11958b(context, str).getAll();
    }

    /* renamed from: b */
    public static void m11960b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C2186v.m12275e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences sharedPreferencesM11958b = m11958b(context, str);
        if (sharedPreferencesM11958b != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesM11958b.edit();
            editorEdit.putString(str2, str3);
            editorEdit.commit();
        }
    }

    /* renamed from: a */
    public static void m11957a(Context context, String str, String... strArr) {
        String str2;
        if (context == null || TextUtils.isEmpty(str)) {
            str2 = "clearData(): parameter error.context,spname";
        } else {
            if (strArr != null) {
                SharedPreferences sharedPreferencesM11958b = m11958b(context, str);
                if (sharedPreferencesM11958b != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesM11958b.edit();
                    if (strArr.length == 0) {
                        editorEdit.clear();
                        editorEdit.commit();
                        return;
                    }
                    for (String str3 : strArr) {
                        if (sharedPreferencesM11958b.contains(str3)) {
                            editorEdit.remove(str3);
                            editorEdit.commit();
                        }
                    }
                    return;
                }
                return;
            }
            str2 = "clearData(): No data need to be deleted,keys is null";
        }
        C2186v.m12276f("hmsSdk", str2);
    }
}
