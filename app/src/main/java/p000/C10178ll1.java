package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: ll1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10178ll1 extends AbstractC10899rO0 {

    /* renamed from: d */
    public final ArrayList f37283d = new ArrayList();

    @Override // p000.AbstractC10899rO0
    /* renamed from: a */
    public final int mo3173a() {
        return this.f37283d.size();
    }

    @Override // p000.AbstractC10899rO0
    /* renamed from: c */
    public final void mo3174c(OO0 oo0, int i) {
        C10306ml1 c10306ml1 = (C10306ml1) oo0;
        View view = c10306ml1.f8408a;
        O90.m5966d(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) view;
        Object obj = this.f37283d.get(i);
        O90.m5967e(obj, "get(...)");
        View view2 = (View) obj;
        c10306ml1.m6058o(false);
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view2.getParent() != null) {
            ViewParent parent = view2.getParent();
            O90.m5966d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(view2);
        }
        frameLayout.addView(view2);
    }

    @Override // p000.AbstractC10899rO0
    /* renamed from: d */
    public final OO0 mo3175d(ViewGroup viewGroup) {
        O90.m5968f(viewGroup, "parent");
        int i = C10306ml1.f37862u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setSaveEnabled(false);
        return new C10306ml1(frameLayout);
    }
}
