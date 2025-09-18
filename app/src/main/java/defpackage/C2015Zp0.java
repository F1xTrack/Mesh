package defpackage;

/* renamed from: Zp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2015Zp0 implements InterfaceC3677ex0 {
    public final C0390Et0 a;
    public final B7 b;
    public int c = -1;

    public C2015Zp0(C0390Et0 c0390Et0, B7 b7) {
        this.a = c0390Et0;
        this.b = b7;
    }

    public final void a() {
        this.a.f(this);
    }

    @Override // defpackage.InterfaceC3677ex0
    public final void r0(Object obj) throws InterruptedException {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.r0(obj);
        }
    }
}
