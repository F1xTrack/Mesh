package p000;

import java.util.concurrent.CancellationException;

/* renamed from: V0 */
/* loaded from: classes.dex */
public final class C1322V0 {

    /* renamed from: c */
    public static final C1322V0 f12290c;

    /* renamed from: d */
    public static final C1322V0 f12291d;

    /* renamed from: a */
    public final boolean f12292a;

    /* renamed from: b */
    public final CancellationException f12293b;

    static {
        if (AbstractC1759b1.f16705d) {
            f12291d = null;
            f12290c = null;
        } else {
            f12291d = new C1322V0(false, null);
            f12290c = new C1322V0(true, null);
        }
    }

    public C1322V0(boolean z, CancellationException cancellationException) {
        this.f12292a = z;
        this.f12293b = cancellationException;
    }
}
