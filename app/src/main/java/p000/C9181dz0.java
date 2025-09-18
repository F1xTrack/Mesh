package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: dz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9181dz0 extends C9053cz0 {
    public C9181dz0(int i, Surface surface) {
        super(new OutputConfiguration(i, surface));
    }

    @Override // p000.C9053cz0, p000.C8792az0, p000.C8610Yy0, p000.C9437fz0
    /* renamed from: c */
    public final Object mo9437c() {
        Object obj = this.f27516a;
        AbstractC9104dM1.m17546e(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // p000.C9053cz0, p000.C8792az0, p000.C8610Yy0, p000.C9437fz0
    /* renamed from: g */
    public final void mo9441g(long j) {
        ((OutputConfiguration) mo9437c()).setDynamicRangeProfile(j);
    }

    @Override // p000.C9437fz0
    /* renamed from: h */
    public final void mo17807h(int i) {
        ((OutputConfiguration) mo9437c()).setMirrorMode(i);
    }

    @Override // p000.C9437fz0
    /* renamed from: j */
    public final void mo17808j(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) mo9437c()).setStreamUseCase(j);
    }
}
