package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3242z {
    private final WeakHashMap<Activity, a> a = new WeakHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.z$a */
    public enum a {
        UNDEFINED,
        RESUMED,
        PAUSED
    }

    public boolean a(Activity activity, a aVar) {
        if (activity != null && this.a.get(activity) == aVar) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.a.put(activity, aVar);
        return true;
    }
}
