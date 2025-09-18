package defpackage;

/* renamed from: oh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6314oh implements CX0 {
    public final InterfaceC6696qh a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public C6314oh(InterfaceC6696qh interfaceC6696qh, long j, long j2, long j3, long j4, long j5) {
        this.a = interfaceC6696qh;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.CX0
    public final boolean e() {
        return true;
    }

    @Override // defpackage.CX0
    public final BX0 i(long j) {
        EX0 ex0 = new EX0(j, C6505ph.a(this.a.f(j), 0L, this.c, this.d, this.e, this.f));
        return new BX0(ex0, ex0);
    }

    @Override // defpackage.CX0
    public final long k() {
        return this.b;
    }
}
