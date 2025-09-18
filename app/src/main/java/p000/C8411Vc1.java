package p000;

import java.util.HashMap;

/* renamed from: Vc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8411Vc1 implements InterfaceC8151Qc1 {

    /* renamed from: a */
    public final C1236Te f12655a;

    /* renamed from: b */
    public final String f12656b;

    /* renamed from: c */
    public final C7135xO f12657c;

    /* renamed from: d */
    public final InterfaceC11821yc1 f12658d;

    /* renamed from: e */
    public final C8877bd1 f12659e;

    public C8411Vc1(C1236Te c1236Te, String str, C7135xO c7135xO, InterfaceC11821yc1 interfaceC11821yc1, C8877bd1 c8877bd1) {
        this.f12655a = c1236Te;
        this.f12656b = str;
        this.f12657c = c7135xO;
        this.f12658d = interfaceC11821yc1;
        this.f12659e = c8877bd1;
    }

    /* renamed from: a */
    public final void m8514a(C0040Ad c0040Ad, InterfaceC9005cd1 interfaceC9005cd1) {
        C1236Te c1236Te = this.f12655a;
        String str = this.f12656b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        InterfaceC11821yc1 interfaceC11821yc1 = this.f12658d;
        if (interfaceC11821yc1 == null) {
            throw new NullPointerException("Null transformer");
        }
        C7135xO c7135xO = this.f12657c;
        C8877bd1 c8877bd1 = this.f12659e;
        C1236Te c1236TeM7708b = c1236Te.m7708b(c0040Ad.f287b);
        C0103Bd c0103Bd = new C0103Bd();
        c0103Bd.f947f = new HashMap();
        c0103Bd.f945d = Long.valueOf(c8877bd1.f17102a.mo2451d());
        c0103Bd.f946e = Long.valueOf(c8877bd1.f17103b.mo2451d());
        c0103Bd.f942a = str;
        c0103Bd.f944c = new C1597ZN(c7135xO, (byte[]) interfaceC11821yc1.apply(c0040Ad.f286a));
        c0103Bd.f943b = null;
        C6502ne c6502ne = c0040Ad.f288c;
        if (c6502ne != null) {
            c0103Bd.f948g = c6502ne.f38427a;
        }
        C0166Cd c0166CdM779b = c0103Bd.m779b();
        C7127xG c7127xG = (C7127xG) c8877bd1.f17104c;
        c7127xG.getClass();
        c7127xG.f45502b.execute(new RunnableC6757rf(c7127xG, c1236TeM7708b, interfaceC9005cd1, c0166CdM779b, 5));
    }
}
