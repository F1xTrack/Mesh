package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class V0 {
    public static final V0 c;
    public static final V0 d;
    public final boolean a;
    public final CancellationException b;

    static {
        if (AbstractC2243b1.d) {
            d = null;
            c = null;
        } else {
            d = new V0(false, null);
            c = new V0(true, null);
        }
    }

    public V0(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
