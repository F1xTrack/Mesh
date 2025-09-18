package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: Pi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1213Pi extends F02 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC5795lz b;

    public /* synthetic */ C1213Pi(AbstractC5795lz abstractC5795lz, int i) {
        this.a = i;
        this.b = abstractC5795lz;
    }

    @Override // defpackage.F02
    public final int a(int i, View view) {
        int iB;
        int i2;
        switch (this.a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                C5554ki0 c5554ki0 = sideSheetBehavior.a;
                switch (c5554ki0.a) {
                    case 0:
                        iB = -c5554ki0.b.l;
                        break;
                    default:
                        iB = c5554ki0.b();
                        break;
                }
                C5554ki0 c5554ki02 = sideSheetBehavior.a;
                switch (c5554ki02.a) {
                    case 0:
                        i2 = c5554ki02.b.o;
                        break;
                    default:
                        i2 = c5554ki02.b.m;
                        break;
                }
                return AbstractC0565Gz1.a(i, iB, i2);
        }
    }

    @Override // defpackage.F02
    public final int b(int i, View view) {
        switch (this.a) {
            case 0:
                return AbstractC0565Gz1.a(i, ((BottomSheetBehavior) this.b).z(), e());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.F02
    public int d(View view) {
        switch (this.a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.d(view);
        }
    }

    @Override // defpackage.F02
    public int e() {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
            default:
                return super.e();
        }
    }

    @Override // defpackage.F02
    public final void i(int i) {
        switch (this.a) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.H(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.s(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.F02
    public final void j(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.a) {
            case 0:
                ((BottomSheetBehavior) this.b).w(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    C5554ki0 c5554ki0 = sideSheetBehavior.a;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (c5554ki0.a) {
                        case 0:
                            if (left <= c5554ki0.b.m) {
                                marginLayoutParams.leftMargin = right;
                                break;
                            }
                            break;
                        default:
                            int i3 = c5554ki0.b.m;
                            if (left <= i3) {
                                marginLayoutParams.rightMargin = i3 - left;
                                break;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                C5554ki0 c5554ki02 = sideSheetBehavior.a;
                switch (c5554ki02.a) {
                    case 0:
                        c5554ki02.c();
                        c5554ki02.b();
                        break;
                    default:
                        int i4 = c5554ki02.b.m;
                        c5554ki02.b();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC8235ym.d(it);
                }
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0028. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // defpackage.F02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1213Pi.k(android.view.View, float, float):void");
    }

    @Override // defpackage.F02
    public final boolean l(int i, View view) {
        WeakReference weakReference;
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                int i2 = bottomSheetBehavior.L;
                if (i2 != 1 && !bottomSheetBehavior.a0) {
                    if (i2 == 3 && bottomSheetBehavior.Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.p) != null && weakReference.get() == view) {
                    break;
                }
                break;
        }
        return true;
    }
}
