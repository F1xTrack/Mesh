package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.a;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: Ze1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1983Ze1 {
    public final Object a;
    public final InterfaceC7405uP b;
    public final ReactApplicationContext c;
    public final C6846rT1 d;
    public final ComponentCallbacks2C0754Jk1 e;
    public final C8216yf1 f;
    public final C6846rT1 g;
    public final int[] h;
    public long i;
    public volatile boolean j;

    public C1983Ze1(ReactApplicationContext reactApplicationContext, ComponentCallbacks2C0754Jk1 componentCallbacks2C0754Jk1, a aVar, int i) {
        this(reactApplicationContext, componentCallbacks2C0754Jk1, new C8216yf1(reactApplicationContext, new C8260yu0(componentCallbacks2C0754Jk1), i), aVar);
    }

    public final void a(DM0 dm0, float f, float f2, ArrayList arrayList) {
        YogaNodeJNIBase yogaNodeJNIBase;
        YogaNodeJNIBase yogaNodeJNIBase2;
        EM0 em0 = (EM0) dm0;
        if (em0.f || em0.p() || ((yogaNodeJNIBase2 = em0.u) != null && YogaNative.jni_YGNodeIsDirtyJNI(yogaNodeJNIBase2.e))) {
            boolean zP = em0.p();
            YogaNodeJNIBase yogaNodeJNIBase3 = em0.u;
            if (zP) {
                float fI = yogaNodeJNIBase3.i();
                float fJ = yogaNodeJNIBase3.j();
                float f3 = f + fI;
                int iRound = Math.round(f3);
                float f4 = f2 + fJ;
                int iRound2 = Math.round(f4);
                int iRound3 = Math.round(yogaNodeJNIBase3.h() + f3);
                int iRound4 = Math.round(yogaNodeJNIBase3.e() + f4);
                int iRound5 = Math.round(fI);
                int iRound6 = Math.round(fJ);
                int i = iRound3 - iRound;
                int i2 = iRound4 - iRound2;
                if ((iRound5 != em0.n || iRound6 != em0.o || i != em0.p || i2 != em0.q) && em0.e) {
                    int i3 = em0.a;
                    C6846rT1 c6846rT1 = this.d;
                    ((C7409uQ0) c6846rT1.d).a();
                    if (!((SparseBooleanArray) c6846rT1.c).get(i3)) {
                        arrayList.add(em0);
                    }
                }
            }
            ArrayList arrayListA = em0.a();
            if (arrayListA != null) {
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    a((DM0) it.next(), yogaNodeJNIBase3.i() + f, yogaNodeJNIBase3.j() + f2, arrayList);
                }
            }
            boolean z = em0.f;
            C8216yf1 c8216yf1 = this.f;
            if (z) {
                em0.u(c8216yf1);
            }
            boolean zP2 = em0.p();
            C6846rT1 c6846rT12 = this.g;
            if (zP2) {
                float fI2 = yogaNodeJNIBase3.i();
                float fJ2 = yogaNodeJNIBase3.j();
                float f5 = f + fI2;
                int iRound7 = Math.round(f5);
                float f6 = f2 + fJ2;
                int iRound8 = Math.round(f6);
                int iRound9 = Math.round(yogaNodeJNIBase3.h() + f5);
                int iRound10 = Math.round(yogaNodeJNIBase3.e() + f6);
                int iRound11 = Math.round(fI2);
                int iRound12 = Math.round(fJ2);
                int i4 = iRound9 - iRound7;
                int i5 = iRound10 - iRound8;
                boolean z2 = (iRound11 == em0.n && iRound12 == em0.o && i4 == em0.p && i5 == em0.q) ? false : true;
                em0.n = iRound11;
                em0.o = iRound12;
                em0.p = i4;
                em0.q = i5;
                if (z2) {
                    if (c6846rT12 != null) {
                        c6846rT12.e(em0);
                    } else {
                        c8216yf1.h.add(new C7646vf1(c8216yf1, em0.h.a, em0.a, iRound11, iRound12, i4, i5));
                    }
                }
            }
            em0.f = false;
            if (em0.p() && (yogaNodeJNIBase = em0.u) != null) {
                yogaNodeJNIBase.l();
            }
            ((SparseBooleanArray) c6846rT12.d).clear();
        }
    }

    public final void b(DM0 dm0) {
        EM0 em0 = (EM0) dm0;
        String str = em0.b;
        UN1.c(str);
        NativeModule nativeModuleA = this.e.a(str);
        if (!(nativeModuleA instanceof J50)) {
            StringBuilder sb = new StringBuilder("Trying to use view ");
            String str2 = em0.b;
            UN1.c(str2);
            sb.append(str2);
            sb.append(" as a parent, but its Manager doesn't extends ViewGroupManager");
            throw new C2262b60(sb.toString());
        }
        if (((J50) nativeModuleA).needsCustomLayoutForChildren()) {
            StringBuilder sb2 = new StringBuilder("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (");
            String str3 = em0.b;
            UN1.c(str3);
            sb2.append(str3);
            sb2.append("). Use measure instead.");
            throw new C2262b60(sb2.toString());
        }
    }

    public final void c(DM0 dm0) {
        new ArrayList().add("rootTag: " + String.valueOf(((EM0) dm0).a));
        MT1.b("cssRoot.calculateLayout".concat(""));
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            int iIntValue = ((EM0) dm0).v.intValue();
            int iIntValue2 = ((EM0) dm0).w.intValue();
            float size = Float.NaN;
            float size2 = View.MeasureSpec.getMode(iIntValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(iIntValue);
            if (View.MeasureSpec.getMode(iIntValue2) != 0) {
                size = View.MeasureSpec.getSize(iIntValue2);
            }
            ((EM0) dm0).h(size2, size);
        } finally {
            Trace.endSection();
            this.i = SystemClock.uptimeMillis() - jUptimeMillis;
        }
    }

    public final boolean d(int i, String str) {
        if (this.d.u(i) != null) {
            return true;
        }
        AbstractC3393dS.p("ReactNative");
        return false;
    }

    public final EM0 e() {
        EM0 em0 = new EM0();
        ReactApplicationContext reactApplicationContext = this.c;
        O90.f(reactApplicationContext, "context");
        if ((reactApplicationContext.getApplicationInfo().flags & 4194304) != 0 && (reactApplicationContext.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) || (reactApplicationContext.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1))) {
            YogaNative.jni_YGNodeStyleSetDirectionJNI(em0.u.e, 2);
        }
        em0.b = "Root";
        return em0;
    }

    public final void f(int i) {
        new ArrayList().add("batchId: " + String.valueOf(i));
        MT1.b("UIImplementation.dispatchViewUpdates".concat(""));
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            k();
            ((SparseBooleanArray) this.g.d).clear();
            this.f.a(i, jUptimeMillis, this.i);
        } finally {
            Trace.endSection();
        }
    }

    public final void g(DM0 dm0, NM0 nm0) {
        if (dm0.c()) {
            return;
        }
        EM0 em0 = (EM0) dm0;
        S91 s91 = em0.d;
        UN1.c(s91);
        C6846rT1 c6846rT1 = this.g;
        c6846rT1.getClass();
        String str = em0.b;
        UN1.c(str);
        em0.A(str.equals(ReactViewManager.REACT_CLASS) && C6846rT1.B(nm0));
        if (em0.l() != EnumC5972mu0.c) {
            int i = em0.a;
            String str2 = em0.b;
            UN1.c(str2);
            ((C8216yf1) c6846rT1.b).b(s91, i, str2, nm0);
        }
    }

    public final void h(int i, int i2, int[] iArr) {
        int iRound;
        int iRound2;
        C6846rT1 c6846rT1 = this.d;
        DM0 dm0U = c6846rT1.u(i);
        DM0 dm0U2 = c6846rT1.u(i2);
        if (dm0U == null || dm0U2 == null) {
            StringBuilder sb = new StringBuilder("Tag ");
            if (dm0U != null) {
                i = i2;
            }
            throw new C2262b60(AbstractC1705Vq.j(sb, i, " does not exist"));
        }
        if (dm0U != dm0U2) {
            for (EM0 em0 = ((EM0) dm0U).h; em0 != dm0U2; em0 = em0.h) {
                if (em0 == null) {
                    throw new C2262b60(AbstractC8235ym.f(i2, "Tag ", i, " is not an ancestor of tag "));
                }
            }
        }
        if (dm0U == dm0U2 || dm0U.c()) {
            iRound = 0;
            iRound2 = 0;
        } else {
            EM0 em02 = (EM0) dm0U;
            YogaNodeJNIBase yogaNodeJNIBase = em02.u;
            iRound2 = Math.round(yogaNodeJNIBase.i());
            iRound = Math.round(yogaNodeJNIBase.j());
            for (EM0 em03 = em02.h; em03 != dm0U2; em03 = em03.h) {
                UN1.c(em03);
                b(em03);
                YogaNodeJNIBase yogaNodeJNIBase2 = em03.u;
                iRound2 += Math.round(yogaNodeJNIBase2.i());
                iRound += Math.round(yogaNodeJNIBase2.j());
            }
            b(dm0U2);
        }
        iArr[0] = iRound2;
        iArr[1] = iRound;
        EM0 em04 = (EM0) dm0U;
        iArr[2] = em04.p;
        iArr[3] = em04.q;
    }

    public final void i(DM0 dm0) {
        YogaNodeJNIBase yogaNodeJNIBase;
        EM0 em0 = (EM0) dm0;
        if (em0.f || em0.p() || ((yogaNodeJNIBase = em0.u) != null && YogaNative.jni_YGNodeIsDirtyJNI(yogaNodeJNIBase.e))) {
            for (int i = 0; i < em0.k(); i++) {
                i(em0.j(i));
            }
            em0.b(this.g);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void j(DM0 dm0) {
        EM0 em0 = (EM0) dm0;
        ArrayList arrayList = em0.m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((EM0) em0.m.get(size)).l = null;
            }
            em0.m.clear();
        }
        int i = em0.a;
        C6846rT1 c6846rT1 = this.d;
        ((C7409uQ0) c6846rT1.d).a();
        if (((SparseBooleanArray) c6846rT1.c).get(i)) {
            throw new C2262b60(AbstractC8235ym.g(i, "Trying to remove root node ", " without using removeRootNode!"));
        }
        ((SparseArray) c6846rT1.b).remove(i);
        for (int iK = em0.k() - 1; iK >= 0; iK--) {
            j(em0.j(iK));
        }
        if (em0.k() == 0) {
            return;
        }
        int iO = 0;
        for (int iK2 = em0.k() - 1; iK2 >= 0; iK2--) {
            YogaNodeJNIBase yogaNodeJNIBase = em0.u;
            if (yogaNodeJNIBase != null && !em0.s()) {
                yogaNodeJNIBase.m(iK2);
            }
            EM0 em0J = em0.j(iK2);
            em0J.h = null;
            iO += em0J.o();
            YogaNodeJNIBase yogaNodeJNIBase2 = em0J.u;
            if (yogaNodeJNIBase2 != null) {
                yogaNodeJNIBase2.n();
                ((C1945Ys) AbstractC0925Lp1.a.getValue()).d(yogaNodeJNIBase2);
            }
        }
        ArrayList arrayList2 = em0.g;
        UN1.c(arrayList2);
        arrayList2.clear();
        em0.t();
        em0.k -= iO;
        em0.F(-iO);
    }

    public final void k() {
        C6846rT1 c6846rT1 = this.d;
        MT1.b("UIImplementation.updateViewHierarchy");
        int i = 0;
        while (true) {
            try {
                ((C7409uQ0) c6846rT1.d).a();
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) c6846rT1.c;
                if (i >= sparseBooleanArray.size()) {
                    return;
                }
                ((C7409uQ0) c6846rT1.d).a();
                DM0 dm0U = c6846rT1.u(sparseBooleanArray.keyAt(i));
                if (((EM0) dm0U).v != null && ((EM0) dm0U).w != null) {
                    new ArrayList().add("rootTag: " + String.valueOf(((EM0) dm0U).a));
                    MT1.b("UIImplementation.notifyOnBeforeLayoutRecursive".concat(""));
                    try {
                        i(dm0U);
                        Trace.endSection();
                        c(dm0U);
                        new ArrayList().add("rootTag: " + String.valueOf(((EM0) dm0U).a));
                        MT1.b("UIImplementation.applyUpdatesRecursive".concat(""));
                        try {
                            ArrayList arrayList = new ArrayList();
                            a(dm0U, 0.0f, 0.0f, arrayList);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                DM0 dm0 = (DM0) it.next();
                                this.b.g(C1727Vx0.a(((EM0) dm0).a, ((EM0) dm0).n, ((EM0) dm0).o, ((EM0) dm0).p, ((EM0) dm0).q));
                            }
                            Trace.endSection();
                        } finally {
                        }
                    } finally {
                    }
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1983Ze1(ReactApplicationContext reactApplicationContext, ComponentCallbacks2C0754Jk1 componentCallbacks2C0754Jk1, C8216yf1 c8216yf1, InterfaceC7405uP interfaceC7405uP) {
        this.a = new Object();
        C6846rT1 c6846rT1 = new C6846rT1(24);
        this.d = c6846rT1;
        this.h = new int[4];
        this.i = 0L;
        this.j = true;
        this.c = reactApplicationContext;
        this.e = componentCallbacks2C0754Jk1;
        this.f = c8216yf1;
        this.g = new C6846rT1(c8216yf1, c6846rT1);
        this.b = interfaceC7405uP;
    }
}
