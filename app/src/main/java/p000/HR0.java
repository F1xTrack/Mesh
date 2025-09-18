package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class HR0 implements A81 {

    /* renamed from: a */
    public final C1832cC f4290a;

    /* renamed from: b */
    public final View f4291b;

    public HR0(View view) {
        IL1.m3830d(view, "Argument must not be null");
        this.f4291b = view;
        this.f4290a = new C1832cC(view);
    }

    @Override // p000.A81
    /* renamed from: a */
    public final void mo77a(J11 j11) {
        this.f4290a.f17365b.remove(j11);
    }

    @Override // p000.A81
    /* renamed from: b */
    public final void mo78b(J11 j11) throws Throwable {
        C1832cC c1832cC = this.f4290a;
        View view = c1832cC.f17364a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM10623a = c1832cC.m10623a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = c1832cC.f17364a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iM10623a2 = c1832cC.m10623a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM10623a > 0 || iM10623a == Integer.MIN_VALUE) && (iM10623a2 > 0 || iM10623a2 == Integer.MIN_VALUE)) {
            j11.m4129n(iM10623a, iM10623a2);
            return;
        }
        ArrayList arrayList = c1832cC.f17365b;
        if (!arrayList.contains(j11)) {
            arrayList.add(j11);
        }
        if (c1832cC.f17366c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC1770bC viewTreeObserverOnPreDrawListenerC1770bC = new ViewTreeObserverOnPreDrawListenerC1770bC(c1832cC);
            c1832cC.f17366c = viewTreeObserverOnPreDrawListenerC1770bC;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1770bC);
        }
    }

    @Override // p000.A81
    /* renamed from: c */
    public final void mo79c(InterfaceC10905rR0 interfaceC10905rR0) {
        this.f4291b.setTag(R.id.glide_custom_view_target_tag, interfaceC10905rR0);
    }

    @Override // p000.A81
    /* renamed from: h */
    public final InterfaceC10905rR0 mo83h() {
        Object tag = this.f4291b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC10905rR0) {
            return (InterfaceC10905rR0) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // p000.A81
    /* renamed from: i */
    public final void mo84i(Drawable drawable) {
        C1832cC c1832cC = this.f4290a;
        ViewTreeObserver viewTreeObserver = c1832cC.f17364a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c1832cC.f17366c);
        }
        c1832cC.f17366c = null;
        c1832cC.f17365b.clear();
    }

    public final String toString() {
        return "Target for: " + this.f4291b;
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onDestroy() {
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStart() {
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStop() {
    }

    @Override // p000.A81
    /* renamed from: e */
    public final void mo80e(Object obj) {
    }

    @Override // p000.A81
    /* renamed from: f */
    public final void mo81f(Drawable drawable) {
    }

    @Override // p000.A81
    /* renamed from: g */
    public final void mo82g(Drawable drawable) {
    }
}
