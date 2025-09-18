package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class r extends CancellationException {
    public final transient InterfaceC6853rW a;

    public r(InterfaceC6853rW interfaceC6853rW) {
        super("Flow was aborted, no more elements needed");
        this.a = interfaceC6853rW;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
