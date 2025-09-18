package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.z */
/* loaded from: classes2.dex */
public class C3765z {

    /* renamed from: a */
    private final WeakHashMap<Activity, a> f25348a = new WeakHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.z$a */
    public enum a {
        UNDEFINED,
        RESUMED,
        PAUSED
    }

    /* renamed from: a */
    public boolean m17312a(Activity activity, a aVar) {
        if (activity != null && this.f25348a.get(activity) == aVar) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f25348a.put(activity, aVar);
        return true;
    }
}
