package io.sentry.android.replay;

import android.view.View;
import java.lang.ref.WeakReference;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6497nZ;
import p000.O90;

/* renamed from: io.sentry.android.replay.y */
/* loaded from: classes2.dex */
public final class C5977y extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f34070e;

    /* renamed from: f */
    public final /* synthetic */ View f34071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5977y(int i, View view) {
        super(1);
        this.f34070e = i;
        this.f34071f = view;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f34070e) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                O90.m5968f(weakReference, "it");
                return Boolean.valueOf(O90.m5963a(weakReference.get(), this.f34071f));
            default:
                WeakReference weakReference2 = (WeakReference) obj;
                O90.m5968f(weakReference2, "it");
                return Boolean.valueOf(O90.m5963a(weakReference2.get(), this.f34071f));
        }
    }
}
