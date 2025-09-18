package defpackage;

/* loaded from: classes.dex */
public final class ZY extends RuntimeException {
    public final int a;
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZY(int i, Throwable th) {
        super(th);
        NX.m(i, "callbackName");
        this.a = i;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
