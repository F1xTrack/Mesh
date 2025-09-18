package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nt0 */
/* loaded from: classes.dex */
public final class C10449nt0 implements InterfaceC0643KC, InterfaceC0580JC {

    /* renamed from: a */
    public final ArrayList f38586a;

    /* renamed from: b */
    public final C8539Xo1 f38587b;

    /* renamed from: c */
    public int f38588c;

    /* renamed from: d */
    public EnumC11389vD0 f38589d;

    /* renamed from: e */
    public InterfaceC0580JC f38590e;

    /* renamed from: f */
    public List f38591f;

    /* renamed from: g */
    public boolean f38592g;

    public C10449nt0(ArrayList arrayList, C8539Xo1 c8539Xo1) {
        this.f38587b = c8539Xo1;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f38586a = arrayList;
        this.f38588c = 0;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: a */
    public final Class mo3254a() {
        return ((InterfaceC0643KC) this.f38586a.get(0)).mo3254a();
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: b */
    public final void mo3255b() {
        List list = this.f38591f;
        if (list != null) {
            this.f38587b.mo4580d(list);
        }
        this.f38591f = null;
        Iterator it = this.f38586a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0643KC) it.next()).mo3255b();
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: c */
    public final void mo3256c(EnumC11389vD0 enumC11389vD0, InterfaceC0580JC interfaceC0580JC) {
        this.f38589d = enumC11389vD0;
        this.f38590e = interfaceC0580JC;
        this.f38591f = (List) this.f38587b.mo4581i();
        ((InterfaceC0643KC) this.f38586a.get(this.f38588c)).mo3256c(enumC11389vD0, this);
        if (this.f38592g) {
            cancel();
        }
    }

    @Override // p000.InterfaceC0643KC
    public final void cancel() {
        this.f38592g = true;
        Iterator it = this.f38586a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0643KC) it.next()).cancel();
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: d */
    public final EnumC1460XC mo3257d() {
        return ((InterfaceC0643KC) this.f38586a.get(0)).mo3257d();
    }

    @Override // p000.InterfaceC0580JC
    /* renamed from: e */
    public final void mo556e(Exception exc) {
        List list = this.f38591f;
        IL1.m3830d(list, "Argument must not be null");
        list.add(exc);
        m23243f();
    }

    /* renamed from: f */
    public final void m23243f() {
        if (this.f38592g) {
            return;
        }
        if (this.f38588c < this.f38586a.size() - 1) {
            this.f38588c++;
            mo3256c(this.f38589d, this.f38590e);
        } else {
            IL1.m3829c(this.f38591f);
            this.f38590e.mo556e(new C11871z10("Fetch failed", new ArrayList(this.f38591f)));
        }
    }

    @Override // p000.InterfaceC0580JC
    /* renamed from: j */
    public final void mo557j(Object obj) {
        if (obj != null) {
            this.f38590e.mo557j(obj);
        } else {
            m23243f();
        }
    }
}
