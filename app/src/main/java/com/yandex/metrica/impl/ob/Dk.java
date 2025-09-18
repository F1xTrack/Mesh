package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/* loaded from: classes2.dex */
class Dk implements InterfaceC3035ql {
    private final Wn a;

    public Dk() {
        this(new Wn());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3035ql
    public Bundle a(Activity activity) {
        ActivityInfo activityInfo;
        Wn wn = this.a;
        ComponentName componentName = activity.getComponentName();
        wn.getClass();
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(componentName, 128);
        } catch (Throwable unused) {
            activityInfo = null;
        }
        if (activityInfo != null) {
            return activityInfo.metaData;
        }
        return null;
    }

    public Dk(Wn wn) {
        this.a = wn;
    }
}
