package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes2.dex */
public final class RV0 extends AbstractC3965gS implements UV0 {
    public Boolean A;
    public Boolean B;
    public boolean C;
    public final S91 a;
    public WeakReference b;
    public InterfaceC5327jW0 c;
    public SV0 d;
    public LV0 e;
    public boolean f;
    public OV0 g;
    public MV0 h;
    public NV0 i;
    public Integer j;
    public Boolean k;
    public boolean l;
    public boolean m;
    public float n;
    public boolean o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public float t;
    public C3596eW0 u;
    public String v;
    public Boolean w;
    public Boolean x;
    public Integer y;
    public Integer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RV0(S91 s91) {
        super(s91);
        O90.f(s91, "reactContext");
        this.a = s91;
        this.b = new WeakReference(null);
        this.g = OV0.a;
        this.h = MV0.b;
        this.i = NV0.a;
        this.o = true;
        this.p = AbstractC8259yu.h(Double.valueOf(1.0d));
        this.q = -1;
        this.s = true;
        this.t = 24.0f;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.C = true;
    }

    public static boolean a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && a((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        int iOrdinal = this.g.ordinal();
        return iOrdinal == 2 || iOrdinal == 3;
    }

    public final void c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((viewGroup instanceof AbstractC7162t71) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i);
                } else if (childAt != null) {
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof C6854rW0) {
                    c(((C6854rW0) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    c((ViewGroup) childAt);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        O90.f(sparseArray, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        O90.f(sparseArray, "container");
    }

    public final LV0 getActivityState() {
        return this.e;
    }

    public final SV0 getContainer() {
        return this.d;
    }

    public final WeakReference<VV0> getContentWrapper() {
        return this.b;
    }

    public final C3596eW0 getFooter() {
        return this.u;
    }

    public final Fragment getFragment() {
        InterfaceC5327jW0 interfaceC5327jW0 = this.c;
        if (interfaceC5327jW0 != null) {
            return interfaceC5327jW0.d();
        }
        return null;
    }

    public final InterfaceC5327jW0 getFragmentWrapper() {
        return this.c;
    }

    public final C6854rW0 getHeaderConfig() {
        Object next;
        C6563q0 c6563q0 = new C6563q0(3, this);
        while (true) {
            if (!c6563q0.hasNext()) {
                next = null;
                break;
            }
            next = c6563q0.next();
            if (((View) next) instanceof C6854rW0) {
                break;
            }
        }
        if (next instanceof C6854rW0) {
            return (C6854rW0) next;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.C;
    }

    public final Integer getNavigationBarColor() {
        return this.z;
    }

    public final ReactContext getReactContext() {
        return this.a;
    }

    public final InterfaceC7405uP getReactEventDispatcher() {
        return OZ1.b(this.a, getId());
    }

    public final MV0 getReplaceAnimation() {
        return this.h;
    }

    public final Integer getScreenOrientation() {
        return this.j;
    }

    public final BottomSheetBehavior<RV0> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C6368oz c6368oz = layoutParams instanceof C6368oz ? (C6368oz) layoutParams : null;
        AbstractC5795lz abstractC5795lz = c6368oz != null ? c6368oz.a : null;
        if (abstractC5795lz instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC5795lz;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.s;
    }

    public final float getSheetCornerRadius() {
        return this.n;
    }

    public final List<Double> getSheetDetents() {
        return this.p;
    }

    public final float getSheetElevation() {
        return this.t;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.o;
    }

    public final int getSheetInitialDetentIndex() {
        return this.r;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.q;
    }

    public final NV0 getStackAnimation() {
        return this.i;
    }

    public final OV0 getStackPresentation() {
        return this.g;
    }

    public final Integer getStatusBarColor() {
        return this.y;
    }

    public final String getStatusBarStyle() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if ((this.d instanceof C5900mW0) && z) {
            S91 s91 = this.a;
            s91.runOnNativeModulesQueueThread(new QV0(this, i3 - i, i4 - i2, s91.getExceptionHandler()));
            C3596eW0 c3596eW0 = this.u;
            if (c3596eW0 != null) {
                SV0 sv0 = this.d;
                O90.c(sv0);
                c3596eW0.o(sv0.getHeight());
            }
            Context context = getContext();
            O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            int iD = OZ1.d(reactContext);
            InterfaceC7405uP interfaceC7405uPB = OZ1.b(reactContext, getId());
            if (interfaceC7405uPB != null) {
                interfaceC7405uPB.g(new GL(iD, getId(), i2, 1));
            }
        }
    }

    public final void setActivityState(LV0 lv0) {
        O90.f(lv0, "activityState");
        LV0 lv02 = this.e;
        if (lv0 == lv02) {
            return;
        }
        if ((this.d instanceof C5900mW0) && lv02 != null && lv0.compareTo(lv02) < 0) {
            throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
        }
        this.e = lv0;
        SV0 sv0 = this.d;
        if (sv0 != null) {
            sv0.d = true;
            sv0.g();
        }
    }

    public final void setBeingRemoved(boolean z) {
        this.l = z;
    }

    public final void setContainer(SV0 sv0) {
        this.d = sv0;
    }

    public final void setContentWrapper(WeakReference<VV0> weakReference) {
        O90.f(weakReference, "<set-?>");
        this.b = weakReference;
    }

    public final void setFooter(C3596eW0 c3596eW0) {
        BottomSheetBehavior<RV0> sheetBehavior;
        if (c3596eW0 == null && this.u != null) {
            BottomSheetBehavior<RV0> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                C3596eW0 c3596eW02 = this.u;
                O90.c(c3596eW02);
                if (c3596eW02.f) {
                    sheetBehavior2.W.remove(c3596eW02.g);
                    c3596eW02.f = false;
                }
            }
        } else if (c3596eW0 != null && (sheetBehavior = getSheetBehavior()) != null) {
            c3596eW0.p(sheetBehavior);
        }
        this.u = c3596eW0;
    }

    public final void setFragmentWrapper(InterfaceC5327jW0 interfaceC5327jW0) {
        this.c = interfaceC5327jW0;
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z) {
        this.C = z;
    }

    public final void setNavigationBarColor(Integer num) {
        if (num != null) {
            QB1.c = true;
        }
        this.z = num;
        InterfaceC5327jW0 interfaceC5327jW0 = this.c;
        if (interfaceC5327jW0 != null) {
            QB1.h(this, interfaceC5327jW0.c());
        }
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            QB1.c = true;
        }
        this.B = bool;
        InterfaceC5327jW0 interfaceC5327jW0 = this.c;
        if (interfaceC5327jW0 != null) {
            QB1.i(this, interfaceC5327jW0.c());
        }
    }

    public final void setNavigationBarTranslucent(Boolean bool) {
        if (bool != null) {
            QB1.c = true;
        }
        this.A = bool;
        InterfaceC5327jW0 interfaceC5327jW0 = this.c;
        if (interfaceC5327jW0 != null) {
            QB1.j(this, interfaceC5327jW0.c());
        }
    }

    public final void setReplaceAnimation(MV0 mv0) {
        O90.f(mv0, "<set-?>");
        this.h = mv0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setScreenOrientation(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L6
            r4 = 0
            r3.j = r4
            return
        L6:
            r0 = 1
            defpackage.QB1.a = r0
            int r1 = r4.hashCode()
            r2 = -1
            switch(r1) {
                case -1894896954: goto L6e;
                case 96673: goto L5e;
                case 729267099: goto L4f;
                case 1430647483: goto L40;
                case 1651658175: goto L32;
                case 1730732811: goto L22;
                case 2118770584: goto L13;
                default: goto L11;
            }
        L11:
            goto L76
        L13:
            java.lang.String r0 = "landscape_right"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1c
            goto L76
        L1c:
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L81
        L22:
            java.lang.String r0 = "landscape_left"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2b
            goto L76
        L2b:
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L81
        L32:
            java.lang.String r1 = "portrait_up"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3b
            goto L76
        L3b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L81
        L40:
            java.lang.String r0 = "landscape"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L49
            goto L76
        L49:
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L81
        L4f:
            java.lang.String r0 = "portrait"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L58
            goto L76
        L58:
            r4 = 7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L81
        L5e:
            java.lang.String r0 = "all"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L67
            goto L76
        L67:
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L81
        L6e:
            java.lang.String r0 = "portrait_down"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L7b
        L76:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto L81
        L7b:
            r4 = 9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L81:
            r3.j = r4
            jW0 r4 = r3.c
            if (r4 == 0) goto La3
            android.app.Activity r4 = r4.c()
            if (r4 != 0) goto L8e
            goto La3
        L8e:
            PV0 r0 = defpackage.PV0.a
            RV0 r0 = defpackage.QB1.d(r3, r0)
            if (r0 == 0) goto La0
            java.lang.Integer r0 = r0.getScreenOrientation()
            if (r0 == 0) goto La0
            int r2 = r0.intValue()
        La0:
            r4.setRequestedOrientation(r2)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RV0.setScreenOrientation(java.lang.String):void");
    }

    public final void setSheetClosesOnTouchOutside(boolean z) {
        this.s = z;
    }

    public final void setSheetCornerRadius(float f) {
        if (this.n == f) {
            return;
        }
        this.n = f;
        this.m = true;
    }

    public final void setSheetDetents(List<Double> list) {
        O90.f(list, "<set-?>");
        this.p = list;
    }

    public final void setSheetElevation(float f) {
        this.t = f;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z) {
        this.o = z;
    }

    public final void setSheetInitialDetentIndex(int i) {
        this.r = i;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i) {
        this.q = i;
    }

    public final void setStackAnimation(NV0 nv0) {
        O90.f(nv0, "<set-?>");
        this.i = nv0;
    }

    public final void setStackPresentation(OV0 ov0) {
        O90.f(ov0, "<set-?>");
        this.g = ov0;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.k = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            QB1.b = true;
        }
        this.y = num;
        InterfaceC5327jW0 interfaceC5327jW0 = this.c;
        if (interfaceC5327jW0 != null) {
            QB1.f(this, interfaceC5327jW0.c(), interfaceC5327jW0.e());
        }
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            QB1.b = true;
        }
        this.w = bool;
        InterfaceC5327jW0 interfaceC5327jW0 = this.c;
        if (interfaceC5327jW0 != null) {
            QB1.g(this, interfaceC5327jW0.c());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            QB1.b = true;
        }
        this.v = str;
        InterfaceC5327jW0 interfaceC5327jW0 = this.c;
        if (interfaceC5327jW0 != null) {
            QB1.k(this, interfaceC5327jW0.c(), interfaceC5327jW0.e());
        }
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            QB1.b = true;
        }
        this.x = bool;
        InterfaceC5327jW0 interfaceC5327jW0 = this.c;
        if (interfaceC5327jW0 != null) {
            QB1.l(this, interfaceC5327jW0.c(), interfaceC5327jW0.e());
        }
    }

    public final void setTransitioning(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        boolean zA = a(this);
        if (!zA || getLayerType() == 2) {
            super.setLayerType((!z || zA) ? 0 : 2, null);
        }
    }

    public final void setGestureEnabled(boolean z) {
    }

    public final void setSheetGrabberVisible(boolean z) {
    }

    @Override // android.view.View
    public final void setLayerType(int i, Paint paint) {
    }
}
