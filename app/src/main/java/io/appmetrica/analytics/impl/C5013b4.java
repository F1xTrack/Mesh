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
public final class C5013b4 extends C4821T5 {

    /* renamed from: q */
    public HashMap f31284q;

    /* renamed from: r */
    public C4933Xl f31285r;

    /* renamed from: s */
    public C4885Vl f31286s;

    /* renamed from: t */
    public C4885Vl f31287t;

    /* renamed from: u */
    public C5387q3 f31288u;

    /* renamed from: v */
    public C4933Xl f31289v;

    public C5013b4(PublicLogger publicLogger) {
        this.f31284q = new HashMap();
        m20144a(publicLogger);
    }

    /* renamed from: b */
    public static C4821T5 m20140b(String str, String str2) {
        C4821T5 c4821t5 = new C4821T5("", 0);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5.f30764d = 5376;
        c4821t5.m19851a(str, str2);
        return c4821t5;
    }

    /* renamed from: n */
    public static C4821T5 m20141n() {
        C4821T5 c4821t5 = new C4821T5("", 0);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5.f30764d = 5632;
        return c4821t5;
    }

    /* renamed from: o */
    public static C4821T5 m20142o() {
        C4821T5 c4821t5 = new C4821T5("", 0);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5.f30764d = 40961;
        return c4821t5;
    }

    /* renamed from: a */
    public final void m20145a(String str, String str2, EnumC4988a4 enumC4988a4) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f31284q.remove(enumC4988a4);
        } else {
            this.f31284q.put(enumC4988a4, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f31284q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f30767g = iIntValue;
    }

    @Override // io.appmetrica.analytics.impl.C4821T5
    /* renamed from: c */
    public final void mo19857c(String str) {
        C4933Xl c4933Xl = this.f31289v;
        c4933Xl.getClass();
        this.f30768h = c4933Xl.mo19479a(str);
    }

    /* renamed from: d */
    public final String m20147d(String str) {
        C4933Xl c4933Xl = this.f31285r;
        c4933Xl.getClass();
        String strMo19479a = c4933Xl.mo19479a(str);
        m20145a(str, strMo19479a, EnumC4988a4.NAME);
        return strMo19479a;
    }

    /* renamed from: e */
    public final String m20148e(String str) throws UnsupportedEncodingException {
        C4885Vl c4885Vl = this.f31286s;
        c4885Vl.getClass();
        String strMo19479a = c4885Vl.mo19479a(str);
        m20145a(str, strMo19479a, EnumC4988a4.VALUE);
        return strMo19479a;
    }

    /* renamed from: f */
    public final C5013b4 m20149f(String str) {
        C4885Vl c4885Vl = this.f31287t;
        c4885Vl.getClass();
        String strMo19479a = c4885Vl.mo19479a(str);
        m20145a(str, strMo19479a, EnumC4988a4.VALUE);
        this.f30762b = strMo19479a;
        return this;
    }

    /* renamed from: p */
    public final HashMap<EnumC4988a4, Integer> m20150p() {
        return this.f31284q;
    }

    @Override // io.appmetrica.analytics.impl.C4821T5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f30761a = m20147d(str);
    }

    @Override // io.appmetrica.analytics.impl.C4821T5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f30762b = m20148e(str);
    }

    @Override // io.appmetrica.analytics.impl.C4821T5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        m20146a(bArr);
    }

    public C5013b4(String str, int i, PublicLogger publicLogger) {
        this("", str, i, publicLogger);
    }

    public C5013b4(String str, String str2, int i, PublicLogger publicLogger) {
        this(str, str2, i, 0, publicLogger);
    }

    public C5013b4(String str, String str2, int i, int i2, PublicLogger publicLogger) {
        this.f31284q = new HashMap();
        m20144a(publicLogger);
        this.f30762b = m20148e(str);
        this.f30761a = m20147d(str2);
        setType(i);
        setCustomType(i2);
    }

    /* renamed from: a */
    public final C5013b4 m20143a(HashMap<EnumC4988a4, Integer> map) {
        this.f31284q = map;
        return this;
    }

    /* renamed from: a */
    public final void m20144a(PublicLogger publicLogger) {
        this.f31285r = new C4933Xl(1000, "event name", publicLogger);
        this.f31286s = new C4885Vl(245760, "event value", publicLogger);
        this.f31287t = new C4885Vl(1024000, "event extended value", publicLogger);
        this.f31288u = new C5387q3(245760, "event value bytes", publicLogger);
        this.f31289v = new C4933Xl(200, "user profile id", publicLogger);
    }

    public C5013b4(byte[] bArr, String str, int i, PublicLogger publicLogger) {
        this.f31284q = new HashMap();
        m20144a(publicLogger);
        m20146a(bArr);
        this.f30761a = m20147d(str);
        setType(i);
    }

    /* renamed from: a */
    public final void m20146a(byte[] bArr) {
        C5387q3 c5387q3 = this.f31288u;
        c5387q3.getClass();
        byte[] bArrMo19479a = c5387q3.mo19479a(bArr);
        EnumC4988a4 enumC4988a4 = EnumC4988a4.VALUE;
        if (bArr.length != bArrMo19479a.length) {
            this.f31284q.put(enumC4988a4, Integer.valueOf(bArr.length - bArrMo19479a.length));
        } else {
            this.f31284q.remove(enumC4988a4);
        }
        Iterator it = this.f31284q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f30767g = iIntValue;
        super.setValueBytes(bArrMo19479a);
    }

    /* renamed from: a */
    public static C4821T5 m20137a(C5107en c5107en) {
        C4821T5 c4821t5M20142o = m20142o();
        c4821t5M20142o.setValue(new String(Base64.encode(MessageNano.toByteArray(c5107en), 0)));
        return c4821t5M20142o;
    }

    /* renamed from: a */
    public static C5013b4 m20139a(PublicLogger publicLogger, C5102ei c5102ei) {
        int length;
        C5013b4 c5013b4 = new C5013b4(publicLogger);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c5013b4.f30764d = 40976;
        C5052ci c5052ci = new C5052ci();
        c5052ci.f31422b = c5102ei.f31604a.currency.getCurrencyCode().getBytes();
        c5052ci.f31426f = c5102ei.f31604a.priceMicros;
        c5052ci.f31423c = StringUtils.stringToBytesForProtobuf(new C4933Xl(200, "revenue productID", c5102ei.f31608e).mo19479a(c5102ei.f31604a.productID));
        c5052ci.f31421a = ((Integer) WrapUtils.getOrDefault(c5102ei.f31604a.quantity, 1)).intValue();
        C4885Vl c4885Vl = c5102ei.f31605b;
        String str = c5102ei.f31604a.payload;
        c4885Vl.getClass();
        c5052ci.f31424d = StringUtils.stringToBytesForProtobuf(c4885Vl.mo19479a(str));
        if (AbstractC5182hn.m20511a(c5102ei.f31604a.receipt)) {
            C4929Xh c4929Xh = new C4929Xh();
            String str2 = (String) c5102ei.f31606c.mo19479a(c5102ei.f31604a.receipt.data);
            length = !StringUtils.equalsNullSafety(c5102ei.f31604a.receipt.data, str2) ? c5102ei.f31604a.receipt.data.length() : 0;
            String str3 = (String) c5102ei.f31607d.mo19479a(c5102ei.f31604a.receipt.signature);
            c4929Xh.f31051a = StringUtils.stringToBytesForProtobuf(str2);
            c4929Xh.f31052b = StringUtils.stringToBytesForProtobuf(str3);
            c5052ci.f31425e = c4929Xh;
        } else {
            length = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(c5052ci), Integer.valueOf(length));
        c5013b4.f30762b = c5013b4.m20148e(new String(Base64.encode((byte[]) pair.first, 0)));
        c5013b4.f30767g = ((Integer) pair.second).intValue();
        return c5013b4;
    }

    /* renamed from: a */
    public static C5013b4 m20138a(PublicLogger publicLogger, C4381B c4381b) {
        C5013b4 c5013b4 = new C5013b4(publicLogger);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c5013b4.f30764d = 40977;
        kotlin.Pair pairM19213a = c4381b.m19213a();
        c5013b4.f30762b = c5013b4.m20148e(new String(Base64.encode((byte[]) pairM19213a.f36702a, 0)));
        c5013b4.f30767g = ((Integer) pairM19213a.f36703b).intValue();
        return c5013b4;
    }
}
