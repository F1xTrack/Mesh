package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.l;
import androidx.fragment.app.o;
import com.facebook.react.ReactRootView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class SV0 extends ViewGroup {
    public final ArrayList a;
    public o b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ChoreographerFrameCallbackC1636Ut f;
    public InterfaceC5327jW0 g;

    public SV0(S91 s91) {
        super(s91);
        this.a = new ArrayList();
        this.f = new ChoreographerFrameCallbackC1636Ut(2, this);
    }

    private final void setFragmentManager(o oVar) {
        this.b = oVar;
        this.d = true;
        g();
    }

    public InterfaceC5327jW0 a(RV0 rv0) {
        O90.f(rv0, "screen");
        return new C4360iW0(rv0);
    }

    public final a b() {
        o oVar = this.b;
        if (oVar == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        a aVar = new a(oVar);
        aVar.o = true;
        return aVar;
    }

    public boolean c(InterfaceC5327jW0 interfaceC5327jW0) {
        return AbstractC8069xu.v(this.a, interfaceC5327jW0);
    }

    public void d() {
        InterfaceC5327jW0 fragmentWrapper;
        RV0 topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.l();
    }

    public final void e() {
        this.d = true;
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((S91) context).a.runOnUiQueueThread(new RunnableC1577Tz0(20, this));
    }

    public void f() {
        a aVarB = b();
        o oVar = this.b;
        if (oVar == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
        }
        HashSet hashSet = new HashSet(oVar.c.f());
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC5327jW0 interfaceC5327jW0 = (InterfaceC5327jW0) it.next();
            O90.c(interfaceC5327jW0);
            if (interfaceC5327jW0.h().getActivityState() == LV0.a && interfaceC5327jW0.d().isAdded()) {
                aVarB.i(interfaceC5327jW0.d());
            }
            hashSet.remove(interfaceC5327jW0.d());
        }
        boolean z = false;
        if (!hashSet.isEmpty()) {
            for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                if ((fragment instanceof C4360iW0) && ((C4360iW0) fragment).h().getContainer() == null) {
                    aVarB.i(fragment);
                }
            }
        }
        boolean z2 = getTopScreen() == null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC5327jW0 interfaceC5327jW02 = (InterfaceC5327jW0) it2.next();
            O90.c(interfaceC5327jW02);
            LV0 activityState = interfaceC5327jW02.h().getActivityState();
            LV0 lv0 = LV0.a;
            if (activityState != lv0 && !interfaceC5327jW02.d().isAdded()) {
                aVarB.c(getId(), interfaceC5327jW02.d(), null, 1);
                z = true;
            } else if (activityState != lv0 && z) {
                aVarB.i(interfaceC5327jW02.d());
                arrayList2.add(interfaceC5327jW02);
            }
            interfaceC5327jW02.h().setTransitioning(z2);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            aVarB.c(getId(), ((InterfaceC5327jW0) it3.next()).d(), null, 1);
        }
        aVarB.g();
    }

    public final void g() {
        o oVar;
        if (!this.d || !this.c || (oVar = this.b) == null || oVar.G) {
            return;
        }
        this.d = false;
        f();
        d();
    }

    public final int getScreenCount() {
        return this.a.size();
    }

    public RV0 getTopScreen() {
        Object next;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC5327jW0) next).h().getActivityState() == LV0.c) {
                break;
            }
        }
        InterfaceC5327jW0 interfaceC5327jW0 = (InterfaceC5327jW0) next;
        if (interfaceC5327jW0 != null) {
            return interfaceC5327jW0.h();
        }
        return null;
    }

    public void h() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5327jW0) it.next()).h().setContainer(null);
        }
        arrayList.clear();
        e();
    }

    public void i(int i) {
        ArrayList arrayList = this.a;
        ((InterfaceC5327jW0) arrayList.get(i)).h().setContainer(null);
        arrayList.remove(i);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        boolean z2;
        o oVarE;
        Fragment fragmentC;
        C1518Tf1 c1518Tf1;
        super.onAttachedToWindow();
        this.c = true;
        ViewParent parent = this;
        while (true) {
            z = parent instanceof ReactRootView;
            if (z || (parent instanceof RV0) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            O90.e(parent, "getParent(...)");
        }
        if (parent instanceof RV0) {
            InterfaceC5327jW0 fragmentWrapper = ((RV0) parent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.g = fragmentWrapper;
                fragmentWrapper.i(this);
                o childFragmentManager = fragmentWrapper.d().getChildFragmentManager();
                O90.e(childFragmentManager, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager);
                c1518Tf1 = C1518Tf1.a;
            } else {
                c1518Tf1 = null;
            }
            if (c1518Tf1 == null) {
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
            z2 = context instanceof l;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (!z2) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        l lVar = (l) context;
        if (lVar.e().c.f().isEmpty()) {
            oVarE = lVar.e();
            O90.c(oVarE);
        } else {
            try {
                fragmentC = o.C(reactRootView);
            } catch (IllegalStateException unused) {
                oVarE = lVar.e();
            }
            if (fragmentC == null) {
                throw new IllegalStateException("View " + reactRootView + " does not have a Fragment set");
            }
            oVarE = fragmentC.getChildFragmentManager();
            O90.c(oVarE);
        }
        setFragmentManager(oVarE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        o oVar = this.b;
        if (oVar != null && !oVar.G) {
            a aVar = new a(oVar);
            boolean z = false;
            for (Fragment fragment : oVar.c.f()) {
                if ((fragment instanceof C4360iW0) && ((C4360iW0) fragment).h().getContainer() == this) {
                    aVar.i(fragment);
                    z = true;
                }
            }
            if (z) {
                aVar.g();
            }
            oVar.x(true);
            oVar.D();
        }
        InterfaceC5327jW0 interfaceC5327jW0 = this.g;
        if (interfaceC5327jW0 != null) {
            interfaceC5327jW0.b(this);
        }
        this.g = null;
        super.onDetachedFromWindow();
        this.c = false;
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
        O90.f(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            O90.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        ChoreographerFrameCallbackC1636Ut choreographerFrameCallbackC1636Ut;
        super.requestLayout();
        if (this.e || (choreographerFrameCallbackC1636Ut = this.f) == null) {
            return;
        }
        this.e = true;
        MJ0.a().c(3, choreographerFrameCallbackC1636Ut);
    }
}
