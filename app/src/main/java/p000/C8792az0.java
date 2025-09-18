package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: az0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8792az0 extends C8610Yy0 {
    public C8792az0(int i, Surface surface) {
        super(new C8662Zy0(new OutputConfiguration(i, surface)));
    }

    @Override // p000.C9437fz0
    /* renamed from: a */
    public final void mo10397a(Surface surface) {
        ((OutputConfiguration) mo9437c()).addSurface(surface);
    }

    @Override // p000.C8610Yy0, p000.C9437fz0
    /* renamed from: b */
    public final void mo9436b() {
        ((OutputConfiguration) mo9437c()).enableSurfaceSharing();
    }

    @Override // p000.C8610Yy0, p000.C9437fz0
    /* renamed from: c */
    public Object mo9437c() {
        Object obj = this.f27516a;
        AbstractC9104dM1.m17546e(obj instanceof C8662Zy0);
        return ((C8662Zy0) obj).f15242a;
    }

    @Override // p000.C8610Yy0, p000.C9437fz0
    /* renamed from: d */
    public String mo9438d() {
        return ((C8662Zy0) this.f27516a).f15243b;
    }

    @Override // p000.C8610Yy0, p000.C9437fz0
    /* renamed from: f */
    public final boolean mo9440f() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // p000.C8610Yy0, p000.C9437fz0
    /* renamed from: g */
    public void mo9441g(long j) {
        ((C8662Zy0) this.f27516a).f15244c = j;
    }

    @Override // p000.C8610Yy0, p000.C9437fz0
    /* renamed from: i */
    public void mo9442i(String str) {
        ((C8662Zy0) this.f27516a).f15243b = str;
    }
}
