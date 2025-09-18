package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: cz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3302cz0 extends C2236az0 {
    public C3302cz0(int i, Surface surface) {
        super(new C2426bz0(new OutputConfiguration(i, surface)));
    }

    @Override // defpackage.C2236az0, defpackage.C1964Yy0, defpackage.C3874fz0
    public Object c() {
        Object obj = this.a;
        AbstractC3377dM1.e(obj instanceof C2426bz0);
        return ((C2426bz0) obj).a;
    }

    @Override // defpackage.C2236az0, defpackage.C1964Yy0, defpackage.C3874fz0
    public final String d() {
        return null;
    }

    @Override // defpackage.C2236az0, defpackage.C1964Yy0, defpackage.C3874fz0
    public void g(long j) {
        ((C2426bz0) this.a).b = j;
    }

    @Override // defpackage.C2236az0, defpackage.C1964Yy0, defpackage.C3874fz0
    public final void i(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }
}
