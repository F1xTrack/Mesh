package com.huawei.hms.framework.network.grs.p011h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import java.util.Locale;
import p000.AbstractC7222ym;

/* renamed from: com.huawei.hms.framework.network.grs.h.a */
/* loaded from: classes.dex */
public class C2116a {
    /* renamed from: a */
    public static String m11858a() {
        return "6.0.11.300";
    }

    /* renamed from: b */
    public static String m11861b(Context context, String str, String str2) {
        return m11860a(context, str, str2);
    }

    /* renamed from: a */
    public static String m11859a(Context context) {
        if (context == null) {
            return "";
        }
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.m11690w("AgentUtil", "", e);
            return "";
        }
    }

    /* renamed from: a */
    public static String m11860a(Context context, String str, String str2) {
        if (context == null) {
            return String.format(Locale.ROOT, AbstractC7222ym.m26232i(str, "/%s"), m11858a());
        }
        String packageName = (ContextHolder.getAppContext() == null ? context : ContextHolder.getAppContext()).getPackageName();
        String strM11859a = m11859a(context);
        Locale locale = Locale.ROOT;
        String strM26234k = AbstractC7222ym.m26234k("%s/%s (Linux; Android %s; %s) ", str, "/%s %s");
        String strM11858a = m11858a();
        if (TextUtils.isEmpty(str2)) {
            str2 = "no_service_name";
        }
        return String.format(locale, strM26234k, packageName, strM11859a, Build.VERSION.RELEASE, Build.MODEL, strM11858a, str2);
    }
}
