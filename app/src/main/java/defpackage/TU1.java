package defpackage;

import com.huawei.hms.rn.push.constants.RemoteMessageAttributes;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class TU1 {
    public static final TU1 c = new TU1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final C8180yT1 a = new C8180yT1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [vU1] */
    public final InterfaceC3404dV1 a(Class cls) {
        C6277oU1 c6277oU1N;
        Charset charset = BS1.a;
        if (cls == null) {
            throw new NullPointerException(RemoteMessageAttributes.MESSAGE_TYPE);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        InterfaceC3404dV1 interfaceC3404dV1 = (InterfaceC3404dV1) concurrentHashMap.get(cls);
        if (interfaceC3404dV1 != null) {
            return interfaceC3404dV1;
        }
        C8180yT1 c8180yT1 = this.a;
        c8180yT1.getClass();
        AbstractC6843rS1.class.isAssignableFrom(cls);
        YU1 yu1D = c8180yT1.a.d(cls);
        boolean z = (yu1D.d & 2) == 2;
        C4125hH1 c4125hH1 = AbstractC7586vL1.a;
        if (z) {
            c6277oU1N = new C7613vU1(yu1D.a);
        } else {
            if (ET1.a[AbstractC8235ym.x(yu1D.b())] == 1) {
                c4125hH1 = null;
            }
            c6277oU1N = C6277oU1.n(yu1D, c4125hH1);
        }
        InterfaceC3404dV1 interfaceC3404dV12 = (InterfaceC3404dV1) concurrentHashMap.putIfAbsent(cls, c6277oU1N);
        return interfaceC3404dV12 != null ? interfaceC3404dV12 : c6277oU1N;
    }
}
