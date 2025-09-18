package p000;

import java.util.Map;

/* renamed from: kc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10031kc0 implements InterfaceC8502Ww0 {

    /* renamed from: a */
    public final /* synthetic */ int f36572a;

    @Override // p000.InterfaceC1844cO
    /* renamed from: a */
    public final void mo104a(Object obj, Object obj2) {
        switch (this.f36572a) {
            case 0:
                throw new C7198yO("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC8554Xw0 interfaceC8554Xw0 = (InterfaceC8554Xw0) obj2;
                interfaceC8554Xw0.mo4359a(C8958cG0.f17401g, entry.getKey());
                interfaceC8554Xw0.mo4359a(C8958cG0.f17402h, entry.getValue());
                return;
            default:
                throw new C7198yO("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
