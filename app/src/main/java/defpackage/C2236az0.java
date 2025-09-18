package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: az0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2236az0 extends C1964Yy0 {
    public C2236az0(int i, Surface surface) {
        super(new C2042Zy0(new OutputConfiguration(i, surface)));
    }

    @Override // defpackage.C3874fz0
    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    @Override // defpackage.C1964Yy0, defpackage.C3874fz0
    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    @Override // defpackage.C1964Yy0, defpackage.C3874fz0
    public Object c() {
        Object obj = this.a;
        AbstractC3377dM1.e(obj instanceof C2042Zy0);
        return ((C2042Zy0) obj).a;
    }

    @Override // defpackage.C1964Yy0, defpackage.C3874fz0
    public String d() {
        return ((C2042Zy0) this.a).b;
    }

    @Override // defpackage.C1964Yy0, defpackage.C3874fz0
    public final boolean f() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // defpackage.C1964Yy0, defpackage.C3874fz0
    public void g(long j) {
        ((C2042Zy0) this.a).c = j;
    }

    @Override // defpackage.C1964Yy0, defpackage.C3874fz0
    public void i(String str) {
        ((C2042Zy0) this.a).b = str;
    }
}
