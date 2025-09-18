package com.p019vk.push.core.utils;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import p000.AbstractC0691Ky;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0005\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0002*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m22267d2 = {"T", "Landroid/content/Context;", "", "enabled", "LTf1;", "setComponentEnabled", "(Landroid/content/Context;Z)V", "areNotificationsEnabled", "(Landroid/content/Context;)Z", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ContextExtensionsKt {
    public static final boolean areNotificationsEnabled(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        O90.m5968f(context, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            NotificationManager notificationManager = (NotificationManager) AbstractC0691Ky.m4784b(context, NotificationManager.class);
            if (notificationManager != null) {
                return notificationManager.areNotificationsEnabled();
            }
            return false;
        }
        Object systemService = context.getSystemService("appops");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        AppOpsManager appOpsManager = (AppOpsManager) systemService;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        O90.m5967e(applicationInfo, "applicationInfo");
        String packageName = context.getApplicationContext().getPackageName();
        O90.m5967e(packageName, "applicationContext.packageName");
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Object obj = cls.getDeclaredField("OP_POST_NOTIFICATION").get(cls2);
            O90.m5966d(obj, "null cannot be cast to non-null type kotlin.Int");
            Object objInvoke = method.invoke(appOpsManager, (Integer) obj, Integer.valueOf(i), packageName);
            O90.m5966d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public static final /* synthetic */ <T> void setComponentEnabled(Context context, boolean z) {
        O90.m5968f(context, "<this>");
        try {
            if (z) {
                context.getPackageManager();
                O90.m5974l();
                throw null;
            }
            context.getPackageManager();
            O90.m5974l();
            throw null;
        } catch (RuntimeException unused) {
        }
    }
}
