package defpackage;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class KU implements BackgroundDetector.BackgroundStateChangeListener {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        synchronized (MU.k) {
            try {
                Iterator it = new ArrayList(MU.l.values()).iterator();
                while (it.hasNext()) {
                    MU mu = (MU) it.next();
                    if (mu.e.get()) {
                        mu.k(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
