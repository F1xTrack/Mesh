package com.yandex.metrica.impl.ob;

import defpackage.O90;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class P3 implements C0<a, a> {
    private final a a;
    private final List<a> b;

    public static final class a implements F0 {
        private final Map<String, String> a;
        private final E0 b;

        public a(Map<String, String> map, E0 e0) {
            this.a = map;
            this.b = e0;
        }

        @Override // com.yandex.metrica.impl.ob.F0
        public E0 a() {
            return this.b;
        }

        public final Map<String, String> b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return O90.a(this.a, aVar.a) && O90.a(this.b, aVar.b);
        }

        public int hashCode() {
            Map<String, String> map = this.a;
            int iHashCode = (map != null ? map.hashCode() : 0) * 31;
            E0 e0 = this.b;
            return iHashCode + (e0 != null ? e0.hashCode() : 0);
        }

        public String toString() {
            return "Candidate(clids=" + this.a + ", source=" + this.b + ")";
        }
    }

    public P3(a aVar, List<a> list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // com.yandex.metrica.impl.ob.C0
    public List<a> a() {
        return this.b;
    }

    @Override // com.yandex.metrica.impl.ob.C0
    public a b() {
        return this.a;
    }

    public a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P3)) {
            return false;
        }
        P3 p3 = (P3) obj;
        return O90.a(this.a, p3.a) && O90.a(this.b, p3.b);
    }

    public int hashCode() {
        a aVar = this.a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<a> list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ClidsInfo(chosen=" + this.a + ", candidates=" + this.b + ")";
    }
}
