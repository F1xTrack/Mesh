package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class D81 implements InterfaceC7798Ji0 {

    /* renamed from: a */
    public final Set f1860a = Collections.newSetFromMap(new WeakHashMap());

    @Override // p000.InterfaceC7798Ji0
    public final void onDestroy() {
        Iterator it = AbstractC7381Bh1.m806e(this.f1860a).iterator();
        while (it.hasNext()) {
            ((A81) it.next()).onDestroy();
        }
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStart() {
        Iterator it = AbstractC7381Bh1.m806e(this.f1860a).iterator();
        while (it.hasNext()) {
            ((A81) it.next()).onStart();
        }
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStop() {
        Iterator it = AbstractC7381Bh1.m806e(this.f1860a).iterator();
        while (it.hasNext()) {
            ((A81) it.next()).onStop();
        }
    }
}
