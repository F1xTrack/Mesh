package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: bQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2321bQ extends AbstractC7067sd1 {
    public AbstractC7067sd1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C3504e20 c;
    public final /* synthetic */ C8213ye1 d;
    public final /* synthetic */ C3387dQ e;

    public C2321bQ(C3387dQ c3387dQ, boolean z, C3504e20 c3504e20, C8213ye1 c8213ye1) {
        this.e = c3387dQ;
        this.b = z;
        this.c = c3504e20;
        this.d = c8213ye1;
    }

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IOException {
        if (this.b) {
            c0885Lc0.J();
            return;
        }
        AbstractC7067sd1 abstractC7067sd1 = this.a;
        if (abstractC7067sd1 == null) {
            C8213ye1 c8213ye1 = this.d;
            C3504e20 c3504e20 = this.c;
            List<InterfaceC7449ud1> list = c3504e20.e;
            InterfaceC7449ud1 interfaceC7449ud1 = this.e;
            if (!list.contains(interfaceC7449ud1)) {
                interfaceC7449ud1 = c3504e20.d;
            }
            boolean z = false;
            for (InterfaceC7449ud1 interfaceC7449ud12 : list) {
                if (z) {
                    AbstractC7067sd1 abstractC7067sd1A = interfaceC7449ud12.a(c3504e20, c8213ye1);
                    if (abstractC7067sd1A != null) {
                        this.a = abstractC7067sd1A;
                        abstractC7067sd1 = abstractC7067sd1A;
                    }
                } else if (interfaceC7449ud12 == interfaceC7449ud1) {
                    z = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c8213ye1);
        }
        abstractC7067sd1.a(c0885Lc0, obj);
    }
}
