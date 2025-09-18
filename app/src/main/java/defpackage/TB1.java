package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class TB1 {
    public static final LC0 a = new LC0("session_id");

    public static Intent a(AbstractActivityC4281i6 abstractActivityC4281i6) {
        Intent parentActivityIntent = abstractActivityC4281i6.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strC = c(abstractActivityC4281i6, abstractActivityC4281i6.getComponentName());
            if (strC == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC4281i6, strC);
            try {
                return c(abstractActivityC4281i6, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent b(AbstractActivityC4281i6 abstractActivityC4281i6, ComponentName componentName) {
        String strC = c(abstractActivityC4281i6, componentName);
        if (strC == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strC);
        return c(abstractActivityC4281i6, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String c(Activity activity, ComponentName componentName) {
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
