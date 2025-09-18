package com.huawei.hms.framework.network.grs.p006e;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC7222ym;

/* renamed from: com.huawei.hms.framework.network.grs.e.c */
/* loaded from: classes.dex */
public class C2097c {

    /* renamed from: b */
    private static final String f19032b = "c";

    /* renamed from: c */
    private static final Map<String, PLSharedPreferences> f19033c = new ConcurrentHashMap(16);

    /* renamed from: a */
    private final PLSharedPreferences f19034a;

    public C2097c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.m11681d(f19032b, "get pkgname from context is{%s}", packageName);
        Map<String, PLSharedPreferences> map = f19033c;
        if (map.containsKey(str + packageName)) {
            this.f19034a = map.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, AbstractC7222ym.m26232i(str, packageName));
            this.f19034a = pLSharedPreferences;
            map.put(str + packageName, pLSharedPreferences);
        }
        m11742a(context);
    }

    /* renamed from: a */
    public String m11743a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f19034a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f19034a.getString(str, str2);
        }
        return string;
    }

    /* renamed from: b */
    public void m11746b() {
        PLSharedPreferences pLSharedPreferences = this.f19034a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f19034a.clear();
        }
    }

    /* renamed from: a */
    public Map<String, ?> m11744a() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f19034a;
        if (pLSharedPreferences == null) {
            return new HashMap();
        }
        synchronized (pLSharedPreferences) {
            all = this.f19034a.getAll();
        }
        return all;
    }

    /* renamed from: b */
    public void m11747b(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f19034a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f19034a.putString(str, str2);
        }
    }

    /* renamed from: a */
    private void m11742a(Context context) {
        String str = f19032b;
        Logger.m11685i(str, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            String string = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String strM11743a = m11743a("version", "");
            if (string.equals(strM11743a)) {
                return;
            }
            Logger.m11686i(str, "app version changed! old version{%s} and new version{%s}", strM11743a, string);
            m11746b();
            m11747b("version", string);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.m11689w(f19032b, "get app version failed and catch NameNotFoundException");
        }
    }

    /* renamed from: a */
    public void m11745a(String str) {
        PLSharedPreferences pLSharedPreferences = this.f19034a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f19034a.remove(str);
        }
    }
}
