package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import java.util.List;
import p000.AbstractC0783MR;
import p000.AbstractC7806Jm0;
import p000.C1299Ue;
import p000.C3952dq;
import p000.C4018et;
import p000.C9385fZ0;
import p000.InterfaceC10097l70;
import p000.InterfaceC3890cq;
import p000.QR1;

/* loaded from: classes.dex */
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";
    private final PreviewImageProcessorImpl mPreviewImageProcessor;
    private final C3952dq mCaptureResultImageMatcher = new C3952dq();
    private final Object mLock = new Object();
    private boolean mIsClosed = false;
    private boolean mIsPaused = false;

    public interface OnCaptureResultCallback {
        void onCaptureResult(long j, List<Pair<CaptureResult.Key, Object>> list);
    }

    public PreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl, Surface surface, Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, InterfaceC10097l70 interfaceC10097l70, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed || this.mIsPaused) {
                    ((C9385fZ0) interfaceC10097l70).m18258a();
                    AbstractC7806Jm0.m4407a(TAG);
                    return;
                }
                try {
                    C1299Ue c1299Ue = C1299Ue.f11947h;
                    if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) {
                        this.mPreviewImageProcessor.process(((C9385fZ0) interfaceC10097l70).m18259b(), totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                            public void onCaptureCompleted(long j, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureResult(j, list);
                            }

                            public void onCaptureProcessProgressed(int i2) {
                            }
                        }, QR1.m6709g());
                    } else {
                        this.mPreviewImageProcessor.process(((C9385fZ0) interfaceC10097l70).m18259b(), totalCaptureResult);
                    }
                    ((C9385fZ0) interfaceC10097l70).m18258a();
                } catch (Throwable th) {
                    ((C9385fZ0) interfaceC10097l70).m18258a();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.m17759b();
            this.mCaptureResultImageMatcher.m17760c();
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.m17758a(totalCaptureResult, 0);
    }

    public void notifyImage(InterfaceC10097l70 interfaceC10097l70) {
        this.mCaptureResultImageMatcher.m17761d(interfaceC10097l70);
    }

    public void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    public void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    public void start(final OnCaptureResultCallback onCaptureResultCallback) {
        this.mCaptureResultImageMatcher.m17765h(new InterfaceC3890cq() { // from class: androidx.camera.extensions.internal.sessionprocessor.i
            @Override // p000.InterfaceC3890cq
            /* renamed from: a */
            public final void mo9925a(InterfaceC10097l70 interfaceC10097l70, TotalCaptureResult totalCaptureResult, int i) {
                this.f16017a.lambda$start$0(onCaptureResultCallback, interfaceC10097l70, totalCaptureResult, i);
            }
        });
    }
}
