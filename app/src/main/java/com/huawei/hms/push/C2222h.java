package com.huawei.hms.push;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* renamed from: com.huawei.hms.push.h */
/* loaded from: classes.dex */
public class C2222h {
    /* renamed from: a */
    private static int m12447a(Context context) {
        int i = context.getApplicationInfo().icon;
        if (i != 0) {
            return i;
        }
        int identifier = context.getResources().getIdentifier("btn_star_big_on", "drawable", ConstantDeviceInfo.APP_PLATFORM);
        HMSLog.m12617d("PushSelfShowLog", "icon is btn_star_big_on ");
        if (identifier != 0) {
            return identifier;
        }
        HMSLog.m12617d("PushSelfShowLog", "icon is sym_def_app_icon ");
        return R.drawable.sym_def_app_icon;
    }

    /* renamed from: b */
    private static int m12450b(Context context, C2229o c2229o) throws NoSuchFieldException, PackageManager.NameNotFoundException, NumberFormatException {
        int iM12520a = 0;
        if (context == null || c2229o == null) {
            HMSLog.m12622i("PushSelfShowLog", "enter getSmallIconId, context or msg is null");
            return 0;
        }
        if (!TextUtils.isEmpty(c2229o.m12499l())) {
            String[] strArrSplit = c2229o.m12499l().split("/");
            if (strArrSplit.length == 3) {
                iM12520a = C2233s.m12521a(context, strArrSplit[1], strArrSplit[2]);
            }
        }
        if (iM12520a == 0) {
            iM12520a = C2233s.m12520a(context, "com.huawei.messaging.default_notification_icon");
        }
        return iM12520a != 0 ? iM12520a : m12447a(context);
    }

    /* renamed from: a */
    public static Bitmap m12448a(Context context, C2229o c2229o) {
        if (context == null || c2229o == null) {
            return null;
        }
        try {
            if (HwBuildEx.VERSION.EMUI_SDK_INT >= 11) {
                HMSLog.m12622i("PushSelfShowLog", "huawei phone, and emui5.0, need not show large icon.");
                return null;
            }
            if ("com.huawei.android.pushagent".equals(c2229o.m12497j())) {
                return null;
            }
            HMSLog.m12622i("PushSelfShowLog", "get left bitmap from " + c2229o.m12497j());
            return ((BitmapDrawable) context.getPackageManager().getApplicationIcon(c2229o.m12497j())).getBitmap();
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m12620e("PushSelfShowLog", "build left icon occur NameNotFoundException.");
            return null;
        } catch (Exception unused2) {
            HMSLog.m12620e("PushSelfShowLog", "build left icon occur Exception.");
            return null;
        }
    }

    @TargetApi(23)
    /* renamed from: a */
    public static void m12449a(Context context, Notification.Builder builder, C2229o c2229o) {
        if (context != null && builder != null && c2229o != null) {
            builder.setSmallIcon(m12450b(context, c2229o));
        } else {
            HMSLog.m12620e("PushSelfShowLog", "msg is null");
        }
    }
}
