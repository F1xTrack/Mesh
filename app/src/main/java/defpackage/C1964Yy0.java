package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: Yy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1964Yy0 extends C3874fz0 {
    public C1964Yy0(int i, Surface surface) {
        super(new C1886Xy0(new OutputConfiguration(i, surface)));
    }

    @Override // defpackage.C3874fz0
    public void b() {
        ((C1886Xy0) this.a).c = true;
    }

    @Override // defpackage.C3874fz0
    public Object c() {
        Object obj = this.a;
        AbstractC3377dM1.e(obj instanceof C1886Xy0);
        return ((C1886Xy0) obj).a;
    }

    @Override // defpackage.C3874fz0
    public String d() {
        return ((C1886Xy0) this.a).b;
    }

    @Override // defpackage.C3874fz0
    public final Surface e() {
        return ((OutputConfiguration) c()).getSurface();
    }

    @Override // defpackage.C3874fz0
    public boolean f() {
        return ((C1886Xy0) this.a).c;
    }

    @Override // defpackage.C3874fz0
    public void g(long j) {
        ((C1886Xy0) this.a).d = j;
    }

    @Override // defpackage.C3874fz0
    public void i(String str) {
        ((C1886Xy0) this.a).b = str;
    }
}
