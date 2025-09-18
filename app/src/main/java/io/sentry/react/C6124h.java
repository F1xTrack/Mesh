package io.sentry.react;

import android.view.View;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC5886f;
import p000.AbstractC6550oP;
import p000.InterfaceC6947uP;
import p000.InterfaceC7136xP;
import p000.N61;

/* renamed from: io.sentry.react.h */
/* loaded from: classes2.dex */
public final class C6124h implements InterfaceC7136xP {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC6947uP f34542a;

    /* renamed from: b */
    public final /* synthetic */ View f34543b;

    /* renamed from: c */
    public final /* synthetic */ N61 f34544c;

    /* renamed from: d */
    public final /* synthetic */ C6125i f34545d;

    public C6124h(C6125i c6125i, InterfaceC6947uP interfaceC6947uP, View view, N61 n61) {
        this.f34545d = c6125i;
        this.f34542a = interfaceC6947uP;
        this.f34543b = view;
        this.f34544c = n61;
    }

    @Override // p000.InterfaceC7136xP
    public final void onEventDispatch(AbstractC6550oP abstractC6550oP) {
        if ("so".equals(abstractC6550oP.getClass().getCanonicalName())) {
            this.f34542a.mo11040a(this);
            ViewTreeObserverOnDrawListenerC5886f.m21585b(this.f34543b, this.f34544c, this.f34545d.f34546a);
        }
    }
}
