package defpackage;

import android.app.Activity;
import android.os.Build;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.perf.metrics.Trace;

/* renamed from: yW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8188yW0 {
    public final FrameMetricsAggregator a;
    public Trace b;

    public C8188yW0(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = (i == 26 || i == 27) ? false : true;
        boolean z3 = (activity.getWindow() == null || (activity.getWindow().getAttributes().flags & 16777216) == 0) ? false : true;
        if (z2 && z3) {
            z = true;
        }
        activity.toString();
        if (!z) {
            throw new IllegalStateException("Device does not support screen traces. Hardware acceleration must be enabled and Android must not be 8.0 or 8.1.");
        }
        this.a = new FrameMetricsAggregator();
    }
}
