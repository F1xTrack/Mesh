package p000;

/* renamed from: tY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11176tY1 {
    /* renamed from: a */
    public static final void m24942a(InterfaceC0125Bz interfaceC0125Bz, Throwable th) {
        try {
            C6466n4 c6466n4 = (C6466n4) interfaceC0125Bz.mo937g(C7512Dv0.f2300c);
            if (c6466n4 != null) {
                c6466n4.m23067l(interfaceC0125Bz, th);
            } else {
                DV1.m1717b(interfaceC0125Bz, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                I02.m3687a(runtimeException, th);
                th = runtimeException;
            }
            DV1.m1717b(interfaceC0125Bz, th);
        }
    }

    /* renamed from: b */
    public static void m24943b(Throwable th) throws Throwable {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        }
        if (!RuntimeException.class.isInstance(th)) {
            throw new RuntimeException(th);
        }
        throw ((Throwable) RuntimeException.class.cast(th));
    }
}
