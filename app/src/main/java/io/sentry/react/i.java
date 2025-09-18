package io.sentry.react;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.facebook.react.bridge.ReactContext;
import defpackage.AbstractC3792fY;
import defpackage.InterfaceC7405uP;
import defpackage.N61;
import defpackage.OZ1;
import io.sentry.EnumC5148n1;
import io.sentry.android.core.D;
import io.sentry.android.core.T;

/* loaded from: classes2.dex */
public final class i extends AbstractC3792fY {
    public final D a;
    public final N61 b;

    public i(D d, N61 n61) {
        T t = d.l;
        this.a = d;
        this.b = n61;
    }

    @Override // defpackage.AbstractC3792fY
    public final void onFragmentViewCreated(o oVar, Fragment fragment, View view, Bundle bundle) {
        if (!"pW0".equals(fragment.getClass().getCanonicalName())) {
            d.l.k(EnumC5148n1.DEBUG, "Fragment is not a ScreenStackFragment, won't listen for the first draw.", new Object[0]);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            d.l.k(EnumC5148n1.WARNING, "Fragment view is not a ViewGroup, won't listen for the first draw.", new Object[0]);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            d.l.k(EnumC5148n1.WARNING, "Fragment view has no children, won't listen for the first draw.", new Object[0]);
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null || !(childAt.getContext() instanceof ReactContext)) {
            d.l.k(EnumC5148n1.WARNING, "Fragment view has no ReactContext, won't listen for the first draw.", new Object[0]);
            return;
        }
        int id = childAt.getId();
        if (id == -1) {
            d.l.k(EnumC5148n1.WARNING, "Screen has no id, won't listen for the first draw.", new Object[0]);
            return;
        }
        InterfaceC7405uP interfaceC7405uPB = OZ1.b(OZ1.c(childAt), id);
        if (interfaceC7405uPB == null) {
            d.l.k(EnumC5148n1.WARNING, "Screen has no event dispatcher, won't listen for the first draw.", new Object[0]);
        } else {
            interfaceC7405uPB.j(new h(this, interfaceC7405uPB, view, this.b));
        }
    }
}
