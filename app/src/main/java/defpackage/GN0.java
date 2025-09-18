package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class GN0 implements InterfaceC6595q90 {
    public final DN0 a;
    public final ArrayList b;
    public final int c;
    public final C4210hk d;
    public final C6649qR0 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public GN0(DN0 dn0, ArrayList arrayList, int i, C4210hk c4210hk, C6649qR0 c6649qR0, int i2, int i3, int i4) {
        O90.f(dn0, "call");
        O90.f(c6649qR0, "request");
        this.a = dn0;
        this.b = arrayList;
        this.c = i;
        this.d = c4210hk;
        this.e = c6649qR0;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static GN0 a(GN0 gn0, int i, C4210hk c4210hk, C6649qR0 c6649qR0, int i2) {
        if ((i2 & 1) != 0) {
            i = gn0.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c4210hk = gn0.d;
        }
        C4210hk c4210hk2 = c4210hk;
        if ((i2 & 4) != 0) {
            c6649qR0 = gn0.e;
        }
        C6649qR0 c6649qR02 = c6649qR0;
        int i4 = gn0.f;
        int i5 = gn0.g;
        int i6 = gn0.h;
        gn0.getClass();
        O90.f(c6649qR02, "request");
        return new GN0(gn0.a, gn0.b, i3, c4210hk2, c6649qR02, i4, i5, i6);
    }

    public final HS0 b(C6649qR0 c6649qR0) {
        O90.f(c6649qR0, "request");
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        C4210hk c4210hk = this.d;
        if (c4210hk != null) {
            if (!((YP) c4210hk.c).b(c6649qR0.a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        GN0 gn0A = a(this, i2, null, c6649qR0, 58);
        InterfaceC6785r90 interfaceC6785r90 = (InterfaceC6785r90) arrayList.get(i);
        HS0 hs0A = interfaceC6785r90.a(gn0A);
        if (hs0A == null) {
            throw new NullPointerException("interceptor " + interfaceC6785r90 + " returned null");
        }
        if (c4210hk != null && i2 < arrayList.size() && gn0A.i != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC6785r90 + " must call proceed() exactly once").toString());
        }
        if (hs0A.g != null) {
            return hs0A;
        }
        throw new IllegalStateException(("interceptor " + interfaceC6785r90 + " returned a response with no body").toString());
    }
}
