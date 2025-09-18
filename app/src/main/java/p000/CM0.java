package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CM0 {

    /* renamed from: a */
    public static final Set f1338a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public static int f1339b = 250;

    /* renamed from: c */
    public static boolean f1340c;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1148a(ViewGroup viewGroup, MW0 mw0, float f, float f2, boolean z) {
        View childAt;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (r3.getScrollEventThrottle() < Math.max(17L, jCurrentTimeMillis - ((InterfaceC11534wM0) viewGroup).getLastScrollDispatchTime()) && (childAt = viewGroup.getChildAt(0)) != null) {
            Iterator it = f1338a.iterator();
            if (it.hasNext()) {
                throw AbstractC7222ym.m26227d(it);
            }
            Context context = viewGroup.getContext();
            O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            int iM6093d = OZ1.m6093d(reactContext);
            InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(reactContext, viewGroup.getId());
            if (interfaceC6947uPM6091b != null) {
                C10107lC0 c10107lC0 = JW0.f5565k;
                interfaceC6947uPM6091b.mo11046g(AbstractC11926zR1.m26436a(iM6093d, viewGroup.getId(), mw0, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight(), z));
                ((InterfaceC11534wM0) viewGroup).setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final void m1149b(ViewGroup viewGroup) {
        BM0 reactScrollViewScrollState = ((InterfaceC11661xM0) viewGroup).getReactScrollViewScrollState();
        int i = reactScrollViewScrollState.f767c;
        Point point = reactScrollViewScrollState.f768d;
        int i2 = point.x;
        int i3 = point.y;
        if (reactScrollViewScrollState.f765a == 1) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                childAt.getWidth();
            }
            viewGroup.getWidth();
        }
        G41 stateWrapper = ((InterfaceC11915zM0) viewGroup).getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", AbstractC11406vL1.m25402a(i2));
            writableNativeMap.putDouble("contentOffsetTop", AbstractC11406vL1.m25402a(i3));
            writableNativeMap.putDouble("scrollAwayPaddingTop", AbstractC11406vL1.m25402a(i));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    /* renamed from: c */
    public static final int m1150c(Context context) {
        if (!f1340c) {
            f1340c = true;
            try {
                AM0 am0 = new AM0(context);
                am0.f175a = 250;
                am0.startScroll(0, 0, 0, 0);
                f1339b = am0.f175a;
            } catch (Throwable unused) {
            }
        }
        return f1339b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final int m1151d(FrameLayout frameLayout, int i, int i2, int i3) {
        BM0 reactScrollViewScrollState = ((InterfaceC11661xM0) frameLayout).getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.f770f || (reactScrollViewScrollState.f769e && ((i2 - i) * (i3 != 0 ? i3 / Math.abs(i3) : 0) > 0))) ? i2 : i;
    }

    /* renamed from: e */
    public static final int m1152e(String str) {
        if (str == null) {
            return 1;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1414557169) {
            if (iHashCode != 3005871) {
                if (iHashCode == 104712844 && str.equals("never")) {
                    return 2;
                }
            } else if (str.equals("auto")) {
                return 1;
            }
        } else if (str.equals("always")) {
            return 0;
        }
        "wrong overScrollMode: ".concat(str);
        AbstractC3929dS.m17683p("ReactNative");
        return 1;
    }

    /* renamed from: f */
    public static final int m1153f(String str) {
        if (str == null) {
            return 0;
        }
        if ("start".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("center".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("end".equals(str)) {
            return 3;
        }
        "wrong snap alignment value: ".concat(str);
        AbstractC3929dS.m17683p("ReactNative");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static final Point m1154g(FrameLayout frameLayout, int i, int i2, int i3, int i4) {
        BM0 reactScrollViewScrollState = ((InterfaceC11661xM0) frameLayout).getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(frameLayout.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.f771g);
        int width = frameLayout.getWidth();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        int paddingStart = (width - frameLayout.getPaddingStart()) - frameLayout.getPaddingEnd();
        int height = (frameLayout.getHeight() - frameLayout.getPaddingBottom()) - frameLayout.getPaddingTop();
        Point point = reactScrollViewScrollState.f766b;
        overScroller.fling(m1151d(frameLayout, frameLayout.getScrollX(), point.x, i), m1151d(frameLayout, frameLayout.getScrollY(), point.y, i2), i, i2, 0, i3, 0, i4, paddingStart / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static final void m1155h(FrameLayout frameLayout, int i, int i2) {
        InterfaceC11407vM0 interfaceC11407vM0 = (InterfaceC11407vM0) frameLayout;
        ValueAnimator flingAnimator = interfaceC11407vM0.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            interfaceC11407vM0.getFlingAnimator().addListener(new C8220Rl0(1, frameLayout));
        }
        ((InterfaceC11661xM0) frameLayout).getReactScrollViewScrollState().f766b.set(i, i2);
        int scrollX = frameLayout.getScrollX();
        int scrollY = frameLayout.getScrollY();
        if (scrollX != i) {
            interfaceC11407vM0.mo603a(scrollX, i);
        }
        if (scrollY != i2) {
            interfaceC11407vM0.mo603a(scrollY, i2);
        }
        m1157j(frameLayout, i, i2);
    }

    /* renamed from: i */
    public static final void m1156i(ViewGroup viewGroup) {
        m1157j(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static void m1157j(ViewGroup viewGroup, int i, int i2) {
        if (R02.m6874b(viewGroup.getId()) == 1) {
            return;
        }
        BM0 reactScrollViewScrollState = ((InterfaceC11661xM0) viewGroup).getReactScrollViewScrollState();
        if (reactScrollViewScrollState.f768d.equals(i, i2)) {
            return;
        }
        reactScrollViewScrollState.f768d.set(i, i2);
        m1149b(viewGroup);
    }
}
