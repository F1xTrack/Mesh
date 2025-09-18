package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C3240ym;
import com.yandex.metrica.impl.ob.M;
import com.yandex.metrica.impl.ob.Vf;
import com.yandex.metrica.impl.ob.Wc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class Ye {
    private static Map<N0, Integer> g;
    private static final Ye h;
    private final InterfaceC2730ef a;
    private final InterfaceC2929mf b;
    private final Ve c;
    private final Ze d;
    private final InterfaceC2705df e;
    private final InterfaceC2755ff f;

    public static class b {
        private InterfaceC2730ef a;
        private InterfaceC2929mf b;
        private Ve c;
        private Ze d;
        private InterfaceC2705df e;
        private InterfaceC2755ff f;

        public /* synthetic */ b(Ye ye, a aVar) {
            this(ye);
        }

        private b(Ye ye) {
            this.a = ye.a;
            this.b = ye.b;
            this.c = ye.c;
            this.d = ye.d;
            this.e = ye.e;
            this.f = ye.f;
        }

        public b a(InterfaceC2730ef interfaceC2730ef) {
            this.a = interfaceC2730ef;
            return this;
        }

        public b a(InterfaceC2929mf interfaceC2929mf) {
            this.b = interfaceC2929mf;
            return this;
        }

        public b a(Ve ve) {
            this.c = ve;
            return this;
        }

        public b a(Ze ze) {
            this.d = ze;
            return this;
        }

        public b a(InterfaceC2705df interfaceC2705df) {
            this.e = interfaceC2705df;
            return this;
        }

        public b a(InterfaceC2755ff interfaceC2755ff) {
            this.f = interfaceC2755ff;
            return this;
        }

        public Ye a() {
            return new Ye(this);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(N0.FIRST_OCCURRENCE, 1);
        map.put(N0.NON_FIRST_OCCURENCE, 0);
        map.put(N0.UNKNOWN, -1);
        g = Collections.unmodifiableMap(map);
        h = new Ye(new C2854jf(), new C2879kf(), new C2780gf(), new Cif(), new C2630af(), new C2655bf());
    }

    public /* synthetic */ Ye(b bVar, a aVar) {
        this(bVar);
    }

    private Ye(b bVar) {
        this(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f);
    }

    public static Ye b() {
        return h;
    }

    public Vf.d.a a(Xe xe, C2856jh c2856jh) {
        Vf.d.a.C0010a c0010a;
        int iA;
        Vf.d.a aVar = new Vf.d.a();
        Vf.d.a.b bVarA = this.f.a(xe.o, xe.p, xe.i, xe.h);
        Vf.b bVarA2 = this.e.a(xe.g);
        String str = xe.m;
        if (TextUtils.isEmpty(str)) {
            c0010a = null;
        } else {
            com.yandex.metrica.w wVarA = C2814i.a(str);
            c0010a = new Vf.d.a.C0010a();
            if (!TextUtils.isEmpty(wVarA.a)) {
                c0010a.b = wVarA.a;
            }
            if (!TextUtils.isEmpty(wVarA.b)) {
                c0010a.c = wVarA.b;
            }
            if (!U2.b(wVarA.c)) {
                c0010a.d = C3240ym.g(wVarA.c);
            }
        }
        if (bVarA != null) {
            aVar.h = bVarA;
        }
        if (bVarA2 != null) {
            aVar.g = bVarA2;
        }
        String strA = this.a.a(xe.a);
        if (strA != null) {
            aVar.e = strA;
        }
        aVar.f = this.b.a(xe, c2856jh);
        String str2 = xe.l;
        if (str2 != null) {
            aVar.i = str2;
        }
        if (c0010a != null) {
            aVar.j = c0010a;
        }
        Integer numA = this.d.a(xe);
        if (numA != null) {
            aVar.d = numA.intValue();
        }
        if (xe.c != null) {
            aVar.b = r9.intValue();
        }
        if (xe.d != null) {
            aVar.p = r9.intValue();
        }
        if (xe.e != null) {
            aVar.q = r9.intValue();
        }
        Long l = xe.f;
        if (l != null) {
            aVar.c = l.longValue();
        }
        Integer num = xe.n;
        if (num != null) {
            aVar.k = num.intValue();
        }
        aVar.l = this.c.a(xe.r);
        String str3 = xe.g;
        if (str3 != null) {
            try {
                iA = new C3095t7().a(Boolean.valueOf(new C3240ym.a(str3).getBoolean("enabled")));
            } catch (Throwable unused) {
            }
        } else {
            iA = -1;
        }
        aVar.m = iA;
        String str4 = xe.q;
        if (str4 != null) {
            aVar.n = str4.getBytes();
        }
        N0 n0 = xe.s;
        Integer num2 = n0 != null ? g.get(n0) : null;
        if (num2 != null) {
            aVar.o = num2.intValue();
        }
        M.b.a aVar2 = xe.t;
        if (aVar2 != null) {
            aVar.r = C2692d2.a(aVar2);
        }
        Wc.a aVar3 = xe.u;
        int iA2 = aVar3 != null ? C2692d2.a(aVar3) : 3;
        Integer num3 = xe.v;
        if (num3 != null) {
            aVar.t = num3.intValue();
        }
        aVar.s = iA2;
        Integer num4 = xe.w;
        aVar.u = num4 == null ? 0 : num4.intValue();
        I0 i0 = xe.x;
        if (i0 != null) {
            aVar.v = i0.a;
        }
        Boolean bool = xe.y;
        if (bool != null) {
            aVar.w = bool.booleanValue();
        }
        if (xe.z != null) {
            aVar.x = r8.intValue();
        }
        return aVar;
    }

    private Ye(InterfaceC2730ef interfaceC2730ef, InterfaceC2929mf interfaceC2929mf, Ve ve, Ze ze, InterfaceC2705df interfaceC2705df, InterfaceC2755ff interfaceC2755ff) {
        this.a = interfaceC2730ef;
        this.b = interfaceC2929mf;
        this.c = ve;
        this.d = ze;
        this.e = interfaceC2705df;
        this.f = interfaceC2755ff;
    }

    public static b a() {
        return new b();
    }
}
