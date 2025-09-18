package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Zf;
import defpackage.AbstractC8235ym;
import defpackage.C1401Rs1;
import defpackage.C7688vt1;
import defpackage.EnumC0625Ht1;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class B3 {
    private final C7688vt1 a;

    public B3(C7688vt1 c7688vt1) {
        this.a = c7688vt1;
    }

    public byte[] a() {
        String currencyCode;
        C7688vt1 c7688vt1 = this.a;
        Zf zf = new Zf();
        zf.b = c7688vt1.c;
        zf.h = c7688vt1.d;
        try {
            currencyCode = Currency.getInstance(c7688vt1.e).getCurrencyCode();
        } catch (Throwable unused) {
            currencyCode = "";
        }
        zf.d = currencyCode.getBytes();
        zf.e = c7688vt1.b.getBytes();
        Zf.a aVar = new Zf.a();
        aVar.b = c7688vt1.n.getBytes();
        aVar.c = c7688vt1.j.getBytes();
        zf.g = aVar;
        zf.i = true;
        zf.j = 1;
        EnumC0625Ht1 enumC0625Ht1 = c7688vt1.a;
        zf.k = enumC0625Ht1.ordinal() == 1 ? 2 : 1;
        Zf.c cVar = new Zf.c();
        cVar.b = c7688vt1.k.getBytes();
        cVar.c = TimeUnit.MILLISECONDS.toSeconds(c7688vt1.l);
        zf.l = cVar;
        if (enumC0625Ht1 == EnumC0625Ht1.b) {
            Zf.b bVar = new Zf.b();
            bVar.b = c7688vt1.m;
            C1401Rs1 c1401Rs1 = c7688vt1.i;
            if (c1401Rs1 != null) {
                bVar.c = a(c1401Rs1);
            }
            Zf.b.a aVar2 = new Zf.b.a();
            aVar2.b = c7688vt1.f;
            C1401Rs1 c1401Rs12 = c7688vt1.g;
            if (c1401Rs12 != null) {
                aVar2.c = a(c1401Rs12);
            }
            aVar2.d = c7688vt1.h;
            bVar.d = aVar2;
            zf.m = bVar;
        }
        return AbstractC2714e.a(zf);
    }

    private Zf.b.C0011b a(C1401Rs1 c1401Rs1) {
        Zf.b.C0011b c0011b = new Zf.b.C0011b();
        c0011b.b = c1401Rs1.a;
        int iX = AbstractC8235ym.x(c1401Rs1.b);
        int i = 1;
        if (iX != 1) {
            i = 2;
            if (iX != 2) {
                i = 3;
                if (iX != 3) {
                    i = 4;
                    if (iX != 4) {
                        i = 0;
                    }
                }
            }
        }
        c0011b.c = i;
        return c0011b;
    }
}
