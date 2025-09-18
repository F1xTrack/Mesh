package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: w6 */
/* loaded from: classes.dex */
public final class C7054w6 extends N02 {

    /* renamed from: a */
    public final /* synthetic */ int f44677a;

    /* renamed from: b */
    public final /* synthetic */ Object f44678b;

    public /* synthetic */ C7054w6(int i, Object obj) {
        this.f44677a = i;
        this.f44678b = obj;
    }

    @Override // p000.N02, p000.InterfaceC10946rl1
    /* renamed from: b */
    public void mo5509b() {
        Object obj = this.f44678b;
        switch (this.f44677a) {
            case 0:
                ((RunnableC6991v6) obj).f44146b.f4104v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) obj;
                layoutInflaterFactory2C0448H6.f4104v.setVisibility(0);
                if (layoutInflaterFactory2C0448H6.f4104v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0448H6.f4104v.getParent();
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    AbstractC9280ek1.m18029c(view);
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC10946rl1
    /* renamed from: c */
    public final void mo18261c() {
        Object obj = this.f44678b;
        switch (this.f44677a) {
            case 0:
                RunnableC6991v6 runnableC6991v6 = (RunnableC6991v6) obj;
                runnableC6991v6.f44146b.f4104v.setAlpha(1.0f);
                LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = runnableC6991v6.f44146b;
                layoutInflaterFactory2C0448H6.f4107y.m23873d(null);
                layoutInflaterFactory2C0448H6.f4107y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H62 = (LayoutInflaterFactory2C0448H6) obj;
                layoutInflaterFactory2C0448H62.f4104v.setAlpha(1.0f);
                layoutInflaterFactory2C0448H62.f4107y.m23873d(null);
                layoutInflaterFactory2C0448H62.f4107y = null;
                break;
            default:
                C1339VH c1339vh = (C1339VH) obj;
                ((LayoutInflaterFactory2C0448H6) c1339vh.f12487c).f4104v.setVisibility(8);
                LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H63 = (LayoutInflaterFactory2C0448H6) c1339vh.f12487c;
                PopupWindow popupWindow = layoutInflaterFactory2C0448H63.f4105w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0448H63.f4104v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0448H63.f4104v.getParent();
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    AbstractC9280ek1.m18029c(view);
                }
                layoutInflaterFactory2C0448H63.f4104v.m9835e();
                layoutInflaterFactory2C0448H63.f4107y.m23873d(null);
                layoutInflaterFactory2C0448H63.f4107y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0448H63.f4059A;
                WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                AbstractC9280ek1.m18029c(viewGroup);
                break;
        }
    }
}
