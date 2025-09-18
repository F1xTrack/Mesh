package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.hms.hatool.o */
/* loaded from: classes.dex */
public abstract class AbstractC2170o {

    /* renamed from: com.huawei.hms.hatool.o$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    private static Object m12142a(Class cls, String str, Class[] clsArr, Object[] objArr) throws a {
        String str2;
        if (cls == null) {
            throw new a("class is null in invokeStaticFun");
        }
        if (clsArr == null) {
            if (objArr != null) {
                throw new a("paramsType is null, but params is not null");
            }
        } else {
            if (objArr == null) {
                throw new a("paramsType or params should be same");
            }
            if (clsArr.length != objArr.length) {
                throw new a("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
            }
        }
        try {
            try {
                return cls.getMethod(str, clsArr).invoke(null, objArr);
            } catch (IllegalAccessException unused) {
                str2 = "invokeStaticFun(): method invoke Exception!";
                C2186v.m12276f("hmsSdk", str2);
                return null;
            } catch (IllegalArgumentException unused2) {
                str2 = "invokeStaticFun(): Illegal Argument!";
                C2186v.m12276f("hmsSdk", str2);
                return null;
            } catch (InvocationTargetException unused3) {
                str2 = "invokeStaticFun(): Invocation Target Exception!";
                C2186v.m12276f("hmsSdk", str2);
                return null;
            }
        } catch (NoSuchMethodException unused4) {
            C2186v.m12276f("hmsSdk", "invokeStaticFun(): cls.getMethod(),No Such Method !");
        }
    }

    /* renamed from: b */
    public static String m12148b() {
        String strM12147a = m12147a("com.huawei.android.os.SystemPropertiesEx", "ro.huawei.build.display.id", "");
        C2186v.m12271c("hmsSdk", "SystemPropertiesEx: get rom_ver: " + strM12147a);
        if (!TextUtils.isEmpty(strM12147a)) {
            return strM12147a;
        }
        String str = Build.DISPLAY;
        C2186v.m12271c("hmsSdk", "SystemProperties: get rom_ver: " + str);
        return str;
    }

    /* renamed from: c */
    public static String m12150c(Context context) {
        return context == null ? "" : context.getPackageName();
    }

    /* renamed from: d */
    public static String m12151d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(m12150c(context), 16384).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            C2186v.m12276f("hmsSdk", "getVersion(): The package name is not correct!");
            return "";
        }
    }

    /* renamed from: a */
    private static Object m12143a(String str, String str2, Class[] clsArr, Object[] objArr) {
        String str3;
        try {
            return m12142a(Class.forName(str), str2, clsArr, objArr);
        } catch (a unused) {
            str3 = "invokeStaticFun(): Static function call Exception ";
            C2186v.m12276f("hmsSdk", str3);
            return null;
        } catch (ClassNotFoundException unused2) {
            str3 = "invokeStaticFun() Not found class!";
            C2186v.m12276f("hmsSdk", str3);
            return null;
        }
    }

    /* renamed from: b */
    public static String m12149b(Context context) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("CHANNEL")) == null) {
                return "Unknown";
            }
            String string = obj.toString();
            return string.length() > 256 ? "Unknown" : string;
        } catch (PackageManager.NameNotFoundException unused) {
            C2186v.m12276f("hmsSdk", "getChannel(): The packageName is not correct!");
            return "Unknown";
        }
    }

    /* renamed from: a */
    public static String m12144a() {
        return m12146a("ro.build.version.emui", "");
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: a */
    public static String m12145a(Context context) {
        return context == null ? "" : Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: a */
    public static String m12146a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String strM12147a = m12147a("android.os.SystemProperties", str, str2);
        return TextUtils.isEmpty(strM12147a) ? m12147a("com.huawei.android.os.SystemPropertiesEx", str, str2) : strM12147a;
    }

    /* renamed from: a */
    private static String m12147a(String str, String str2, String str3) {
        Object objM12143a = m12143a(str, "get", new Class[]{String.class, String.class}, new Object[]{str2, str3});
        return objM12143a != null ? (String) objM12143a : str3;
    }
}
