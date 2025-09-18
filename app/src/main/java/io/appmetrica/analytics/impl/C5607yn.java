package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.yn */
/* loaded from: classes2.dex */
public final class C5607yn extends SimpleThreadSafeToggle {

    /* renamed from: a */
    public final WeakHashMap f32897a;

    public C5607yn() {
        super(false, "[WakelocksToggle]");
        this.f32897a = new WeakHashMap();
    }

    /* renamed from: a */
    public final synchronized void m21228a(Object obj) {
        this.f32897a.put(obj, null);
        if (this.f32897a.size() == 1) {
            updateState(true);
        }
    }

    /* renamed from: b */
    public final synchronized void m21229b(Object obj) {
        this.f32897a.remove(obj);
        if (this.f32897a.isEmpty()) {
            updateState(false);
        }
    }
}
