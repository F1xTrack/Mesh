package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: ll1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5755ll1 extends AbstractC6830rO0 {
    public final ArrayList d = new ArrayList();

    @Override // defpackage.AbstractC6830rO0
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.AbstractC6830rO0
    public final void c(OO0 oo0, int i) {
        C5946ml1 c5946ml1 = (C5946ml1) oo0;
        View view = c5946ml1.a;
        O90.d(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) view;
        Object obj = this.d.get(i);
        O90.e(obj, "get(...)");
        View view2 = (View) obj;
        c5946ml1.o(false);
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view2.getParent() != null) {
            ViewParent parent = view2.getParent();
            O90.d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(view2);
        }
        frameLayout.addView(view2);
    }

    @Override // defpackage.AbstractC6830rO0
    public final OO0 d(ViewGroup viewGroup) {
        O90.f(viewGroup, "parent");
        int i = C5946ml1.u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setSaveEnabled(false);
        return new C5946ml1(frameLayout);
    }
}
