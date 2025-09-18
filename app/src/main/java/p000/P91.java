package p000;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P91 implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ Q91 f8878a;

    public P91(Q91 q91) {
        this.f8878a = q91;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC7806Jm0.m4412f("TextureViewImpl");
        Q91 q91 = this.f8878a;
        q91.f9505f = surfaceTexture;
        if (q91.f9506g == null) {
            q91.m6594l();
            return;
        }
        q91.f9507h.getClass();
        Objects.toString(q91.f9507h);
        AbstractC7806Jm0.m4412f("TextureViewImpl");
        q91.f9507h.f14748l.mo6573a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Q91 q91 = this.f8878a;
        q91.f9505f = null;
        C0489Hl c0489Hl = q91.f9506g;
        if (c0489Hl == null) {
            AbstractC7806Jm0.m4412f("TextureViewImpl");
            return true;
        }
        AbstractC8301Sz1.m7478a(c0489Hl, new C1339VH(this, 23, surfaceTexture), AbstractC3982eJ.m17901c(q91.f9504e.getContext()));
        q91.f9509j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC7806Jm0.m4412f("TextureViewImpl");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C0300El c0300El = (C0300El) this.f8878a.f9510k.getAndSet(null);
        if (c0300El != null) {
            c0300El.m2375b(null);
        }
    }
}
