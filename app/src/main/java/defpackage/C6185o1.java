package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o1 */
/* loaded from: classes2.dex */
public final class C6185o1 implements InterfaceC5908mZ {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C6185o1(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.a) {
            case 0:
                C0733Jd1.b.getClass();
                C0733Jd1 c0733Jd1 = C0733Jd1.c;
                InterfaceC1200Pd1 interfaceC1200Pd1V = ((AbstractC6567q1) this.c).v();
                List listEmptyList = Collections.emptyList();
                C5994n1 c5994n1 = new C5994n1(0, this);
                C1220Pk0 c1220Pk0 = C1922Yk0.e;
                O90.e(c1220Pk0, "NO_LOCKS");
                return NV1.B(new C1913Yh0(c1220Pk0, c5994n1), c0733Jd1, interfaceC1200Pd1V, listEmptyList, false);
            case 1:
                C7718w21 c7718w21 = new C7718w21();
                Iterator it = ((CZ) this.c).j().iterator();
                while (it.hasNext()) {
                    c7718w21.add(((AZ) it.next()).b((C7833we1) this.b));
                }
                return c7718w21;
            default:
                C4085h40 c4085h40 = (C4085h40) this.c;
                C5434k40 c5434k40 = (C5434k40) this.b;
                try {
                } catch (IOException e) {
                    c4085h40.a(2, 2, e);
                } catch (Throwable th) {
                    c4085h40.a(3, 3, null);
                    AbstractC0199Ch1.d(c5434k40);
                    throw th;
                }
                if (!c5434k40.a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (c5434k40.a(false, this)) {
                }
                c4085h40.a(1, 9, null);
                AbstractC0199Ch1.d(c5434k40);
                return C1518Tf1.a;
        }
    }
}
