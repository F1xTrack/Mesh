package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes2.dex */
public final class QI extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ AbstractC1676Vg0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QI(int i, InterfaceC5908mZ interfaceC5908mZ) {
        super(0);
        this.e = i;
        switch (i) {
            case 1:
                this.f = (AbstractC1676Vg0) interfaceC5908mZ;
                super(0);
                break;
            default:
                this.f = (AbstractC1676Vg0) interfaceC5908mZ;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Vg0, mZ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Vg0, mZ] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return AbstractC8069xu.g0((Iterable) this.f.invoke());
            default:
                try {
                    return (List) this.f.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return MN.a;
                }
        }
    }
}
