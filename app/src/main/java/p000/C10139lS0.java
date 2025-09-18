package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lS0 */
/* loaded from: classes.dex */
public final class C10139lS0 implements InterfaceC0768MC, InterfaceC0580JC {

    /* renamed from: a */
    public final RunnableC0895OD f37064a;

    /* renamed from: b */
    public final C0832ND f37065b;

    /* renamed from: c */
    public int f37066c;

    /* renamed from: d */
    public int f37067d = -1;

    /* renamed from: e */
    public InterfaceC7740If0 f37068e;

    /* renamed from: f */
    public List f37069f;

    /* renamed from: g */
    public int f37070g;

    /* renamed from: h */
    public volatile C11087ss0 f37071h;

    /* renamed from: i */
    public File f37072i;

    /* renamed from: j */
    public C10267mS0 f37073j;

    public C10139lS0(C0832ND c0832nd, RunnableC0895OD runnableC0895OD) {
        this.f37065b = c0832nd;
        this.f37064a = runnableC0895OD;
    }

    @Override // p000.InterfaceC0768MC
    /* renamed from: b */
    public final boolean mo555b() {
        List list;
        ArrayList arrayListM5583a = this.f37065b.m5583a();
        boolean z = false;
        if (arrayListM5583a.isEmpty()) {
            return false;
        }
        C0832ND c0832nd = this.f37065b;
        C9239eQ0 c9239eQ0M25734a = c0832nd.f7553c.m25734a();
        Class<?> cls = c0832nd.f7554d.getClass();
        Class cls2 = c0832nd.f7557g;
        Class cls3 = c0832nd.f7561k;
        C0827N8 c0827n8 = c9239eQ0M25734a.f26704h;
        C9553gt0 c9553gt0 = (C9553gt0) ((AtomicReference) c0827n8.f7523b).getAndSet(null);
        if (c9553gt0 == null) {
            c9553gt0 = new C9553gt0(cls, cls2, cls3);
        } else {
            c9553gt0.f28073a = cls;
            c9553gt0.f28074b = cls2;
            c9553gt0.f28075c = cls3;
        }
        synchronized (((C7119x8) c0827n8.f7524c)) {
            list = (List) ((C7119x8) c0827n8.f7524c).getOrDefault(c9553gt0, null);
        }
        ((AtomicReference) c0827n8.f7523b).set(c9553gt0);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c9239eQ0M25734a.f26697a.m1044U0(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = c9239eQ0M25734a.f26699c.m23029d((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!c9239eQ0M25734a.f26702f.m25612b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            c9239eQ0M25734a.f26704h.m5567w(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list2 = arrayList;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f37065b.f7561k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f37065b.f7554d.getClass() + " to " + this.f37065b.f7561k);
        }
        while (true) {
            List list3 = this.f37069f;
            if (list3 != null && this.f37070g < list3.size()) {
                this.f37071h = null;
                while (!z && this.f37070g < this.f37069f.size()) {
                    List list4 = this.f37069f;
                    int i = this.f37070g;
                    this.f37070g = i + 1;
                    InterfaceC11215ts0 interfaceC11215ts0 = (InterfaceC11215ts0) list4.get(i);
                    File file = this.f37072i;
                    C0832ND c0832nd2 = this.f37065b;
                    this.f37071h = interfaceC11215ts0.mo8530b(file, c0832nd2.f7555e, c0832nd2.f7556f, c0832nd2.f7559i);
                    if (this.f37071h != null && this.f37065b.m5585c(this.f37071h.f42649c.mo3254a()) != null) {
                        this.f37071h.f42649c.mo3256c(this.f37065b.f7565o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f37067d + 1;
            this.f37067d = i2;
            if (i2 >= list2.size()) {
                int i3 = this.f37066c + 1;
                this.f37066c = i3;
                if (i3 >= arrayListM5583a.size()) {
                    return false;
                }
                this.f37067d = 0;
            }
            InterfaceC7740If0 interfaceC7740If0 = (InterfaceC7740If0) arrayListM5583a.get(this.f37066c);
            Class cls5 = (Class) list2.get(this.f37067d);
            InterfaceC11312uc1 interfaceC11312uc1M5587e = this.f37065b.m5587e(cls5);
            C0832ND c0832nd3 = this.f37065b;
            this.f37073j = new C10267mS0(c0832nd3.f7553c.f45261a, interfaceC7740If0, c0832nd3.f7564n, c0832nd3.f7555e, c0832nd3.f7556f, interfaceC11312uc1M5587e, cls5, c0832nd3.f7559i);
            File fileMo5746f = c0832nd3.f7558h.m1677b().mo5746f(this.f37073j);
            this.f37072i = fileMo5746f;
            if (fileMo5746f != null) {
                this.f37068e = interfaceC7740If0;
                this.f37069f = this.f37065b.f7553c.m25734a().m17933g(fileMo5746f);
                this.f37070g = 0;
            }
        }
    }

    @Override // p000.InterfaceC0768MC
    public final void cancel() {
        C11087ss0 c11087ss0 = this.f37071h;
        if (c11087ss0 != null) {
            c11087ss0.f42649c.cancel();
        }
    }

    @Override // p000.InterfaceC0580JC
    /* renamed from: e */
    public final void mo556e(Exception exc) {
        this.f37064a.mo4921a(this.f37073j, exc, this.f37071h.f42649c, EnumC1460XC.f13617d);
    }

    @Override // p000.InterfaceC0580JC
    /* renamed from: j */
    public final void mo557j(Object obj) {
        this.f37064a.mo4922c(this.f37068e, obj, this.f37071h.f42649c, EnumC1460XC.f13617d, this.f37073j);
    }
}
