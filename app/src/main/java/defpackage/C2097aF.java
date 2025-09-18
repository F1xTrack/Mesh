package defpackage;

/* renamed from: aF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2097aF extends AbstractC6693qg {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public C2097aF(I31 i31, int i) {
        super(i, i31.k - 1);
        this.e = i31;
    }

    @Override // defpackage.InterfaceC0375Eo0
    public final long e() {
        switch (this.d) {
            case 0:
                a();
                return ((ZE) this.e).f(this.c);
            default:
                a();
                return ((I31) this.e).o[(int) this.c];
        }
    }

    @Override // defpackage.InterfaceC0375Eo0
    public final long h() {
        switch (this.d) {
            case 0:
                a();
                return ((ZE) this.e).e(this.c);
            default:
                return ((I31) this.e).c((int) this.c) + e();
        }
    }

    public C2097aF(ZE ze, long j, long j2) {
        super(j, j2);
        this.e = ze;
    }
}
