package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.oc */
/* loaded from: classes2.dex */
public class C5346oc {

    /* renamed from: a */
    public final Map f32341a;

    /* renamed from: b */
    public final Object f32342b;

    public C5346oc(Object obj) {
        this(new HashMap(), obj);
    }

    /* renamed from: a */
    public final void m20863a(Object obj, Object obj2) {
        this.f32341a.put(obj, obj2);
    }

    public C5346oc(HashMap map, Object obj) {
        this.f32341a = map;
        this.f32342b = obj;
    }

    /* renamed from: a */
    public final Object m20862a(Object obj) {
        Object obj2 = this.f32341a.get(obj);
        return obj2 == null ? this.f32342b : obj2;
    }
}
