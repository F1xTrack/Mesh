package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import defpackage.C6974s81;
import defpackage.InterfaceC3415dZ0;
import defpackage.NT;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
class AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
    private final InterfaceC3415dZ0 mCaptureCallback;
    private final AdvancedSessionProcessor$ExtensionMetadataMonitor mExtensionMetadataMonitor;
    private long mOnCaptureStartedTimestamp;
    private final C6974s81 mTagBundle;
    private boolean mWillReceiveOnCaptureCompleted;

    public AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(InterfaceC3415dZ0 interfaceC3415dZ0, C6974s81 c6974s81, boolean z) {
        this(interfaceC3415dZ0, c6974s81, null, z);
    }

    public void onCaptureCompleted(long j, int i, Map<CaptureResult.Key, Object> map) {
        AdvancedSessionProcessor$ExtensionMetadataMonitor advancedSessionProcessor$ExtensionMetadataMonitor = this.mExtensionMetadataMonitor;
        if (advancedSessionProcessor$ExtensionMetadataMonitor != null) {
            advancedSessionProcessor$ExtensionMetadataMonitor.checkExtensionMetadata(map);
        }
        if (this.mWillReceiveOnCaptureCompleted) {
            this.mCaptureCallback.f(new NT(j, this.mTagBundle, map));
            this.mCaptureCallback.g();
        }
    }

    public void onCaptureFailed(int i) {
        this.mCaptureCallback.d();
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
        this.mCaptureCallback.f(new NT(this.mOnCaptureStartedTimestamp, this.mTagBundle, Collections.emptyMap()));
        this.mCaptureCallback.g();
    }

    public void onCaptureStarted(int i, long j) {
        this.mOnCaptureStartedTimestamp = j;
        this.mCaptureCallback.i();
    }

    public AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(InterfaceC3415dZ0 interfaceC3415dZ0, C6974s81 c6974s81, AdvancedSessionProcessor$ExtensionMetadataMonitor advancedSessionProcessor$ExtensionMetadataMonitor, boolean z) {
        this.mOnCaptureStartedTimestamp = -1L;
        this.mCaptureCallback = interfaceC3415dZ0;
        this.mTagBundle = c6974s81;
        this.mExtensionMetadataMonitor = advancedSessionProcessor$ExtensionMetadataMonitor;
        this.mWillReceiveOnCaptureCompleted = z;
    }
}
