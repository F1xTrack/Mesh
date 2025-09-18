package defpackage;

/* loaded from: classes.dex */
public final class U {
    public final Throwable a;

    static {
        new U(new T("Failure occurred while trying to finish a future.", 0));
    }

    public U(Throwable th) {
        th.getClass();
        this.a = th;
    }
}
