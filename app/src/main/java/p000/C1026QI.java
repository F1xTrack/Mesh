package p000;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: QI */
/* loaded from: classes2.dex */
public final class C1026QI extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f9559e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC8418Vg0 f9560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1026QI(int i, InterfaceC6434mZ interfaceC6434mZ) {
        super(0);
        this.f9559e = i;
        switch (i) {
            case 1:
                this.f9560f = (AbstractC8418Vg0) interfaceC6434mZ;
                super(0);
                break;
            default:
                this.f9560f = (AbstractC8418Vg0) interfaceC6434mZ;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Vg0, mZ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Vg0, mZ] */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f9559e) {
            case 0:
                return AbstractC7167xu.m25987g0((Iterable) this.f9560f.invoke());
            default:
                try {
                    return (List) this.f9560f.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C0779MN.f7117a;
                }
        }
    }
}
