package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Vf;
import com.yandex.metrica.impl.ob.Z4;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class W4 {
    public static final Map<Integer, Integer> h = Collections.unmodifiableMap(new a());
    private final C2864k0 a;
    private final X4 b;
    private final Z4 c;
    private final Mn d;
    private final Mn e;
    private final Om f;
    private final C2819i4 g;

    public class a extends HashMap<Integer, Integer> {
        public a() {
            put(Integer.valueOf(EnumC2865k1.EVENT_TYPE_DIAGNOSTIC.b()), 22);
            put(Integer.valueOf(EnumC2865k1.EVENT_TYPE_DIAGNOSTIC_STATBOX.b()), 23);
            put(Integer.valueOf(EnumC2865k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.b()), 24);
            put(Integer.valueOf(EnumC2865k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.b()), 24);
        }
    }

    public static class b {
    }

    public W4(C2864k0 c2864k0, X4 x4, Z4 z4, C2819i4 c2819i4, Mn mn, Mn mn2, Om om) {
        this.a = c2864k0;
        this.b = x4;
        this.c = z4;
        this.g = c2819i4;
        this.e = mn;
        this.d = mn2;
        this.f = om;
    }

    public byte[] a() throws UnsupportedEncodingException {
        Vf vf = new Vf();
        Vf.d dVar = new Vf.d();
        vf.b = new Vf.d[]{dVar};
        Z4.a aVarA = this.c.a();
        dVar.b = aVarA.a;
        Vf.d.b bVar = new Vf.d.b();
        dVar.c = bVar;
        bVar.d = 2;
        bVar.b = new Vf.f();
        Vf.f fVar = dVar.c.b;
        long j = aVarA.b;
        fVar.b = j;
        fVar.c = C2814i.a(j);
        dVar.c.c = this.b.l();
        Vf.d.a aVar = new Vf.d.a();
        dVar.d = new Vf.d.a[]{aVar};
        aVar.b = aVarA.c;
        aVar.q = this.g.a(this.a.n());
        aVar.c = this.f.b() - aVarA.b;
        aVar.d = h.get(Integer.valueOf(this.a.n())).intValue();
        if (!TextUtils.isEmpty(this.a.g())) {
            aVar.e = this.e.a(this.a.g());
        }
        if (!TextUtils.isEmpty(this.a.p())) {
            String strP = this.a.p();
            String strA = this.d.a(strP);
            if (!TextUtils.isEmpty(strA)) {
                aVar.f = strA.getBytes();
            }
            int length = strP.getBytes().length;
            byte[] bArr = aVar.f;
            aVar.k = length - (bArr != null ? bArr.length : 0);
        }
        return AbstractC2714e.a(vf);
    }
}
