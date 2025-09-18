package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import p000.AbstractC9821iz0;
import p000.C4066fe;

/* loaded from: classes.dex */
class AdvancedSessionProcessor$OutputSurfaceImplAdapter implements OutputSurfaceImpl {
    private final AbstractC9821iz0 mOutputSurface;

    public AdvancedSessionProcessor$OutputSurfaceImplAdapter(AbstractC9821iz0 abstractC9821iz0) {
        this.mOutputSurface = abstractC9821iz0;
    }

    public int getImageFormat() {
        return ((C4066fe) this.mOutputSurface).f27307c;
    }

    public Size getSize() {
        return ((C4066fe) this.mOutputSurface).f27306b;
    }

    public Surface getSurface() {
        return ((C4066fe) this.mOutputSurface).f27305a;
    }
}
