package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class r {
    public final WeakHashMap a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC4800q enumC4800q) {
        if (activity != null && this.a.get(activity) == enumC4800q) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.a.put(activity, enumC4800q);
        return true;
    }
}
