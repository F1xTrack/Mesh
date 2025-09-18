package com.yandex.metrica.impl.p022ob;

import java.util.List;
import java.util.Map;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.P3 */
/* loaded from: classes2.dex */
public final class C2845P3 implements InterfaceC2517C0<a, a> {

    /* renamed from: a */
    private final a f21924a;

    /* renamed from: b */
    private final List<a> f21925b;

    /* renamed from: com.yandex.metrica.impl.ob.P3$a */
    public static final class a implements InterfaceC2592F0 {

        /* renamed from: a */
        private final Map<String, String> f21926a;

        /* renamed from: b */
        private final EnumC2567E0 f21927b;

        public a(Map<String, String> map, EnumC2567E0 enumC2567E0) {
            this.f21926a = map;
            this.f21927b = enumC2567E0;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2592F0
        /* renamed from: a */
        public EnumC2567E0 mo14053a() {
            return this.f21927b;
        }

        /* renamed from: b */
        public final Map<String, String> m14761b() {
            return this.f21926a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return O90.m5963a(this.f21926a, aVar.f21926a) && O90.m5963a(this.f21927b, aVar.f21927b);
        }

        public int hashCode() {
            Map<String, String> map = this.f21926a;
            int iHashCode = (map != null ? map.hashCode() : 0) * 31;
            EnumC2567E0 enumC2567E0 = this.f21927b;
            return iHashCode + (enumC2567E0 != null ? enumC2567E0.hashCode() : 0);
        }

        public String toString() {
            return "Candidate(clids=" + this.f21926a + ", source=" + this.f21927b + ")";
        }
    }

    public C2845P3(a aVar, List<a> list) {
        this.f21924a = aVar;
        this.f21925b = list;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2517C0
    /* renamed from: a */
    public List<a> mo13931a() {
        return this.f21925b;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2517C0
    /* renamed from: b */
    public a mo13932b() {
        return this.f21924a;
    }

    /* renamed from: c */
    public a m14760c() {
        return this.f21924a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2845P3)) {
            return false;
        }
        C2845P3 c2845p3 = (C2845P3) obj;
        return O90.m5963a(this.f21924a, c2845p3.f21924a) && O90.m5963a(this.f21925b, c2845p3.f21925b);
    }

    public int hashCode() {
        a aVar = this.f21924a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<a> list = this.f21925b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ClidsInfo(chosen=" + this.f21924a + ", candidates=" + this.f21925b + ")";
    }
}
