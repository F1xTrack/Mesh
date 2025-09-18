package io.appmetrica.analytics.impl;

import defpackage.O90;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4664k7 implements Converter {
    public final Gd a;

    public C4664k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4760o7 fromModel(C4640j7 c4640j7) {
        C4760o7 c4760o7 = new C4760o7();
        Boolean bool = c4640j7.a;
        if (bool != null) {
            c4760o7.a = this.a.fromModel(bool).intValue();
        }
        Double d = c4640j7.c;
        if (d != null) {
            c4760o7.c = d.doubleValue();
        }
        Double d2 = c4640j7.b;
        if (d2 != null) {
            c4760o7.b = d2.doubleValue();
        }
        Long l = c4640j7.h;
        if (l != null) {
            c4760o7.h = l.longValue();
        }
        Integer num = c4640j7.f;
        if (num != null) {
            c4760o7.f = num.intValue();
        }
        Integer num2 = c4640j7.e;
        if (num2 != null) {
            c4760o7.e = num2.intValue();
        }
        Integer num3 = c4640j7.g;
        if (num3 != null) {
            c4760o7.g = num3.intValue();
        }
        Integer num4 = c4640j7.d;
        if (num4 != null) {
            c4760o7.d = num4.intValue();
        }
        String str = c4640j7.i;
        if (str != null) {
            c4760o7.i = str;
        }
        String str2 = c4640j7.j;
        if (str2 != null) {
            c4760o7.j = str2;
        }
        return c4760o7;
    }

    public C4664k7(Gd gd) {
        this.a = gd;
    }

    public /* synthetic */ C4664k7(Gd gd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Gd() : gd);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4640j7 toModel(C4760o7 c4760o7) {
        if (c4760o7 == null) {
            return new C4640j7(null, null, null, null, null, null, null, null, null, null);
        }
        C4760o7 c4760o72 = new C4760o7();
        Boolean boolA = this.a.a(c4760o7.a);
        double d = c4760o7.c;
        Double dValueOf = !((d > c4760o72.c ? 1 : (d == c4760o72.c ? 0 : -1)) == 0) ? Double.valueOf(d) : null;
        double d2 = c4760o7.b;
        Double dValueOf2 = !(d2 == c4760o72.b) ? Double.valueOf(d2) : null;
        long j = c4760o7.h;
        Long lValueOf = j != c4760o72.h ? Long.valueOf(j) : null;
        int i = c4760o7.f;
        Integer numValueOf = i != c4760o72.f ? Integer.valueOf(i) : null;
        int i2 = c4760o7.e;
        Integer numValueOf2 = i2 != c4760o72.e ? Integer.valueOf(i2) : null;
        int i3 = c4760o7.g;
        Integer numValueOf3 = i3 != c4760o72.g ? Integer.valueOf(i3) : null;
        int i4 = c4760o7.d;
        Integer numValueOf4 = i4 != c4760o72.d ? Integer.valueOf(i4) : null;
        String str = c4760o7.i;
        String str2 = !O90.a(str, c4760o72.i) ? str : null;
        String str3 = c4760o7.j;
        return new C4640j7(boolA, dValueOf2, dValueOf, numValueOf4, numValueOf2, numValueOf, numValueOf3, lValueOf, str2, !O90.a(str3, c4760o72.j) ? str3 : null);
    }
}
