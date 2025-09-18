package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: pO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10643pO0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f40045a;

    /* renamed from: b */
    public final /* synthetic */ RecyclerView f40046b;

    public /* synthetic */ RunnableC10643pO0(RecyclerView recyclerView, int i) {
        this.f40045a = i;
        this.f40046b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, SR1 {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3 = this.f40046b;
        switch (this.f40045a) {
            case 0:
                if (recyclerView3.f16523u && !recyclerView3.isLayoutRequested()) {
                    if (!recyclerView3.f16519s) {
                        recyclerView3.requestLayout();
                        break;
                    } else if (!recyclerView3.f16529x) {
                        recyclerView3.m10277p();
                        break;
                    } else {
                        recyclerView3.f16527w = true;
                        break;
                    }
                }
                break;
            default:
                AbstractC11538wO0 abstractC11538wO0 = recyclerView3.f16483M;
                if (abstractC11538wO0 != null) {
                    C1463XF c1463xf = (C1463XF) abstractC11538wO0;
                    ArrayList arrayList = c1463xf.f13635h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c1463xf.f13637j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c1463xf.f13638k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c1463xf.f13636i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        recyclerView2 = recyclerView3;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            recyclerView2 = recyclerView3;
                            long j = c1463xf.f44850d;
                            if (zHasNext) {
                                OO0 oo0 = (OO0) it.next();
                                View view = oo0.f8408a;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c1463xf.f13644q.add(oo0);
                                viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C1148SF(c1463xf, oo0, viewPropertyAnimatorAnimate, view)).start();
                                recyclerView3 = recyclerView2;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c1463xf.f13640m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC1085RF runnableC1085RF = new RunnableC1085RF(c1463xf, arrayList5, 0);
                                    if (zIsEmpty) {
                                        runnableC1085RF.run();
                                    } else {
                                        View view2 = ((C1400WF) arrayList5.get(0)).f13091a.f8408a;
                                        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                                        view2.postOnAnimationDelayed(runnableC1085RF, j);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c1463xf.f13641n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC1483XZ runnableC1483XZ = new RunnableC1483XZ(c1463xf, arrayList6, false, 6);
                                    if (zIsEmpty) {
                                        runnableC1483XZ.run();
                                    } else {
                                        View view3 = ((C1337VF) arrayList6.get(0)).f12460a.f8408a;
                                        WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                                        view3.postOnAnimationDelayed(runnableC1483XZ, j);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c1463xf.f13639l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC1085RF runnableC1085RF2 = new RunnableC1085RF(c1463xf, arrayList7, 1);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        runnableC1085RF2.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? c1463xf.f44851e : 0L, zIsEmpty3 ? 0L : c1463xf.f44852f) + j;
                                        View view4 = ((OO0) arrayList7.get(0)).f8408a;
                                        WeakHashMap weakHashMap3 = AbstractC10944rk1.f41842a;
                                        view4.postOnAnimationDelayed(runnableC1085RF2, jMax);
                                    }
                                }
                            }
                        }
                    }
                    recyclerView = recyclerView2;
                } else {
                    recyclerView = recyclerView3;
                }
                recyclerView.f16532y1 = false;
                break;
        }
    }
}
