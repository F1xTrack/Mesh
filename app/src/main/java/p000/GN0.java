package p000;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class GN0 implements InterfaceC10741q90 {

    /* renamed from: a */
    public final DN0 f3711a;

    /* renamed from: b */
    public final ArrayList f3712b;

    /* renamed from: c */
    public final int f3713c;

    /* renamed from: d */
    public final C4198hk f3714d;

    /* renamed from: e */
    public final C10777qR0 f3715e;

    /* renamed from: f */
    public final int f3716f;

    /* renamed from: g */
    public final int f3717g;

    /* renamed from: h */
    public final int f3718h;

    /* renamed from: i */
    public int f3719i;

    public GN0(DN0 dn0, ArrayList arrayList, int i, C4198hk c4198hk, C10777qR0 c10777qR0, int i2, int i3, int i4) {
        O90.m5968f(dn0, "call");
        O90.m5968f(c10777qR0, "request");
        this.f3711a = dn0;
        this.f3712b = arrayList;
        this.f3713c = i;
        this.f3714d = c4198hk;
        this.f3715e = c10777qR0;
        this.f3716f = i2;
        this.f3717g = i3;
        this.f3718h = i4;
    }

    /* renamed from: a */
    public static GN0 m3054a(GN0 gn0, int i, C4198hk c4198hk, C10777qR0 c10777qR0, int i2) {
        if ((i2 & 1) != 0) {
            i = gn0.f3713c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c4198hk = gn0.f3714d;
        }
        C4198hk c4198hk2 = c4198hk;
        if ((i2 & 4) != 0) {
            c10777qR0 = gn0.f3715e;
        }
        C10777qR0 c10777qR02 = c10777qR0;
        int i4 = gn0.f3716f;
        int i5 = gn0.f3717g;
        int i6 = gn0.f3718h;
        gn0.getClass();
        O90.m5968f(c10777qR02, "request");
        return new GN0(gn0.f3711a, gn0.f3712b, i3, c4198hk2, c10777qR02, i4, i5, i6);
    }

    /* renamed from: b */
    public final HS0 m3055b(C10777qR0 c10777qR0) {
        O90.m5968f(c10777qR0, "request");
        ArrayList arrayList = this.f3712b;
        int size = arrayList.size();
        int i = this.f3713c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3719i++;
        C4198hk c4198hk = this.f3714d;
        if (c4198hk != null) {
            if (!((C1536YP) c4198hk.f28555c).m9292b(c10777qR0.f40870a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.f3719i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        GN0 gn0M3054a = m3054a(this, i2, null, c10777qR0, 58);
        InterfaceC10869r90 interfaceC10869r90 = (InterfaceC10869r90) arrayList.get(i);
        HS0 hs0Mo18634a = interfaceC10869r90.mo18634a(gn0M3054a);
        if (hs0Mo18634a == null) {
            throw new NullPointerException("interceptor " + interfaceC10869r90 + " returned null");
        }
        if (c4198hk != null && i2 < arrayList.size() && gn0M3054a.f3719i != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC10869r90 + " must call proceed() exactly once").toString());
        }
        if (hs0Mo18634a.f4301g != null) {
            return hs0Mo18634a;
        }
        throw new IllegalStateException(("interceptor " + interfaceC10869r90 + " returned a response with no body").toString());
    }
}
