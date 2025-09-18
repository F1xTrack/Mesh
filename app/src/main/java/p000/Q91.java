package p000;

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
public final class Q91 extends AbstractC9559gw0 {

    /* renamed from: e */
    public TextureView f9504e;

    /* renamed from: f */
    public SurfaceTexture f9505f;

    /* renamed from: g */
    public C0489Hl f9506g;

    /* renamed from: h */
    public Z61 f9507h;

    /* renamed from: i */
    public boolean f9508i;

    /* renamed from: j */
    public SurfaceTexture f9509j;

    /* renamed from: k */
    public AtomicReference f9510k;

    /* renamed from: l */
    public C4224i9 f9511l;

    @Override // p000.AbstractC9559gw0
    /* renamed from: e */
    public final View mo6588e() {
        return this.f9504e;
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: f */
    public final Bitmap mo6589f() {
        TextureView textureView = this.f9504e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f9504e.getBitmap();
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: g */
    public final void mo6590g() {
        if (!this.f9508i || this.f9509j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f9504e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f9509j;
        if (surfaceTexture != surfaceTexture2) {
            this.f9504e.setSurfaceTexture(surfaceTexture2);
            this.f9509j = null;
            this.f9508i = false;
        }
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: h */
    public final void mo6591h() {
        this.f9508i = true;
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: i */
    public final void mo6592i(Z61 z61, C4224i9 c4224i9) {
        this.f28105b = z61.f14738b;
        this.f9511l = c4224i9;
        FrameLayout frameLayout = (FrameLayout) this.f28106c;
        frameLayout.getClass();
        ((Size) this.f28105b).getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f9504e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.f28105b).getWidth(), ((Size) this.f28105b).getHeight()));
        this.f9504e.setSurfaceTextureListener(new P91(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f9504e);
        Z61 z612 = this.f9507h;
        if (z612 != null) {
            z612.m9493d();
        }
        this.f9507h = z61;
        Executor executorM17901c = AbstractC3982eJ.m17901c(this.f9504e.getContext());
        z61.f14747k.m2374a(new O91(this, 0, z61), executorM17901c);
        m6594l();
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: k */
    public final InterfaceFutureC7800Jj0 mo6593k() {
        return AbstractC11797yQ1.m26149b(new C8450Vw0(22, this));
    }

    /* renamed from: l */
    public final void m6594l() {
        SurfaceTexture surfaceTexture;
        Size size = (Size) this.f28105b;
        if (size == null || (surfaceTexture = this.f9505f) == null || this.f9507h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), ((Size) this.f28105b).getHeight());
        Surface surface = new Surface(this.f9505f);
        Z61 z61 = this.f9507h;
        C0489Hl c0489HlM26149b = AbstractC11797yQ1.m26149b(new H30(this, 15, surface));
        this.f9506g = c0489HlM26149b;
        c0489HlM26149b.f4484b.mo2494d(new RunnableC6757rf(this, surface, c0489HlM26149b, z61, 16), AbstractC3982eJ.m17901c(this.f9504e.getContext()));
        this.f28104a = true;
        m18677j();
    }
}
