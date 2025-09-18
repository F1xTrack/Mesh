package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: Pi */
/* loaded from: classes.dex */
public final class C0989Pi extends F02 {

    /* renamed from: a */
    public final /* synthetic */ int f9252a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6397lz f9253b;

    public /* synthetic */ C0989Pi(AbstractC6397lz abstractC6397lz, int i) {
        this.f9252a = i;
        this.f9253b = abstractC6397lz;
    }

    @Override // p000.F02
    /* renamed from: a */
    public final int mo1635a(int i, View view) {
        int iM22243b;
        int i2;
        switch (this.f9252a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9253b;
                C10043ki0 c10043ki0 = sideSheetBehavior.f18233a;
                switch (c10043ki0.f36618a) {
                    case 0:
                        iM22243b = -c10043ki0.f36619b.f18244l;
                        break;
                    default:
                        iM22243b = c10043ki0.m22243b();
                        break;
                }
                C10043ki0 c10043ki02 = sideSheetBehavior.f18233a;
                switch (c10043ki02.f36618a) {
                    case 0:
                        i2 = c10043ki02.f36619b.f18247o;
                        break;
                    default:
                        i2 = c10043ki02.f36619b.f18245m;
                        break;
                }
                return AbstractC7677Gz1.m3204a(i, iM22243b, i2);
        }
    }

    @Override // p000.F02
    /* renamed from: b */
    public final int mo1636b(int i, View view) {
        switch (this.f9252a) {
            case 0:
                return AbstractC7677Gz1.m3204a(i, ((BottomSheetBehavior) this.f9253b).m11213z(), mo2483e());
            default:
                return view.getTop();
        }
    }

    @Override // p000.F02
    /* renamed from: d */
    public int mo1637d(View view) {
        switch (this.f9252a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9253b;
                return sideSheetBehavior.f18244l + sideSheetBehavior.f18247o;
            default:
                return super.mo1637d(view);
        }
    }

    @Override // p000.F02
    /* renamed from: e */
    public int mo2483e() {
        switch (this.f9252a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f9253b;
                return bottomSheetBehavior.f18098I ? bottomSheetBehavior.f18109T : bottomSheetBehavior.f18096G;
            default:
                return super.mo2483e();
        }
    }

    @Override // p000.F02
    /* renamed from: i */
    public final void mo1641i(int i) {
        switch (this.f9252a) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f9253b;
                    if (bottomSheetBehavior.f18100K) {
                        bottomSheetBehavior.m11198H(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9253b;
                    if (sideSheetBehavior.f18239g) {
                        sideSheetBehavior.m11248s(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p000.F02
    /* renamed from: j */
    public final void mo1642j(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f9252a) {
            case 0:
                ((BottomSheetBehavior) this.f9253b).m11212w(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9253b;
                WeakReference weakReference = sideSheetBehavior.f18249q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    C10043ki0 c10043ki0 = sideSheetBehavior.f18233a;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (c10043ki0.f36618a) {
                        case 0:
                            if (left <= c10043ki0.f36619b.f18245m) {
                                marginLayoutParams.leftMargin = right;
                                break;
                            }
                            break;
                        default:
                            int i3 = c10043ki0.f36619b.f18245m;
                            if (left <= i3) {
                                marginLayoutParams.rightMargin = i3 - left;
                                break;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f18253u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                C10043ki0 c10043ki02 = sideSheetBehavior.f18233a;
                switch (c10043ki02.f36618a) {
                    case 0:
                        c10043ki02.m22244c();
                        c10043ki02.m22243b();
                        break;
                    default:
                        int i4 = c10043ki02.f36619b.f18245m;
                        c10043ki02.m22243b();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC7222ym.m26227d(it);
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
    @Override // p000.F02
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1643k(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0989Pi.mo1643k(android.view.View, float, float):void");
    }

    @Override // p000.F02
    /* renamed from: l */
    public final boolean mo1644l(int i, View view) {
        WeakReference weakReference;
        switch (this.f9252a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f9253b;
                int i2 = bottomSheetBehavior.f18101L;
                if (i2 != 1 && !bottomSheetBehavior.f18117a0) {
                    if (i2 == 3 && bottomSheetBehavior.f18114Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f18111V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f18110U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9253b;
                if (sideSheetBehavior.f18240h != 1 && (weakReference = sideSheetBehavior.f18248p) != null && weakReference.get() == view) {
                    break;
                }
                break;
        }
        return true;
    }
}
