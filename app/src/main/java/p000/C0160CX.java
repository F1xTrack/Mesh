package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: CX */
/* loaded from: classes.dex */
public final class C0160CX implements DR0 {

    /* renamed from: a */
    public final ArrayList f1422a;

    public C0160CX(Set set) {
        this.f1422a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DR0 dr0 = (DR0) it.next();
            if (dr0 != null) {
                this.f1422a.add(dr0);
            }
        }
    }

    /* renamed from: l */
    public static void m1193l() {
        AbstractC3929dS.m17675h("ForwardingRequestListener");
    }

    @Override // p000.DR0
    /* renamed from: a */
    public final void mo1194a(C10737q70 c10737q70, String str, boolean z) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).mo1194a(c10737q70, str, z);
            } catch (Exception unused) {
                m1193l();
            }
        }
    }

    @Override // p000.DR0
    /* renamed from: b */
    public final void mo1195b(C10737q70 c10737q70, Object obj, String str, boolean z) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).mo1195b(c10737q70, obj, str, z);
            } catch (Exception unused) {
                m1193l();
            }
        }
    }

    @Override // p000.DR0
    /* renamed from: c */
    public final void mo1196c(C10737q70 c10737q70, String str, Throwable th, boolean z) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).mo1196c(c10737q70, str, th, z);
            } catch (Exception unused) {
                m1193l();
            }
        }
    }

    @Override // p000.DR0
    /* renamed from: d */
    public final void mo1197d(String str, String str2) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).mo1197d(str, str2);
            } catch (Exception unused) {
                m1193l();
            }
        }
    }

    @Override // p000.DR0
    /* renamed from: e */
    public final void mo1198e(String str, String str2) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).mo1198e(str, str2);
            } catch (Exception unused) {
                m1193l();
            }
        }
    }

    @Override // p000.DR0
    /* renamed from: f */
    public final void mo1199f(String str, String str2, boolean z) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).mo1199f(str, str2, z);
            } catch (Exception unused) {
                m1193l();
            }
        }
    }

    @Override // p000.DR0
    /* renamed from: g */
    public final void mo1200g(String str) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).mo1200g(str);
            } catch (Exception unused) {
                m1193l();
            }
        }
    }

    @Override // p000.DR0
    /* renamed from: h */
    public final boolean mo1201h(String str) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((DR0) arrayList.get(i)).mo1201h(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.DR0
    /* renamed from: i */
    public final void mo1202i(String str, String str2, Map map) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).mo1202i(str, str2, map);
            } catch (Exception unused) {
                m1193l();
            }
        }
    }

    @Override // p000.DR0
    /* renamed from: j */
    public final void mo1203j(String str, String str2, Throwable th, Map map) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).mo1203j(str, str2, th, map);
            } catch (Exception unused) {
                m1193l();
            }
        }
    }

    @Override // p000.DR0
    /* renamed from: k */
    public final void mo1204k(String str) {
        ArrayList arrayList = this.f1422a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((DR0) arrayList.get(i)).mo1204k(str);
            } catch (Exception unused) {
                m1193l();
            }
        }
    }

    public C0160CX(DR0... dr0Arr) {
        this.f1422a = new ArrayList(dr0Arr.length);
        for (DR0 dr0 : dr0Arr) {
            if (dr0 != null) {
                this.f1422a.add(dr0);
            }
        }
    }
}
