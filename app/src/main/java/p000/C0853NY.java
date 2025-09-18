package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: NY */
/* loaded from: classes.dex */
public final class C0853NY extends C7564Ev0 {

    /* renamed from: n */
    public static HandlerThread f7861n;

    /* renamed from: o */
    public static Handler f7862o;

    /* renamed from: j */
    public final int f7863j;

    /* renamed from: k */
    public SparseIntArray[] f7864k;

    /* renamed from: l */
    public final ArrayList f7865l;

    /* renamed from: m */
    public final WindowOnFrameMetricsAvailableListenerC0790MY f7866m;

    public C0853NY(int i) {
        super(14);
        this.f7864k = new SparseIntArray[9];
        this.f7865l = new ArrayList();
        this.f7866m = new WindowOnFrameMetricsAvailableListenerC0790MY(this);
        this.f7863j = i;
    }

    /* renamed from: o */
    public static void m5777o(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    @Override // p000.C7564Ev0
    /* renamed from: a */
    public final void mo2450a(Activity activity) {
        if (f7861n == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            f7861n = handlerThread;
            handlerThread.start();
            f7862o = new Handler(f7861n.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = this.f7864k;
            if (sparseIntArrayArr[i] == null && (this.f7863j & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this.f7866m, f7862o);
        this.f7865l.add(new WeakReference(activity));
    }

    @Override // p000.C7564Ev0
    /* renamed from: k */
    public final SparseIntArray[] mo2452k() {
        return this.f7864k;
    }

    @Override // p000.C7564Ev0
    /* renamed from: l */
    public final SparseIntArray[] mo2453l(Activity activity) {
        ArrayList arrayList = this.f7865l;
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
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.f7866m);
        return this.f7864k;
    }

    @Override // p000.C7564Ev0
    /* renamed from: m */
    public final SparseIntArray[] mo2454m() {
        SparseIntArray[] sparseIntArrayArr = this.f7864k;
        this.f7864k = new SparseIntArray[9];
        return sparseIntArrayArr;
    }

    @Override // p000.C7564Ev0
    /* renamed from: n */
    public final SparseIntArray[] mo2455n() {
        ArrayList arrayList = this.f7865l;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            Activity activity = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.f7866m);
                arrayList.remove(size);
            }
        }
        return this.f7864k;
    }
}
