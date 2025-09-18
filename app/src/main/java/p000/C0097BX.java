package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: BX */
/* loaded from: classes.dex */
public final class C0097BX implements ER0 {

    /* renamed from: a */
    public final ArrayList f866a;

    public C0097BX(C1156SN c1156sn) {
        if (c1156sn == null) {
            this.f866a = new ArrayList();
        } else {
            this.f866a = new ArrayList(0);
        }
    }

    @Override // p000.TD0
    /* renamed from: a */
    public final void mo743a(RD0 rd0, String str, Map map) {
        Iterator it = this.f866a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).mo743a(rd0, str, map);
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ForwardingRequestListener2");
            }
        }
    }

    @Override // p000.ER0
    /* renamed from: b */
    public final void mo744b(C11941zZ0 c11941zZ0) {
        Iterator it = this.f866a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).mo744b(c11941zZ0);
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ForwardingRequestListener2");
            }
        }
    }

    @Override // p000.TD0
    /* renamed from: c */
    public final void mo745c(RD0 rd0) {
        O90.m5968f(rd0, "producerContext");
        Iterator it = this.f866a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).mo745c(rd0);
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ForwardingRequestListener2");
            }
        }
    }

    @Override // p000.ER0
    /* renamed from: d */
    public final void mo746d(C11941zZ0 c11941zZ0, Throwable th) {
        O90.m5968f(c11941zZ0, "producerContext");
        O90.m5968f(th, "throwable");
        Iterator it = this.f866a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).mo746d(c11941zZ0, th);
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ForwardingRequestListener2");
            }
        }
    }

    @Override // p000.TD0
    /* renamed from: e */
    public final void mo747e(RD0 rd0, String str, Throwable th, Map map) {
        Iterator it = this.f866a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).mo747e(rd0, str, th, map);
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ForwardingRequestListener2");
            }
        }
    }

    @Override // p000.TD0
    /* renamed from: f */
    public final void mo748f(RD0 rd0, String str, boolean z) {
        O90.m5968f(rd0, "producerContext");
        O90.m5968f(str, "producerName");
        Iterator it = this.f866a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).mo748f(rd0, str, z);
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ForwardingRequestListener2");
            }
        }
    }

    @Override // p000.ER0
    /* renamed from: g */
    public final void mo749g(RD0 rd0) {
        O90.m5968f(rd0, "producerContext");
        Iterator it = this.f866a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).mo749g(rd0);
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ForwardingRequestListener2");
            }
        }
    }

    @Override // p000.ER0
    /* renamed from: h */
    public final void mo750h(RD0 rd0) {
        O90.m5968f(rd0, "producerContext");
        Iterator it = this.f866a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).mo750h(rd0);
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ForwardingRequestListener2");
            }
        }
    }

    @Override // p000.TD0
    /* renamed from: i */
    public final boolean mo751i(RD0 rd0, String str) {
        O90.m5968f(rd0, "producerContext");
        O90.m5968f(str, "producerName");
        ArrayList arrayList = this.f866a;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ER0) it.next()).mo751i(rd0, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.TD0
    /* renamed from: j */
    public final void mo752j(RD0 rd0, String str) {
        O90.m5968f(rd0, "producerContext");
        O90.m5968f(str, "producerName");
        Iterator it = this.f866a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).mo752j(rd0, str);
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ForwardingRequestListener2");
            }
        }
    }

    @Override // p000.TD0
    /* renamed from: k */
    public final void mo753k(RD0 rd0, String str) {
        Iterator it = this.f866a.iterator();
        while (it.hasNext()) {
            try {
                ((ER0) it.next()).mo753k(rd0, str);
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ForwardingRequestListener2");
            }
        }
    }
}
