package com.bumptech.glide.manager;

import androidx.lifecycle.C1742a;
import java.util.HashSet;
import java.util.Iterator;
import p000.AbstractC7381Bh1;
import p000.AbstractC7538Ei0;
import p000.EnumC7382Bi0;
import p000.EnumC7434Ci0;
import p000.InterfaceC7486Di0;
import p000.InterfaceC7798Ji0;
import p000.InterfaceC7850Ki0;
import p000.InterfaceC7902Li0;
import p000.InterfaceC8504Wx0;

/* loaded from: classes.dex */
final class LifecycleLifecycle implements InterfaceC7486Di0, InterfaceC7850Ki0 {

    /* renamed from: a */
    public final HashSet f17788a = new HashSet();

    /* renamed from: b */
    public final AbstractC7538Ei0 f17789b;

    public LifecycleLifecycle(AbstractC7538Ei0 abstractC7538Ei0) {
        this.f17789b = abstractC7538Ei0;
        abstractC7538Ei0.mo2368a(this);
    }

    @Override // p000.InterfaceC7486Di0
    /* renamed from: e */
    public final void mo1843e(InterfaceC7798Ji0 interfaceC7798Ji0) {
        this.f17788a.remove(interfaceC7798Ji0);
    }

    @Override // p000.InterfaceC7486Di0
    /* renamed from: k */
    public final void mo1844k(InterfaceC7798Ji0 interfaceC7798Ji0) {
        this.f17788a.add(interfaceC7798Ji0);
        EnumC7434Ci0 enumC7434Ci0 = ((C1742a) this.f17789b).f16309c;
        if (enumC7434Ci0 == EnumC7434Ci0.f1586a) {
            interfaceC7798Ji0.onDestroy();
        } else if (enumC7434Ci0.compareTo(EnumC7434Ci0.f1589d) >= 0) {
            interfaceC7798Ji0.onStart();
        } else {
            interfaceC7798Ji0.onStop();
        }
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_DESTROY)
    public void onDestroy(InterfaceC7902Li0 interfaceC7902Li0) {
        Iterator it = AbstractC7381Bh1.m806e(this.f17788a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7798Ji0) it.next()).onDestroy();
        }
        interfaceC7902Li0.getLifecycle().mo2369b(this);
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_START)
    public void onStart(InterfaceC7902Li0 interfaceC7902Li0) {
        Iterator it = AbstractC7381Bh1.m806e(this.f17788a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7798Ji0) it.next()).onStart();
        }
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_STOP)
    public void onStop(InterfaceC7902Li0 interfaceC7902Li0) {
        Iterator it = AbstractC7381Bh1.m806e(this.f17788a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7798Ji0) it.next()).onStop();
        }
    }
}
