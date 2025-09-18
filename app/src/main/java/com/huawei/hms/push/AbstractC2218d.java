package com.huawei.hms.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;
import p000.C8079Os1;

/* renamed from: com.huawei.hms.push.d */
/* loaded from: classes.dex */
public abstract class AbstractC2218d {

    /* renamed from: a */
    private static final Object f19416a = new Object();

    /* renamed from: b */
    private static int f19417b = -1;

    /* renamed from: a */
    private static boolean m12430a(Context context) {
        HMSLog.m12617d("CommFun", "existFrameworkPush:" + f19417b);
        try {
            File file = new File("/system/framework/hwpush.jar");
            if (!m12429a() && !file.isFile()) {
                return false;
            }
            HMSLog.m12617d("CommFun", "push jarFile is exist");
            return true;
        } catch (Exception e) {
            HMSLog.m12620e("CommFun", "get Apk version faild ,Exception e= " + e.toString());
            return false;
        }
    }

    /* renamed from: b */
    public static long m12432b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 16384).versionCode;
        } catch (Exception unused) {
            HMSLog.m12620e("CommFun", "get nc versionCode error");
            return -1L;
        }
    }

    /* renamed from: c */
    public static boolean m12435c() {
        return HwBuildEx.VERSION.EMUI_SDK_INT < 19;
    }

    /* renamed from: d */
    public static boolean m12436d(Context context) {
        HMSLog.m12617d("CommFun", "existFrameworkPush:" + f19417b);
        synchronized (f19416a) {
            try {
                int i = f19417b;
                if (-1 != i) {
                    return 1 == i;
                }
                if (m12430a(context)) {
                    f19417b = 1;
                } else {
                    f19417b = 0;
                }
                return 1 == f19417b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public static String m12434c(Context context) {
        return C8079Os1.m6176c(context).getString("client/project_id");
    }

    /* renamed from: b */
    public static boolean m12433b() {
        return HwBuildEx.VERSION.EMUI_SDK_INT >= 21;
    }

    /* renamed from: a */
    private static boolean m12429a() throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("huawei.cust.HwCfgFilePolicy");
            Integer num = (Integer) cls.getDeclaredField("CUST_TYPE_CONFIG").get(cls);
            num.intValue();
            File file = (File) cls.getDeclaredMethod("getCfgFile", String.class, Integer.TYPE).invoke(cls, "jars/hwpush.jar", num);
            if (file != null && file.exists()) {
                HMSLog.m12617d("CommFun", "get push cust File path success.");
                return true;
            }
        } catch (ClassNotFoundException unused) {
            HMSLog.m12620e("CommFun", "HwCfgFilePolicy ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            HMSLog.m12620e("CommFun", "check cust exist push IllegalAccessException.");
        } catch (IllegalArgumentException unused3) {
            HMSLog.m12620e("CommFun", "check cust exist push IllegalArgumentException.");
        } catch (NoSuchFieldException unused4) {
            HMSLog.m12620e("CommFun", "check cust exist push NoSuchFieldException.");
        } catch (NoSuchMethodException unused5) {
            HMSLog.m12620e("CommFun", "check cust exist push NoSuchMethodException.");
        } catch (SecurityException unused6) {
            HMSLog.m12620e("CommFun", "check cust exist push SecurityException.");
        } catch (InvocationTargetException unused7) {
            HMSLog.m12620e("CommFun", "check cust exist push InvocationTargetException.");
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m12431a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        return jSONObject == null || (TextUtils.isEmpty(str) && jSONObject2 == null);
    }
}
