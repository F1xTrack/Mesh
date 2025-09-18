package p000;

import android.content.Context;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: KQ */
/* loaded from: classes.dex */
public final class C0657KQ {

    /* renamed from: a */
    public final Context f6073a;

    /* renamed from: b */
    public final M71 f6074b;

    /* renamed from: c */
    public final C6226jG f6075c;

    /* renamed from: d */
    public InterfaceC10736q61 f6076d;

    /* renamed from: e */
    public InterfaceC10736q61 f6077e;

    /* renamed from: f */
    public InterfaceC10736q61 f6078f;

    /* renamed from: g */
    public InterfaceC10736q61 f6079g;

    /* renamed from: h */
    public final Looper f6080h;

    /* renamed from: i */
    public final int f6081i;

    /* renamed from: j */
    public final C1017Q9 f6082j;

    /* renamed from: k */
    public final int f6083k;

    /* renamed from: l */
    public final boolean f6084l;

    /* renamed from: m */
    public final DX0 f6085m;

    /* renamed from: n */
    public final long f6086n;

    /* renamed from: o */
    public final long f6087o;

    /* renamed from: p */
    public final long f6088p;

    /* renamed from: q */
    public final C1774bG f6089q;

    /* renamed from: r */
    public final long f6090r;

    /* renamed from: s */
    public final long f6091s;

    /* renamed from: t */
    public final boolean f6092t;

    /* renamed from: u */
    public boolean f6093u;

    /* renamed from: v */
    public final String f6094v;

    public C0657KQ(final Context context, X11 x11) {
        final int i = 2;
        final int i2 = 1;
        C6226jG c6226jG = new C6226jG(5, x11);
        final int i3 = 0;
        InterfaceC10736q61 interfaceC10736q61 = new InterfaceC10736q61() { // from class: JQ
            @Override // p000.InterfaceC10736q61
            public final Object get() {
                C0959PE c0959pe;
                switch (i3) {
                    case 0:
                        return new C6415mG(new CC0(context, new C9817ix0(3)), new C7063wF());
                    case 1:
                        return new C1654aH(context, new OL0(7));
                    default:
                        Context context2 = context;
                        C9367fQ0 c9367fQ0 = C0959PE.f8910n;
                        synchronized (C0959PE.class) {
                            try {
                                if (C0959PE.f8916t == null) {
                                    C1396WB c1396wb = new C1396WB(context2);
                                    C0959PE.f8916t = new C0959PE((Context) c1396wb.f13035c, (HashMap) c1396wb.f13036d, c1396wb.f13034b, (M71) c1396wb.f13037e, c1396wb.f13033a);
                                }
                                c0959pe = C0959PE.f8916t;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return c0959pe;
                }
            }
        };
        InterfaceC10736q61 interfaceC10736q612 = new InterfaceC10736q61() { // from class: JQ
            @Override // p000.InterfaceC10736q61
            public final Object get() {
                C0959PE c0959pe;
                switch (i2) {
                    case 0:
                        return new C6415mG(new CC0(context, new C9817ix0(3)), new C7063wF());
                    case 1:
                        return new C1654aH(context, new OL0(7));
                    default:
                        Context context2 = context;
                        C9367fQ0 c9367fQ0 = C0959PE.f8910n;
                        synchronized (C0959PE.class) {
                            try {
                                if (C0959PE.f8916t == null) {
                                    C1396WB c1396wb = new C1396WB(context2);
                                    C0959PE.f8916t = new C0959PE((Context) c1396wb.f13035c, (HashMap) c1396wb.f13036d, c1396wb.f13034b, (M71) c1396wb.f13037e, c1396wb.f13033a);
                                }
                                c0959pe = C0959PE.f8916t;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return c0959pe;
                }
            }
        };
        C1816bw c1816bw = new C1816bw(2);
        InterfaceC10736q61 interfaceC10736q613 = new InterfaceC10736q61() { // from class: JQ
            @Override // p000.InterfaceC10736q61
            public final Object get() {
                C0959PE c0959pe;
                switch (i) {
                    case 0:
                        return new C6415mG(new CC0(context, new C9817ix0(3)), new C7063wF());
                    case 1:
                        return new C1654aH(context, new OL0(7));
                    default:
                        Context context2 = context;
                        C9367fQ0 c9367fQ0 = C0959PE.f8910n;
                        synchronized (C0959PE.class) {
                            try {
                                if (C0959PE.f8916t == null) {
                                    C1396WB c1396wb = new C1396WB(context2);
                                    C0959PE.f8916t = new C0959PE((Context) c1396wb.f13035c, (HashMap) c1396wb.f13036d, c1396wb.f13034b, (M71) c1396wb.f13037e, c1396wb.f13033a);
                                }
                                c0959pe = C0959PE.f8916t;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return c0959pe;
                }
            }
        };
        context.getClass();
        this.f6073a = context;
        this.f6075c = c6226jG;
        this.f6076d = interfaceC10736q61;
        this.f6077e = interfaceC10736q612;
        this.f6078f = c1816bw;
        this.f6079g = interfaceC10736q613;
        int i4 = AbstractC7485Dh1.f2166a;
        Looper looperMyLooper = Looper.myLooper();
        this.f6080h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f6082j = C1017Q9.f9497d;
        this.f6083k = 1;
        this.f6084l = true;
        this.f6085m = DX0.f2039c;
        this.f6086n = 5000L;
        this.f6087o = 15000L;
        this.f6088p = 3000L;
        this.f6089q = new C1774bG(AbstractC7485Dh1.m1802Q(20L), AbstractC7485Dh1.m1802Q(500L), 0.999f);
        this.f6074b = M71.f6997a;
        this.f6090r = 500L;
        this.f6091s = 2000L;
        this.f6092t = true;
        this.f6094v = "";
        this.f6081i = -1000;
    }
}
