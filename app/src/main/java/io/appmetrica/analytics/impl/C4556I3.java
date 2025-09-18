package io.appmetrica.analytics.impl;

import java.util.Map;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.I3 */
/* loaded from: classes2.dex */
public final class C4556I3 implements InterfaceC4752Q7 {

    /* renamed from: a */
    public final Map f30267a;

    /* renamed from: b */
    public final EnumC4728P7 f30268b;

    public C4556I3(Map<String, String> map, EnumC4728P7 enumC4728P7) {
        this.f30267a = map;
        this.f30268b = enumC4728P7;
    }

    /* renamed from: a */
    public final C4556I3 m19482a(Map<String, String> map, EnumC4728P7 enumC4728P7) {
        return new C4556I3(map, enumC4728P7);
    }

    /* renamed from: b */
    public final Map<String, String> m19483b() {
        return this.f30267a;
    }

    /* renamed from: c */
    public final EnumC4728P7 m19484c() {
        return this.f30268b;
    }

    /* renamed from: d */
    public final Map<String, String> m19485d() {
        return this.f30267a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4556I3)) {
            return false;
        }
        C4556I3 c4556i3 = (C4556I3) obj;
        return O90.m5963a(this.f30267a, c4556i3.f30267a) && this.f30268b == c4556i3.f30268b;
    }

    public final int hashCode() {
        Map map = this.f30267a;
        return this.f30268b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f30267a + ", source=" + this.f30268b + ')';
    }

    /* renamed from: a */
    public static C4556I3 m19481a(C4556I3 c4556i3, Map map, EnumC4728P7 enumC4728P7, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c4556i3.f30267a;
        }
        if ((i & 2) != 0) {
            enumC4728P7 = c4556i3.f30268b;
        }
        c4556i3.getClass();
        return new C4556I3(map, enumC4728P7);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4752Q7
    /* renamed from: a */
    public final EnumC4728P7 mo19471a() {
        return this.f30268b;
    }
}
