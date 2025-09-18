package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X6 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1454X6 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ int f13564a;

    /* renamed from: b */
    public final /* synthetic */ Object f13565b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1454X6(int i, Object obj) {
        this.f13564a = i;
        this.f13565b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f13564a) {
            case 0:
                C4096g7 c4096g7 = (C4096g7) this.f13565b;
                if (!c4096g7.getInternalPopup().mo9475a()) {
                    c4096g7.f27573f.mo9484l(c4096g7.getTextDirection(), c4096g7.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c4096g7.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                C3908d7 c3908d7 = (C3908d7) this.f13565b;
                C4096g7 c4096g72 = c3908d7.f25822H;
                c3908d7.getClass();
                if (!c4096g72.isAttachedToWindow() || !c4096g72.getGlobalVisibleRect(c3908d7.f25820F)) {
                    c3908d7.dismiss();
                    break;
                } else {
                    c3908d7.m17495r();
                    c3908d7.mo335b();
                    break;
                }
                break;
            case 2:
                ViewOnKeyListenerC0053Aq viewOnKeyListenerC0053Aq = (ViewOnKeyListenerC0053Aq) this.f13565b;
                if (viewOnKeyListenerC0053Aq.mo334a()) {
                    ArrayList arrayList = viewOnKeyListenerC0053Aq.f404h;
                    if (arrayList.size() > 0 && !((C7289zq) arrayList.get(0)).f47024a.f4479y) {
                        View view = viewOnKeyListenerC0053Aq.f411o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C7289zq) it.next()).f47024a.mo335b();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0053Aq.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                ViewOnKeyListenerC10476o41 viewOnKeyListenerC10476o41 = (ViewOnKeyListenerC10476o41) this.f13565b;
                if (viewOnKeyListenerC10476o41.mo334a()) {
                    C8438Vq0 c8438Vq0 = viewOnKeyListenerC10476o41.f38776h;
                    if (!c8438Vq0.f4479y) {
                        View view2 = viewOnKeyListenerC10476o41.f38781m;
                        if (view2 != null && view2.isShown()) {
                            c8438Vq0.mo335b();
                            break;
                        } else {
                            viewOnKeyListenerC10476o41.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
