package p000;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;

/* renamed from: bq */
/* loaded from: classes.dex */
public final class C1810bq {

    /* renamed from: b */
    public final ImageWriter f17175b;

    /* renamed from: c */
    public final X11 f17176c;

    /* renamed from: e */
    public final Surface f17178e;

    /* renamed from: f */
    public final boolean f17179f;

    /* renamed from: g */
    public final boolean f17180g;

    /* renamed from: a */
    public final Object f17174a = new Object();

    /* renamed from: d */
    public boolean f17177d = false;

    /* renamed from: h */
    public long f17181h = -1;

    public C1810bq(Surface surface, Size size, boolean z) {
        this.f17180g = z;
        boolean z2 = AbstractC6878tJ.f42992a.m17864z0(CaptureOutputSurfaceOccupiedQuirk.class) != null || z;
        this.f17179f = z2;
        if (Build.VERSION.SDK_INT < 29 || !z2) {
            this.f17178e = surface;
            this.f17176c = null;
            this.f17175b = null;
        } else {
            AbstractC7806Jm0.m4412f("CaptureOutputSurface");
            X11 x11M18702a = AbstractC9575h22.m18702a(size.getWidth(), size.getHeight(), 35, 2);
            this.f17176c = x11M18702a;
            this.f17178e = x11M18702a.mo4044h();
            this.f17175b = ImageWriter.newInstance(surface, 2, 35);
            x11M18702a.mo4047k(new C0071B7(16, this), QR1.m6703a());
        }
    }

    /* renamed from: a */
    public final void m10525a() {
        synchronized (this.f17174a) {
            try {
                this.f17177d = true;
                if (Build.VERSION.SDK_INT >= 29 && this.f17179f) {
                    this.f17176c.mo4042f();
                    this.f17176c.close();
                    this.f17175b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final Surface m10526b() {
        return this.f17178e;
    }
}
