package p000;

/* renamed from: Zp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8644Zp0 implements InterfaceC9305ex0 {

    /* renamed from: a */
    public final C7560Et0 f15141a;

    /* renamed from: b */
    public final C0071B7 f15142b;

    /* renamed from: c */
    public int f15143c = -1;

    public C8644Zp0(C7560Et0 c7560Et0, C0071B7 c0071b7) {
        this.f15141a = c7560Et0;
        this.f15142b = c0071b7;
    }

    /* renamed from: a */
    public final void m9612a() {
        this.f15141a.m10134f(this);
    }

    @Override // p000.InterfaceC9305ex0
    /* renamed from: r0 */
    public final void mo505r0(Object obj) throws InterruptedException {
        int i = this.f15143c;
        int i2 = this.f15141a.f16322g;
        if (i != i2) {
            this.f15143c = i2;
            this.f15142b.mo505r0(obj);
        }
    }
}
