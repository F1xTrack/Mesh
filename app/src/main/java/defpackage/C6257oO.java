package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: oO */
/* loaded from: classes.dex */
public final class C6257oO implements InterfaceC2124aO, InterfaceC3486dx0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public EnumC7465uj b = EnumC7465uj.b;
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ C7020sO d;

    public C6257oO(C7020sO c7020sO) {
        this.d = c7020sO;
    }

    @Override // defpackage.InterfaceC3486dx0
    public final void a(Executor executor, InterfaceC3296cx0 interfaceC3296cx0) {
        this.d.h.execute(new RunnableC1557Ts1(this, interfaceC3296cx0, executor, 22));
    }

    public final void b(boolean z) {
        EnumC7465uj enumC7465uj = EnumC7465uj.b;
        EnumC7465uj enumC7465uj2 = z ? EnumC7465uj.a : enumC7465uj;
        if (this.b == enumC7465uj2) {
            return;
        }
        this.b = enumC7465uj2;
        if (enumC7465uj2 == enumC7465uj) {
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceFutureC0750Jj0) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.a.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new RunnableC3529eA(entry, 21, enumC7465uj2));
            } catch (RejectedExecutionException unused) {
                AbstractC0759Jm0.f(this.d.a);
            }
        }
    }

    @Override // defpackage.InterfaceC3486dx0
    public final InterfaceFutureC0750Jj0 g() {
        return AbstractC8171yQ1.b(new C5684lO(this, 0));
    }

    @Override // defpackage.InterfaceC3486dx0
    public final void l(InterfaceC3296cx0 interfaceC3296cx0) {
        this.d.h.execute(new RunnableC3529eA(this, 22, interfaceC3296cx0));
    }
}
