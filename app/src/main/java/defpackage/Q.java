package defpackage;

/* loaded from: classes.dex */
public final class Q {
    public static final Q b;
    public static final Q c;
    public final RuntimeException a;

    static {
        if (AbstractC5608l0.d) {
            c = null;
            b = null;
        } else {
            c = new Q(false, null);
            b = new Q(true, null);
        }
    }

    public Q(boolean z, RuntimeException runtimeException) {
        this.a = runtimeException;
    }
}
