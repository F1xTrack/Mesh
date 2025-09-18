package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* renamed from: e70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3521e70 implements InterfaceC8000xX {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC3903g70 b;

    public /* synthetic */ C3521e70(InterfaceC3903g70 interfaceC3903g70, InterfaceC3903g70 interfaceC3903g702, int i) {
        this.a = i;
        this.b = interfaceC3903g702;
    }

    @Override // defpackage.InterfaceC8000xX
    public final void b(AbstractC8190yX abstractC8190yX) throws Exception {
        InterfaceC3903g70 interfaceC3903g70 = this.b;
        switch (this.a) {
            case 0:
                int i = ImageProcessingUtil.a;
                if (interfaceC3903g70 != null) {
                    interfaceC3903g70.close();
                    break;
                }
                break;
            default:
                int i2 = ImageProcessingUtil.a;
                interfaceC3903g70.close();
                break;
        }
    }
}
