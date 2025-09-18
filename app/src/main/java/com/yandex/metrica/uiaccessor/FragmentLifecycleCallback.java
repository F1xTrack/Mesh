package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import p000.AbstractC4060fY;
import p000.InterfaceC9036cq1;

/* loaded from: classes2.dex */
public class FragmentLifecycleCallback extends AbstractC4060fY {

    /* renamed from: a */
    public final InterfaceC9036cq1 f25522a;

    /* renamed from: b */
    public final WeakReference f25523b;

    public FragmentLifecycleCallback(InterfaceC9036cq1 interfaceC9036cq1, Activity activity) {
        this.f25522a = interfaceC9036cq1;
        this.f25523b = new WeakReference(activity);
    }

    @Override // p000.AbstractC4060fY
    public void onFragmentAttached(AbstractC1733o abstractC1733o, Fragment fragment, Context context) {
        Activity activity = (Activity) this.f25523b.get();
        if (activity != null) {
            this.f25522a.fragmentAttached(activity);
        }
    }
}
