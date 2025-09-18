package io.sentry.react;

import android.view.View;
import defpackage.AbstractC6260oP;
import defpackage.InterfaceC7405uP;
import defpackage.InterfaceC7976xP;
import defpackage.N61;

/* loaded from: classes2.dex */
public final class h implements InterfaceC7976xP {
    public final /* synthetic */ InterfaceC7405uP a;
    public final /* synthetic */ View b;
    public final /* synthetic */ N61 c;
    public final /* synthetic */ i d;

    public h(i iVar, InterfaceC7405uP interfaceC7405uP, View view, N61 n61) {
        this.d = iVar;
        this.a = interfaceC7405uP;
        this.b = view;
        this.c = n61;
    }

    @Override // defpackage.InterfaceC7976xP
    public final void onEventDispatch(AbstractC6260oP abstractC6260oP) {
        if ("so".equals(abstractC6260oP.getClass().getCanonicalName())) {
            this.a.a(this);
            io.sentry.android.core.internal.util.f.b(this.b, this.c, this.d.a);
        }
    }
}
