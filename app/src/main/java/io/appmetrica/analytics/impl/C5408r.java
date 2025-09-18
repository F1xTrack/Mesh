package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.r */
/* loaded from: classes2.dex */
public final class C5408r {

    /* renamed from: a */
    public final WeakHashMap f32477a = new WeakHashMap();

    /* renamed from: a */
    public final boolean m20986a(Activity activity, EnumC5383q enumC5383q) {
        if (activity != null && this.f32477a.get(activity) == enumC5383q) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f32477a.put(activity, enumC5383q);
        return true;
    }
}
