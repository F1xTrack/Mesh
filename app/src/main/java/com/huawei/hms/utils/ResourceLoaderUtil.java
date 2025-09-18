package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes2.dex */
public abstract class ResourceLoaderUtil {

    /* renamed from: a */
    private static Context f19661a;

    /* renamed from: b */
    private static String f19662b;

    public static int getAnimId(String str) {
        Context context = f19661a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "anim", f19662b);
    }

    public static int getColorId(String str) {
        Context context = f19661a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "color", f19662b);
    }

    public static int getDimenId(String str) {
        Context context = f19661a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "dimen", f19662b);
    }

    public static Drawable getDrawable(String str) {
        Context context = f19661a;
        if (context == null) {
            return null;
        }
        return context.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        Context context = f19661a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "drawable", f19662b);
    }

    public static int getIdId(String str) {
        Context context = f19661a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, NotificationConstants.f19487ID, f19662b);
    }

    public static int getLayoutId(String str) {
        Context context = f19661a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "layout", f19662b);
    }

    public static String getString(String str) {
        Context context = f19661a;
        return context == null ? "" : context.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        Context context = f19661a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "string", f19662b);
    }

    public static int getStyleId(String str) {
        Context context = f19661a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "style", f19662b);
    }

    public static Context getmContext() {
        return f19661a;
    }

    public static void setmContext(Context context) {
        f19661a = context;
        if (context != null) {
            f19662b = context.getPackageName();
        } else {
            f19662b = null;
            HMSLog.m12620e("ResourceLoaderUtil", "context is null");
        }
    }

    public static String getString(String str, Object... objArr) {
        Context context = f19661a;
        if (context == null) {
            return "";
        }
        return context.getResources().getString(getStringId(str), objArr);
    }
}
