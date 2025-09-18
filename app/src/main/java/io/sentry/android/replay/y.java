package io.sentry.android.replay;

import android.view.View;
import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class y extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, View view) {
        super(1);
        this.e = i;
        this.f = view;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                O90.f(weakReference, "it");
                return Boolean.valueOf(O90.a(weakReference.get(), this.f));
            default:
                WeakReference weakReference2 = (WeakReference) obj;
                O90.f(weakReference2, "it");
                return Boolean.valueOf(O90.a(weakReference2.get(), this.f));
        }
    }
}
