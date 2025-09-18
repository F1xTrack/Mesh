package defpackage;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;

/* renamed from: bq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2399bq {
    public final ImageWriter b;
    public final X11 c;
    public final Surface e;
    public final boolean f;
    public final boolean g;
    public final Object a = new Object();
    public boolean d = false;
    public long h = -1;

    public C2399bq(Surface surface, Size size, boolean z) {
        this.g = z;
        boolean z2 = AbstractC7196tJ.a.z0(CaptureOutputSurfaceOccupiedQuirk.class) != null || z;
        this.f = z2;
        if (Build.VERSION.SDK_INT < 29 || !z2) {
            this.e = surface;
            this.c = null;
            this.b = null;
        } else {
            AbstractC0759Jm0.f("CaptureOutputSurface");
            X11 x11A = AbstractC4079h22.a(size.getWidth(), size.getHeight(), 35, 2);
            this.c = x11A;
            this.e = x11A.h();
            this.b = ImageWriter.newInstance(surface, 2, 35);
            x11A.k(new B7(16, this), QR1.a());
        }
    }

    public final void a() {
        synchronized (this.a) {
            try {
                this.d = true;
                if (Build.VERSION.SDK_INT >= 29 && this.f) {
                    this.c.f();
                    this.c.close();
                    this.b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Surface b() {
        return this.e;
    }
}
