package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ma */
/* loaded from: classes2.dex */
public final class C5294ma {

    /* renamed from: a */
    public final HashMap f32190a;

    /* renamed from: b */
    public final boolean f32191b;

    public C5294ma() {
        this(false);
    }

    /* renamed from: a */
    public final void m20705a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f32190a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f32190a.toString();
    }

    public C5294ma(boolean z) {
        this.f32190a = new HashMap();
        this.f32191b = z;
    }
}
