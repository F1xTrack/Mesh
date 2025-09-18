package p000;

/* renamed from: AJ */
/* loaded from: classes2.dex */
public final class C0020AJ extends RuntimeException {

    /* renamed from: a */
    public final transient InterfaceC0125Bz f163a;

    public C0020AJ(InterfaceC0125Bz interfaceC0125Bz) {
        this.f163a = interfaceC0125Bz;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f163a.toString();
    }
}
