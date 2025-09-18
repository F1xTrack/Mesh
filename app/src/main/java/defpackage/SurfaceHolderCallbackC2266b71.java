package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* renamed from: b71 */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC2266b71 implements SurfaceHolder.Callback {
    public Size a;
    public Z61 b;
    public Z61 c;
    public C4290i9 d;
    public Size e;
    public boolean f = false;
    public boolean g = false;
    public final /* synthetic */ C2456c71 h;

    public SurfaceHolderCallbackC2266b71(C2456c71 c2456c71) {
        this.h = c2456c71;
    }

    public final boolean a() {
        C2456c71 c2456c71 = this.h;
        Surface surface = c2456c71.e.getHolder().getSurface();
        if (this.f || this.b == null || !Objects.equals(this.a, this.e)) {
            return false;
        }
        AbstractC0759Jm0.f("SurfaceViewImpl");
        C4290i9 c4290i9 = this.d;
        Z61 z61 = this.b;
        Objects.requireNonNull(z61);
        z61.b(surface, AbstractC3556eJ.c(c2456c71.e.getContext()), new WN0(2, c4290i9));
        this.f = true;
        c2456c71.a = true;
        c2456c71.j();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AbstractC0759Jm0.f("SurfaceViewImpl");
        this.e = new Size(i2, i3);
        a();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Z61 z61;
        AbstractC0759Jm0.f("SurfaceViewImpl");
        if (!this.g || (z61 = this.c) == null) {
            return;
        }
        z61.d();
        z61.j.b(null);
        this.c = null;
        this.g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC0759Jm0.f("SurfaceViewImpl");
        if (this.f) {
            Z61 z61 = this.b;
            if (z61 != null) {
                Objects.toString(z61);
                AbstractC0759Jm0.f("SurfaceViewImpl");
                this.b.l.a();
            }
        } else {
            Z61 z612 = this.b;
            if (z612 != null) {
                Objects.toString(z612);
                AbstractC0759Jm0.f("SurfaceViewImpl");
                this.b.d();
            }
        }
        this.g = true;
        Z61 z613 = this.b;
        if (z613 != null) {
            this.c = z613;
        }
        this.f = false;
        this.b = null;
        this.d = null;
        this.e = null;
        this.a = null;
    }
}
