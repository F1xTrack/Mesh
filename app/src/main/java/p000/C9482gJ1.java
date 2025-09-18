package p000;

import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gJ1 */
/* loaded from: classes.dex */
public final class C9482gJ1 {

    /* renamed from: c */
    public static final C9482gJ1 f27672c = new C9482gJ1();

    /* renamed from: b */
    public final ConcurrentHashMap f27674b = new ConcurrentHashMap();

    /* renamed from: a */
    public final C10888rI1 f27673a = new C10888rI1();

    /* renamed from: a */
    public final InterfaceC11785yK1 m18426a(Class cls) {
        Charset charset = AbstractC11398vH1.f44320a;
        if (cls == null) {
            throw new NullPointerException(RemoteMessageAttributes.MESSAGE_TYPE);
        }
        ConcurrentHashMap concurrentHashMap = this.f27674b;
        InterfaceC11785yK1 interfaceC11785yK1M7653u = (InterfaceC11785yK1) concurrentHashMap.get(cls);
        if (interfaceC11785yK1M7653u == null) {
            C10888rI1 c10888rI1 = this.f27673a;
            c10888rI1.getClass();
            C1210TE c1210te = AbstractC9486gL1.f27693a;
            QG1.class.isAssignableFrom(cls);
            C11910zJ1 c11910zJ1Mo577b = c10888rI1.f41511a.mo577b(cls);
            if ((c11910zJ1Mo577b.f46790d & 2) == 2) {
                C1210TE c1210te2 = AbstractC9486gL1.f27693a;
                C10212m12 c10212m12 = NF1.f7676a;
                interfaceC11785yK1M7653u = new WI1(c1210te2, c11910zJ1Mo577b.f46787a);
            } else {
                int i = AbstractC9098dJ1.f25935a;
                int i2 = AbstractC9736iI1.f29067a;
                C1210TE c1210te3 = AbstractC9486gL1.f27693a;
                C10212m12 c10212m122 = c11910zJ1Mo577b.m26371b() + (-1) != 1 ? NF1.f7676a : null;
                int i3 = AbstractC11781yI1.f46180a;
                interfaceC11785yK1M7653u = TI1.m7653u(c11910zJ1Mo577b, c1210te3, c10212m122);
            }
            InterfaceC11785yK1 interfaceC11785yK1 = (InterfaceC11785yK1) concurrentHashMap.putIfAbsent(cls, interfaceC11785yK1M7653u);
            if (interfaceC11785yK1 != null) {
                return interfaceC11785yK1;
            }
        }
        return interfaceC11785yK1M7653u;
    }
}
