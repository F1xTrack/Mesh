package defpackage;

/* renamed from: nE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6036nE implements InterfaceC1373Rj0, InterfaceC6365oy {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C6036nE(Y3 y3, int i, long j, long j2) {
        this.c = y3;
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.InterfaceC6365oy
    public void b(Object obj) {
        C7934xB c7934xB = (C7934xB) obj;
        C4092h61 c4092h61 = (C4092h61) this.c;
        YN1.h(c4092h61.h);
        byte[] bArrE = C0396Ev0.e(c7934xB.a, c7934xB.c);
        C4103hA0 c4103hA0 = c4092h61.c;
        c4103hA0.getClass();
        c4103hA0.E(bArrE.length, bArrE);
        c4092h61.a.d(bArrE.length, c4103hA0);
        long j = c7934xB.b;
        long j2 = this.a;
        if (j == -9223372036854775807L) {
            YN1.f(c4092h61.h.r == Long.MAX_VALUE);
        } else {
            long j3 = c4092h61.h.r;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        c4092h61.a.a(j2, this.b, bArrE.length, 0, null);
    }

    @Override // defpackage.InterfaceC1373Rj0
    public void invoke(Object obj) {
        ((Z3) obj).D(this.b, this.a, (Y3) this.c);
    }

    public /* synthetic */ C6036nE(C4092h61 c4092h61, long j, int i) {
        this.c = c4092h61;
        this.a = j;
        this.b = i;
    }
}
