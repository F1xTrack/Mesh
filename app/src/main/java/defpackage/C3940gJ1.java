package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gJ1 */
/* loaded from: classes.dex */
public final class C3940gJ1 {
    public static final C3940gJ1 c = new C3940gJ1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final C6813rI1 a = new C6813rI1();

    public final InterfaceC8153yK1 a(Class cls) {
        Charset charset = AbstractC7574vH1.a;
        if (cls == null) {
            throw new NullPointerException(RemoteMessageAttributes.MESSAGE_TYPE);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        InterfaceC8153yK1 interfaceC8153yK1U = (InterfaceC8153yK1) concurrentHashMap.get(cls);
        if (interfaceC8153yK1U == null) {
            C6813rI1 c6813rI1 = this.a;
            c6813rI1.getClass();
            TE te = AbstractC3946gL1.a;
            QG1.class.isAssignableFrom(cls);
            C8340zJ1 c8340zJ1B = c6813rI1.a.b(cls);
            if ((c8340zJ1B.d & 2) == 2) {
                TE te2 = AbstractC3946gL1.a;
                C5806m12 c5806m12 = NF1.a;
                interfaceC8153yK1U = new WI1(te2, c8340zJ1B.a);
            } else {
                int i = AbstractC3368dJ1.a;
                int i2 = AbstractC4319iI1.a;
                TE te3 = AbstractC3946gL1.a;
                C5806m12 c5806m122 = c8340zJ1B.b() + (-1) != 1 ? NF1.a : null;
                int i3 = AbstractC8147yI1.a;
                interfaceC8153yK1U = TI1.u(c8340zJ1B, te3, c5806m122);
            }
            InterfaceC8153yK1 interfaceC8153yK1 = (InterfaceC8153yK1) concurrentHashMap.putIfAbsent(cls, interfaceC8153yK1U);
            if (interfaceC8153yK1 != null) {
                return interfaceC8153yK1;
            }
        }
        return interfaceC8153yK1U;
    }
}
