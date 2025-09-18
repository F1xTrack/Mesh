package com.yandex.metrica.impl.ob;

import defpackage.F91;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3090t2 {
    public final Map<String, String> a;
    public final boolean b;

    public C3090t2(Map<String, String> map, boolean z) {
        this.a = map;
        this.b = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SatelliteClidsInfo{clids=");
        sb.append(this.a);
        sb.append(", checked=");
        return F91.w(sb, this.b, '}');
    }
}
