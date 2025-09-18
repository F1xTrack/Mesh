package p000;

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
public final class RV0 extends AbstractC4117gS implements UV0 {

    /* renamed from: A */
    public Boolean f10216A;

    /* renamed from: B */
    public Boolean f10217B;

    /* renamed from: C */
    public boolean f10218C;

    /* renamed from: a */
    public final S91 f10219a;

    /* renamed from: b */
    public WeakReference f10220b;

    /* renamed from: c */
    public InterfaceC9891jW0 f10221c;

    /* renamed from: d */
    public SV0 f10222d;

    /* renamed from: e */
    public LV0 f10223e;

    /* renamed from: f */
    public boolean f10224f;

    /* renamed from: g */
    public OV0 f10225g;

    /* renamed from: h */
    public MV0 f10226h;

    /* renamed from: i */
    public NV0 f10227i;

    /* renamed from: j */
    public Integer f10228j;

    /* renamed from: k */
    public Boolean f10229k;

    /* renamed from: l */
    public boolean f10230l;

    /* renamed from: m */
    public boolean f10231m;

    /* renamed from: n */
    public float f10232n;

    /* renamed from: o */
    public boolean f10233o;

    /* renamed from: p */
    public List f10234p;

    /* renamed from: q */
    public int f10235q;

    /* renamed from: r */
    public int f10236r;

    /* renamed from: s */
    public boolean f10237s;

    /* renamed from: t */
    public float f10238t;

    /* renamed from: u */
    public C9251eW0 f10239u;

    /* renamed from: v */
    public String f10240v;

    /* renamed from: w */
    public Boolean f10241w;

    /* renamed from: x */
    public Boolean f10242x;

    /* renamed from: y */
    public Integer f10243y;

    /* renamed from: z */
    public Integer f10244z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RV0(S91 s91) {
        super(s91);
        O90.m5968f(s91, "reactContext");
        this.f10219a = s91;
        this.f10220b = new WeakReference(null);
        this.f10225g = OV0.f8460a;
        this.f10226h = MV0.f7198b;
        this.f10227i = NV0.f7826a;
        this.f10233o = true;
        this.f10234p = AbstractC7230yu.m26277h(Double.valueOf(1.0d));
        this.f10235q = -1;
        this.f10237s = true;
        this.f10238t = 24.0f;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.f10218C = true;
    }

    /* renamed from: a */
    public static boolean m7027a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && m7027a((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m7028b() {
        int iOrdinal = this.f10225g.ordinal();
        return iOrdinal == 2 || iOrdinal == 3;
    }

    /* renamed from: c */
    public final void m7029c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((viewGroup instanceof AbstractC11122t71) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i);
                } else if (childAt != null) {
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof C10915rW0) {
                    m7029c(((C10915rW0) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    m7029c((ViewGroup) childAt);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        O90.m5968f(sparseArray, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        O90.m5968f(sparseArray, "container");
    }

    public final LV0 getActivityState() {
        return this.f10223e;
    }

    public final SV0 getContainer() {
        return this.f10222d;
    }

    public final WeakReference<VV0> getContentWrapper() {
        return this.f10220b;
    }

    public final C9251eW0 getFooter() {
        return this.f10239u;
    }

    public final Fragment getFragment() {
        InterfaceC9891jW0 interfaceC9891jW0 = this.f10221c;
        if (interfaceC9891jW0 != null) {
            return interfaceC9891jW0.mo13724d();
        }
        return null;
    }

    public final InterfaceC9891jW0 getFragmentWrapper() {
        return this.f10221c;
    }

    public final C10915rW0 getHeaderConfig() {
        Object next;
        C6653q0 c6653q0 = new C6653q0(3, this);
        while (true) {
            if (!c6653q0.hasNext()) {
                next = null;
                break;
            }
            next = c6653q0.next();
            if (((View) next) instanceof C10915rW0) {
                break;
            }
        }
        if (next instanceof C10915rW0) {
            return (C10915rW0) next;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f10218C;
    }

    public final Integer getNavigationBarColor() {
        return this.f10244z;
    }

    public final ReactContext getReactContext() {
        return this.f10219a;
    }

    public final InterfaceC6947uP getReactEventDispatcher() {
        return OZ1.m6091b(this.f10219a, getId());
    }

    public final MV0 getReplaceAnimation() {
        return this.f10226h;
    }

    public final Integer getScreenOrientation() {
        return this.f10228j;
    }

    public final BottomSheetBehavior<RV0> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C6588oz c6588oz = layoutParams instanceof C6588oz ? (C6588oz) layoutParams : null;
        AbstractC6397lz abstractC6397lz = c6588oz != null ? c6588oz.f39405a : null;
        if (abstractC6397lz instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC6397lz;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.f10237s;
    }

    public final float getSheetCornerRadius() {
        return this.f10232n;
    }

    public final List<Double> getSheetDetents() {
        return this.f10234p;
    }

    public final float getSheetElevation() {
        return this.f10238t;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.f10233o;
    }

    public final int getSheetInitialDetentIndex() {
        return this.f10236r;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.f10235q;
    }

    public final NV0 getStackAnimation() {
        return this.f10227i;
    }

    public final OV0 getStackPresentation() {
        return this.f10225g;
    }

    public final Integer getStatusBarColor() {
        return this.f10243y;
    }

    public final String getStatusBarStyle() {
        return this.f10240v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if ((this.f10222d instanceof C10275mW0) && z) {
            S91 s91 = this.f10219a;
            s91.runOnNativeModulesQueueThread(new QV0(this, i3 - i, i4 - i2, s91.getExceptionHandler()));
            C9251eW0 c9251eW0 = this.f10239u;
            if (c9251eW0 != null) {
                SV0 sv0 = this.f10222d;
                O90.m5965c(sv0);
                c9251eW0.m18002o(sv0.getHeight());
            }
            Context context = getContext();
            O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            int iM6093d = OZ1.m6093d(reactContext);
            InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(reactContext, getId());
            if (interfaceC6947uPM6091b != null) {
                interfaceC6947uPM6091b.mo11046g(new C0400GL(iM6093d, getId(), i2, 1));
            }
        }
    }

    public final void setActivityState(LV0 lv0) {
        O90.m5968f(lv0, "activityState");
        LV0 lv02 = this.f10223e;
        if (lv0 == lv02) {
            return;
        }
        if ((this.f10222d instanceof C10275mW0) && lv02 != null && lv0.compareTo(lv02) < 0) {
            throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
        }
        this.f10223e = lv0;
        SV0 sv0 = this.f10222d;
        if (sv0 != null) {
            sv0.f10818d = true;
            sv0.m7381g();
        }
    }

    public final void setBeingRemoved(boolean z) {
        this.f10230l = z;
    }

    public final void setContainer(SV0 sv0) {
        this.f10222d = sv0;
    }

    public final void setContentWrapper(WeakReference<VV0> weakReference) {
        O90.m5968f(weakReference, "<set-?>");
        this.f10220b = weakReference;
    }

    public final void setFooter(C9251eW0 c9251eW0) {
        BottomSheetBehavior<RV0> sheetBehavior;
        if (c9251eW0 == null && this.f10239u != null) {
            BottomSheetBehavior<RV0> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                C9251eW0 c9251eW02 = this.f10239u;
                O90.m5965c(c9251eW02);
                if (c9251eW02.f26734f) {
                    sheetBehavior2.f18112W.remove(c9251eW02.f26735g);
                    c9251eW02.f26734f = false;
                }
            }
        } else if (c9251eW0 != null && (sheetBehavior = getSheetBehavior()) != null) {
            c9251eW0.m18003p(sheetBehavior);
        }
        this.f10239u = c9251eW0;
    }

    public final void setFragmentWrapper(InterfaceC9891jW0 interfaceC9891jW0) {
        this.f10221c = interfaceC9891jW0;
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z) {
        this.f10218C = z;
    }

    public final void setNavigationBarColor(Integer num) {
        if (num != null) {
            QB1.f9528c = true;
        }
        this.f10244z = num;
        InterfaceC9891jW0 interfaceC9891jW0 = this.f10221c;
        if (interfaceC9891jW0 != null) {
            QB1.m6605h(this, interfaceC9891jW0.mo10005c());
        }
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            QB1.f9528c = true;
        }
        this.f10217B = bool;
        InterfaceC9891jW0 interfaceC9891jW0 = this.f10221c;
        if (interfaceC9891jW0 != null) {
            QB1.m6606i(this, interfaceC9891jW0.mo10005c());
        }
    }

    public final void setNavigationBarTranslucent(Boolean bool) {
        if (bool != null) {
            QB1.f9528c = true;
        }
        this.f10216A = bool;
        InterfaceC9891jW0 interfaceC9891jW0 = this.f10221c;
        if (interfaceC9891jW0 != null) {
            QB1.m6607j(this, interfaceC9891jW0.mo10005c());
        }
    }

    public final void setReplaceAnimation(MV0 mv0) {
        O90.m5968f(mv0, "<set-?>");
        this.f10226h = mv0;
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
            r3.f10228j = r4
            return
        L6:
            r0 = 1
            p000.QB1.f9526a = r0
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
            r3.f10228j = r4
            jW0 r4 = r3.f10221c
            if (r4 == 0) goto La3
            android.app.Activity r4 = r4.mo10005c()
            if (r4 != 0) goto L8e
            goto La3
        L8e:
            PV0 r0 = p000.PV0.f9086a
            RV0 r0 = p000.QB1.m6601d(r3, r0)
            if (r0 == 0) goto La0
            java.lang.Integer r0 = r0.getScreenOrientation()
            if (r0 == 0) goto La0
            int r2 = r0.intValue()
        La0:
            r4.setRequestedOrientation(r2)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RV0.setScreenOrientation(java.lang.String):void");
    }

    public final void setSheetClosesOnTouchOutside(boolean z) {
        this.f10237s = z;
    }

    public final void setSheetCornerRadius(float f) {
        if (this.f10232n == f) {
            return;
        }
        this.f10232n = f;
        this.f10231m = true;
    }

    public final void setSheetDetents(List<Double> list) {
        O90.m5968f(list, "<set-?>");
        this.f10234p = list;
    }

    public final void setSheetElevation(float f) {
        this.f10238t = f;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z) {
        this.f10233o = z;
    }

    public final void setSheetInitialDetentIndex(int i) {
        this.f10236r = i;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i) {
        this.f10235q = i;
    }

    public final void setStackAnimation(NV0 nv0) {
        O90.m5968f(nv0, "<set-?>");
        this.f10227i = nv0;
    }

    public final void setStackPresentation(OV0 ov0) {
        O90.m5968f(ov0, "<set-?>");
        this.f10225g = ov0;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.f10229k = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            QB1.f9527b = true;
        }
        this.f10243y = num;
        InterfaceC9891jW0 interfaceC9891jW0 = this.f10221c;
        if (interfaceC9891jW0 != null) {
            QB1.m6603f(this, interfaceC9891jW0.mo10005c(), interfaceC9891jW0.mo13725e());
        }
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            QB1.f9527b = true;
        }
        this.f10241w = bool;
        InterfaceC9891jW0 interfaceC9891jW0 = this.f10221c;
        if (interfaceC9891jW0 != null) {
            QB1.m6604g(this, interfaceC9891jW0.mo10005c());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            QB1.f9527b = true;
        }
        this.f10240v = str;
        InterfaceC9891jW0 interfaceC9891jW0 = this.f10221c;
        if (interfaceC9891jW0 != null) {
            QB1.m6608k(this, interfaceC9891jW0.mo10005c(), interfaceC9891jW0.mo13725e());
        }
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            QB1.f9527b = true;
        }
        this.f10242x = bool;
        InterfaceC9891jW0 interfaceC9891jW0 = this.f10221c;
        if (interfaceC9891jW0 != null) {
            QB1.m6609l(this, interfaceC9891jW0.mo10005c(), interfaceC9891jW0.mo13725e());
        }
    }

    public final void setTransitioning(boolean z) {
        if (this.f10224f == z) {
            return;
        }
        this.f10224f = z;
        boolean zM7027a = m7027a(this);
        if (!zM7027a || getLayerType() == 2) {
            super.setLayerType((!z || zM7027a) ? 0 : 2, null);
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
