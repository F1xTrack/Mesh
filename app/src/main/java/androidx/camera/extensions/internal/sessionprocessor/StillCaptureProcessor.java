package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000.AbstractC0783MR;
import p000.AbstractC7806Jm0;
import p000.AbstractC9104dM1;
import p000.AbstractC9821iz0;
import p000.C1299Ue;
import p000.C1810bq;
import p000.C3952dq;
import p000.C4018et;
import p000.C9385fZ0;
import p000.InterfaceC10097l70;
import p000.InterfaceC3890cq;
import p000.QR1;

/* loaded from: classes.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    C1810bq mCaptureOutputSurface;
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;
    final C3952dq mCaptureResultImageMatcher = new C3952dq();
    final Object mLock = new Object();
    HashMap<Integer, Pair<InterfaceC10097l70, TotalCaptureResult>> mCaptureResults = new HashMap<>();
    OnCaptureResultCallback mOnCaptureResultCallback = null;
    TotalCaptureResult mSourceCaptureResult = null;
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$1 */
    public class C16941 implements ProcessResultImpl {
        final /* synthetic */ OnCaptureResultCallback val$onCaptureResultCallback;

        public C16941(OnCaptureResultCallback onCaptureResultCallback) {
            onCaptureResultCallback = onCaptureResultCallback;
        }

        public void onCaptureCompleted(long j, List<Pair<CaptureResult.Key, Object>> list) {
            onCaptureResultCallback.onCaptureCompleted(j, list);
        }

        public void onCaptureProcessProgressed(int i) {
            onCaptureResultCallback.onCaptureProcessProgressed(i);
        }
    }

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$2 */
    public class C16952 implements ProcessResultImpl {
        final /* synthetic */ OnCaptureResultCallback val$onCaptureResultCallback;

        public C16952(OnCaptureResultCallback onCaptureResultCallback) {
            onCaptureResultCallback = onCaptureResultCallback;
        }

        public void onCaptureCompleted(long j, List<Pair<CaptureResult.Key, Object>> list) {
            onCaptureResultCallback.onCaptureCompleted(j, list);
        }

        public void onCaptureProcessProgressed(int i) {
            onCaptureResultCallback.onCaptureProcessProgressed(i);
        }
    }

    public interface OnCaptureResultCallback {
        void onCaptureCompleted(long j, List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i);

        void onError(Exception exc);

        void onProcessCompleted();
    }

    public StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size, AbstractC9821iz0 abstractC9821iz0, boolean z) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        C1810bq c1810bq = new C1810bq(surface, size, z);
        this.mCaptureOutputSurface = c1810bq;
        captureProcessorImpl.onOutputSurface(c1810bq.m10526b(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = abstractC9821iz0 != null;
        if (abstractC9821iz0 != null) {
            C1299Ue c1299Ue = C1299Ue.f11948i;
            if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) {
                AbstractC9104dM1.m17546e(abstractC9821iz0.mo18263a() == 35);
                captureProcessorImpl.onResolutionUpdate(size, abstractC9821iz0.mo18264b());
                captureProcessorImpl.onPostviewOutputSurface(abstractC9821iz0.mo18265c());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX WARN: Finally extract failed */
    public /* synthetic */ void lambda$process$1(boolean z, HashMap map, OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                    } catch (Exception e) {
                        AbstractC7806Jm0.m4409c(TAG);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e);
                        }
                        AbstractC7806Jm0.m4407a(TAG);
                        OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback2 != null) {
                            onCaptureResultCallback2.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                    }
                    if (this.mIsClosed) {
                        AbstractC7806Jm0.m4407a(TAG);
                        AbstractC7806Jm0.m4407a(TAG);
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                        return;
                    }
                    AbstractC7806Jm0.m4407a(TAG);
                    C1299Ue c1299Ue = C1299Ue.f11948i;
                    if (AbstractC0783MR.m5368h(c1299Ue) && C4018et.m18064d(c1299Ue) && z && this.mIsPostviewConfigured) {
                        this.mCaptureProcessorImpl.processWithPostview(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                            final /* synthetic */ OnCaptureResultCallback val$onCaptureResultCallback;

                            public C16941(OnCaptureResultCallback onCaptureResultCallback4) {
                                onCaptureResultCallback = onCaptureResultCallback4;
                            }

                            public void onCaptureCompleted(long j, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureCompleted(j, list);
                            }

                            public void onCaptureProcessProgressed(int i) {
                                onCaptureResultCallback.onCaptureProcessProgressed(i);
                            }
                        }, QR1.m6703a());
                    } else {
                        C1299Ue c1299Ue2 = C1299Ue.f11947h;
                        if (AbstractC0783MR.m5368h(c1299Ue2) && C4018et.m18064d(c1299Ue2)) {
                            this.mCaptureProcessorImpl.process(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                final /* synthetic */ OnCaptureResultCallback val$onCaptureResultCallback;

                                public C16952(OnCaptureResultCallback onCaptureResultCallback4) {
                                    onCaptureResultCallback = onCaptureResultCallback4;
                                }

                                public void onCaptureCompleted(long j, List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j, list);
                                }

                                public void onCaptureProcessProgressed(int i) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i);
                                }
                            }, QR1.m6703a());
                        } else {
                            this.mCaptureProcessorImpl.process(map);
                        }
                    }
                    AbstractC7806Jm0.m4407a(TAG);
                    OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback4 != null) {
                        onCaptureResultCallback4.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                } catch (Throwable th) {
                    AbstractC7806Jm0.m4407a(TAG);
                    OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback5 != null) {
                        onCaptureResultCallback5.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void lambda$startCapture$0(List list, OnCaptureResultCallback onCaptureResultCallback, boolean z, InterfaceC10097l70 interfaceC10097l70, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    ((C9385fZ0) interfaceC10097l70).m18258a();
                    AbstractC7806Jm0.m4412f(TAG);
                    return;
                }
                AbstractC7806Jm0.m4412f(TAG);
                this.mCaptureResults.put(Integer.valueOf(i), new Pair<>(interfaceC10097l70, totalCaptureResult));
                Objects.toString(this.mCaptureResults.keySet());
                AbstractC7806Jm0.m4412f(TAG);
                if (this.mCaptureResults.keySet().containsAll(list)) {
                    process(this.mCaptureResults, onCaptureResultCallback, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<InterfaceC10097l70, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((C9385fZ0) ((InterfaceC10097l70) it.next().first)).m18258a();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            AbstractC7806Jm0.m4412f(TAG);
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.m17760c();
            this.mCaptureResultImageMatcher.m17759b();
            this.mCaptureOutputSurface.m10525a();
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult, int i) {
        Long l;
        this.mCaptureResultImageMatcher.m17758a(totalCaptureResult, i);
        if (this.mTimeStampForOutputImage == -1 && (l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long jLongValue = l.longValue();
            this.mTimeStampForOutputImage = jLongValue;
            C1810bq c1810bq = this.mCaptureOutputSurface;
            if (c1810bq.f17180g) {
                c1810bq.f17181h = jLongValue;
            }
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyImage(InterfaceC10097l70 interfaceC10097l70) {
        this.mCaptureResultImageMatcher.m17761d(interfaceC10097l70);
    }

    public void process(Map<Integer, Pair<InterfaceC10097l70, TotalCaptureResult>> map, final OnCaptureResultCallback onCaptureResultCallback, final boolean z) {
        final HashMap map2 = new HashMap();
        synchronized (this.mLock) {
            try {
                for (Integer num : map.keySet()) {
                    Pair<InterfaceC10097l70, TotalCaptureResult> pair = map.get(num);
                    map2.put(num, new Pair(((C9385fZ0) ((InterfaceC10097l70) pair.first)).f27236b, (TotalCaptureResult) pair.second));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        QR1.m6709g().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f16019a.lambda$process$1(z, map2, onCaptureResultCallback);
            }
        });
    }

    public void startCapture(final boolean z, final List<Integer> list, final OnCaptureResultCallback onCaptureResultCallback) {
        AbstractC7806Jm0.m4412f(TAG);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            AbstractC9104dM1.m17550i(!this.mIsClosed, "StillCaptureProcessor is closed. Can't invoke startCapture()");
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.m17759b();
        this.mCaptureResultImageMatcher.m17765h(new InterfaceC3890cq() { // from class: androidx.camera.extensions.internal.sessionprocessor.k
            @Override // p000.InterfaceC3890cq
            /* renamed from: a */
            public final void mo9925a(InterfaceC10097l70 interfaceC10097l70, TotalCaptureResult totalCaptureResult, int i) {
                this.f16023a.lambda$startCapture$0(list, onCaptureResultCallback, z, interfaceC10097l70, totalCaptureResult, i);
            }
        });
    }
}
