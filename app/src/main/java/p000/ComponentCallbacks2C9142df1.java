package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: df1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C9142df1 implements ComponentCallbacks2 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 60) {
            ((C1565Ys) AbstractC7917Lp1.f6883a.getValue()).m9387a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
