package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3106Zf;
import java.util.Currency;
import java.util.concurrent.TimeUnit;
import p000.AbstractC7222ym;
import p000.C11474vt1;
import p000.C8235Rs1;
import p000.EnumC7717Ht1;

/* renamed from: com.yandex.metrica.impl.ob.B3 */
/* loaded from: classes2.dex */
public class C2495B3 {

    /* renamed from: a */
    private final C11474vt1 f20918a;

    public C2495B3(C11474vt1 c11474vt1) {
        this.f20918a = c11474vt1;
    }

    /* renamed from: a */
    public byte[] m13916a() {
        String currencyCode;
        C11474vt1 c11474vt1 = this.f20918a;
        C3106Zf c3106Zf = new C3106Zf();
        c3106Zf.f22957b = c11474vt1.f44583c;
        c3106Zf.f22963h = c11474vt1.f44584d;
        try {
            currencyCode = Currency.getInstance(c11474vt1.f44585e).getCurrencyCode();
        } catch (Throwable unused) {
            currencyCode = "";
        }
        c3106Zf.f22959d = currencyCode.getBytes();
        c3106Zf.f22960e = c11474vt1.f44582b.getBytes();
        C3106Zf.a aVar = new C3106Zf.a();
        aVar.f22969b = c11474vt1.f44594n.getBytes();
        aVar.f22970c = c11474vt1.f44590j.getBytes();
        c3106Zf.f22962g = aVar;
        c3106Zf.f22964i = true;
        c3106Zf.f22965j = 1;
        EnumC7717Ht1 enumC7717Ht1 = c11474vt1.f44581a;
        c3106Zf.f22966k = enumC7717Ht1.ordinal() == 1 ? 2 : 1;
        C3106Zf.c cVar = new C3106Zf.c();
        cVar.f22980b = c11474vt1.f44591k.getBytes();
        cVar.f22981c = TimeUnit.MILLISECONDS.toSeconds(c11474vt1.f44592l);
        c3106Zf.f22967l = cVar;
        if (enumC7717Ht1 == EnumC7717Ht1.f4567b) {
            C3106Zf.b bVar = new C3106Zf.b();
            bVar.f22971b = c11474vt1.f44593m;
            C8235Rs1 c8235Rs1 = c11474vt1.f44589i;
            if (c8235Rs1 != null) {
                bVar.f22972c = m13915a(c8235Rs1);
            }
            C3106Zf.b.a aVar2 = new C3106Zf.b.a();
            aVar2.f22974b = c11474vt1.f44586f;
            C8235Rs1 c8235Rs12 = c11474vt1.f44587g;
            if (c8235Rs12 != null) {
                aVar2.f22975c = m13915a(c8235Rs12);
            }
            aVar2.f22976d = c11474vt1.f44588h;
            bVar.f22973d = aVar2;
            c3106Zf.f22968m = bVar;
        }
        return AbstractC3219e.m15809a(c3106Zf);
    }

    /* renamed from: a */
    private C3106Zf.b.C7305b m13915a(C8235Rs1 c8235Rs1) {
        C3106Zf.b.C7305b c7305b = new C3106Zf.b.C7305b();
        c7305b.f22978b = c8235Rs1.f10466a;
        int iM26247x = AbstractC7222ym.m26247x(c8235Rs1.f10467b);
        int i = 1;
        if (iM26247x != 1) {
            i = 2;
            if (iM26247x != 2) {
                i = 3;
                if (iM26247x != 3) {
                    i = 4;
                    if (iM26247x != 4) {
                        i = 0;
                    }
                }
            }
        }
        c7305b.f22979c = i;
        return c7305b;
    }
}
