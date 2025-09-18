package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class BX implements ER0 {
    public final ArrayList a;

    public BX(SN sn) {
        if (sn == null) {
            this.a = new ArrayList();
        } else {
            this.a = new ArrayList(0);
        }
    }

    @Override // defpackage.TD0
    public final void a(RD0 rd0, String str, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).a(rd0, str, map);
            } catch (Exception unused) {
                AbstractC3393dS.h("ForwardingRequestListener2");
            }
        }
    }

    @Override // defpackage.ER0
    public final void b(C8387zZ0 c8387zZ0) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).b(c8387zZ0);
            } catch (Exception unused) {
                AbstractC3393dS.h("ForwardingRequestListener2");
            }
        }
    }

    @Override // defpackage.TD0
    public final void c(RD0 rd0) {
        O90.f(rd0, "producerContext");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).c(rd0);
            } catch (Exception unused) {
                AbstractC3393dS.h("ForwardingRequestListener2");
            }
        }
    }

    @Override // defpackage.ER0
    public final void d(C8387zZ0 c8387zZ0, Throwable th) {
        O90.f(c8387zZ0, "producerContext");
        O90.f(th, "throwable");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).d(c8387zZ0, th);
            } catch (Exception unused) {
                AbstractC3393dS.h("ForwardingRequestListener2");
            }
        }
    }

    @Override // defpackage.TD0
    public final void e(RD0 rd0, String str, Throwable th, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).e(rd0, str, th, map);
            } catch (Exception unused) {
                AbstractC3393dS.h("ForwardingRequestListener2");
            }
        }
    }

    @Override // defpackage.TD0
    public final void f(RD0 rd0, String str, boolean z) {
        O90.f(rd0, "producerContext");
        O90.f(str, "producerName");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).f(rd0, str, z);
            } catch (Exception unused) {
                AbstractC3393dS.h("ForwardingRequestListener2");
            }
        }
    }

    @Override // defpackage.ER0
    public final void g(RD0 rd0) {
        O90.f(rd0, "producerContext");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).g(rd0);
            } catch (Exception unused) {
                AbstractC3393dS.h("ForwardingRequestListener2");
            }
        }
    }

    @Override // defpackage.ER0
    public final void h(RD0 rd0) {
        O90.f(rd0, "producerContext");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).h(rd0);
            } catch (Exception unused) {
                AbstractC3393dS.h("ForwardingRequestListener2");
            }
        }
    }

    @Override // defpackage.TD0
    public final boolean i(RD0 rd0, String str) {
        O90.f(rd0, "producerContext");
        O90.f(str, "producerName");
        ArrayList arrayList = this.a;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ER0) it.next()).i(rd0, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.TD0
    public final void j(RD0 rd0, String str) {
        O90.f(rd0, "producerContext");
        O90.f(str, "producerName");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).j(rd0, str);
            } catch (Exception unused) {
                AbstractC3393dS.h("ForwardingRequestListener2");
            }
        }
    }

    @Override // defpackage.TD0
    public final void k(RD0 rd0, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).k(rd0, str);
            } catch (Exception unused) {
                AbstractC3393dS.h("ForwardingRequestListener2");
            }
        }
    }
}
