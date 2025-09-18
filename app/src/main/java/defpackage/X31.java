package defpackage;

/* loaded from: classes2.dex */
public abstract class X31 {
    public static final /* synthetic */ int a = 0;

    static {
        Object objB;
        Object objB2;
        Exception exc = new Exception();
        String simpleName = AbstractC1938Yp1.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objB = AbstractC1594Uf.class.getCanonicalName();
        } catch (Throwable th) {
            objB = RQ1.b(th);
        }
        if (PS0.a(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objB2 = X31.class.getCanonicalName();
        } catch (Throwable th2) {
            objB2 = RQ1.b(th2);
        }
        if (PS0.a(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
