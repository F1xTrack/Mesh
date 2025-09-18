package androidx.core.app;

import android.os.Build;
import p000.C0853NY;
import p000.C7564Ev0;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a */
    public final C7564Ev0 f16089a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f16089a = new C0853NY(i);
        } else {
            this.f16089a = new C7564Ev0(14);
        }
    }
}
