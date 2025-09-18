package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: RF */
/* loaded from: classes.dex */
public final class RunnableC1085RF implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10092a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f10093b;

    /* renamed from: c */
    public final /* synthetic */ C1463XF f10094c;

    public /* synthetic */ RunnableC1085RF(C1463XF c1463xf, ArrayList arrayList, int i) {
        this.f10092a = i;
        this.f10094c = c1463xf;
        this.f10093b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10092a) {
            case 0:
                ArrayList arrayList = this.f10093b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1463XF c1463xf = this.f10094c;
                    if (!zHasNext) {
                        arrayList.clear();
                        c1463xf.f13640m.remove(arrayList);
                        break;
                    } else {
                        C1400WF c1400wf = (C1400WF) it.next();
                        OO0 oo0 = c1400wf.f13091a;
                        c1463xf.getClass();
                        View view = oo0.f8408a;
                        int i = c1400wf.f13094d - c1400wf.f13092b;
                        int i2 = c1400wf.f13095e - c1400wf.f13093c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1463xf.f13643p.add(oo0);
                        viewPropertyAnimatorAnimate.setDuration(c1463xf.f44851e).setListener(new C1211TF(c1463xf, oo0, i, view, i2, viewPropertyAnimatorAnimate)).start();
                    }
                }
            default:
                ArrayList arrayList2 = this.f10093b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C1463XF c1463xf2 = this.f10094c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c1463xf2.f13639l.remove(arrayList2);
                        break;
                    } else {
                        OO0 oo02 = (OO0) it2.next();
                        c1463xf2.getClass();
                        View view2 = oo02.f8408a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        c1463xf2.f13642o.add(oo02);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(c1463xf2.f44849c).setListener(new C1148SF(c1463xf2, oo02, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                }
        }
    }
}
