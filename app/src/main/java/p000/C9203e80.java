package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9203e80 extends AbstractC0504I {

    /* renamed from: h */
    public ArrayList f26557h;

    /* renamed from: i */
    public int f26558i;

    /* renamed from: j */
    public int f26559j;

    /* renamed from: k */
    public AtomicInteger f26560k;

    /* renamed from: l */
    public Throwable f26561l;

    /* renamed from: m */
    public HashMap f26562m;

    /* renamed from: n */
    public final /* synthetic */ C9331f80 f26563n;

    public C9203e80(C9331f80 c9331f80) {
        this.f26563n = c9331f80;
        c9331f80.getClass();
        if (this.f26560k != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f26560k == null) {
                    this.f26560k = new AtomicInteger(0);
                    int size = this.f26563n.f27085a.size();
                    this.f26559j = size;
                    this.f26558i = size;
                    this.f26557h = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        InterfaceC1523YC interfaceC1523YC = (InterfaceC1523YC) ((InterfaceC10608p61) this.f26563n.f27085a.get(i)).get();
                        this.f26557h.add(interfaceC1523YC);
                        AbstractC0504I abstractC0504I = (AbstractC0504I) interfaceC1523YC;
                        abstractC0504I.m3673l(new C9075d80(this, i), C1685am.f15687a);
                        if (!abstractC0504I.mo3662a()) {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: n */
    public static void m17866n(C9203e80 c9203e80, int i, InterfaceC1523YC interfaceC1523YC) {
        InterfaceC1523YC interfaceC1523YCM17867o;
        Throwable th;
        synchronized (c9203e80) {
            interfaceC1523YCM17867o = interfaceC1523YC == c9203e80.m17869q() ? null : interfaceC1523YC == c9203e80.m17868p(i) ? c9203e80.m17867o(i) : interfaceC1523YC;
        }
        if (interfaceC1523YCM17867o != null) {
            interfaceC1523YCM17867o.close();
        }
        if (i == 0) {
            AbstractC0504I abstractC0504I = (AbstractC0504I) interfaceC1523YC;
            c9203e80.f26561l = abstractC0504I.m3664c();
            c9203e80.f26562m = abstractC0504I.f4626a;
        }
        if (c9203e80.f26560k.incrementAndGet() != c9203e80.f26559j || (th = c9203e80.f26561l) == null) {
            return;
        }
        c9203e80.m3670i(th, c9203e80.f26562m);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // p000.AbstractC0504I, p000.InterfaceC1523YC
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean mo3662a() {
        /*
            r1 = this;
            monitor-enter(r1)
            f80 r0 = r1.f26563n     // Catch: java.lang.Throwable -> L14
            r0.getClass()     // Catch: java.lang.Throwable -> L14
            YC r0 = r1.m17869q()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            boolean r0 = r0.mo3662a()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 0
        L17:
            monitor-exit(r1)
            return r0
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9203e80.mo3662a():boolean");
    }

    @Override // p000.AbstractC0504I, p000.InterfaceC1523YC
    public final boolean close() {
        this.f26563n.getClass();
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                ArrayList arrayList = this.f26557h;
                this.f26557h = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    InterfaceC1523YC interfaceC1523YC = (InterfaceC1523YC) arrayList.get(i);
                    if (interfaceC1523YC != null) {
                        interfaceC1523YC.close();
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0504I, p000.InterfaceC1523YC
    public final synchronized Object getResult() {
        InterfaceC1523YC interfaceC1523YCM17869q;
        this.f26563n.getClass();
        interfaceC1523YCM17869q = m17869q();
        return interfaceC1523YCM17869q != null ? interfaceC1523YCM17869q.getResult() : null;
    }

    /* renamed from: o */
    public final synchronized InterfaceC1523YC m17867o(int i) {
        InterfaceC1523YC interfaceC1523YC;
        ArrayList arrayList = this.f26557h;
        interfaceC1523YC = null;
        if (arrayList != null && i < arrayList.size()) {
            interfaceC1523YC = (InterfaceC1523YC) this.f26557h.set(i, null);
        }
        return interfaceC1523YC;
    }

    /* renamed from: p */
    public final synchronized InterfaceC1523YC m17868p(int i) {
        ArrayList arrayList;
        arrayList = this.f26557h;
        return (arrayList == null || i >= arrayList.size()) ? null : (InterfaceC1523YC) this.f26557h.get(i);
    }

    /* renamed from: q */
    public final synchronized InterfaceC1523YC m17869q() {
        return m17868p(this.f26558i);
    }
}
