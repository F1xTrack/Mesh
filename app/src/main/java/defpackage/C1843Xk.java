package defpackage;

/* renamed from: Xk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1843Xk extends EX {
    public final /* synthetic */ C1921Yk b;
    public final /* synthetic */ C4210hk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1843Xk(C1921Yk c1921Yk, C4210hk c4210hk, Z11 z11) {
        super(z11);
        this.b = c1921Yk;
        this.c = c4210hk;
    }

    @Override // defpackage.EX, defpackage.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1921Yk c1921Yk = this.b;
        C4210hk c4210hk = this.c;
        synchronized (c1921Yk) {
            if (c4210hk.a) {
                return;
            }
            c4210hk.a = true;
            super.close();
            ((VG) this.c.b).e();
        }
    }
}
