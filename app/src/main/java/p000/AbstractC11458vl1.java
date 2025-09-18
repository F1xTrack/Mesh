package p000;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* renamed from: vl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11458vl1 implements A81 {

    /* renamed from: a */
    public final ImageView f44516a;

    /* renamed from: b */
    public final C11330ul1 f44517b;

    public AbstractC11458vl1(ImageView imageView) {
        IL1.m3830d(imageView, "Argument must not be null");
        this.f44516a = imageView;
        this.f44517b = new C11330ul1(imageView);
    }

    @Override // p000.A81
    /* renamed from: a */
    public final void mo77a(J11 j11) {
        this.f44517b.f43846b.remove(j11);
    }

    @Override // p000.A81
    /* renamed from: b */
    public final void mo78b(J11 j11) throws Throwable {
        C11330ul1 c11330ul1 = this.f44517b;
        ImageView imageView = c11330ul1.f43845a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iM25231a = c11330ul1.m25231a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = c11330ul1.f43845a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iM25231a2 = c11330ul1.m25231a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM25231a > 0 || iM25231a == Integer.MIN_VALUE) && (iM25231a2 > 0 || iM25231a2 == Integer.MIN_VALUE)) {
            j11.m4129n(iM25231a, iM25231a2);
            return;
        }
        ArrayList arrayList = c11330ul1.f43846b;
        if (!arrayList.contains(j11)) {
            arrayList.add(j11);
        }
        if (c11330ul1.f43847c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC1770bC viewTreeObserverOnPreDrawListenerC1770bC = new ViewTreeObserverOnPreDrawListenerC1770bC(c11330ul1);
            c11330ul1.f43847c = viewTreeObserverOnPreDrawListenerC1770bC;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1770bC);
        }
    }

    @Override // p000.A81
    /* renamed from: c */
    public final void mo79c(InterfaceC10905rR0 interfaceC10905rR0) {
        this.f44516a.setTag(R.id.glide_custom_view_target_tag, interfaceC10905rR0);
    }

    @Override // p000.A81
    /* renamed from: h */
    public final InterfaceC10905rR0 mo83h() {
        Object tag = this.f44516a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC10905rR0) {
            return (InterfaceC10905rR0) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final String toString() {
        return "Target for: " + this.f44516a;
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onDestroy() {
    }
}
