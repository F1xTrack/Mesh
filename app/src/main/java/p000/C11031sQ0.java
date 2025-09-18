package p000;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11031sQ0 implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    public static final AtomicReference f42428a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        Clock clock = C11159tQ0.f43063j;
        synchronized (C11159tQ0.class) {
            Iterator it = C11159tQ0.f43065l.values().iterator();
            while (it.hasNext()) {
                ((C6621pV) it.next()).m23808e(z);
            }
        }
    }
}
