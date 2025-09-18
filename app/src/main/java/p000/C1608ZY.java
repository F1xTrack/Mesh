package p000;

/* renamed from: ZY */
/* loaded from: classes.dex */
public final class C1608ZY extends RuntimeException {

    /* renamed from: a */
    public final int f14962a;

    /* renamed from: b */
    public final Throwable f14963b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608ZY(int i, Throwable th) {
        super(th);
        AbstractC0852NX.m5764m(i, "callbackName");
        this.f14962a = i;
        this.f14963b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f14963b;
    }
}
