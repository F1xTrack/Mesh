package com.yandex.metrica.impl.p022ob;

import android.util.Pair;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.impl.p022ob.C3106Zf;

/* renamed from: com.yandex.metrica.impl.ob.q2 */
/* loaded from: classes2.dex */
class C3534q2 {

    /* renamed from: a */
    private final Revenue f24529a;

    /* renamed from: b */
    private final InterfaceC2865Pn<String> f24530b;

    /* renamed from: c */
    private final InterfaceC2865Pn<String> f24531c;

    /* renamed from: d */
    private final InterfaceC2865Pn<String> f24532d;

    /* renamed from: e */
    private final C2689Im f24533e;

    public C3534q2(Revenue revenue, C2689Im c2689Im) {
        this.f24533e = c2689Im;
        this.f24529a = revenue;
        this.f24530b = new C2790Mn(30720, "revenue payload", c2689Im);
        this.f24531c = new C2840On(new C2790Mn(184320, "receipt data", c2689Im), "<truncated data was not sent, see METRIKALIB-4568>");
        this.f24532d = new C2840On(new C2815Nn(1000, "receipt signature", c2689Im), "<truncated data was not sent, see METRIKALIB-4568>");
    }

    /* renamed from: a */
    public Pair<byte[], Integer> m16599a() {
        C3106Zf c3106Zf = new C3106Zf();
        c3106Zf.f22959d = this.f24529a.currency.getCurrencyCode().getBytes();
        if (C2968U2.m15244a(this.f24529a.price)) {
            c3106Zf.f22958c = this.f24529a.price.doubleValue();
        }
        if (C2968U2.m15244a(this.f24529a.priceMicros)) {
            c3106Zf.f22963h = this.f24529a.priceMicros.longValue();
        }
        c3106Zf.f22960e = C2819O2.m14690d(new C2815Nn(200, "revenue productID", this.f24533e).mo14016a(this.f24529a.productID));
        Integer num = this.f24529a.quantity;
        if (num == null) {
            num = 1;
        }
        c3106Zf.f22957b = num.intValue();
        c3106Zf.f22961f = C2819O2.m14690d(this.f24530b.mo14016a(this.f24529a.payload));
        if (C2968U2.m15244a(this.f24529a.receipt)) {
            C3106Zf.a aVar = new C3106Zf.a();
            String strMo14016a = this.f24531c.mo14016a(this.f24529a.receipt.data);
            length = C3323i.m16068a(this.f24529a.receipt.data, strMo14016a) ? this.f24529a.receipt.data.length() : 0;
            String strMo14016a2 = this.f24532d.mo14016a(this.f24529a.receipt.signature);
            aVar.f22969b = C2819O2.m14690d(strMo14016a);
            aVar.f22970c = C2819O2.m14690d(strMo14016a2);
            c3106Zf.f22962g = aVar;
        }
        return new Pair<>(AbstractC3219e.m15809a(c3106Zf), Integer.valueOf(length));
    }
}
