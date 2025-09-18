package io.sentry.react;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.C5832D;
import io.sentry.android.core.C5847T;
import p000.AbstractC4060fY;
import p000.InterfaceC6947uP;
import p000.N61;
import p000.OZ1;

/* renamed from: io.sentry.react.i */
/* loaded from: classes2.dex */
public final class C6125i extends AbstractC4060fY {

    /* renamed from: a */
    public final C5832D f34546a;

    /* renamed from: b */
    public final N61 f34547b;

    public C6125i(C5832D c5832d, N61 n61) {
        C5847T c5847t = C6120d.f34519l;
        this.f34546a = c5832d;
        this.f34547b = n61;
    }

    @Override // p000.AbstractC4060fY
    public final void onFragmentViewCreated(AbstractC1733o abstractC1733o, Fragment fragment, View view, Bundle bundle) {
        if (!"pW0".equals(fragment.getClass().getCanonicalName())) {
            C6120d.f34519l.mo21407k(EnumC6069n1.DEBUG, "Fragment is not a ScreenStackFragment, won't listen for the first draw.", new Object[0]);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            C6120d.f34519l.mo21407k(EnumC6069n1.WARNING, "Fragment view is not a ViewGroup, won't listen for the first draw.", new Object[0]);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            C6120d.f34519l.mo21407k(EnumC6069n1.WARNING, "Fragment view has no children, won't listen for the first draw.", new Object[0]);
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null || !(childAt.getContext() instanceof ReactContext)) {
            C6120d.f34519l.mo21407k(EnumC6069n1.WARNING, "Fragment view has no ReactContext, won't listen for the first draw.", new Object[0]);
            return;
        }
        int id = childAt.getId();
        if (id == -1) {
            C6120d.f34519l.mo21407k(EnumC6069n1.WARNING, "Screen has no id, won't listen for the first draw.", new Object[0]);
            return;
        }
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(OZ1.m6092c(childAt), id);
        if (interfaceC6947uPM6091b == null) {
            C6120d.f34519l.mo21407k(EnumC6069n1.WARNING, "Screen has no event dispatcher, won't listen for the first draw.", new Object[0]);
        } else {
            interfaceC6947uPM6091b.mo11049j(new C6124h(this, interfaceC6947uPM6091b, view, this.f34547b));
        }
    }
}
