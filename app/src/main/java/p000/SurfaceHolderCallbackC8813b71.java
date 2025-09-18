package p000;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* renamed from: b71 */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC8813b71 implements SurfaceHolder.Callback {

    /* renamed from: a */
    public Size f16809a;

    /* renamed from: b */
    public Z61 f16810b;

    /* renamed from: c */
    public Z61 f16811c;

    /* renamed from: d */
    public C4224i9 f16812d;

    /* renamed from: e */
    public Size f16813e;

    /* renamed from: f */
    public boolean f16814f = false;

    /* renamed from: g */
    public boolean f16815g = false;

    /* renamed from: h */
    public final /* synthetic */ C8941c71 f16816h;

    public SurfaceHolderCallbackC8813b71(C8941c71 c8941c71) {
        this.f16816h = c8941c71;
    }

    /* renamed from: a */
    public final boolean m10422a() {
        C8941c71 c8941c71 = this.f16816h;
        Surface surface = c8941c71.f17329e.getHolder().getSurface();
        if (this.f16814f || this.f16810b == null || !Objects.equals(this.f16809a, this.f16813e)) {
            return false;
        }
        AbstractC7806Jm0.m4412f("SurfaceViewImpl");
        C4224i9 c4224i9 = this.f16812d;
        Z61 z61 = this.f16810b;
        Objects.requireNonNull(z61);
        z61.m9491b(surface, AbstractC3982eJ.m17901c(c8941c71.f17329e.getContext()), new WN0(2, c4224i9));
        this.f16814f = true;
        c8941c71.f28104a = true;
        c8941c71.m18677j();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AbstractC7806Jm0.m4412f("SurfaceViewImpl");
        this.f16813e = new Size(i2, i3);
        m10422a();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Z61 z61;
        AbstractC7806Jm0.m4412f("SurfaceViewImpl");
        if (!this.f16815g || (z61 = this.f16811c) == null) {
            return;
        }
        z61.m9493d();
        z61.f14746j.m2375b(null);
        this.f16811c = null;
        this.f16815g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC7806Jm0.m4412f("SurfaceViewImpl");
        if (this.f16814f) {
            Z61 z61 = this.f16810b;
            if (z61 != null) {
                Objects.toString(z61);
                AbstractC7806Jm0.m4412f("SurfaceViewImpl");
                this.f16810b.f14748l.mo6573a();
            }
        } else {
            Z61 z612 = this.f16810b;
            if (z612 != null) {
                Objects.toString(z612);
                AbstractC7806Jm0.m4412f("SurfaceViewImpl");
                this.f16810b.m9493d();
            }
        }
        this.f16815g = true;
        Z61 z613 = this.f16810b;
        if (z613 != null) {
            this.f16811c = z613;
        }
        this.f16814f = false;
        this.f16810b = null;
        this.f16812d = null;
        this.f16813e = null;
        this.f16809a = null;
    }
}
