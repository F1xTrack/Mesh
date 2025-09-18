package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class E2 implements InterfaceC0279Di0 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public boolean b;
    public boolean c;

    public final void a() {
        this.c = true;
        Iterator it = AbstractC0121Bh1.e(this.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0747Ji0) it.next()).onDestroy();
        }
    }

    @Override // defpackage.InterfaceC0279Di0
    public final void e(InterfaceC0747Ji0 interfaceC0747Ji0) {
        this.a.remove(interfaceC0747Ji0);
    }

    @Override // defpackage.InterfaceC0279Di0
    public final void k(InterfaceC0747Ji0 interfaceC0747Ji0) {
        this.a.add(interfaceC0747Ji0);
        if (this.c) {
            interfaceC0747Ji0.onDestroy();
        } else if (this.b) {
            interfaceC0747Ji0.onStart();
        } else {
            interfaceC0747Ji0.onStop();
        }
    }
}
