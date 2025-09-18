package io.appmetrica.analytics.impl;

import defpackage.O90;
import java.util.Map;

/* loaded from: classes2.dex */
public final class I3 implements Q7 {
    public final Map a;
    public final P7 b;

    public I3(Map<String, String> map, P7 p7) {
        this.a = map;
        this.b = p7;
    }

    public final I3 a(Map<String, String> map, P7 p7) {
        return new I3(map, p7);
    }

    public final Map<String, String> b() {
        return this.a;
    }

    public final P7 c() {
        return this.b;
    }

    public final Map<String, String> d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I3)) {
            return false;
        }
        I3 i3 = (I3) obj;
        return O90.a(this.a, i3.a) && this.b == i3.b;
    }

    public final int hashCode() {
        Map map = this.a;
        return this.b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.a + ", source=" + this.b + ')';
    }

    public static I3 a(I3 i3, Map map, P7 p7, int i, Object obj) {
        if ((i & 1) != 0) {
            map = i3.a;
        }
        if ((i & 2) != 0) {
            p7 = i3.b;
        }
        i3.getClass();
        return new I3(map, p7);
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final P7 a() {
        return this.b;
    }
}
