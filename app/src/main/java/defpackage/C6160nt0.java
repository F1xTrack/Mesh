package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nt0 */
/* loaded from: classes.dex */
public final class C6160nt0 implements KC, JC {
    public final ArrayList a;
    public final C1857Xo1 b;
    public int c;
    public EnumC7561vD0 d;
    public JC e;
    public List f;
    public boolean g;

    public C6160nt0(ArrayList arrayList, C1857Xo1 c1857Xo1) {
        this.b = c1857Xo1;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.a = arrayList;
        this.c = 0;
    }

    @Override // defpackage.KC
    public final Class a() {
        return ((KC) this.a.get(0)).a();
    }

    @Override // defpackage.KC
    public final void b() {
        List list = this.f;
        if (list != null) {
            this.b.d(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((KC) it.next()).b();
        }
    }

    @Override // defpackage.KC
    public final void c(EnumC7561vD0 enumC7561vD0, JC jc) {
        this.d = enumC7561vD0;
        this.e = jc;
        this.f = (List) this.b.i();
        ((KC) this.a.get(this.c)).c(enumC7561vD0, this);
        if (this.g) {
            cancel();
        }
    }

    @Override // defpackage.KC
    public final void cancel() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((KC) it.next()).cancel();
        }
    }

    @Override // defpackage.KC
    public final XC d() {
        return ((KC) this.a.get(0)).d();
    }

    @Override // defpackage.JC
    public final void e(Exception exc) {
        List list = this.f;
        IL1.d(list, "Argument must not be null");
        list.add(exc);
        f();
    }

    public final void f() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            c(this.d, this.e);
        } else {
            IL1.c(this.f);
            this.e.e(new C8283z10("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.JC
    public final void j(Object obj) {
        if (obj != null) {
            this.e.j(obj);
        } else {
            f();
        }
    }
}
