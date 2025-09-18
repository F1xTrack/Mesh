package defpackage;

import android.hardware.camera2.CaptureRequest;

/* renamed from: cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2580cn implements InterfaceC7602vR {
    public final /* synthetic */ int a;
    public final C0468Ft0 b;

    public C2580cn(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = C0468Ft0.b();
                break;
            default:
                this.b = C0468Ft0.b();
                break;
        }
    }

    public static C2580cn b(InterfaceC7122sw interfaceC7122sw) {
        C2580cn c2580cn = new C2580cn(1);
        interfaceC7122sw.L(new C0515Gj(c2580cn, 5, interfaceC7122sw));
        return c2580cn;
    }

    public C1562Tu0 a() {
        return new C1562Tu0(6, C0873Ky0.a(this.b));
    }

    @Override // defpackage.InterfaceC7602vR
    public final C0468Ft0 c() {
        switch (this.a) {
        }
        return this.b;
    }

    public void e(CaptureRequest.Key key, Object obj) {
        EnumC6931rw enumC6931rw = EnumC6931rw.c;
        this.b.d(C3456dn.L0(key), enumC6931rw, obj);
    }
}
