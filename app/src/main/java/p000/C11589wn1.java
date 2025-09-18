package p000;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: wn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11589wn1 extends N02 {

    /* renamed from: a */
    public final /* synthetic */ int f45106a;

    /* renamed from: b */
    public final /* synthetic */ C11843yn1 f45107b;

    public /* synthetic */ C11589wn1(C11843yn1 c11843yn1, int i) {
        this.f45106a = i;
        this.f45107b = c11843yn1;
    }

    @Override // p000.InterfaceC10946rl1
    /* renamed from: c */
    public final void mo18261c() {
        View view;
        C11843yn1 c11843yn1 = this.f45107b;
        switch (this.f45106a) {
            case 0:
                if (c11843yn1.f46475o && (view = c11843yn1.f46467g) != null) {
                    view.setTranslationY(0.0f);
                    c11843yn1.f46464d.setTranslationY(0.0f);
                }
                c11843yn1.f46464d.setVisibility(8);
                c11843yn1.f46464d.setTransitioning(false);
                c11843yn1.f46479s = null;
                C1339VH c1339vh = c11843yn1.f46471k;
                if (c1339vh != null) {
                    c1339vh.m8359B(c11843yn1.f46470j);
                    c11843yn1.f46470j = null;
                    c11843yn1.f46471k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c11843yn1.f46463c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    AbstractC9280ek1.m18029c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c11843yn1.f46479s = null;
                c11843yn1.f46464d.requestLayout();
                break;
        }
    }
}
