package p000;

import java.util.List;

/* renamed from: yB */
/* loaded from: classes.dex */
public final class C7185yB implements U51 {

    /* renamed from: c */
    public static final C4261ik f46132c;

    /* renamed from: a */
    public final P70 f46133a;

    /* renamed from: b */
    public final long[] f46134b;

    static {
        C7354Au0 c7354Au0 = C7354Au0.f461a;
        C4262il c4262il = new C4262il(21);
        c7354Au0.getClass();
        f46132c = new C4261ik(c4262il, c7354Au0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7185yB(p000.C9367fQ0 r20) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7185yB.<init>(fQ0):void");
    }

    @Override // p000.U51
    /* renamed from: c */
    public final int mo5855c(long j) {
        int iM1814b = AbstractC7485Dh1.m1814b(this.f46134b, j, false);
        if (iM1814b < this.f46133a.size()) {
            return iM1814b;
        }
        return -1;
    }

    @Override // p000.U51
    /* renamed from: f */
    public final long mo5856f(int i) {
        YN1.m9278c(i < this.f46133a.size());
        return this.f46134b[i];
    }

    @Override // p000.U51
    /* renamed from: h */
    public final List mo5857h(long j) {
        int iM1821f = AbstractC7485Dh1.m1821f(this.f46134b, j, false);
        return iM1821f == -1 ? P70.m6236z() : (P70) this.f46133a.get(iM1821f);
    }

    @Override // p000.U51
    /* renamed from: j */
    public final int mo5858j() {
        return this.f46133a.size();
    }
}
