package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.AbstractC0357Ei0;
import defpackage.AbstractC3914gB;
import defpackage.C0312Dt0;
import defpackage.C1923Yk1;
import defpackage.C3759fN;
import defpackage.C5706lV0;
import defpackage.C5897mV0;
import defpackage.C6279oV0;
import defpackage.EnumC0123Bi0;
import defpackage.H20;
import defpackage.InterfaceC1845Xk1;
import defpackage.InterfaceC2001Zk1;
import defpackage.InterfaceC6088nV0;
import defpackage.LB1;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class t implements H20, InterfaceC6088nV0, InterfaceC2001Zk1 {
    public final Fragment a;
    public final C1923Yk1 b;
    public final h c;
    public InterfaceC1845Xk1 d;
    public androidx.lifecycle.a e = null;
    public C5897mV0 f = null;

    public t(Fragment fragment, C1923Yk1 c1923Yk1, h hVar) {
        this.a = fragment;
        this.b = c1923Yk1;
        this.c = hVar;
    }

    public final void a(EnumC0123Bi0 enumC0123Bi0) {
        this.e.e(enumC0123Bi0);
    }

    public final void b() {
        if (this.e == null) {
            this.e = new androidx.lifecycle.a(this);
            C5897mV0 c5897mV0 = new C5897mV0(this);
            this.f = c5897mV0;
            c5897mV0.a();
            this.c.run();
        }
    }

    @Override // defpackage.H20
    public final AbstractC3914gB getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0312Dt0 c0312Dt0 = new C0312Dt0(0);
        LinkedHashMap linkedHashMap = c0312Dt0.a;
        if (application != null) {
            linkedHashMap.put(C3759fN.g, application);
        }
        linkedHashMap.put(LB1.a, fragment);
        linkedHashMap.put(LB1.b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(LB1.c, fragment.getArguments());
        }
        return c0312Dt0;
    }

    @Override // defpackage.H20
    public final InterfaceC1845Xk1 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.a;
        InterfaceC1845Xk1 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.d = new C6279oV0(application, fragment, fragment.getArguments());
        }
        return this.d;
    }

    @Override // defpackage.InterfaceC0903Li0
    public final AbstractC0357Ei0 getLifecycle() {
        b();
        return this.e;
    }

    @Override // defpackage.InterfaceC6088nV0
    public final C5706lV0 getSavedStateRegistry() {
        b();
        return this.f.b;
    }

    @Override // defpackage.InterfaceC2001Zk1
    public final C1923Yk1 getViewModelStore() {
        b();
        return this.b;
    }
}
