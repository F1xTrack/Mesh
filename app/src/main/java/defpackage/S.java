package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class S {
    public static final S c;
    public static final S d;
    public final boolean a;
    public final CancellationException b;

    static {
        if (AbstractC5799m0.d) {
            d = null;
            c = null;
        } else {
            d = new S(false, null);
            c = new S(true, null);
        }
    }

    public S(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
