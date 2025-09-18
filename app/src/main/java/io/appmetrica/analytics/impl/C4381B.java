package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import kotlin.Pair;
import p000.AbstractC7038vr;
import p000.AbstractC7230yu;
import p000.InterfaceC6497nZ;

/* renamed from: io.appmetrica.analytics.impl.B */
/* loaded from: classes2.dex */
public final class C4381B {

    /* renamed from: a */
    public final AdRevenue f29879a;

    /* renamed from: b */
    public final boolean f29880b;

    /* renamed from: c */
    public final C4933Xl f29881c;

    /* renamed from: d */
    public final C4885Vl f29882d;

    public C4381B(AdRevenue adRevenue, boolean z, PublicLogger publicLogger) {
        this.f29879a = adRevenue;
        this.f29880b = z;
        this.f29881c = new C4933Xl(100, "ad revenue strings", publicLogger);
        this.f29882d = new C4885Vl(30720, "ad revenue payload", publicLogger);
    }

    /* renamed from: a */
    public final Pair m19213a() {
        C5458t c5458t = new C5458t();
        int length = 0;
        for (Pair pair : AbstractC7230yu.m26275f(new Pair(this.f29879a.adNetwork, new C5483u(c5458t)), new Pair(this.f29879a.adPlacementId, new C5508v(c5458t)), new Pair(this.f29879a.adPlacementName, new C5533w(c5458t)), new Pair(this.f29879a.adUnitId, new C5558x(c5458t)), new Pair(this.f29879a.adUnitName, new C5583y(c5458t)), new Pair(this.f29879a.precision, new C5608z(c5458t)), new Pair(this.f29879a.currency.getCurrencyCode(), new C4356A(c5458t)))) {
            String str = (String) pair.f36702a;
            InterfaceC6497nZ interfaceC6497nZ = (InterfaceC6497nZ) pair.f36703b;
            C4933Xl c4933Xl = this.f29881c;
            c4933Xl.getClass();
            String strMo19479a = c4933Xl.mo19479a(str);
            byte[] bArrStringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] bArrStringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(strMo19479a);
            interfaceC6497nZ.invoke(bArrStringToBytesForProtobuf2);
            length += bArrStringToBytesForProtobuf.length - bArrStringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) AbstractC4406C.f29920a.get(this.f29879a.adType);
        c5458t.f32600d = num != null ? num.intValue() : 0;
        C5433s c5433s = new C5433s();
        BigDecimal bigDecimal = this.f29879a.adRevenue;
        BigInteger bigInteger = AbstractC5591y7.f32848a;
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC5591y7.f32848a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC5591y7.f32849b) >= 0) {
                break;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i++;
        }
        Long lValueOf = Long.valueOf(bigIntegerUnscaledValue.longValue());
        Integer numValueOf = Integer.valueOf(i);
        long jLongValue = lValueOf.longValue();
        int iIntValue = numValueOf.intValue();
        c5433s.f32525a = jLongValue;
        c5433s.f32526b = iIntValue;
        c5458t.f32598b = c5433s;
        Map<String, String> map = this.f29879a.payload;
        if (map != null) {
            String strM20174b = AbstractC5020bb.m20174b(map);
            C4885Vl c4885Vl = this.f29882d;
            c4885Vl.getClass();
            byte[] bArrStringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(c4885Vl.mo19479a(strM20174b));
            c5458t.f32607k = bArrStringToBytesForProtobuf3;
            length += StringUtils.stringToBytesForProtobuf(strM20174b).length - bArrStringToBytesForProtobuf3.length;
        }
        if (this.f29880b) {
            c5458t.f32597a = "autocollected".getBytes(AbstractC7038vr.f44561a);
        }
        return new Pair(MessageNano.toByteArray(c5458t), Integer.valueOf(length));
    }
}
