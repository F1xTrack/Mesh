package p000;

import java.util.ArrayList;

/* renamed from: TW */
/* loaded from: classes.dex */
public final class C1228TW {

    /* renamed from: a */
    public final ArrayList f11406a;

    /* renamed from: b */
    public final char f11407b;

    /* renamed from: c */
    public final double f11408c;

    /* renamed from: d */
    public final String f11409d;

    /* renamed from: e */
    public final String f11410e;

    public C1228TW(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f11406a = arrayList;
        this.f11407b = c;
        this.f11408c = d;
        this.f11409d = str;
        this.f11410e = str2;
    }

    /* renamed from: a */
    public static int m7703a(char c, String str, String str2) {
        return str2.hashCode() + AbstractC1374Vq.m8586e(c * 31, 31, str);
    }

    public final int hashCode() {
        return m7703a(this.f11407b, this.f11410e, this.f11409d);
    }
}
