package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.c7 */
/* loaded from: classes2.dex */
public final class C5041c7 implements ProtobufConverter {

    /* renamed from: a */
    public final C4518Gd f31358a;

    /* renamed from: b */
    public final C5241k7 f31359b;

    public C5041c7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5316n7 fromModel(C5091e7 c5091e7) {
        C5316n7 c5316n7 = new C5316n7();
        Integer num = c5091e7.f31537a;
        if (num != null) {
            c5316n7.f32246a = num.intValue();
        }
        String str = c5091e7.f31538b;
        if (str != null) {
            c5316n7.f32247b = str;
        }
        String str2 = c5091e7.f31539c;
        if (str2 != null) {
            c5316n7.f32248c = str2;
        }
        Long l = c5091e7.f31540d;
        if (l != null) {
            c5316n7.f32249d = l.longValue();
        }
        C5216j7 c5216j7 = c5091e7.f31541e;
        if (c5216j7 != null) {
            c5316n7.f32250e = this.f31359b.fromModel(c5216j7);
        }
        String str3 = c5091e7.f31542f;
        if (str3 != null) {
            c5316n7.f32251f = str3;
        }
        String str4 = c5091e7.f31543g;
        if (str4 != null) {
            c5316n7.f32252g = str4;
        }
        Long l2 = c5091e7.f31544h;
        if (l2 != null) {
            c5316n7.f32253h = l2.longValue();
        }
        Integer num2 = c5091e7.f31545i;
        if (num2 != null) {
            c5316n7.f32254i = num2.intValue();
        }
        Integer num3 = c5091e7.f31546j;
        if (num3 != null) {
            c5316n7.f32255j = num3.intValue();
        }
        String str5 = c5091e7.f31547k;
        if (str5 != null) {
            c5316n7.f32256k = str5;
        }
        EnumC4465E8 enumC4465E8 = c5091e7.f31548l;
        if (enumC4465E8 != null) {
            c5316n7.f32257l = enumC4465E8.f30059a;
        }
        String str6 = c5091e7.f31549m;
        if (str6 != null) {
            c5316n7.f32258m = str6;
        }
        EnumC4994aa enumC4994aa = c5091e7.f31550n;
        if (enumC4994aa != null) {
            c5316n7.f32259n = enumC4994aa.f31257a;
        }
        EnumC5243k9 enumC5243k9 = c5091e7.f31551o;
        if (enumC5243k9 != null) {
            c5316n7.f32260o = enumC5243k9.f32037a;
        }
        Boolean bool = c5091e7.f31552p;
        if (bool != null) {
            c5316n7.f32261p = this.f31358a.fromModel(bool).intValue();
        }
        Integer num4 = c5091e7.f31553q;
        if (num4 != null) {
            c5316n7.f32262q = num4.intValue();
        }
        byte[] bArr = c5091e7.f31554r;
        if (bArr != null) {
            c5316n7.f32263r = bArr;
        }
        return c5316n7;
    }

    public C5041c7(C4518Gd c4518Gd, C5241k7 c5241k7) {
        this.f31358a = c4518Gd;
        this.f31359b = c5241k7;
    }

    public /* synthetic */ C5041c7(C4518Gd c4518Gd, C5241k7 c5241k7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4518Gd() : c4518Gd, (i & 2) != 0 ? new C5241k7(null, 1, null) : c5241k7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5091e7 toModel(C5316n7 c5316n7) {
        EnumC5243k9 enumC5243k9;
        C5316n7 c5316n72 = new C5316n7();
        int i = c5316n7.f32246a;
        Integer numValueOf = i != c5316n72.f32246a ? Integer.valueOf(i) : null;
        String str = c5316n7.f32247b;
        String str2 = !O90.m5963a(str, c5316n72.f32247b) ? str : null;
        String str3 = c5316n7.f32248c;
        String str4 = !O90.m5963a(str3, c5316n72.f32248c) ? str3 : null;
        long j = c5316n7.f32249d;
        Long lValueOf = j != c5316n72.f32249d ? Long.valueOf(j) : null;
        C5216j7 model = this.f31359b.toModel(c5316n7.f32250e);
        String str5 = c5316n7.f32251f;
        String str6 = !O90.m5963a(str5, c5316n72.f32251f) ? str5 : null;
        String str7 = c5316n7.f32252g;
        String str8 = !O90.m5963a(str7, c5316n72.f32252g) ? str7 : null;
        long j2 = c5316n7.f32253h;
        Long lValueOf2 = Long.valueOf(j2);
        if (j2 == c5316n72.f32253h) {
            lValueOf2 = null;
        }
        int i2 = c5316n7.f32254i;
        Integer numValueOf2 = i2 != c5316n72.f32254i ? Integer.valueOf(i2) : null;
        int i3 = c5316n7.f32255j;
        Integer numValueOf3 = i3 != c5316n72.f32255j ? Integer.valueOf(i3) : null;
        String str9 = c5316n7.f32256k;
        String str10 = !O90.m5963a(str9, c5316n72.f32256k) ? str9 : null;
        int i4 = c5316n7.f32257l;
        Integer numValueOf4 = Integer.valueOf(i4);
        if (i4 == c5316n72.f32257l) {
            numValueOf4 = null;
        }
        EnumC4465E8 enumC4465E8M19340a = numValueOf4 != null ? EnumC4465E8.m19340a(Integer.valueOf(numValueOf4.intValue())) : null;
        String str11 = c5316n7.f32258m;
        String str12 = !O90.m5963a(str11, c5316n72.f32258m) ? str11 : null;
        int i5 = c5316n7.f32259n;
        Integer numValueOf5 = Integer.valueOf(i5);
        if (i5 == c5316n72.f32259n) {
            numValueOf5 = null;
        }
        EnumC4994aa enumC4994aaM20117a = numValueOf5 != null ? EnumC4994aa.m20117a(Integer.valueOf(numValueOf5.intValue())) : null;
        int i6 = c5316n7.f32260o;
        Integer numValueOf6 = Integer.valueOf(i6);
        if (i6 == c5316n72.f32260o) {
            numValueOf6 = null;
        }
        if (numValueOf6 != null) {
            int iIntValue = numValueOf6.intValue();
            EnumC5243k9[] enumC5243k9ArrValues = EnumC5243k9.values();
            int length = enumC5243k9ArrValues.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    EnumC5243k9 enumC5243k92 = enumC5243k9ArrValues[i7];
                    EnumC5243k9[] enumC5243k9Arr = enumC5243k9ArrValues;
                    if (enumC5243k92.f32037a == iIntValue) {
                        enumC5243k9 = enumC5243k92;
                        break;
                    }
                    i7++;
                    enumC5243k9ArrValues = enumC5243k9Arr;
                } else {
                    enumC5243k9 = EnumC5243k9.NATIVE;
                    break;
                }
            }
        } else {
            enumC5243k9 = null;
        }
        Boolean boolM19441a = this.f31358a.m19441a(c5316n7.f32261p);
        int i8 = c5316n7.f32262q;
        Integer numValueOf7 = i8 != c5316n72.f32262q ? Integer.valueOf(i8) : null;
        byte[] bArr = c5316n7.f32263r;
        return new C5091e7(numValueOf, str2, str4, lValueOf, model, str6, str8, lValueOf2, numValueOf2, numValueOf3, str10, enumC4465E8M19340a, str12, enumC4994aaM20117a, enumC5243k9, boolM19441a, numValueOf7, !Arrays.equals(bArr, c5316n72.f32263r) ? bArr : null);
    }
}
