package p000;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: KU */
/* loaded from: classes.dex */
public final class C0661KU implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    public static final AtomicReference f6124a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        synchronized (C0786MU.f7172k) {
            try {
                Iterator it = new ArrayList(C0786MU.f7173l.values()).iterator();
                while (it.hasNext()) {
                    C0786MU c0786mu = (C0786MU) it.next();
                    if (c0786mu.f7178e.get()) {
                        c0786mu.m5384k(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
