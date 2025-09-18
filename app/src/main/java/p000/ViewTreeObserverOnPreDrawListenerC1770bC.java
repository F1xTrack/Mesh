package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bC */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1770bC implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ int f16858a = 0;

    /* renamed from: b */
    public final WeakReference f16859b;

    public ViewTreeObserverOnPreDrawListenerC1770bC(C1832cC c1832cC) {
        this.f16859b = new WeakReference(c1832cC);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        switch (this.f16858a) {
            case 0:
                C1832cC c1832cC = (C1832cC) this.f16859b.get();
                if (c1832cC != null) {
                    ArrayList arrayList = c1832cC.f17365b;
                    if (!arrayList.isEmpty()) {
                        View view = c1832cC.f17364a;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iM10623a = c1832cC.m10623a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iM10623a2 = c1832cC.m10623a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iM10623a > 0 || iM10623a == Integer.MIN_VALUE) {
                            if (iM10623a2 > 0 || iM10623a2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((J11) ((InterfaceC9190e21) it.next())).m4129n(iM10623a, iM10623a2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c1832cC.f17366c);
                                }
                                c1832cC.f17366c = null;
                                arrayList.clear();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                C11330ul1 c11330ul1 = (C11330ul1) this.f16859b.get();
                if (c11330ul1 != null) {
                    ArrayList arrayList2 = c11330ul1.f43846b;
                    if (!arrayList2.isEmpty()) {
                        ImageView imageView = c11330ul1.f43845a;
                        int paddingRight2 = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                        int iM25231a = c11330ul1.m25231a(imageView.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                        int iM25231a2 = c11330ul1.m25231a(imageView.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if (iM25231a > 0 || iM25231a == Integer.MIN_VALUE) {
                            if (iM25231a2 > 0 || iM25231a2 == Integer.MIN_VALUE) {
                                Iterator it2 = new ArrayList(arrayList2).iterator();
                                while (it2.hasNext()) {
                                    ((J11) ((InterfaceC9190e21) it2.next())).m4129n(iM25231a, iM25231a2);
                                }
                                ViewTreeObserver viewTreeObserver2 = imageView.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(c11330ul1.f43847c);
                                }
                                c11330ul1.f43847c = null;
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

    public ViewTreeObserverOnPreDrawListenerC1770bC(C11330ul1 c11330ul1) {
        this.f16859b = new WeakReference(c11330ul1);
    }
}
