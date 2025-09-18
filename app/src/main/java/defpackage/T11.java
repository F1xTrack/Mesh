package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class T11 implements InterfaceC7125sx {
    public final /* synthetic */ X11 a;

    public T11(X11 x11) {
        this.a = x11;
    }

    @Override // defpackage.InterfaceC7125sx
    public final void a(boolean z) {
        ArrayList arrayList;
        AbstractC0121Bh1.a();
        synchronized (this.a) {
            arrayList = new ArrayList((HashSet) this.a.d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC7125sx) it.next()).a(z);
        }
    }
}
