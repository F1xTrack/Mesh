package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: E2 */
/* loaded from: classes.dex */
public final class C0255E2 implements InterfaceC7486Di0 {

    /* renamed from: a */
    public final Set f2354a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f2355b;

    /* renamed from: c */
    public boolean f2356c;

    /* renamed from: a */
    public final void m1986a() {
        this.f2356c = true;
        Iterator it = AbstractC7381Bh1.m806e(this.f2354a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7798Ji0) it.next()).onDestroy();
        }
    }

    @Override // p000.InterfaceC7486Di0
    /* renamed from: e */
    public final void mo1843e(InterfaceC7798Ji0 interfaceC7798Ji0) {
        this.f2354a.remove(interfaceC7798Ji0);
    }

    @Override // p000.InterfaceC7486Di0
    /* renamed from: k */
    public final void mo1844k(InterfaceC7798Ji0 interfaceC7798Ji0) {
        this.f2354a.add(interfaceC7798Ji0);
        if (this.f2356c) {
            interfaceC7798Ji0.onDestroy();
        } else if (this.f2355b) {
            interfaceC7798Ji0.onStart();
        } else {
            interfaceC7798Ji0.onStop();
        }
    }
}
