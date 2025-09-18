package io.appmetrica.analytics.impl;

import defpackage.O90;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4471c7 implements ProtobufConverter {
    public final Gd a;
    public final C4664k7 b;

    public C4471c7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4736n7 fromModel(C4521e7 c4521e7) {
        C4736n7 c4736n7 = new C4736n7();
        Integer num = c4521e7.a;
        if (num != null) {
            c4736n7.a = num.intValue();
        }
        String str = c4521e7.b;
        if (str != null) {
            c4736n7.b = str;
        }
        String str2 = c4521e7.c;
        if (str2 != null) {
            c4736n7.c = str2;
        }
        Long l = c4521e7.d;
        if (l != null) {
            c4736n7.d = l.longValue();
        }
        C4640j7 c4640j7 = c4521e7.e;
        if (c4640j7 != null) {
            c4736n7.e = this.b.fromModel(c4640j7);
        }
        String str3 = c4521e7.f;
        if (str3 != null) {
            c4736n7.f = str3;
        }
        String str4 = c4521e7.g;
        if (str4 != null) {
            c4736n7.g = str4;
        }
        Long l2 = c4521e7.h;
        if (l2 != null) {
            c4736n7.h = l2.longValue();
        }
        Integer num2 = c4521e7.i;
        if (num2 != null) {
            c4736n7.i = num2.intValue();
        }
        Integer num3 = c4521e7.j;
        if (num3 != null) {
            c4736n7.j = num3.intValue();
        }
        String str5 = c4521e7.k;
        if (str5 != null) {
            c4736n7.k = str5;
        }
        E8 e8 = c4521e7.l;
        if (e8 != null) {
            c4736n7.l = e8.a;
        }
        String str6 = c4521e7.m;
        if (str6 != null) {
            c4736n7.m = str6;
        }
        EnumC4424aa enumC4424aa = c4521e7.n;
        if (enumC4424aa != null) {
            c4736n7.n = enumC4424aa.a;
        }
        EnumC4666k9 enumC4666k9 = c4521e7.o;
        if (enumC4666k9 != null) {
            c4736n7.o = enumC4666k9.a;
        }
        Boolean bool = c4521e7.p;
        if (bool != null) {
            c4736n7.p = this.a.fromModel(bool).intValue();
        }
        Integer num4 = c4521e7.q;
        if (num4 != null) {
            c4736n7.q = num4.intValue();
        }
        byte[] bArr = c4521e7.r;
        if (bArr != null) {
            c4736n7.r = bArr;
        }
        return c4736n7;
    }

    public C4471c7(Gd gd, C4664k7 c4664k7) {
        this.a = gd;
        this.b = c4664k7;
    }

    public /* synthetic */ C4471c7(Gd gd, C4664k7 c4664k7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Gd() : gd, (i & 2) != 0 ? new C4664k7(null, 1, null) : c4664k7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4521e7 toModel(C4736n7 c4736n7) {
        EnumC4666k9 enumC4666k9;
        C4736n7 c4736n72 = new C4736n7();
        int i = c4736n7.a;
        Integer numValueOf = i != c4736n72.a ? Integer.valueOf(i) : null;
        String str = c4736n7.b;
        String str2 = !O90.a(str, c4736n72.b) ? str : null;
        String str3 = c4736n7.c;
        String str4 = !O90.a(str3, c4736n72.c) ? str3 : null;
        long j = c4736n7.d;
        Long lValueOf = j != c4736n72.d ? Long.valueOf(j) : null;
        C4640j7 model = this.b.toModel(c4736n7.e);
        String str5 = c4736n7.f;
        String str6 = !O90.a(str5, c4736n72.f) ? str5 : null;
        String str7 = c4736n7.g;
        String str8 = !O90.a(str7, c4736n72.g) ? str7 : null;
        long j2 = c4736n7.h;
        Long lValueOf2 = Long.valueOf(j2);
        if (j2 == c4736n72.h) {
            lValueOf2 = null;
        }
        int i2 = c4736n7.i;
        Integer numValueOf2 = i2 != c4736n72.i ? Integer.valueOf(i2) : null;
        int i3 = c4736n7.j;
        Integer numValueOf3 = i3 != c4736n72.j ? Integer.valueOf(i3) : null;
        String str9 = c4736n7.k;
        String str10 = !O90.a(str9, c4736n72.k) ? str9 : null;
        int i4 = c4736n7.l;
        Integer numValueOf4 = Integer.valueOf(i4);
        if (i4 == c4736n72.l) {
            numValueOf4 = null;
        }
        E8 e8A = numValueOf4 != null ? E8.a(Integer.valueOf(numValueOf4.intValue())) : null;
        String str11 = c4736n7.m;
        String str12 = !O90.a(str11, c4736n72.m) ? str11 : null;
        int i5 = c4736n7.n;
        Integer numValueOf5 = Integer.valueOf(i5);
        if (i5 == c4736n72.n) {
            numValueOf5 = null;
        }
        EnumC4424aa enumC4424aaA = numValueOf5 != null ? EnumC4424aa.a(Integer.valueOf(numValueOf5.intValue())) : null;
        int i6 = c4736n7.o;
        Integer numValueOf6 = Integer.valueOf(i6);
        if (i6 == c4736n72.o) {
            numValueOf6 = null;
        }
        if (numValueOf6 != null) {
            int iIntValue = numValueOf6.intValue();
            EnumC4666k9[] enumC4666k9ArrValues = EnumC4666k9.values();
            int length = enumC4666k9ArrValues.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    EnumC4666k9 enumC4666k92 = enumC4666k9ArrValues[i7];
                    EnumC4666k9[] enumC4666k9Arr = enumC4666k9ArrValues;
                    if (enumC4666k92.a == iIntValue) {
                        enumC4666k9 = enumC4666k92;
                        break;
                    }
                    i7++;
                    enumC4666k9ArrValues = enumC4666k9Arr;
                } else {
                    enumC4666k9 = EnumC4666k9.NATIVE;
                    break;
                }
            }
        } else {
            enumC4666k9 = null;
        }
        Boolean boolA = this.a.a(c4736n7.p);
        int i8 = c4736n7.q;
        Integer numValueOf7 = i8 != c4736n72.q ? Integer.valueOf(i8) : null;
        byte[] bArr = c4736n7.r;
        return new C4521e7(numValueOf, str2, str4, lValueOf, model, str6, str8, lValueOf2, numValueOf2, numValueOf3, str10, e8A, str12, enumC4424aaA, enumC4666k9, boolA, numValueOf7, !Arrays.equals(bArr, c4736n72.r) ? bArr : null);
    }
}
