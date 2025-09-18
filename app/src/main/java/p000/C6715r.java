package p000;

import java.util.concurrent.CancellationException;

/* renamed from: r */
/* loaded from: classes2.dex */
public final class C6715r extends CancellationException {

    /* renamed from: a */
    public final transient InterfaceC6748rW f41279a;

    public C6715r(InterfaceC6748rW interfaceC6748rW) {
        super("Flow was aborted, no more elements needed");
        this.f41279a = interfaceC6748rW;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
