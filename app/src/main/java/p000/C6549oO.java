package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: oO */
/* loaded from: classes.dex */
public final class C6549oO implements InterfaceC1661aO, InterfaceC9177dx0 {

    /* renamed from: a */
    public final LinkedHashMap f38980a = new LinkedHashMap();

    /* renamed from: b */
    public EnumC6967uj f38981b = EnumC6967uj.f43810b;

    /* renamed from: c */
    public final ArrayList f38982c = new ArrayList();

    /* renamed from: d */
    public final /* synthetic */ C6820sO f38983d;

    public C6549oO(C6820sO c6820sO) {
        this.f38983d = c6820sO;
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: a */
    public final void mo1479a(Executor executor, InterfaceC9049cx0 interfaceC9049cx0) {
        this.f38983d.f42398h.execute(new RunnableC8339Ts1(this, interfaceC9049cx0, executor, 22));
    }

    /* renamed from: b */
    public final void m23373b(boolean z) {
        EnumC6967uj enumC6967uj = EnumC6967uj.f43810b;
        EnumC6967uj enumC6967uj2 = z ? EnumC6967uj.f43809a : enumC6967uj;
        if (this.f38981b == enumC6967uj2) {
            return;
        }
        this.f38981b = enumC6967uj2;
        if (enumC6967uj2 == enumC6967uj) {
            ArrayList arrayList = this.f38982c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceFutureC7800Jj0) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.f38980a.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new RunnableC3973eA(entry, 21, enumC6967uj2));
            } catch (RejectedExecutionException unused) {
                AbstractC7806Jm0.m4412f(this.f38983d.f42391a);
            }
        }
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: g */
    public final InterfaceFutureC7800Jj0 mo1480g() {
        return AbstractC11797yQ1.m26149b(new C6360lO(this, 0));
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: l */
    public final void mo1481l(InterfaceC9049cx0 interfaceC9049cx0) {
        this.f38983d.f42398h.execute(new RunnableC3973eA(this, 22, interfaceC9049cx0));
    }
}
