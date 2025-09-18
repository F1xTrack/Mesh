package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.impl.ob.Zf;

/* renamed from: com.yandex.metrica.impl.ob.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3016q2 {
    private final Revenue a;
    private final Pn<String> b;
    private final Pn<String> c;
    private final Pn<String> d;
    private final Im e;

    public C3016q2(Revenue revenue, Im im) {
        this.e = im;
        this.a = revenue;
        this.b = new Mn(30720, "revenue payload", im);
        this.c = new On(new Mn(184320, "receipt data", im), "<truncated data was not sent, see METRIKALIB-4568>");
        this.d = new On(new Nn(1000, "receipt signature", im), "<truncated data was not sent, see METRIKALIB-4568>");
    }

    public Pair<byte[], Integer> a() {
        Zf zf = new Zf();
        zf.d = this.a.currency.getCurrencyCode().getBytes();
        if (U2.a(this.a.price)) {
            zf.c = this.a.price.doubleValue();
        }
        if (U2.a(this.a.priceMicros)) {
            zf.h = this.a.priceMicros.longValue();
        }
        zf.e = O2.d(new Nn(200, "revenue productID", this.e).a(this.a.productID));
        Integer num = this.a.quantity;
        if (num == null) {
            num = 1;
        }
        zf.b = num.intValue();
        zf.f = O2.d(this.b.a(this.a.payload));
        if (U2.a(this.a.receipt)) {
            Zf.a aVar = new Zf.a();
            String strA = this.c.a(this.a.receipt.data);
            length = C2814i.a(this.a.receipt.data, strA) ? this.a.receipt.data.length() : 0;
            String strA2 = this.d.a(this.a.receipt.signature);
            aVar.b = O2.d(strA);
            aVar.c = O2.d(strA2);
            zf.g = aVar;
        }
        return new Pair<>(AbstractC2714e.a(zf), Integer.valueOf(length));
    }
}
