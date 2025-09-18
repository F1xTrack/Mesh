package p000;

import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.C1930a;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: Ze1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8623Ze1 {

    /* renamed from: a */
    public final Object f15070a;

    /* renamed from: b */
    public final InterfaceC6947uP f15071b;

    /* renamed from: c */
    public final ReactApplicationContext f15072c;

    /* renamed from: d */
    public final C10910rT1 f15073d;

    /* renamed from: e */
    public final ComponentCallbacks2C7803Jk1 f15074e;

    /* renamed from: f */
    public final C11827yf1 f15075f;

    /* renamed from: g */
    public final C10910rT1 f15076g;

    /* renamed from: h */
    public final int[] f15077h;

    /* renamed from: i */
    public long f15078i;

    /* renamed from: j */
    public volatile boolean f15079j;

    public C8623Ze1(ReactApplicationContext reactApplicationContext, ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1, C1930a c1930a, int i) {
        this(reactApplicationContext, componentCallbacks2C7803Jk1, new C11827yf1(reactApplicationContext, new C11856yu0(componentCallbacks2C7803Jk1), i), c1930a);
    }

    /* renamed from: a */
    public final void m9565a(DM0 dm0, float f, float f2, ArrayList arrayList) {
        YogaNodeJNIBase yogaNodeJNIBase;
        YogaNodeJNIBase yogaNodeJNIBase2;
        EM0 em0 = (EM0) dm0;
        if (em0.f2654f || em0.m2187p() || ((yogaNodeJNIBase2 = em0.f2669u) != null && YogaNative.jni_YGNodeIsDirtyJNI(yogaNodeJNIBase2.f17997e))) {
            boolean zM2187p = em0.m2187p();
            YogaNodeJNIBase yogaNodeJNIBase3 = em0.f2669u;
            if (zM2187p) {
                float fM11096i = yogaNodeJNIBase3.m11096i();
                float fM11097j = yogaNodeJNIBase3.m11097j();
                float f3 = f + fM11096i;
                int iRound = Math.round(f3);
                float f4 = f2 + fM11097j;
                int iRound2 = Math.round(f4);
                int iRound3 = Math.round(yogaNodeJNIBase3.m11095h() + f3);
                int iRound4 = Math.round(yogaNodeJNIBase3.m11093e() + f4);
                int iRound5 = Math.round(fM11096i);
                int iRound6 = Math.round(fM11097j);
                int i = iRound3 - iRound;
                int i2 = iRound4 - iRound2;
                if ((iRound5 != em0.f2662n || iRound6 != em0.f2663o || i != em0.f2664p || i2 != em0.f2665q) && em0.f2653e) {
                    int i3 = em0.f2649a;
                    C10910rT1 c10910rT1 = this.f15073d;
                    ((C11287uQ0) c10910rT1.f41680d).m25186a();
                    if (!((SparseBooleanArray) c10910rT1.f41679c).get(i3)) {
                        arrayList.add(em0);
                    }
                }
            }
            ArrayList arrayListMo1651a = em0.mo1651a();
            if (arrayListMo1651a != null) {
                Iterator it = arrayListMo1651a.iterator();
                while (it.hasNext()) {
                    m9565a((DM0) it.next(), yogaNodeJNIBase3.m11096i() + f, yogaNodeJNIBase3.m11097j() + f2, arrayList);
                }
            }
            boolean z = em0.f2654f;
            C11827yf1 c11827yf1 = this.f15075f;
            if (z) {
                em0.mo2192u(c11827yf1);
            }
            boolean zM2187p2 = em0.m2187p();
            C10910rT1 c10910rT12 = this.f15076g;
            if (zM2187p2) {
                float fM11096i2 = yogaNodeJNIBase3.m11096i();
                float fM11097j2 = yogaNodeJNIBase3.m11097j();
                float f5 = f + fM11096i2;
                int iRound7 = Math.round(f5);
                float f6 = f2 + fM11097j2;
                int iRound8 = Math.round(f6);
                int iRound9 = Math.round(yogaNodeJNIBase3.m11095h() + f5);
                int iRound10 = Math.round(yogaNodeJNIBase3.m11093e() + f6);
                int iRound11 = Math.round(fM11096i2);
                int iRound12 = Math.round(fM11097j2);
                int i4 = iRound9 - iRound7;
                int i5 = iRound10 - iRound8;
                boolean z2 = (iRound11 == em0.f2662n && iRound12 == em0.f2663o && i4 == em0.f2664p && i5 == em0.f2665q) ? false : true;
                em0.f2662n = iRound11;
                em0.f2663o = iRound12;
                em0.f2664p = i4;
                em0.f2665q = i5;
                if (z2) {
                    if (c10910rT12 != null) {
                        c10910rT12.m24379e(em0);
                    } else {
                        c11827yf1.f46391h.add(new C11446vf1(c11827yf1, em0.f2656h.f2649a, em0.f2649a, iRound11, iRound12, i4, i5));
                    }
                }
            }
            em0.f2654f = false;
            if (em0.m2187p() && (yogaNodeJNIBase = em0.f2669u) != null) {
                yogaNodeJNIBase.m11099l();
            }
            ((SparseBooleanArray) c10910rT12.f41680d).clear();
        }
    }

    /* renamed from: b */
    public final void m9566b(DM0 dm0) {
        EM0 em0 = (EM0) dm0;
        String str = em0.f2650b;
        UN1.m7999c(str);
        NativeModule nativeModuleM4401a = this.f15074e.m4401a(str);
        if (!(nativeModuleM4401a instanceof J50)) {
            StringBuilder sb = new StringBuilder("Trying to use view ");
            String str2 = em0.f2650b;
            UN1.m7999c(str2);
            sb.append(str2);
            sb.append(" as a parent, but its Manager doesn't extends ViewGroupManager");
            throw new C8810b60(sb.toString());
        }
        if (((J50) nativeModuleM4401a).needsCustomLayoutForChildren()) {
            StringBuilder sb2 = new StringBuilder("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (");
            String str3 = em0.f2650b;
            UN1.m7999c(str3);
            sb2.append(str3);
            sb2.append("). Use measure instead.");
            throw new C8810b60(sb2.toString());
        }
    }

    /* renamed from: c */
    public final void m9567c(DM0 dm0) {
        new ArrayList().add("rootTag: " + String.valueOf(((EM0) dm0).f2649a));
        MT1.m5371b("cssRoot.calculateLayout".concat(""));
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            int iIntValue = ((EM0) dm0).f2670v.intValue();
            int iIntValue2 = ((EM0) dm0).f2671w.intValue();
            float size = Float.NaN;
            float size2 = View.MeasureSpec.getMode(iIntValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(iIntValue);
            if (View.MeasureSpec.getMode(iIntValue2) != 0) {
                size = View.MeasureSpec.getSize(iIntValue2);
            }
            ((EM0) dm0).m2179h(size2, size);
        } finally {
            Trace.endSection();
            this.f15078i = SystemClock.uptimeMillis() - jUptimeMillis;
        }
    }

    /* renamed from: d */
    public final boolean m9568d(int i, String str) {
        if (this.f15073d.m24384u(i) != null) {
            return true;
        }
        AbstractC3929dS.m17683p("ReactNative");
        return false;
    }

    /* renamed from: e */
    public final EM0 m9569e() {
        EM0 em0 = new EM0();
        ReactApplicationContext reactApplicationContext = this.f15072c;
        O90.m5968f(reactApplicationContext, "context");
        if ((reactApplicationContext.getApplicationInfo().flags & 4194304) != 0 && (reactApplicationContext.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) || (reactApplicationContext.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1))) {
            YogaNative.jni_YGNodeStyleSetDirectionJNI(em0.f2669u.f17997e, 2);
        }
        em0.f2650b = "Root";
        return em0;
    }

    /* renamed from: f */
    public final void m9570f(int i) {
        new ArrayList().add("batchId: " + String.valueOf(i));
        MT1.m5371b("UIImplementation.dispatchViewUpdates".concat(""));
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            m9575k();
            ((SparseBooleanArray) this.f15076g.f41680d).clear();
            this.f15075f.m26212a(i, jUptimeMillis, this.f15078i);
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: g */
    public final void m9571g(DM0 dm0, NM0 nm0) {
        if (dm0.mo1653c()) {
            return;
        }
        EM0 em0 = (EM0) dm0;
        S91 s91 = em0.f2652d;
        UN1.m7999c(s91);
        C10910rT1 c10910rT1 = this.f15076g;
        c10910rT1.getClass();
        String str = em0.f2650b;
        UN1.m7999c(str);
        em0.m2170A(str.equals(ReactViewManager.REACT_CLASS) && C10910rT1.m24362B(nm0));
        if (em0.m2183l() != EnumC10323mu0.f37987c) {
            int i = em0.f2649a;
            String str2 = em0.f2650b;
            UN1.m7999c(str2);
            ((C11827yf1) c10910rT1.f41678b).m26213b(s91, i, str2, nm0);
        }
    }

    /* renamed from: h */
    public final void m9572h(int i, int i2, int[] iArr) {
        int iRound;
        int iRound2;
        C10910rT1 c10910rT1 = this.f15073d;
        DM0 dm0M24384u = c10910rT1.m24384u(i);
        DM0 dm0M24384u2 = c10910rT1.m24384u(i2);
        if (dm0M24384u == null || dm0M24384u2 == null) {
            StringBuilder sb = new StringBuilder("Tag ");
            if (dm0M24384u != null) {
                i = i2;
            }
            throw new C8810b60(AbstractC1374Vq.m8591j(sb, i, " does not exist"));
        }
        if (dm0M24384u != dm0M24384u2) {
            for (EM0 em0 = ((EM0) dm0M24384u).f2656h; em0 != dm0M24384u2; em0 = em0.f2656h) {
                if (em0 == null) {
                    throw new C8810b60(AbstractC7222ym.m26229f(i2, "Tag ", i, " is not an ancestor of tag "));
                }
            }
        }
        if (dm0M24384u == dm0M24384u2 || dm0M24384u.mo1653c()) {
            iRound = 0;
            iRound2 = 0;
        } else {
            EM0 em02 = (EM0) dm0M24384u;
            YogaNodeJNIBase yogaNodeJNIBase = em02.f2669u;
            iRound2 = Math.round(yogaNodeJNIBase.m11096i());
            iRound = Math.round(yogaNodeJNIBase.m11097j());
            for (EM0 em03 = em02.f2656h; em03 != dm0M24384u2; em03 = em03.f2656h) {
                UN1.m7999c(em03);
                m9566b(em03);
                YogaNodeJNIBase yogaNodeJNIBase2 = em03.f2669u;
                iRound2 += Math.round(yogaNodeJNIBase2.m11096i());
                iRound += Math.round(yogaNodeJNIBase2.m11097j());
            }
            m9566b(dm0M24384u2);
        }
        iArr[0] = iRound2;
        iArr[1] = iRound;
        EM0 em04 = (EM0) dm0M24384u;
        iArr[2] = em04.f2664p;
        iArr[3] = em04.f2665q;
    }

    /* renamed from: i */
    public final void m9573i(DM0 dm0) {
        YogaNodeJNIBase yogaNodeJNIBase;
        EM0 em0 = (EM0) dm0;
        if (em0.f2654f || em0.m2187p() || ((yogaNodeJNIBase = em0.f2669u) != null && YogaNative.jni_YGNodeIsDirtyJNI(yogaNodeJNIBase.f17997e))) {
            for (int i = 0; i < em0.m2182k(); i++) {
                m9573i(em0.m2181j(i));
            }
            em0.mo1652b(this.f15076g);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* renamed from: j */
    public final void m9574j(DM0 dm0) {
        EM0 em0 = (EM0) dm0;
        ArrayList arrayList = em0.f2661m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((EM0) em0.f2661m.get(size)).f2660l = null;
            }
            em0.f2661m.clear();
        }
        int i = em0.f2649a;
        C10910rT1 c10910rT1 = this.f15073d;
        ((C11287uQ0) c10910rT1.f41680d).m25186a();
        if (((SparseBooleanArray) c10910rT1.f41679c).get(i)) {
            throw new C8810b60(AbstractC7222ym.m26230g(i, "Trying to remove root node ", " without using removeRootNode!"));
        }
        ((SparseArray) c10910rT1.f41678b).remove(i);
        for (int iM2182k = em0.m2182k() - 1; iM2182k >= 0; iM2182k--) {
            m9574j(em0.m2181j(iM2182k));
        }
        if (em0.m2182k() == 0) {
            return;
        }
        int iM2186o = 0;
        for (int iM2182k2 = em0.m2182k() - 1; iM2182k2 >= 0; iM2182k2--) {
            YogaNodeJNIBase yogaNodeJNIBase = em0.f2669u;
            if (yogaNodeJNIBase != null && !em0.mo2190s()) {
                yogaNodeJNIBase.m11100m(iM2182k2);
            }
            EM0 em0M2181j = em0.m2181j(iM2182k2);
            em0M2181j.f2656h = null;
            iM2186o += em0M2181j.m2186o();
            YogaNodeJNIBase yogaNodeJNIBase2 = em0M2181j.f2669u;
            if (yogaNodeJNIBase2 != null) {
                yogaNodeJNIBase2.m11101n();
                ((C1565Ys) AbstractC7917Lp1.f6883a.getValue()).mo4580d(yogaNodeJNIBase2);
            }
        }
        ArrayList arrayList2 = em0.f2655g;
        UN1.m7999c(arrayList2);
        arrayList2.clear();
        em0.mo2191t();
        em0.f2659k -= iM2186o;
        em0.m2175F(-iM2186o);
    }

    /* renamed from: k */
    public final void m9575k() {
        C10910rT1 c10910rT1 = this.f15073d;
        MT1.m5371b("UIImplementation.updateViewHierarchy");
        int i = 0;
        while (true) {
            try {
                ((C11287uQ0) c10910rT1.f41680d).m25186a();
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) c10910rT1.f41679c;
                if (i >= sparseBooleanArray.size()) {
                    return;
                }
                ((C11287uQ0) c10910rT1.f41680d).m25186a();
                DM0 dm0M24384u = c10910rT1.m24384u(sparseBooleanArray.keyAt(i));
                if (((EM0) dm0M24384u).f2670v != null && ((EM0) dm0M24384u).f2671w != null) {
                    new ArrayList().add("rootTag: " + String.valueOf(((EM0) dm0M24384u).f2649a));
                    MT1.m5371b("UIImplementation.notifyOnBeforeLayoutRecursive".concat(""));
                    try {
                        m9573i(dm0M24384u);
                        Trace.endSection();
                        m9567c(dm0M24384u);
                        new ArrayList().add("rootTag: " + String.valueOf(((EM0) dm0M24384u).f2649a));
                        MT1.m5371b("UIImplementation.applyUpdatesRecursive".concat(""));
                        try {
                            ArrayList arrayList = new ArrayList();
                            m9565a(dm0M24384u, 0.0f, 0.0f, arrayList);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                DM0 dm0 = (DM0) it.next();
                                this.f15071b.mo11046g(C8452Vx0.m8643a(((EM0) dm0).f2649a, ((EM0) dm0).f2662n, ((EM0) dm0).f2663o, ((EM0) dm0).f2664p, ((EM0) dm0).f2665q));
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

    public C8623Ze1(ReactApplicationContext reactApplicationContext, ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1, C11827yf1 c11827yf1, InterfaceC6947uP interfaceC6947uP) {
        this.f15070a = new Object();
        C10910rT1 c10910rT1 = new C10910rT1(24);
        this.f15073d = c10910rT1;
        this.f15077h = new int[4];
        this.f15078i = 0L;
        this.f15079j = true;
        this.f15072c = reactApplicationContext;
        this.f15074e = componentCallbacks2C7803Jk1;
        this.f15075f = c11827yf1;
        this.f15076g = new C10910rT1(c11827yf1, c10910rT1);
        this.f15071b = interfaceC6947uP;
    }
}
