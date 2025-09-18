package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: cz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9053cz0 extends C8792az0 {
    public C9053cz0(int i, Surface surface) {
        super(new C8920bz0(new OutputConfiguration(i, surface)));
    }

    @Override // p000.C8792az0, p000.C8610Yy0, p000.C9437fz0
    /* renamed from: c */
    public Object mo9437c() {
        Object obj = this.f27516a;
        AbstractC9104dM1.m17546e(obj instanceof C8920bz0);
        return ((C8920bz0) obj).f17249a;
    }

    @Override // p000.C8792az0, p000.C8610Yy0, p000.C9437fz0
    /* renamed from: d */
    public final String mo9438d() {
        return null;
    }

    @Override // p000.C8792az0, p000.C8610Yy0, p000.C9437fz0
    /* renamed from: g */
    public void mo9441g(long j) {
        ((C8920bz0) this.f27516a).f17250b = j;
    }

    @Override // p000.C8792az0, p000.C8610Yy0, p000.C9437fz0
    /* renamed from: i */
    public final void mo9442i(String str) {
        ((OutputConfiguration) mo9437c()).setPhysicalCameraId(str);
    }
}
