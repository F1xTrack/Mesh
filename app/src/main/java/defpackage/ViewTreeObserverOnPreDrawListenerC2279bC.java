package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2279bC implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public ViewTreeObserverOnPreDrawListenerC2279bC(C2469cC c2469cC) {
        this.b = new WeakReference(c2469cC);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        switch (this.a) {
            case 0:
                C2469cC c2469cC = (C2469cC) this.b.get();
                if (c2469cC != null) {
                    ArrayList arrayList = c2469cC.b;
                    if (!arrayList.isEmpty()) {
                        View view = c2469cC.a;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iA = c2469cC.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iA2 = c2469cC.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iA > 0 || iA == Integer.MIN_VALUE) {
                            if (iA2 > 0 || iA2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((J11) ((InterfaceC3505e21) it.next())).n(iA, iA2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c2469cC.c);
                                }
                                c2469cC.c = null;
                                arrayList.clear();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                C7473ul1 c7473ul1 = (C7473ul1) this.b.get();
                if (c7473ul1 != null) {
                    ArrayList arrayList2 = c7473ul1.b;
                    if (!arrayList2.isEmpty()) {
                        ImageView imageView = c7473ul1.a;
                        int paddingRight2 = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                        int iA3 = c7473ul1.a(imageView.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                        int iA4 = c7473ul1.a(imageView.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if (iA3 > 0 || iA3 == Integer.MIN_VALUE) {
                            if (iA4 > 0 || iA4 == Integer.MIN_VALUE) {
                                Iterator it2 = new ArrayList(arrayList2).iterator();
                                while (it2.hasNext()) {
                                    ((J11) ((InterfaceC3505e21) it2.next())).n(iA3, iA4);
                                }
                                ViewTreeObserver viewTreeObserver2 = imageView.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(c7473ul1.c);
                                }
                                c7473ul1.c = null;
                                arrayList2.clear();
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC2279bC(C7473ul1 c7473ul1) {
        this.b = new WeakReference(c7473ul1);
    }
}
