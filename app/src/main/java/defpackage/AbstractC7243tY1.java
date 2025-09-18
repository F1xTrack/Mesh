package defpackage;

/* renamed from: tY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7243tY1 {
    public static final void a(InterfaceC0173Bz interfaceC0173Bz, Throwable th) {
        try {
            C6006n4 c6006n4 = (C6006n4) interfaceC0173Bz.g(C0318Dv0.c);
            if (c6006n4 != null) {
                c6006n4.l(interfaceC0173Bz, th);
            } else {
                DV1.b(interfaceC0173Bz, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                I02.a(runtimeException, th);
                th = runtimeException;
            }
            DV1.b(interfaceC0173Bz, th);
        }
    }

    public static void b(Throwable th) throws Throwable {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        }
        if (!RuntimeException.class.isInstance(th)) {
            throw new RuntimeException(th);
        }
        throw ((Throwable) RuntimeException.class.cast(th));
    }
}
