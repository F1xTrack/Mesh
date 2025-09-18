package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class X6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ X6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                C3902g7 c3902g7 = (C3902g7) this.b;
                if (!c3902g7.getInternalPopup().a()) {
                    c3902g7.f.l(c3902g7.getTextDirection(), c3902g7.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c3902g7.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                C3330d7 c3330d7 = (C3330d7) this.b;
                C3902g7 c3902g72 = c3330d7.H;
                c3330d7.getClass();
                if (!c3902g72.isAttachedToWindow() || !c3902g72.getGlobalVisibleRect(c3330d7.F)) {
                    c3330d7.dismiss();
                    break;
                } else {
                    c3330d7.r();
                    c3330d7.b();
                    break;
                }
                break;
            case 2:
                ViewOnKeyListenerC0068Aq viewOnKeyListenerC0068Aq = (ViewOnKeyListenerC0068Aq) this.b;
                if (viewOnKeyListenerC0068Aq.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0068Aq.h;
                    if (arrayList.size() > 0 && !((C8437zq) arrayList.get(0)).a.y) {
                        View view = viewOnKeyListenerC0068Aq.o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C8437zq) it.next()).a.b();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0068Aq.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                ViewOnKeyListenerC6199o41 viewOnKeyListenerC6199o41 = (ViewOnKeyListenerC6199o41) this.b;
                if (viewOnKeyListenerC6199o41.a()) {
                    C1706Vq0 c1706Vq0 = viewOnKeyListenerC6199o41.h;
                    if (!c1706Vq0.y) {
                        View view2 = viewOnKeyListenerC6199o41.m;
                        if (view2 != null && view2.isShown()) {
                            c1706Vq0.b();
                            break;
                        } else {
                            viewOnKeyListenerC6199o41.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
