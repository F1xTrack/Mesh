package p000;

import java.util.concurrent.CancellationException;

/* renamed from: S */
/* loaded from: classes.dex */
public final class C1132S {

    /* renamed from: c */
    public static final C1132S f10519c;

    /* renamed from: d */
    public static final C1132S f10520d;

    /* renamed from: a */
    public final boolean f10521a;

    /* renamed from: b */
    public final CancellationException f10522b;

    static {
        if (AbstractC6399m0.f37377d) {
            f10520d = null;
            f10519c = null;
        } else {
            f10520d = new C1132S(false, null);
            f10519c = new C1132S(true, null);
        }
    }

    public C1132S(boolean z, CancellationException cancellationException) {
        this.f10521a = z;
        this.f10522b = cancellationException;
    }
}
