package p000;

import androidx.camera.core.ImageProcessingUtil;

/* renamed from: e70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9201e70 implements InterfaceC7144xX {

    /* renamed from: a */
    public final /* synthetic */ int f26544a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9457g70 f26545b;

    public /* synthetic */ C9201e70(InterfaceC9457g70 interfaceC9457g70, InterfaceC9457g70 interfaceC9457g702, int i) {
        this.f26544a = i;
        this.f26545b = interfaceC9457g702;
    }

    @Override // p000.InterfaceC7144xX
    /* renamed from: b */
    public final void mo4038b(AbstractC7207yX abstractC7207yX) throws Exception {
        InterfaceC9457g70 interfaceC9457g70 = this.f26545b;
        switch (this.f26544a) {
            case 0:
                int i = ImageProcessingUtil.f15955a;
                if (interfaceC9457g70 != null) {
                    interfaceC9457g70.close();
                    break;
                }
                break;
            default:
                int i2 = ImageProcessingUtil.f15955a;
                interfaceC9457g70.close();
                break;
        }
    }
}
