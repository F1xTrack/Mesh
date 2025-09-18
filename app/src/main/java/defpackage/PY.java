package defpackage;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class PY {
    public static final C7533v4 e = C7533v4.d();
    public final Activity a;
    public final FrameMetricsAggregator b;
    public final HashMap c;
    public boolean d;

    public PY(Activity activity) {
        FrameMetricsAggregator frameMetricsAggregator = new FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.d = false;
        this.a = activity;
        this.b = frameMetricsAggregator;
        this.c = map;
    }

    public final C8462zy0 a() {
        boolean z = this.d;
        C7533v4 c7533v4 = e;
        if (!z) {
            c7533v4.a();
            return new C8462zy0();
        }
        SparseIntArray[] sparseIntArrayArrK = this.b.a.k();
        if (sparseIntArrayArrK == null) {
            c7533v4.a();
            return new C8462zy0();
        }
        SparseIntArray sparseIntArray = sparseIntArrayArrK[0];
        if (sparseIntArray == null) {
            c7533v4.a();
            return new C8462zy0();
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
        return new C8462zy0(new OY(i, i2, i3));
    }
}
