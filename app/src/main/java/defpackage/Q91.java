package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Q91 extends AbstractC4056gw0 {
    public TextureView e;
    public SurfaceTexture f;
    public C0599Hl g;
    public Z61 h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public C4290i9 l;

    @Override // defpackage.AbstractC4056gw0
    public final View e() {
        return this.e;
    }

    @Override // defpackage.AbstractC4056gw0
    public final Bitmap f() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // defpackage.AbstractC4056gw0
    public final void g() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    @Override // defpackage.AbstractC4056gw0
    public final void h() {
        this.i = true;
    }

    @Override // defpackage.AbstractC4056gw0
    public final void i(Z61 z61, C4290i9 c4290i9) {
        this.b = z61.b;
        this.l = c4290i9;
        FrameLayout frameLayout = (FrameLayout) this.c;
        frameLayout.getClass();
        ((Size) this.b).getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
        this.e.setSurfaceTextureListener(new P91(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        Z61 z612 = this.h;
        if (z612 != null) {
            z612.d();
        }
        this.h = z61;
        Executor executorC = AbstractC3556eJ.c(this.e.getContext());
        z61.k.a(new O91(this, 0, z61), executorC);
        l();
    }

    @Override // defpackage.AbstractC4056gw0
    public final InterfaceFutureC0750Jj0 k() {
        return AbstractC8171yQ1.b(new C1724Vw0(22, this));
    }

    public final void l() {
        SurfaceTexture surfaceTexture;
        Size size = (Size) this.b;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), ((Size) this.b).getHeight());
        Surface surface = new Surface(this.f);
        Z61 z61 = this.h;
        C0599Hl c0599HlB = AbstractC8171yQ1.b(new H30(this, 15, surface));
        this.g = c0599HlB;
        c0599HlB.b.d(new RunnableC6880rf(this, surface, c0599HlB, z61, 16), AbstractC3556eJ.c(this.e.getContext()));
        this.a = true;
        j();
    }
}
