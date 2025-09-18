package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P91 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ Q91 a;

    public P91(Q91 q91) {
        this.a = q91;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC0759Jm0.f("TextureViewImpl");
        Q91 q91 = this.a;
        q91.f = surfaceTexture;
        if (q91.g == null) {
            q91.l();
            return;
        }
        q91.h.getClass();
        Objects.toString(q91.h);
        AbstractC0759Jm0.f("TextureViewImpl");
        q91.h.l.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Q91 q91 = this.a;
        q91.f = null;
        C0599Hl c0599Hl = q91.g;
        if (c0599Hl == null) {
            AbstractC0759Jm0.f("TextureViewImpl");
            return true;
        }
        AbstractC1500Sz1.a(c0599Hl, new VH(this, 23, surfaceTexture), AbstractC3556eJ.c(q91.e.getContext()));
        q91.j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC0759Jm0.f("TextureViewImpl");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C0365El c0365El = (C0365El) this.a.k.getAndSet(null);
        if (c0365El != null) {
            c0365El.b(null);
        }
    }
}
