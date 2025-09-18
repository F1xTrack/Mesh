package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class S8 {
    public static final Map h;
    public static final S8 i;
    public final InterfaceC4427ad a;
    public final pn b;
    public final InterfaceC4928v8 c;
    public final InterfaceC4786p9 d;
    public final Nb e;
    public final InterfaceC4790pd f;
    public final K9 g;

    static {
        HashMap map = new HashMap();
        map.put(EnumC4424aa.FIRST_OCCURRENCE, 1);
        map.put(EnumC4424aa.NON_FIRST_OCCURENCE, 0);
        map.put(EnumC4424aa.UNKNOWN, -1);
        h = Collections.unmodifiableMap(map);
        i = new S8(new C4604hi(), new Zl(), new C4981xd(), new C4580gi(), new C4572ga(), new C4596ha(), new C4548fa());
    }

    public S8(R8 r8) {
        this(r8.a, r8.b, r8.c, r8.d, r8.e, r8.f, r8.g);
    }

    public final C4473c9 a(J8 j8, Eg eg) {
        C4473c9 c4473c9 = new C4473c9();
        C4448b9 c4448b9A = this.f.a(j8.l, j8.m);
        X8 x8A = this.e.a(j8.g);
        if (c4448b9A != null) {
            c4473c9.g = c4448b9A;
        }
        if (x8A != null) {
            c4473c9.f = x8A;
        }
        String strA = this.a.a(j8.a);
        if (strA != null) {
            c4473c9.d = strA;
        }
        c4473c9.e = this.b.a(j8, eg);
        String str = j8.j;
        if (str != null) {
            c4473c9.h = str;
        }
        Integer numA = this.d.a(j8);
        if (numA != null) {
            c4473c9.c = numA.intValue();
        }
        Long l = j8.c;
        if (l != null) {
            c4473c9.a = l.longValue();
        }
        Long l2 = j8.d;
        if (l2 != null) {
            c4473c9.n = l2.longValue();
        }
        Long l3 = j8.e;
        if (l3 != null) {
            c4473c9.o = l3.longValue();
        }
        Long l4 = j8.f;
        if (l4 != null) {
            c4473c9.b = l4.longValue();
        }
        Integer num = j8.k;
        if (num != null) {
            c4473c9.i = num.intValue();
        }
        c4473c9.j = this.c.a(j8.o);
        C4640j7 c4640j7 = j8.g;
        c4473c9.k = c4640j7 != null ? new C4663k6().a(c4640j7.a) : -1;
        String str2 = j8.n;
        if (str2 != null) {
            c4473c9.l = str2.getBytes();
        }
        EnumC4424aa enumC4424aa = j8.p;
        Integer num2 = enumC4424aa != null ? (Integer) h.get(enumC4424aa) : null;
        if (num2 != null) {
            c4473c9.m = num2.intValue();
        }
        EnumC4666k9 enumC4666k9 = j8.q;
        if (enumC4666k9 != null) {
            c4473c9.p = enumC4666k9.a;
        }
        Boolean bool = j8.r;
        if (bool != null) {
            c4473c9.q = bool.booleanValue();
        }
        if (j8.s != null) {
            c4473c9.r = r6.intValue();
        }
        c4473c9.s = ((C4548fa) this.g).a(j8.t);
        return c4473c9;
    }

    public S8(InterfaceC4427ad interfaceC4427ad, pn pnVar, InterfaceC4928v8 interfaceC4928v8, InterfaceC4786p9 interfaceC4786p9, Nb nb, InterfaceC4790pd interfaceC4790pd, K9 k9) {
        this.a = interfaceC4427ad;
        this.b = pnVar;
        this.c = interfaceC4928v8;
        this.d = interfaceC4786p9;
        this.e = nb;
        this.f = interfaceC4790pd;
        this.g = k9;
    }

    public static R8 a() {
        return new R8(i);
    }
}
