package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import java.util.Collections;
import java.util.Map;
import p000.C0848NT;
import p000.C10996s81;
import p000.InterfaceC9129dZ0;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter */
/* loaded from: classes.dex */
class C1692xa6b766a6 implements SessionProcessorImpl.CaptureCallback {
    private final InterfaceC9129dZ0 mCaptureCallback;
    private final AdvancedSessionProcessor$ExtensionMetadataMonitor mExtensionMetadataMonitor;
    private long mOnCaptureStartedTimestamp;
    private final C10996s81 mTagBundle;
    private boolean mWillReceiveOnCaptureCompleted;

    public C1692xa6b766a6(InterfaceC9129dZ0 interfaceC9129dZ0, C10996s81 c10996s81, boolean z) {
        this(interfaceC9129dZ0, c10996s81, null, z);
    }

    public void onCaptureCompleted(long j, int i, Map<CaptureResult.Key, Object> map) {
        AdvancedSessionProcessor$ExtensionMetadataMonitor advancedSessionProcessor$ExtensionMetadataMonitor = this.mExtensionMetadataMonitor;
        if (advancedSessionProcessor$ExtensionMetadataMonitor != null) {
            advancedSessionProcessor$ExtensionMetadataMonitor.checkExtensionMetadata(map);
        }
        if (this.mWillReceiveOnCaptureCompleted) {
            this.mCaptureCallback.mo8494f(new C0848NT(j, this.mTagBundle, map));
            this.mCaptureCallback.mo8496g();
        }
    }

    public void onCaptureFailed(int i) {
        this.mCaptureCallback.mo8492d();
    }

    public void onCaptureProcessProgressed(int i) {
        this.mCaptureCallback.onCaptureProcessProgressed(i);
    }

    public void onCaptureProcessStarted(int i) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureSequenceAborted(int i) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureSequenceCompleted(int i) {
        if (this.mWillReceiveOnCaptureCompleted) {
            return;
        }
        this.mCaptureCallback.mo8494f(new C0848NT(this.mOnCaptureStartedTimestamp, this.mTagBundle, Collections.emptyMap()));
        this.mCaptureCallback.mo8496g();
    }

    public void onCaptureStarted(int i, long j) {
        this.mOnCaptureStartedTimestamp = j;
        this.mCaptureCallback.mo8499i();
    }

    public C1692xa6b766a6(InterfaceC9129dZ0 interfaceC9129dZ0, C10996s81 c10996s81, AdvancedSessionProcessor$ExtensionMetadataMonitor advancedSessionProcessor$ExtensionMetadataMonitor, boolean z) {
        this.mOnCaptureStartedTimestamp = -1L;
        this.mCaptureCallback = interfaceC9129dZ0;
        this.mTagBundle = c10996s81;
        this.mExtensionMetadataMonitor = advancedSessionProcessor$ExtensionMetadataMonitor;
        this.mWillReceiveOnCaptureCompleted = z;
    }
}
