package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.C1742a;
import java.util.LinkedHashMap;
import p000.AbstractC4100gB;
import p000.AbstractC7538Ei0;
import p000.C10145lV0;
import p000.C10273mV0;
import p000.C10529oV0;
import p000.C4049fN;
import p000.C7508Dt0;
import p000.C8583Yk1;
import p000.EnumC7382Bi0;
import p000.H20;
import p000.InterfaceC10401nV0;
import p000.InterfaceC8531Xk1;
import p000.InterfaceC8635Zk1;
import p000.LB1;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public final class C1738t implements H20, InterfaceC10401nV0, InterfaceC8635Zk1 {

    /* renamed from: a */
    public final Fragment f16269a;

    /* renamed from: b */
    public final C8583Yk1 f16270b;

    /* renamed from: c */
    public final RunnableC1726h f16271c;

    /* renamed from: d */
    public InterfaceC8531Xk1 f16272d;

    /* renamed from: e */
    public C1742a f16273e = null;

    /* renamed from: f */
    public C10273mV0 f16274f = null;

    public C1738t(Fragment fragment, C8583Yk1 c8583Yk1, RunnableC1726h runnableC1726h) {
        this.f16269a = fragment;
        this.f16270b = c8583Yk1;
        this.f16271c = runnableC1726h;
    }

    /* renamed from: a */
    public final void m10116a(EnumC7382Bi0 enumC7382Bi0) {
        this.f16273e.m10126e(enumC7382Bi0);
    }

    /* renamed from: b */
    public final void m10117b() {
        if (this.f16273e == null) {
            this.f16273e = new C1742a(this);
            C10273mV0 c10273mV0 = new C10273mV0(this);
            this.f16274f = c10273mV0;
            c10273mV0.m22830a();
            this.f16271c.run();
        }
    }

    @Override // p000.H20
    public final AbstractC4100gB getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f16269a;
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
        C7508Dt0 c7508Dt0 = new C7508Dt0(0);
        LinkedHashMap linkedHashMap = c7508Dt0.f27599a;
        if (application != null) {
            linkedHashMap.put(C4049fN.f27162g, application);
        }
        linkedHashMap.put(LB1.f6544a, fragment);
        linkedHashMap.put(LB1.f6545b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(LB1.f6546c, fragment.getArguments());
        }
        return c7508Dt0;
    }

    @Override // p000.H20
    public final InterfaceC8531Xk1 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f16269a;
        InterfaceC8531Xk1 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f16272d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f16272d == null) {
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
            this.f16272d = new C10529oV0(application, fragment, fragment.getArguments());
        }
        return this.f16272d;
    }

    @Override // p000.InterfaceC7902Li0
    public final AbstractC7538Ei0 getLifecycle() {
        m10117b();
        return this.f16273e;
    }

    @Override // p000.InterfaceC10401nV0
    public final C10145lV0 getSavedStateRegistry() {
        m10117b();
        return this.f16274f.f37730b;
    }

    @Override // p000.InterfaceC8635Zk1
    public final C8583Yk1 getViewModelStore() {
        m10117b();
        return this.f16270b;
    }
}
