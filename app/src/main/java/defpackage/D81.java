package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class D81 implements InterfaceC0747Ji0 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.InterfaceC0747Ji0
    public final void onDestroy() {
        Iterator it = AbstractC0121Bh1.e(this.a).iterator();
        while (it.hasNext()) {
            ((A81) it.next()).onDestroy();
        }
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStart() {
        Iterator it = AbstractC0121Bh1.e(this.a).iterator();
        while (it.hasNext()) {
            ((A81) it.next()).onStart();
        }
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStop() {
        Iterator it = AbstractC0121Bh1.e(this.a).iterator();
        while (it.hasNext()) {
            ((A81) it.next()).onStop();
        }
    }
}
