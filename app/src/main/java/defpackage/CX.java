package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CX implements DR0 {
    public final ArrayList a;

    public CX(Set set) {
        this.a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DR0 dr0 = (DR0) it.next();
            if (dr0 != null) {
                this.a.add(dr0);
            }
        }
    }

    public static void l() {
        AbstractC3393dS.h("ForwardingRequestListener");
    }

    @Override // defpackage.DR0
    public final void a(C6589q70 c6589q70, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).a(c6589q70, str, z);
            } catch (Exception unused) {
                l();
            }
        }
    }

    @Override // defpackage.DR0
    public final void b(C6589q70 c6589q70, Object obj, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).b(c6589q70, obj, str, z);
            } catch (Exception unused) {
                l();
            }
        }
    }

    @Override // defpackage.DR0
    public final void c(C6589q70 c6589q70, String str, Throwable th, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).c(c6589q70, str, th, z);
            } catch (Exception unused) {
                l();
            }
        }
    }

    @Override // defpackage.DR0
    public final void d(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).d(str, str2);
            } catch (Exception unused) {
                l();
            }
        }
    }

    @Override // defpackage.DR0
    public final void e(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).e(str, str2);
            } catch (Exception unused) {
                l();
            }
        }
    }

    @Override // defpackage.DR0
    public final void f(String str, String str2, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).f(str, str2, z);
            } catch (Exception unused) {
                l();
            }
        }
    }

    @Override // defpackage.DR0
    public final void g(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).g(str);
            } catch (Exception unused) {
                l();
            }
        }
    }

    @Override // defpackage.DR0
    public final boolean h(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((DR0) arrayList.get(i)).h(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.DR0
    public final void i(String str, String str2, Map map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).i(str, str2, map);
            } catch (Exception unused) {
                l();
            }
        }
    }

    @Override // defpackage.DR0
    public final void j(String str, String str2, Throwable th, Map map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).j(str, str2, th, map);
            } catch (Exception unused) {
                l();
            }
        }
    }

    @Override // defpackage.DR0
    public final void k(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).k(str);
            } catch (Exception unused) {
                l();
            }
        }
    }

    public CX(DR0... dr0Arr) {
        this.a = new ArrayList(dr0Arr.length);
        for (DR0 dr0 : dr0Arr) {
            if (dr0 != null) {
                this.a.add(dr0);
            }
        }
    }
}
