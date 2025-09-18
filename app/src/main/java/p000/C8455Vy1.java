package p000;

import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: Vy1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C8455Vy1 implements InterfaceC8502Ww0 {

    /* renamed from: b */
    public static final /* synthetic */ C8455Vy1 f12893b = new C8455Vy1(0);

    /* renamed from: c */
    public static final /* synthetic */ C8455Vy1 f12894c = new C8455Vy1(1);

    /* renamed from: a */
    public final /* synthetic */ int f12895a;

    public /* synthetic */ C8455Vy1(int i) {
        this.f12895a = i;
    }

    @Override // p000.InterfaceC1844cO
    /* renamed from: a */
    public final void mo104a(Object obj, Object obj2) {
        switch (this.f12895a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC8554Xw0 interfaceC8554Xw0 = (InterfaceC8554Xw0) obj2;
                Charset charset = C9054cz1.f25740f;
                interfaceC8554Xw0.mo4359a(C9054cz1.f25741g, entry.getKey());
                interfaceC8554Xw0.mo4359a(C9054cz1.f25742h, entry.getValue());
                return;
            case 1:
                throw new C7198yO("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                InterfaceC8554Xw0 interfaceC8554Xw02 = (InterfaceC8554Xw0) obj2;
                interfaceC8554Xw02.mo4359a(C11272uI1.f43636g, entry2.getKey());
                interfaceC8554Xw02.mo4359a(C11272uI1.f43637h, entry2.getValue());
                return;
            default:
                throw new C7198yO("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
