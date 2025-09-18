package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jM */
/* loaded from: classes.dex */
public final class C6232jM implements InterfaceC6548oN {

    /* renamed from: a */
    public final C9591hA0 f35087a;

    /* renamed from: c */
    public final String f35089c;

    /* renamed from: d */
    public final int f35090d;

    /* renamed from: e */
    public String f35091e;

    /* renamed from: f */
    public InterfaceC8357Ub1 f35092f;

    /* renamed from: h */
    public int f35094h;

    /* renamed from: i */
    public int f35095i;

    /* renamed from: j */
    public long f35096j;

    /* renamed from: k */
    public C6686qX f35097k;

    /* renamed from: l */
    public int f35098l;

    /* renamed from: m */
    public int f35099m;

    /* renamed from: g */
    public int f35093g = 0;

    /* renamed from: p */
    public long f35102p = -9223372036854775807L;

    /* renamed from: b */
    public final AtomicInteger f35088b = new AtomicInteger();

    /* renamed from: n */
    public int f35100n = -1;

    /* renamed from: o */
    public int f35101o = -1;

    public C6232jM(String str, int i, int i2) {
        this.f35087a = new C9591hA0(new byte[i2]);
        this.f35089c = str;
        this.f35090d = i;
    }

    /* renamed from: a */
    public final boolean m22028a(C9591hA0 c9591hA0, byte[] bArr, int i) {
        int iMin = Math.min(c9591hA0.m18743a(), i - this.f35094h);
        c9591hA0.m18747e(bArr, this.f35094h, iMin);
        int i2 = this.f35094h + iMin;
        this.f35094h = i2;
        return i2 == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04a0  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [Ub1] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // p000.InterfaceC6548oN
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9102b(p000.C9591hA0 r38) throws p000.C10103lA0 {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6232jM.mo9102b(hA0):void");
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: c */
    public final void mo9103c() {
        this.f35093g = 0;
        this.f35094h = 0;
        this.f35095i = 0;
        this.f35102p = -9223372036854775807L;
        this.f35088b.set(0);
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: d */
    public final void mo9104d(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        ym0.m9266a();
        ym0.m9267b();
        this.f35091e = (String) ym0.f14269b;
        ym0.m9267b();
        this.f35092f = interfaceC1538YR.mo2005w(ym0.f14272e, 1);
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: f */
    public final void mo9106f(int i, long j) {
        this.f35102p = j;
    }

    /* renamed from: g */
    public final void m22029g(C6589p c6589p) {
        int i;
        int i2 = c6589p.f39425c;
        if (i2 == -2147483647 || (i = c6589p.f39426d) == -1) {
            return;
        }
        C6686qX c6686qX = this.f35097k;
        String str = c6589p.f39424b;
        if (c6686qX != null && i == c6686qX.f40951A && i2 == c6686qX.f40952B && str.equals(c6686qX.f40974m)) {
            return;
        }
        C6686qX c6686qX2 = this.f35097k;
        C6623pX c6623pX = c6686qX2 == null ? new C6623pX() : c6686qX2.m24020a();
        c6623pX.f40150a = this.f35091e;
        c6623pX.f40161l = AbstractC8544Xr0.m9171n(str);
        c6623pX.f40175z = i;
        c6623pX.f40141A = i2;
        c6623pX.f40153d = this.f35089c;
        c6623pX.f40155f = this.f35090d;
        C6686qX c6686qX3 = new C6686qX(c6623pX);
        this.f35097k = c6686qX3;
        this.f35092f.mo965f(c6686qX3);
    }

    @Override // p000.InterfaceC6548oN
    /* renamed from: e */
    public final void mo9105e(boolean z) {
    }
}
