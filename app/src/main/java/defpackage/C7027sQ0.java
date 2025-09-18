package defpackage;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7027sQ0 implements BackgroundDetector.BackgroundStateChangeListener {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        Clock clock = C7218tQ0.j;
        synchronized (C7218tQ0.class) {
            Iterator it = C7218tQ0.l.values().iterator();
            while (it.hasNext()) {
                ((C6469pV) it.next()).e(z);
            }
        }
    }
}
