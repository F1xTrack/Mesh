package p000;

import java.util.Arrays;

/* renamed from: t3 */
/* loaded from: classes.dex */
public final class C6862t3 implements InterfaceC6548oN {

    /* renamed from: w */
    public static final byte[] f42791w = {73, 68, 51};

    /* renamed from: a */
    public final boolean f42792a;

    /* renamed from: d */
    public final String f42795d;

    /* renamed from: e */
    public final int f42796e;

    /* renamed from: f */
    public String f42797f;

    /* renamed from: g */
    public InterfaceC8357Ub1 f42798g;

    /* renamed from: h */
    public InterfaceC8357Ub1 f42799h;

    /* renamed from: l */
    public boolean f42803l;

    /* renamed from: m */
    public boolean f42804m;

    /* renamed from: p */
    public int f42807p;

    /* renamed from: q */
    public boolean f42808q;

    /* renamed from: s */
    public int f42810s;

    /* renamed from: u */
    public InterfaceC8357Ub1 f42812u;

    /* renamed from: v */
    public long f42813v;

    /* renamed from: b */
    public final C0683Kq f42793b = new C0683Kq(new byte[7], 7);

    /* renamed from: c */
    public final C9591hA0 f42794c = new C9591hA0(Arrays.copyOf(f42791w, 10));

    /* renamed from: i */
    public int f42800i = 0;

    /* renamed from: j */
    public int f42801j = 0;

    /* renamed from: k */
    public int f42802k = 256;

    /* renamed from: n */
    public int f42805n = -1;

    /* renamed from: o */
    public int f42806o = -1;

    /* renamed from: r */
    public long f42809r = -9223372036854775807L;

    /* renamed from: t */
    public long f42811t = -9223372036854775807L;

    public C6862t3(int i, String str, boolean z) {
        this.f42792a = z;
        this.f42795d = str;
        this.f42796e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f5  */
    @Override // p000.InterfaceC6548oN
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9102b(p000.C9591hA0 r24) throws p000.C10103lA0 {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6862t3.mo9102b(hA0):void");
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: c */
    public final void mo9103c() {
        this.f42811t = -9223372036854775807L;
        this.f42804m = false;
        this.f42800i = 0;
        this.f42801j = 0;
        this.f42802k = 256;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: d */
    public final void mo9104d(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        ym0.m9266a();
        ym0.m9267b();
        this.f42797f = (String) ym0.f14269b;
        ym0.m9267b();
        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(ym0.f14272e, 1);
        this.f42798g = interfaceC8357Ub1Mo2005w;
        this.f42812u = interfaceC8357Ub1Mo2005w;
        if (!this.f42792a) {
            this.f42799h = new C1404WJ();
            return;
        }
        ym0.m9266a();
        ym0.m9267b();
        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w2 = interfaceC1538YR.mo2005w(ym0.f14272e, 5);
        this.f42799h = interfaceC8357Ub1Mo2005w2;
        C6623pX c6623pX = new C6623pX();
        ym0.m9267b();
        c6623pX.f40150a = (String) ym0.f14269b;
        c6623pX.f40161l = AbstractC8544Xr0.m9171n("application/id3");
        F91.m2512B(c6623pX, interfaceC8357Ub1Mo2005w2);
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: f */
    public final void mo9106f(int i, long j) {
        this.f42811t = j;
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: e */
    public final void mo9105e(boolean z) {
    }
}
