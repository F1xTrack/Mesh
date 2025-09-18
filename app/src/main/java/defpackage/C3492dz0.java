package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: dz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3492dz0 extends C3302cz0 {
    public C3492dz0(int i, Surface surface) {
        super(new OutputConfiguration(i, surface));
    }

    @Override // defpackage.C3302cz0, defpackage.C2236az0, defpackage.C1964Yy0, defpackage.C3874fz0
    public final Object c() {
        Object obj = this.a;
        AbstractC3377dM1.e(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // defpackage.C3302cz0, defpackage.C2236az0, defpackage.C1964Yy0, defpackage.C3874fz0
    public final void g(long j) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j);
    }

    @Override // defpackage.C3874fz0
    public final void h(int i) {
        ((OutputConfiguration) c()).setMirrorMode(i);
    }

    @Override // defpackage.C3874fz0
    public final void j(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) c()).setStreamUseCase(j);
    }
}
