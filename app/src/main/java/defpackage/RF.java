package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class RF implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ XF c;

    public /* synthetic */ RF(XF xf, ArrayList arrayList, int i) {
        this.a = i;
        this.c = xf;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    XF xf = this.c;
                    if (!zHasNext) {
                        arrayList.clear();
                        xf.m.remove(arrayList);
                        break;
                    } else {
                        WF wf = (WF) it.next();
                        OO0 oo0 = wf.a;
                        xf.getClass();
                        View view = oo0.a;
                        int i = wf.d - wf.b;
                        int i2 = wf.e - wf.c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        xf.p.add(oo0);
                        viewPropertyAnimatorAnimate.setDuration(xf.e).setListener(new TF(xf, oo0, i, view, i2, viewPropertyAnimatorAnimate)).start();
                    }
                }
            default:
                ArrayList arrayList2 = this.b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    XF xf2 = this.c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        xf2.l.remove(arrayList2);
                        break;
                    } else {
                        OO0 oo02 = (OO0) it2.next();
                        xf2.getClass();
                        View view2 = oo02.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        xf2.o.add(oo02);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(xf2.c).setListener(new SF(xf2, oo02, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                }
        }
    }
}
