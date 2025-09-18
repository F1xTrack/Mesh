package io.appmetrica.analytics.impl;

import defpackage.AbstractC7680vr;
import defpackage.AbstractC8259yu;
import defpackage.InterfaceC6099nZ;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class B {
    public final AdRevenue a;
    public final boolean b;
    public final Xl c;
    public final Vl d;

    public B(AdRevenue adRevenue, boolean z, PublicLogger publicLogger) {
        this.a = adRevenue;
        this.b = z;
        this.c = new Xl(100, "ad revenue strings", publicLogger);
        this.d = new Vl(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        C4871t c4871t = new C4871t();
        int length = 0;
        for (Pair pair : AbstractC8259yu.f(new Pair(this.a.adNetwork, new C4895u(c4871t)), new Pair(this.a.adPlacementId, new C4919v(c4871t)), new Pair(this.a.adPlacementName, new C4943w(c4871t)), new Pair(this.a.adUnitId, new C4967x(c4871t)), new Pair(this.a.adUnitName, new C4991y(c4871t)), new Pair(this.a.precision, new C5015z(c4871t)), new Pair(this.a.currency.getCurrencyCode(), new A(c4871t)))) {
            String str = (String) pair.a;
            InterfaceC6099nZ interfaceC6099nZ = (InterfaceC6099nZ) pair.b;
            Xl xl = this.c;
            xl.getClass();
            String strA = xl.a(str);
            byte[] bArrStringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] bArrStringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(strA);
            interfaceC6099nZ.invoke(bArrStringToBytesForProtobuf2);
            length += bArrStringToBytesForProtobuf.length - bArrStringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) C.a.get(this.a.adType);
        c4871t.d = num != null ? num.intValue() : 0;
        C4847s c4847s = new C4847s();
        BigDecimal bigDecimal = this.a.adRevenue;
        BigInteger bigInteger = AbstractC4999y7.a;
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC4999y7.a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC4999y7.b) >= 0) {
                break;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i++;
        }
        Long lValueOf = Long.valueOf(bigIntegerUnscaledValue.longValue());
        Integer numValueOf = Integer.valueOf(i);
        long jLongValue = lValueOf.longValue();
        int iIntValue = numValueOf.intValue();
        c4847s.a = jLongValue;
        c4847s.b = iIntValue;
        c4871t.b = c4847s;
        Map<String, String> map = this.a.payload;
        if (map != null) {
            String strB = AbstractC4450bb.b(map);
            Vl vl = this.d;
            vl.getClass();
            byte[] bArrStringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(vl.a(strB));
            c4871t.k = bArrStringToBytesForProtobuf3;
            length += StringUtils.stringToBytesForProtobuf(strB).length - bArrStringToBytesForProtobuf3.length;
        }
        if (this.b) {
            c4871t.a = "autocollected".getBytes(AbstractC7680vr.a);
        }
        return new Pair(MessageNano.toByteArray(c4871t), Integer.valueOf(length));
    }
}
