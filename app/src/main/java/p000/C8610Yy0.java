package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: Yy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8610Yy0 extends C9437fz0 {
    public C8610Yy0(int i, Surface surface) {
        super(new C8558Xy0(new OutputConfiguration(i, surface)));
    }

    @Override // p000.C9437fz0
    /* renamed from: b */
    public void mo9436b() {
        ((C8558Xy0) this.f27516a).f14070c = true;
    }

    @Override // p000.C9437fz0
    /* renamed from: c */
    public Object mo9437c() {
        Object obj = this.f27516a;
        AbstractC9104dM1.m17546e(obj instanceof C8558Xy0);
        return ((C8558Xy0) obj).f14068a;
    }

    @Override // p000.C9437fz0
    /* renamed from: d */
    public String mo9438d() {
        return ((C8558Xy0) this.f27516a).f14069b;
    }

    @Override // p000.C9437fz0
    /* renamed from: e */
    public final Surface mo9439e() {
        return ((OutputConfiguration) mo9437c()).getSurface();
    }

    @Override // p000.C9437fz0
    /* renamed from: f */
    public boolean mo9440f() {
        return ((C8558Xy0) this.f27516a).f14070c;
    }

    @Override // p000.C9437fz0
    /* renamed from: g */
    public void mo9441g(long j) {
        ((C8558Xy0) this.f27516a).f14071d = j;
    }

    @Override // p000.C9437fz0
    /* renamed from: i */
    public void mo9442i(String str) {
        ((C8558Xy0) this.f27516a).f14069b = str;
    }
}
