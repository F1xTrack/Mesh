package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class NY extends C0396Ev0 {
    public static HandlerThread n;
    public static Handler o;
    public final int j;
    public SparseIntArray[] k;
    public final ArrayList l;
    public final MY m;

    public NY(int i) {
        super(14);
        this.k = new SparseIntArray[9];
        this.l = new ArrayList();
        this.m = new MY(this);
        this.j = i;
    }

    public static void o(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    @Override // defpackage.C0396Ev0
    public final void a(Activity activity) {
        if (n == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            n = handlerThread;
            handlerThread.start();
            o = new Handler(n.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = this.k;
            if (sparseIntArrayArr[i] == null && (this.j & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this.m, o);
        this.l.add(new WeakReference(activity));
    }

    @Override // defpackage.C0396Ev0
    public final SparseIntArray[] k() {
        return this.k;
    }

    @Override // defpackage.C0396Ev0
    public final SparseIntArray[] l(Activity activity) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.m);
        return this.k;
    }

    @Override // defpackage.C0396Ev0
    public final SparseIntArray[] m() {
        SparseIntArray[] sparseIntArrayArr = this.k;
        this.k = new SparseIntArray[9];
        return sparseIntArrayArr;
    }

    @Override // defpackage.C0396Ev0
    public final SparseIntArray[] n() {
        ArrayList arrayList = this.l;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            Activity activity = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.m);
                arrayList.remove(size);
            }
        }
        return this.k;
    }
}
