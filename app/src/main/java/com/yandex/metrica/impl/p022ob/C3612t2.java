package com.yandex.metrica.impl.p022ob;

import java.util.Map;
import p000.F91;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.t2 */
/* loaded from: classes2.dex */
public class C3612t2 {

    /* renamed from: a */
    public final Map<String, String> f24792a;

    /* renamed from: b */
    public final boolean f24793b;

    public C3612t2(Map<String, String> map, boolean z) {
        this.f24792a = map;
        this.f24793b = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SatelliteClidsInfo{clids=");
        sb.append(this.f24792a);
        sb.append(", checked=");
        return F91.m2540w(sb, this.f24793b, '}');
    }
}
