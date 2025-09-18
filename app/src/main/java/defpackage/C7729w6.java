package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7729w6 extends N02 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C7729w6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.N02, defpackage.InterfaceC6900rl1
    public void b() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((RunnableC7539v6) obj).b.v.setVisibility(0);
                break;
            case 1:
                H6 h6 = (H6) obj;
                h6.v.setVisibility(0);
                if (h6.v.getParent() instanceof View) {
                    View view = (View) h6.v.getParent();
                    WeakHashMap weakHashMap = AbstractC6897rk1.a;
                    AbstractC3639ek1.c(view);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC6900rl1
    public final void c() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                RunnableC7539v6 runnableC7539v6 = (RunnableC7539v6) obj;
                runnableC7539v6.b.v.setAlpha(1.0f);
                H6 h6 = runnableC7539v6.b;
                h6.y.d(null);
                h6.y = null;
                break;
            case 1:
                H6 h62 = (H6) obj;
                h62.v.setAlpha(1.0f);
                h62.y.d(null);
                h62.y = null;
                break;
            default:
                VH vh = (VH) obj;
                ((H6) vh.c).v.setVisibility(8);
                H6 h63 = (H6) vh.c;
                PopupWindow popupWindow = h63.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (h63.v.getParent() instanceof View) {
                    View view = (View) h63.v.getParent();
                    WeakHashMap weakHashMap = AbstractC6897rk1.a;
                    AbstractC3639ek1.c(view);
                }
                h63.v.e();
                h63.y.d(null);
                h63.y = null;
                ViewGroup viewGroup = h63.A;
                WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                AbstractC3639ek1.c(viewGroup);
                break;
        }
    }
}
