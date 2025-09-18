package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: wn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7860wn1 extends N02 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C8240yn1 b;

    public /* synthetic */ C7860wn1(C8240yn1 c8240yn1, int i) {
        this.a = i;
        this.b = c8240yn1;
    }

    @Override // defpackage.InterfaceC6900rl1
    public final void c() {
        View view;
        C8240yn1 c8240yn1 = this.b;
        switch (this.a) {
            case 0:
                if (c8240yn1.o && (view = c8240yn1.g) != null) {
                    view.setTranslationY(0.0f);
                    c8240yn1.d.setTranslationY(0.0f);
                }
                c8240yn1.d.setVisibility(8);
                c8240yn1.d.setTransitioning(false);
                c8240yn1.s = null;
                VH vh = c8240yn1.k;
                if (vh != null) {
                    vh.B(c8240yn1.j);
                    c8240yn1.j = null;
                    c8240yn1.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c8240yn1.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC6897rk1.a;
                    AbstractC3639ek1.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c8240yn1.s = null;
                c8240yn1.d.requestLayout();
                break;
        }
    }
}
