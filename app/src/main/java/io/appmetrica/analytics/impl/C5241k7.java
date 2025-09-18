package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.k7 */
/* loaded from: classes2.dex */
public final class C5241k7 implements Converter {

    /* renamed from: a */
    public final C4518Gd f32030a;

    public C5241k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5341o7 fromModel(C5216j7 c5216j7) {
        C5341o7 c5341o7 = new C5341o7();
        Boolean bool = c5216j7.f31957a;
        if (bool != null) {
            c5341o7.f32322a = this.f32030a.fromModel(bool).intValue();
        }
        Double d = c5216j7.f31959c;
        if (d != null) {
            c5341o7.f32324c = d.doubleValue();
        }
        Double d2 = c5216j7.f31958b;
        if (d2 != null) {
            c5341o7.f32323b = d2.doubleValue();
        }
        Long l = c5216j7.f31964h;
        if (l != null) {
            c5341o7.f32329h = l.longValue();
        }
        Integer num = c5216j7.f31962f;
        if (num != null) {
            c5341o7.f32327f = num.intValue();
        }
        Integer num2 = c5216j7.f31961e;
        if (num2 != null) {
            c5341o7.f32326e = num2.intValue();
        }
        Integer num3 = c5216j7.f31963g;
        if (num3 != null) {
            c5341o7.f32328g = num3.intValue();
        }
        Integer num4 = c5216j7.f31960d;
        if (num4 != null) {
            c5341o7.f32325d = num4.intValue();
        }
        String str = c5216j7.f31965i;
        if (str != null) {
            c5341o7.f32330i = str;
        }
        String str2 = c5216j7.f31966j;
        if (str2 != null) {
            c5341o7.f32331j = str2;
        }
        return c5341o7;
    }

    public C5241k7(C4518Gd c4518Gd) {
        this.f32030a = c4518Gd;
    }

    public /* synthetic */ C5241k7(C4518Gd c4518Gd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4518Gd() : c4518Gd);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5216j7 toModel(C5341o7 c5341o7) {
        if (c5341o7 == null) {
            return new C5216j7(null, null, null, null, null, null, null, null, null, null);
        }
        C5341o7 c5341o72 = new C5341o7();
        Boolean boolM19441a = this.f32030a.m19441a(c5341o7.f32322a);
        double d = c5341o7.f32324c;
        Double dValueOf = !((d > c5341o72.f32324c ? 1 : (d == c5341o72.f32324c ? 0 : -1)) == 0) ? Double.valueOf(d) : null;
        double d2 = c5341o7.f32323b;
        Double dValueOf2 = !(d2 == c5341o72.f32323b) ? Double.valueOf(d2) : null;
        long j = c5341o7.f32329h;
        Long lValueOf = j != c5341o72.f32329h ? Long.valueOf(j) : null;
        int i = c5341o7.f32327f;
        Integer numValueOf = i != c5341o72.f32327f ? Integer.valueOf(i) : null;
        int i2 = c5341o7.f32326e;
        Integer numValueOf2 = i2 != c5341o72.f32326e ? Integer.valueOf(i2) : null;
        int i3 = c5341o7.f32328g;
        Integer numValueOf3 = i3 != c5341o72.f32328g ? Integer.valueOf(i3) : null;
        int i4 = c5341o7.f32325d;
        Integer numValueOf4 = i4 != c5341o72.f32325d ? Integer.valueOf(i4) : null;
        String str = c5341o7.f32330i;
        String str2 = !O90.m5963a(str, c5341o72.f32330i) ? str : null;
        String str3 = c5341o7.f32331j;
        return new C5216j7(boolM19441a, dValueOf2, dValueOf, numValueOf4, numValueOf2, numValueOf, numValueOf3, lValueOf, str2, !O90.m5963a(str3, c5341o72.f32331j) ? str3 : null);
    }
}
