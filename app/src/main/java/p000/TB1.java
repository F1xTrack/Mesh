package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class TB1 {

    /* renamed from: a */
    public static final LC0 f11196a = new LC0("session_id");

    /* renamed from: a */
    public static Intent m7622a(AbstractActivityC4221i6 abstractActivityC4221i6) {
        Intent parentActivityIntent = abstractActivityC4221i6.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM7624c = m7624c(abstractActivityC4221i6, abstractActivityC4221i6.getComponentName());
            if (strM7624c == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC4221i6, strM7624c);
            try {
                return m7624c(abstractActivityC4221i6, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public static Intent m7623b(AbstractActivityC4221i6 abstractActivityC4221i6, ComponentName componentName) {
        String strM7624c = m7624c(abstractActivityC4221i6, componentName);
        if (strM7624c == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM7624c);
        return m7624c(abstractActivityC4221i6, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m7624c(Activity activity, ComponentName componentName) {
        String string;
        PackageManager packageManager = activity.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }
}
