package p000;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.util.HashMap;

/* renamed from: PY */
/* loaded from: classes.dex */
public final class C0979PY {

    /* renamed from: e */
    public static final C6989v4 f9125e = C6989v4.m25319d();

    /* renamed from: a */
    public final Activity f9126a;

    /* renamed from: b */
    public final FrameMetricsAggregator f9127b;

    /* renamed from: c */
    public final HashMap f9128c;

    /* renamed from: d */
    public boolean f9129d;

    public C0979PY(Activity activity) {
        FrameMetricsAggregator frameMetricsAggregator = new FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.f9129d = false;
        this.f9126a = activity;
        this.f9127b = frameMetricsAggregator;
        this.f9128c = map;
    }

    /* renamed from: a */
    public final C11991zy0 m6382a() {
        boolean z = this.f9129d;
        C6989v4 c6989v4 = f9125e;
        if (!z) {
            c6989v4.m25320a();
            return new C11991zy0();
        }
        SparseIntArray[] sparseIntArrayArrMo2452k = this.f9127b.f16089a.mo2452k();
        if (sparseIntArrayArrMo2452k == null) {
            c6989v4.m25320a();
            return new C11991zy0();
        }
        SparseIntArray sparseIntArray = sparseIntArrayArrMo2452k[0];
        if (sparseIntArray == null) {
            c6989v4.m25320a();
            return new C11991zy0();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            int iValueAt = sparseIntArray.valueAt(i4);
            i += iValueAt;
            if (iKeyAt > 700) {
                i3 += iValueAt;
            }
            if (iKeyAt > 16) {
                i2 += iValueAt;
            }
        }
        return new C11991zy0(new C0916OY(i, i2, i3));
    }
}
