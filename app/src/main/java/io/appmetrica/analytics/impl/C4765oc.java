package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4765oc {
    public final Map a;
    public final Object b;

    public C4765oc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    public C4765oc(HashMap map, Object obj) {
        this.a = map;
        this.b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        return obj2 == null ? this.b : obj2;
    }
}
