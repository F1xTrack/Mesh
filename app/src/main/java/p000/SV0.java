package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.C1719a;
import androidx.fragment.app.Fragment;
import com.facebook.react.ReactRootView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class SV0 extends ViewGroup {

    /* renamed from: a */
    public final ArrayList f10815a;

    /* renamed from: b */
    public AbstractC1733o f10816b;

    /* renamed from: c */
    public boolean f10817c;

    /* renamed from: d */
    public boolean f10818d;

    /* renamed from: e */
    public boolean f10819e;

    /* renamed from: f */
    public final ChoreographerFrameCallbackC1314Ut f10820f;

    /* renamed from: g */
    public InterfaceC9891jW0 f10821g;

    public SV0(S91 s91) {
        super(s91);
        this.f10815a = new ArrayList();
        this.f10820f = new ChoreographerFrameCallbackC1314Ut(2, this);
    }

    private final void setFragmentManager(AbstractC1733o abstractC1733o) {
        this.f10816b = abstractC1733o;
        this.f10818d = true;
        m7381g();
    }

    /* renamed from: a */
    public InterfaceC9891jW0 mo7375a(RV0 rv0) {
        O90.m5968f(rv0, "screen");
        return new C9763iW0(rv0);
    }

    /* renamed from: b */
    public final C1719a m7376b() {
        AbstractC1733o abstractC1733o = this.f10816b;
        if (abstractC1733o == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        C1719a c1719a = new C1719a(abstractC1733o);
        c1719a.f43746o = true;
        return c1719a;
    }

    /* renamed from: c */
    public boolean mo7377c(InterfaceC9891jW0 interfaceC9891jW0) {
        return AbstractC7167xu.m25994v(this.f10815a, interfaceC9891jW0);
    }

    /* renamed from: d */
    public void mo7378d() {
        InterfaceC9891jW0 fragmentWrapper;
        RV0 topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.mo13730l();
    }

    /* renamed from: e */
    public final void m7379e() {
        this.f10818d = true;
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((S91) context).f10602a.runOnUiQueueThread(new RunnableC8352Tz0(20, this));
    }

    /* renamed from: f */
    public void mo7380f() {
        C1719a c1719aM7376b = m7376b();
        AbstractC1733o abstractC1733o = this.f10816b;
        if (abstractC1733o == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
        }
        HashSet hashSet = new HashSet(abstractC1733o.f16215c.m10112f());
        ArrayList arrayList = this.f10815a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC9891jW0 interfaceC9891jW0 = (InterfaceC9891jW0) it.next();
            O90.m5965c(interfaceC9891jW0);
            if (interfaceC9891jW0.mo13727h().getActivityState() == LV0.f6675a && interfaceC9891jW0.mo13724d().isAdded()) {
                c1719aM7376b.m10018i(interfaceC9891jW0.mo13724d());
            }
            hashSet.remove(interfaceC9891jW0.mo13724d());
        }
        boolean z = false;
        if (!hashSet.isEmpty()) {
            for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                if ((fragment instanceof C9763iW0) && ((C9763iW0) fragment).mo13727h().getContainer() == null) {
                    c1719aM7376b.m10018i(fragment);
                }
            }
        }
        boolean z2 = getTopScreen() == null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC9891jW0 interfaceC9891jW02 = (InterfaceC9891jW0) it2.next();
            O90.m5965c(interfaceC9891jW02);
            LV0 activityState = interfaceC9891jW02.mo13727h().getActivityState();
            LV0 lv0 = LV0.f6675a;
            if (activityState != lv0 && !interfaceC9891jW02.mo13724d().isAdded()) {
                c1719aM7376b.mo10013c(getId(), interfaceC9891jW02.mo13724d(), null, 1);
                z = true;
            } else if (activityState != lv0 && z) {
                c1719aM7376b.m10018i(interfaceC9891jW02.mo13724d());
                arrayList2.add(interfaceC9891jW02);
            }
            interfaceC9891jW02.mo13727h().setTransitioning(z2);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            c1719aM7376b.mo10013c(getId(), ((InterfaceC9891jW0) it3.next()).mo13724d(), null, 1);
        }
        c1719aM7376b.m10016g();
    }

    /* renamed from: g */
    public final void m7381g() {
        AbstractC1733o abstractC1733o;
        if (!this.f10818d || !this.f10817c || (abstractC1733o = this.f10816b) == null || abstractC1733o.f16206G) {
            return;
        }
        this.f10818d = false;
        mo7380f();
        mo7378d();
    }

    public final int getScreenCount() {
        return this.f10815a.size();
    }

    public RV0 getTopScreen() {
        Object next;
        Iterator it = this.f10815a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC9891jW0) next).mo13727h().getActivityState() == LV0.f6677c) {
                break;
            }
        }
        InterfaceC9891jW0 interfaceC9891jW0 = (InterfaceC9891jW0) next;
        if (interfaceC9891jW0 != null) {
            return interfaceC9891jW0.mo13727h();
        }
        return null;
    }

    /* renamed from: h */
    public void mo7382h() {
        ArrayList arrayList = this.f10815a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC9891jW0) it.next()).mo13727h().setContainer(null);
        }
        arrayList.clear();
        m7379e();
    }

    /* renamed from: i */
    public void mo7383i(int i) {
        ArrayList arrayList = this.f10815a;
        ((InterfaceC9891jW0) arrayList.get(i)).mo13727h().setContainer(null);
        arrayList.remove(i);
        m7379e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        boolean z2;
        AbstractC1733o abstractC1733oM10034e;
        Fragment fragmentM10035C;
        C8313Tf1 c8313Tf1;
        super.onAttachedToWindow();
        this.f10817c = true;
        ViewParent parent = this;
        while (true) {
            z = parent instanceof ReactRootView;
            if (z || (parent instanceof RV0) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            O90.m5967e(parent, "getParent(...)");
        }
        if (parent instanceof RV0) {
            InterfaceC9891jW0 fragmentWrapper = ((RV0) parent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.f10821g = fragmentWrapper;
                fragmentWrapper.mo13728i(this);
                AbstractC1733o childFragmentManager = fragmentWrapper.mo13724d().getChildFragmentManager();
                O90.m5967e(childFragmentManager, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager);
                c8313Tf1 = C8313Tf1.f11463a;
            } else {
                c8313Tf1 = null;
            }
            if (c8313Tf1 == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached");
            }
            return;
        }
        if (!z) {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
        }
        ReactRootView reactRootView = (ReactRootView) parent;
        Context context = reactRootView.getContext();
        while (true) {
            z2 = context instanceof AbstractActivityC1730l;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (!z2) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        AbstractActivityC1730l abstractActivityC1730l = (AbstractActivityC1730l) context;
        if (abstractActivityC1730l.m10034e().f16215c.m10112f().isEmpty()) {
            abstractC1733oM10034e = abstractActivityC1730l.m10034e();
            O90.m5965c(abstractC1733oM10034e);
        } else {
            try {
                fragmentM10035C = AbstractC1733o.m10035C(reactRootView);
            } catch (IllegalStateException unused) {
                abstractC1733oM10034e = abstractActivityC1730l.m10034e();
            }
            if (fragmentM10035C == null) {
                throw new IllegalStateException("View " + reactRootView + " does not have a Fragment set");
            }
            abstractC1733oM10034e = fragmentM10035C.getChildFragmentManager();
            O90.m5965c(abstractC1733oM10034e);
        }
        setFragmentManager(abstractC1733oM10034e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC1733o abstractC1733o = this.f10816b;
        if (abstractC1733o != null && !abstractC1733o.f16206G) {
            C1719a c1719a = new C1719a(abstractC1733o);
            boolean z = false;
            for (Fragment fragment : abstractC1733o.f16215c.m10112f()) {
                if ((fragment instanceof C9763iW0) && ((C9763iW0) fragment).mo13727h().getContainer() == this) {
                    c1719a.m10018i(fragment);
                    z = true;
                }
            }
            if (z) {
                c1719a.m10016g();
            }
            abstractC1733o.m10088x(true);
            abstractC1733o.m10040D();
        }
        InterfaceC9891jW0 interfaceC9891jW0 = this.f10821g;
        if (interfaceC9891jW0 != null) {
            interfaceC9891jW0.mo13723b(this);
        }
        this.f10821g = null;
        super.onDetachedFromWindow();
        this.f10817c = false;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            removeViewAt(childCount);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        O90.m5968f(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            O90.m5966d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        ChoreographerFrameCallbackC1314Ut choreographerFrameCallbackC1314Ut;
        super.requestLayout();
        if (this.f10819e || (choreographerFrameCallbackC1314Ut = this.f10820f) == null) {
            return;
        }
        this.f10819e = true;
        MJ0.m5303a().m5305c(3, choreographerFrameCallbackC1314Ut);
    }
}
