package defpackage;

import java.util.List;

/* renamed from: yB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8124yB implements U51 {
    public static final C4400ik c;
    public final P70 a;
    public final long[] b;

    static {
        C0081Au0 c0081Au0 = C0081Au0.a;
        C4403il c4403il = new C4403il(21);
        c0081Au0.getClass();
        c = new C4400ik(c4403il, c0081Au0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8124yB(defpackage.C3769fQ0 r20) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8124yB.<init>(fQ0):void");
    }

    @Override // defpackage.U51
    public final int c(long j) {
        int iB = AbstractC0277Dh1.b(this.b, j, false);
        if (iB < this.a.size()) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.U51
    public final long f(int i) {
        YN1.c(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.U51
    public final List h(long j) {
        int iF = AbstractC0277Dh1.f(this.b, j, false);
        return iF == -1 ? P70.z() : (P70) this.a.get(iF);
    }

    @Override // defpackage.U51
    public final int j() {
        return this.a.size();
    }
}
