package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class KQ {
    public final Context a;
    public final M71 b;
    public final C5278jG c;
    public InterfaceC6587q61 d;
    public InterfaceC6587q61 e;
    public InterfaceC6587q61 f;
    public InterfaceC6587q61 g;
    public final Looper h;
    public final int i;
    public final Q9 j;
    public final int k;
    public final boolean l;
    public final DX0 m;
    public final long n;
    public final long o;
    public final long p;
    public final C2291bG q;
    public final long r;
    public final long s;
    public final boolean t;
    public boolean u;
    public final String v;

    public KQ(final Context context, X11 x11) {
        final int i = 2;
        final int i2 = 1;
        C5278jG c5278jG = new C5278jG(5, x11);
        final int i3 = 0;
        InterfaceC6587q61 interfaceC6587q61 = new InterfaceC6587q61() { // from class: JQ
            @Override // defpackage.InterfaceC6587q61
            public final Object get() {
                PE pe;
                switch (i3) {
                    case 0:
                        return new C5851mG(new CC0(context, new C5217ix0(3)), new C7756wF());
                    case 1:
                        return new C2103aH(context, new OL0(7));
                    default:
                        Context context2 = context;
                        C3769fQ0 c3769fQ0 = PE.n;
                        synchronized (PE.class) {
                            try {
                                if (PE.t == null) {
                                    WB wb = new WB(context2);
                                    PE.t = new PE((Context) wb.c, (HashMap) wb.d, wb.b, (M71) wb.e, wb.a);
                                }
                                pe = PE.t;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return pe;
                }
            }
        };
        InterfaceC6587q61 interfaceC6587q612 = new InterfaceC6587q61() { // from class: JQ
            @Override // defpackage.InterfaceC6587q61
            public final Object get() {
                PE pe;
                switch (i2) {
                    case 0:
                        return new C5851mG(new CC0(context, new C5217ix0(3)), new C7756wF());
                    case 1:
                        return new C2103aH(context, new OL0(7));
                    default:
                        Context context2 = context;
                        C3769fQ0 c3769fQ0 = PE.n;
                        synchronized (PE.class) {
                            try {
                                if (PE.t == null) {
                                    WB wb = new WB(context2);
                                    PE.t = new PE((Context) wb.c, (HashMap) wb.d, wb.b, (M71) wb.e, wb.a);
                                }
                                pe = PE.t;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return pe;
                }
            }
        };
        C2417bw c2417bw = new C2417bw(2);
        InterfaceC6587q61 interfaceC6587q613 = new InterfaceC6587q61() { // from class: JQ
            @Override // defpackage.InterfaceC6587q61
            public final Object get() {
                PE pe;
                switch (i) {
                    case 0:
                        return new C5851mG(new CC0(context, new C5217ix0(3)), new C7756wF());
                    case 1:
                        return new C2103aH(context, new OL0(7));
                    default:
                        Context context2 = context;
                        C3769fQ0 c3769fQ0 = PE.n;
                        synchronized (PE.class) {
                            try {
                                if (PE.t == null) {
                                    WB wb = new WB(context2);
                                    PE.t = new PE((Context) wb.c, (HashMap) wb.d, wb.b, (M71) wb.e, wb.a);
                                }
                                pe = PE.t;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return pe;
                }
            }
        };
        context.getClass();
        this.a = context;
        this.c = c5278jG;
        this.d = interfaceC6587q61;
        this.e = interfaceC6587q612;
        this.f = c2417bw;
        this.g = interfaceC6587q613;
        int i4 = AbstractC0277Dh1.a;
        Looper looperMyLooper = Looper.myLooper();
        this.h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.j = Q9.d;
        this.k = 1;
        this.l = true;
        this.m = DX0.c;
        this.n = 5000L;
        this.o = 15000L;
        this.p = 3000L;
        this.q = new C2291bG(AbstractC0277Dh1.Q(20L), AbstractC0277Dh1.Q(500L), 0.999f);
        this.b = M71.a;
        this.r = 500L;
        this.s = 2000L;
        this.t = true;
        this.v = "";
        this.i = -1000;
    }
}
