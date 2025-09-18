package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o1 */
/* loaded from: classes2.dex */
public final class C6526o1 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ int f38684a;

    /* renamed from: b */
    public final Object f38685b;

    /* renamed from: c */
    public final /* synthetic */ Object f38686c;

    public /* synthetic */ C6526o1(Object obj, int i, Object obj2) {
        this.f38684a = i;
        this.f38686c = obj;
        this.f38685b = obj2;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f38684a) {
            case 0:
                C7789Jd1.f5652b.getClass();
                C7789Jd1 c7789Jd1 = C7789Jd1.f5653c;
                InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v = ((AbstractC6654q1) this.f38686c).mo1439v();
                List listEmptyList = Collections.emptyList();
                C6463n1 c6463n1 = new C6463n1(0, this);
                C8114Pk0 c8114Pk0 = C8582Yk0.f14497e;
                O90.m5967e(c8114Pk0, "NO_LOCKS");
                return NV1.m5727B(new C8576Yh0(c8114Pk0, c6463n1), c7789Jd1, interfaceC8101Pd1Mo1439v, listEmptyList, false);
            case 1:
                C11494w21 c11494w21 = new C11494w21();
                Iterator it = ((AbstractC0162CZ) this.f38686c).mo1222j().iterator();
                while (it.hasNext()) {
                    c11494w21.add(((InterfaceC0036AZ) it.next()).mo114b((C11571we1) this.f38685b));
                }
                return c11494w21;
            default:
                C9579h40 c9579h40 = (C9579h40) this.f38686c;
                C9963k40 c9963k40 = (C9963k40) this.f38685b;
                try {
                } catch (IOException e) {
                    c9579h40.m18713a(2, 2, e);
                } catch (Throwable th) {
                    c9579h40.m18713a(3, 3, null);
                    AbstractC7433Ch1.m1275d(c9963k40);
                    throw th;
                }
                if (!c9963k40.m22145a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (c9963k40.m22145a(false, this)) {
                }
                c9579h40.m18713a(1, 9, null);
                AbstractC7433Ch1.m1275d(c9963k40);
                return C8313Tf1.f11463a;
        }
    }
}
