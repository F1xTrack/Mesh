package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.b4 */
/* loaded from: classes2.dex */
public final class C4443b4 extends T5 {
    public HashMap q;
    public Xl r;
    public Vl s;
    public Vl t;
    public C4804q3 u;
    public Xl v;

    public C4443b4(PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
    }

    public static T5 b(String str, String str2) {
        T5 t5 = new T5("", 0);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5.d = 5376;
        t5.a(str, str2);
        return t5;
    }

    public static T5 n() {
        T5 t5 = new T5("", 0);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5.d = 5632;
        return t5;
    }

    public static T5 o() {
        T5 t5 = new T5("", 0);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5.d = 40961;
        return t5;
    }

    public final void a(String str, String str2, EnumC4418a4 enumC4418a4) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.q.remove(enumC4418a4);
        } else {
            this.q.put(enumC4418a4, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.g = iIntValue;
    }

    @Override // io.appmetrica.analytics.impl.T5
    public final void c(String str) {
        Xl xl = this.v;
        xl.getClass();
        this.h = xl.a(str);
    }

    public final String d(String str) {
        Xl xl = this.r;
        xl.getClass();
        String strA = xl.a(str);
        a(str, strA, EnumC4418a4.NAME);
        return strA;
    }

    public final String e(String str) throws UnsupportedEncodingException {
        Vl vl = this.s;
        vl.getClass();
        String strA = vl.a(str);
        a(str, strA, EnumC4418a4.VALUE);
        return strA;
    }

    public final C4443b4 f(String str) {
        Vl vl = this.t;
        vl.getClass();
        String strA = vl.a(str);
        a(str, strA, EnumC4418a4.VALUE);
        this.b = strA;
        return this;
    }

    public final HashMap<EnumC4418a4, Integer> p() {
        return this.q;
    }

    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public C4443b4(String str, int i, PublicLogger publicLogger) {
        this("", str, i, publicLogger);
    }

    public C4443b4(String str, String str2, int i, PublicLogger publicLogger) {
        this(str, str2, i, 0, publicLogger);
    }

    public C4443b4(String str, String str2, int i, int i2, PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        this.b = e(str);
        this.a = d(str2);
        setType(i);
        setCustomType(i2);
    }

    public final C4443b4 a(HashMap<EnumC4418a4, Integer> map) {
        this.q = map;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.r = new Xl(1000, "event name", publicLogger);
        this.s = new Vl(245760, "event value", publicLogger);
        this.t = new Vl(1024000, "event extended value", publicLogger);
        this.u = new C4804q3(245760, "event value bytes", publicLogger);
        this.v = new Xl(200, "user profile id", publicLogger);
    }

    public C4443b4(byte[] bArr, String str, int i, PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.a = d(str);
        setType(i);
    }

    public final void a(byte[] bArr) {
        C4804q3 c4804q3 = this.u;
        c4804q3.getClass();
        byte[] bArrA = c4804q3.a(bArr);
        EnumC4418a4 enumC4418a4 = EnumC4418a4.VALUE;
        if (bArr.length != bArrA.length) {
            this.q.put(enumC4418a4, Integer.valueOf(bArr.length - bArrA.length));
        } else {
            this.q.remove(enumC4418a4);
        }
        Iterator it = this.q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.g = iIntValue;
        super.setValueBytes(bArrA);
    }

    public static T5 a(en enVar) {
        T5 t5O = o();
        t5O.setValue(new String(Base64.encode(MessageNano.toByteArray(enVar), 0)));
        return t5O;
    }

    public static C4443b4 a(PublicLogger publicLogger, C4532ei c4532ei) {
        int length;
        C4443b4 c4443b4 = new C4443b4(publicLogger);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        c4443b4.d = 40976;
        C4482ci c4482ci = new C4482ci();
        c4482ci.b = c4532ei.a.currency.getCurrencyCode().getBytes();
        c4482ci.f = c4532ei.a.priceMicros;
        c4482ci.c = StringUtils.stringToBytesForProtobuf(new Xl(200, "revenue productID", c4532ei.e).a(c4532ei.a.productID));
        c4482ci.a = ((Integer) WrapUtils.getOrDefault(c4532ei.a.quantity, 1)).intValue();
        Vl vl = c4532ei.b;
        String str = c4532ei.a.payload;
        vl.getClass();
        c4482ci.d = StringUtils.stringToBytesForProtobuf(vl.a(str));
        if (hn.a(c4532ei.a.receipt)) {
            Xh xh = new Xh();
            String str2 = (String) c4532ei.c.a(c4532ei.a.receipt.data);
            length = !StringUtils.equalsNullSafety(c4532ei.a.receipt.data, str2) ? c4532ei.a.receipt.data.length() : 0;
            String str3 = (String) c4532ei.d.a(c4532ei.a.receipt.signature);
            xh.a = StringUtils.stringToBytesForProtobuf(str2);
            xh.b = StringUtils.stringToBytesForProtobuf(str3);
            c4482ci.e = xh;
        } else {
            length = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(c4482ci), Integer.valueOf(length));
        c4443b4.b = c4443b4.e(new String(Base64.encode((byte[]) pair.first, 0)));
        c4443b4.g = ((Integer) pair.second).intValue();
        return c4443b4;
    }

    public static C4443b4 a(PublicLogger publicLogger, B b) {
        C4443b4 c4443b4 = new C4443b4(publicLogger);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        c4443b4.d = 40977;
        kotlin.Pair pairA = b.a();
        c4443b4.b = c4443b4.e(new String(Base64.encode((byte[]) pairA.a, 0)));
        c4443b4.g = ((Integer) pairA.b).intValue();
        return c4443b4;
    }
}
