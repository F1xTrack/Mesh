package defpackage;

/* loaded from: classes2.dex */
public final class AJ extends RuntimeException {
    public final transient InterfaceC0173Bz a;

    public AJ(InterfaceC0173Bz interfaceC0173Bz) {
        this.a = interfaceC0173Bz;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
