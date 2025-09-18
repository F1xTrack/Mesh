package defpackage;

/* renamed from: m01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5801m01 implements MK {
    public final C6183o01 a;
    public final long b;
    public final Object c;
    public final C0767Jp d;

    public C5801m01(C6183o01 c6183o01, long j, Object obj, C0767Jp c0767Jp) {
        this.a = c6183o01;
        this.b = j;
        this.c = obj;
        this.d = c0767Jp;
    }

    @Override // defpackage.MK
    public final void a() {
        C6183o01 c6183o01 = this.a;
        synchronized (c6183o01) {
            if (this.b < c6183o01.l()) {
                return;
            }
            Object[] objArr = c6183o01.g;
            O90.c(objArr);
            long j = this.b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            WB1.a(objArr, j, WB1.a);
            c6183o01.f();
        }
    }
}
