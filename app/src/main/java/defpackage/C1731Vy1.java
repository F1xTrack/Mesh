package defpackage;

import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: Vy1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1731Vy1 implements InterfaceC1802Ww0 {
    public static final /* synthetic */ C1731Vy1 b = new C1731Vy1(0);
    public static final /* synthetic */ C1731Vy1 c = new C1731Vy1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C1731Vy1(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
                Charset charset = C3303cz1.f;
                interfaceC1880Xw0.a(C3303cz1.g, entry.getKey());
                interfaceC1880Xw0.a(C3303cz1.h, entry.getValue());
                return;
            case 1:
                throw new C8163yO("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                InterfaceC1880Xw0 interfaceC1880Xw02 = (InterfaceC1880Xw0) obj2;
                interfaceC1880Xw02.a(C7386uI1.g, entry2.getKey());
                interfaceC1880Xw02.a(C7386uI1.h, entry2.getValue());
                return;
            default:
                throw new C8163yO("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
