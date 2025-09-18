package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class T11 implements InterfaceC6855sx {

    /* renamed from: a */
    public final /* synthetic */ X11 f11128a;

    public T11(X11 x11) {
        this.f11128a = x11;
    }

    @Override // p000.InterfaceC6855sx
    /* renamed from: a */
    public final void mo3861a(boolean z) {
        ArrayList arrayList;
        AbstractC7381Bh1.m802a();
        synchronized (this.f11128a) {
            arrayList = new ArrayList((HashSet) this.f11128a.f13489d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC6855sx) it.next()).mo3861a(z);
        }
    }
}
