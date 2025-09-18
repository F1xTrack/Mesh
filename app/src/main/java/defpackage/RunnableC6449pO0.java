package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: pO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6449pO0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ RunnableC6449pO0(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, SR1 {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3 = this.b;
        switch (this.a) {
            case 0:
                if (recyclerView3.u && !recyclerView3.isLayoutRequested()) {
                    if (!recyclerView3.s) {
                        recyclerView3.requestLayout();
                        break;
                    } else if (!recyclerView3.x) {
                        recyclerView3.p();
                        break;
                    } else {
                        recyclerView3.w = true;
                        break;
                    }
                }
                break;
            default:
                AbstractC7784wO0 abstractC7784wO0 = recyclerView3.M;
                if (abstractC7784wO0 != null) {
                    XF xf = (XF) abstractC7784wO0;
                    ArrayList arrayList = xf.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = xf.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = xf.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = xf.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        recyclerView2 = recyclerView3;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            recyclerView2 = recyclerView3;
                            long j = xf.d;
                            if (zHasNext) {
                                OO0 oo0 = (OO0) it.next();
                                View view = oo0.a;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                xf.q.add(oo0);
                                viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new SF(xf, oo0, viewPropertyAnimatorAnimate, view)).start();
                                recyclerView3 = recyclerView2;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    xf.m.add(arrayList5);
                                    arrayList2.clear();
                                    RF rf = new RF(xf, arrayList5, 0);
                                    if (zIsEmpty) {
                                        rf.run();
                                    } else {
                                        View view2 = ((WF) arrayList5.get(0)).a.a;
                                        WeakHashMap weakHashMap = AbstractC6897rk1.a;
                                        view2.postOnAnimationDelayed(rf, j);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    xf.n.add(arrayList6);
                                    arrayList3.clear();
                                    XZ xz = new XZ(xf, arrayList6, false, 6);
                                    if (zIsEmpty) {
                                        xz.run();
                                    } else {
                                        View view3 = ((VF) arrayList6.get(0)).a.a;
                                        WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                                        view3.postOnAnimationDelayed(xz, j);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    xf.l.add(arrayList7);
                                    arrayList4.clear();
                                    RF rf2 = new RF(xf, arrayList7, 1);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        rf2.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? xf.e : 0L, zIsEmpty3 ? 0L : xf.f) + j;
                                        View view4 = ((OO0) arrayList7.get(0)).a;
                                        WeakHashMap weakHashMap3 = AbstractC6897rk1.a;
                                        view4.postOnAnimationDelayed(rf2, jMax);
                                    }
                                }
                            }
                        }
                    }
                    recyclerView = recyclerView2;
                } else {
                    recyclerView = recyclerView3;
                }
                recyclerView.y1 = false;
                break;
        }
    }
}
