package p000;

import android.hardware.camera2.CaptureRequest;

/* renamed from: cn */
/* loaded from: classes.dex */
public final class C1869cn implements InterfaceC7012vR {

    /* renamed from: a */
    public final /* synthetic */ int f17744a;

    /* renamed from: b */
    public final C7612Ft0 f17745b;

    public C1869cn(int i) {
        this.f17744a = i;
        switch (i) {
            case 1:
                this.f17745b = C7612Ft0.m2812b();
                break;
            default:
                this.f17745b = C7612Ft0.m2812b();
                break;
        }
    }

    /* renamed from: b */
    public static C1869cn m10866b(InterfaceC6854sw interfaceC6854sw) {
        C1869cn c1869cn = new C1869cn(1);
        interfaceC6854sw.mo4789L(new C0424Gj(c1869cn, 5, interfaceC6854sw));
        return c1869cn;
    }

    /* renamed from: a */
    public C8342Tu0 m10867a() {
        return new C8342Tu0(6, C7882Ky0.m4786a(this.f17745b));
    }

    @Override // p000.InterfaceC7012vR
    /* renamed from: c */
    public final C7612Ft0 mo4871c() {
        switch (this.f17744a) {
        }
        return this.f17745b;
    }

    /* renamed from: e */
    public void m10868e(CaptureRequest.Key key, Object obj) {
        EnumC6791rw enumC6791rw = EnumC6791rw.f42161c;
        this.f17745b.m2814d(C3950dn.m17743L0(key), enumC6791rw, obj);
    }
}
