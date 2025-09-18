package defpackage;

import java.util.Map;

/* renamed from: kc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5536kc0 implements InterfaceC1802Ww0 {
    public final /* synthetic */ int a;

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new C8163yO("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
                interfaceC1880Xw0.a(C2482cG0.g, entry.getKey());
                interfaceC1880Xw0.a(C2482cG0.h, entry.getValue());
                return;
            default:
                throw new C8163yO("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
