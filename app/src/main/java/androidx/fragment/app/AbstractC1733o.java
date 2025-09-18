package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C1690a;
import androidx.fragment.app.AbstractC1733o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC1374Vq;
import p000.AbstractC1544YX;
import p000.AbstractC1576Z2;
import p000.AbstractC1607ZX;
import p000.AbstractC4060fY;
import p000.AbstractC6750rY;
import p000.AbstractC7222ym;
import p000.C0767MB;
import p000.C10145lV0;
import p000.C10189lr0;
import p000.C10817ql0;
import p000.C1135S2;
import p000.C1339VH;
import p000.C1418WX;
import p000.C1513Y2;
import p000.C1671aY;
import p000.C1792bY;
import p000.C1854cY;
import p000.C3935dY;
import p000.C3997eY;
import p000.C6307kY;
import p000.C6893tY;
import p000.C6963uf;
import p000.C7042vv;
import p000.C7512Dv0;
import p000.C7621Fx1;
import p000.C7978Mu0;
import p000.EnumC7434Ci0;
import p000.G10;
import p000.GR0;
import p000.InterfaceC0430Gp;
import p000.InterfaceC10401nV0;
import p000.InterfaceC1640a3;
import p000.InterfaceC4186hY;
import p000.InterfaceC6433mY;
import p000.InterfaceC6650py;
import p000.InterfaceC7554Eq0;
import p000.InterfaceC7880Kx0;
import p000.InterfaceC7902Li0;
import p000.InterfaceC8140Px0;
import p000.InterfaceC8556Xx0;
import p000.InterfaceC8608Yx0;
import p000.InterfaceC8635Zk1;
import p000.InterfaceC9563gy0;
import p000.O90;
import ru.mes.dnevnik.R;

/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public abstract class AbstractC1733o {

    /* renamed from: A */
    public C1513Y2 f16200A;

    /* renamed from: B */
    public C1513Y2 f16201B;

    /* renamed from: C */
    public ArrayDeque f16202C;

    /* renamed from: D */
    public boolean f16203D;

    /* renamed from: E */
    public boolean f16204E;

    /* renamed from: F */
    public boolean f16205F;

    /* renamed from: G */
    public boolean f16206G;

    /* renamed from: H */
    public boolean f16207H;

    /* renamed from: I */
    public ArrayList f16208I;

    /* renamed from: J */
    public ArrayList f16209J;

    /* renamed from: K */
    public ArrayList f16210K;

    /* renamed from: L */
    public C1734p f16211L;

    /* renamed from: M */
    public final GR0 f16212M;

    /* renamed from: b */
    public boolean f16214b;

    /* renamed from: d */
    public ArrayList f16216d;

    /* renamed from: e */
    public ArrayList f16217e;

    /* renamed from: g */
    public C1690a f16219g;

    /* renamed from: l */
    public final C1339VH f16224l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f16225m;

    /* renamed from: n */
    public final C1792bY f16226n;

    /* renamed from: o */
    public final C1792bY f16227o;

    /* renamed from: p */
    public final C1792bY f16228p;

    /* renamed from: q */
    public final C1792bY f16229q;

    /* renamed from: r */
    public final C1854cY f16230r;

    /* renamed from: s */
    public int f16231s;

    /* renamed from: t */
    public AbstractC1607ZX f16232t;

    /* renamed from: u */
    public AbstractC1544YX f16233u;

    /* renamed from: v */
    public Fragment f16234v;

    /* renamed from: w */
    public Fragment f16235w;

    /* renamed from: x */
    public final C3935dY f16236x;

    /* renamed from: y */
    public final C7512Dv0 f16237y;

    /* renamed from: z */
    public C1513Y2 f16238z;

    /* renamed from: a */
    public final ArrayList f16213a = new ArrayList();

    /* renamed from: c */
    public final C1737s f16215c = new C1737s();

    /* renamed from: f */
    public final LayoutInflaterFactory2C1732n f16218f = new LayoutInflaterFactory2C1732n(this);

    /* renamed from: h */
    public final C0767MB f16220h = new C0767MB(this);

    /* renamed from: i */
    public final AtomicInteger f16221i = new AtomicInteger();

    /* renamed from: j */
    public final Map f16222j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map f16223k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [bY] */
    /* JADX WARN: Type inference failed for: r0v13, types: [bY] */
    /* JADX WARN: Type inference failed for: r0v14, types: [bY] */
    /* JADX WARN: Type inference failed for: r0v15, types: [bY] */
    public AbstractC1733o() {
        Collections.synchronizedMap(new HashMap());
        this.f16224l = new C1339VH(this);
        this.f16225m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f16226n = new InterfaceC6650py(this) { // from class: bY

            /* renamed from: b */
            public final /* synthetic */ AbstractC1733o f17064b;

            {
                this.f17064b = this;
            }

            @Override // p000.InterfaceC6650py
            /* renamed from: b */
            public final void mo3020b(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1733o abstractC1733o = this.f17064b;
                        if (abstractC1733o.m10045J()) {
                            abstractC1733o.m10072h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1733o abstractC1733o2 = this.f17064b;
                        if (abstractC1733o2.m10045J() && num.intValue() == 80) {
                            abstractC1733o2.m10076l(false);
                            break;
                        }
                        break;
                    case 2:
                        C10961rt0 c10961rt0 = (C10961rt0) obj;
                        AbstractC1733o abstractC1733o3 = this.f17064b;
                        if (abstractC1733o3.m10045J()) {
                            abstractC1733o3.m10077m(c10961rt0.f41942a, false);
                            break;
                        }
                        break;
                    default:
                        C9081dB0 c9081dB0 = (C9081dB0) obj;
                        AbstractC1733o abstractC1733o4 = this.f17064b;
                        if (abstractC1733o4.m10045J()) {
                            abstractC1733o4.m10082r(c9081dB0.f25855a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f16227o = new InterfaceC6650py(this) { // from class: bY

            /* renamed from: b */
            public final /* synthetic */ AbstractC1733o f17064b;

            {
                this.f17064b = this;
            }

            @Override // p000.InterfaceC6650py
            /* renamed from: b */
            public final void mo3020b(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1733o abstractC1733o = this.f17064b;
                        if (abstractC1733o.m10045J()) {
                            abstractC1733o.m10072h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1733o abstractC1733o2 = this.f17064b;
                        if (abstractC1733o2.m10045J() && num.intValue() == 80) {
                            abstractC1733o2.m10076l(false);
                            break;
                        }
                        break;
                    case 2:
                        C10961rt0 c10961rt0 = (C10961rt0) obj;
                        AbstractC1733o abstractC1733o3 = this.f17064b;
                        if (abstractC1733o3.m10045J()) {
                            abstractC1733o3.m10077m(c10961rt0.f41942a, false);
                            break;
                        }
                        break;
                    default:
                        C9081dB0 c9081dB0 = (C9081dB0) obj;
                        AbstractC1733o abstractC1733o4 = this.f17064b;
                        if (abstractC1733o4.m10045J()) {
                            abstractC1733o4.m10082r(c9081dB0.f25855a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f16228p = new InterfaceC6650py(this) { // from class: bY

            /* renamed from: b */
            public final /* synthetic */ AbstractC1733o f17064b;

            {
                this.f17064b = this;
            }

            @Override // p000.InterfaceC6650py
            /* renamed from: b */
            public final void mo3020b(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1733o abstractC1733o = this.f17064b;
                        if (abstractC1733o.m10045J()) {
                            abstractC1733o.m10072h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1733o abstractC1733o2 = this.f17064b;
                        if (abstractC1733o2.m10045J() && num.intValue() == 80) {
                            abstractC1733o2.m10076l(false);
                            break;
                        }
                        break;
                    case 2:
                        C10961rt0 c10961rt0 = (C10961rt0) obj;
                        AbstractC1733o abstractC1733o3 = this.f17064b;
                        if (abstractC1733o3.m10045J()) {
                            abstractC1733o3.m10077m(c10961rt0.f41942a, false);
                            break;
                        }
                        break;
                    default:
                        C9081dB0 c9081dB0 = (C9081dB0) obj;
                        AbstractC1733o abstractC1733o4 = this.f17064b;
                        if (abstractC1733o4.m10045J()) {
                            abstractC1733o4.m10082r(c9081dB0.f25855a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f16229q = new InterfaceC6650py(this) { // from class: bY

            /* renamed from: b */
            public final /* synthetic */ AbstractC1733o f17064b;

            {
                this.f17064b = this;
            }

            @Override // p000.InterfaceC6650py
            /* renamed from: b */
            public final void mo3020b(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1733o abstractC1733o = this.f17064b;
                        if (abstractC1733o.m10045J()) {
                            abstractC1733o.m10072h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1733o abstractC1733o2 = this.f17064b;
                        if (abstractC1733o2.m10045J() && num.intValue() == 80) {
                            abstractC1733o2.m10076l(false);
                            break;
                        }
                        break;
                    case 2:
                        C10961rt0 c10961rt0 = (C10961rt0) obj;
                        AbstractC1733o abstractC1733o3 = this.f17064b;
                        if (abstractC1733o3.m10045J()) {
                            abstractC1733o3.m10077m(c10961rt0.f41942a, false);
                            break;
                        }
                        break;
                    default:
                        C9081dB0 c9081dB0 = (C9081dB0) obj;
                        AbstractC1733o abstractC1733o4 = this.f17064b;
                        if (abstractC1733o4.m10045J()) {
                            abstractC1733o4.m10082r(c9081dB0.f25855a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f16230r = new C1854cY(this);
        this.f16231s = -1;
        this.f16236x = new C3935dY(this);
        this.f16237y = new C7512Dv0(14);
        this.f16202C = new ArrayDeque();
        this.f16212M = new GR0(23, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* renamed from: C */
    public static Fragment m10035C(ViewGroup viewGroup) {
        while (viewGroup != 0) {
            Object tag = viewGroup.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = viewGroup.getParent();
            viewGroup = parent instanceof View ? (View) parent : 0;
        }
        return null;
    }

    /* renamed from: I */
    public static boolean m10036I(Fragment fragment) {
        if (!fragment.mHasMenu || !fragment.mMenuVisible) {
            Iterator it = fragment.mChildFragmentManager.f16215c.m10111e().iterator();
            boolean zM10036I = false;
            while (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    zM10036I = m10036I(fragment2);
                }
                if (zM10036I) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public static boolean m10037K(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        AbstractC1733o abstractC1733o = fragment.mFragmentManager;
        return fragment.equals(abstractC1733o.f16235w) && m10037K(abstractC1733o.f16234v);
    }

    /* renamed from: A */
    public final Fragment m10038A(int i) {
        C1737s c1737s = this.f16215c;
        ArrayList arrayList = c1737s.f16265a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C1736r c1736r : c1737s.f16266b.values()) {
            if (c1736r != null) {
                Fragment fragment2 = c1736r.f16262c;
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: B */
    public final Fragment m10039B(String str) {
        C1737s c1737s = this.f16215c;
        ArrayList arrayList = c1737s.f16265a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
        for (C1736r c1736r : c1737s.f16266b.values()) {
            if (c1736r != null) {
                Fragment fragment2 = c1736r.f16262c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: D */
    public final void m10040D() {
        Iterator it = m10069e().iterator();
        while (it.hasNext()) {
            C1724f c1724f = (C1724f) it.next();
            if (c1724f.f16187e) {
                c1724f.f16187e = false;
                c1724f.m10027d();
            }
        }
    }

    /* renamed from: E */
    public final ViewGroup m10041E(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f16233u.mo2123c()) {
            View viewMo2122b = this.f16233u.mo2122b(fragment.mContainerId);
            if (viewMo2122b instanceof ViewGroup) {
                return (ViewGroup) viewMo2122b;
            }
        }
        return null;
    }

    /* renamed from: F */
    public final C3935dY m10042F() {
        Fragment fragment = this.f16234v;
        return fragment != null ? fragment.mFragmentManager.m10042F() : this.f16236x;
    }

    /* renamed from: G */
    public final C7512Dv0 m10043G() {
        Fragment fragment = this.f16234v;
        return fragment != null ? fragment.mFragmentManager.m10043G() : this.f16237y;
    }

    /* renamed from: H */
    public final void m10044H(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m10062a0(fragment);
    }

    /* renamed from: J */
    public final boolean m10045J() {
        Fragment fragment = this.f16234v;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f16234v.getParentFragmentManager().m10045J();
    }

    /* renamed from: L */
    public final boolean m10046L() {
        return this.f16204E || this.f16205F;
    }

    /* renamed from: M */
    public final void m10047M(int i, boolean z) {
        HashMap map;
        AbstractC1607ZX abstractC1607ZX;
        if (this.f16232t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f16231s) {
            this.f16231s = i;
            C1737s c1737s = this.f16215c;
            Iterator it = c1737s.f16265a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = c1737s.f16266b;
                if (!zHasNext) {
                    break;
                }
                C1736r c1736r = (C1736r) map.get(((Fragment) it.next()).mWho);
                if (c1736r != null) {
                    c1736r.m10102i();
                }
            }
            for (C1736r c1736r2 : map.values()) {
                if (c1736r2 != null) {
                    c1736r2.m10102i();
                    Fragment fragment = c1736r2.f16262c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !c1737s.f16267c.containsKey(fragment.mWho)) {
                            c1737s.m10115i(c1736r2.m10105l(), fragment.mWho);
                        }
                        c1737s.m10114h(c1736r2);
                    }
                }
            }
            Iterator it2 = c1737s.m10110d().iterator();
            while (it2.hasNext()) {
                C1736r c1736r3 = (C1736r) it2.next();
                Fragment fragment2 = c1736r3.f16262c;
                if (fragment2.mDeferStart) {
                    if (this.f16214b) {
                        this.f16207H = true;
                    } else {
                        fragment2.mDeferStart = false;
                        c1736r3.m10102i();
                    }
                }
            }
            if (this.f16203D && (abstractC1607ZX = this.f16232t) != null && this.f16231s == 7) {
                ((C1418WX) abstractC1607ZX).f13247e.invalidateMenu();
                this.f16203D = false;
            }
        }
    }

    /* renamed from: N */
    public final void m10048N() {
        if (this.f16232t == null) {
            return;
        }
        this.f16204E = false;
        this.f16205F = false;
        this.f16211L.f16245i = false;
        for (Fragment fragment : this.f16215c.m10112f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: O */
    public final boolean m10049O() {
        return m10050P(-1, 0);
    }

    /* renamed from: P */
    public final boolean m10050P(int i, int i2) {
        m10088x(false);
        m10087w(true);
        Fragment fragment = this.f16235w;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().m10049O()) {
            return true;
        }
        boolean zM10051Q = m10051Q(this.f16208I, this.f16209J, i, i2);
        if (zM10051Q) {
            this.f16214b = true;
            try {
                m10054T(this.f16208I, this.f16209J);
            } finally {
                m10067d();
            }
        }
        m10068d0();
        boolean z = this.f16207H;
        C1737s c1737s = this.f16215c;
        if (z) {
            this.f16207H = false;
            Iterator it = c1737s.m10110d().iterator();
            while (it.hasNext()) {
                C1736r c1736r = (C1736r) it.next();
                Fragment fragment2 = c1736r.f16262c;
                if (fragment2.mDeferStart) {
                    if (this.f16214b) {
                        this.f16207H = true;
                    } else {
                        fragment2.mDeferStart = false;
                        c1736r.m10102i();
                    }
                }
            }
        }
        c1737s.f16266b.values().removeAll(Collections.singleton(null));
        return zM10051Q;
    }

    /* renamed from: Q */
    public final boolean m10051Q(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f16216d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f16216d.size() - 1;
            } else {
                int size2 = this.f16216d.size() - 1;
                while (size2 >= 0) {
                    C1719a c1719a = (C1719a) this.f16216d.get(size2);
                    if (i >= 0 && i == c1719a.f16160s) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z) {
                        while (size2 > 0) {
                            C1719a c1719a2 = (C1719a) this.f16216d.get(size2 - 1);
                            if (i < 0 || i != c1719a2.f16160s) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.f16216d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f16216d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C1719a) this.f16216d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: R */
    public final void m10052R(AbstractC4060fY abstractC4060fY) {
        ((CopyOnWriteArrayList) this.f16224l.f12486b).add(new C1671aY(abstractC4060fY));
    }

    /* renamed from: S */
    public final void m10053S(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
            int i = fragment.mBackStackNesting;
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        C1737s c1737s = this.f16215c;
        synchronized (c1737s.f16265a) {
            c1737s.f16265a.remove(fragment);
        }
        fragment.mAdded = false;
        if (m10036I(fragment)) {
            this.f16203D = true;
        }
        fragment.mRemoving = true;
        m10062a0(fragment);
    }

    /* renamed from: T */
    public final void m10054T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C1719a) arrayList.get(i)).f43746o) {
                if (i2 != i) {
                    m10090z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C1719a) arrayList.get(i2)).f43746o) {
                        i2++;
                    }
                }
                m10090z(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m10090z(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: U */
    public final void m10055U(Bundle bundle) {
        C1339VH c1339vh;
        int i;
        C1736r c1736r;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f16232t.f14957b.getClassLoader());
                this.f16223k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f16232t.f14957b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C1737s c1737s = this.f16215c;
        HashMap map2 = c1737s.f16267c;
        map2.clear();
        map2.putAll(map);
        C6307kY c6307kY = (C6307kY) bundle.getParcelable("state");
        if (c6307kY == null) {
            return;
        }
        HashMap map3 = c1737s.f16266b;
        map3.clear();
        Iterator it = c6307kY.f36527a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c1339vh = this.f16224l;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM10115i = c1737s.m10115i(null, (String) it.next());
            if (bundleM10115i != null) {
                Fragment fragment = (Fragment) this.f16211L.f16240d.get(((C1735q) bundleM10115i.getParcelable("state")).f16247b);
                if (fragment != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragment.toString();
                    }
                    c1736r = new C1736r(c1339vh, c1737s, fragment, bundleM10115i);
                } else {
                    c1736r = new C1736r(this.f16224l, this.f16215c, this.f16232t.f14957b.getClassLoader(), m10042F(), bundleM10115i);
                }
                Fragment fragment2 = c1736r.f16262c;
                fragment2.mSavedFragmentState = bundleM10115i;
                fragment2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment2.toString();
                }
                c1736r.m10103j(this.f16232t.f14957b.getClassLoader());
                c1737s.m10113g(c1736r);
                c1736r.f16264e = this.f16231s;
            }
        }
        C1734p c1734p = this.f16211L;
        c1734p.getClass();
        Iterator it2 = new ArrayList(c1734p.f16240d.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (map3.get(fragment3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment3.toString();
                    Objects.toString(c6307kY.f36527a);
                }
                this.f16211L.m10093e(fragment3);
                fragment3.mFragmentManager = this;
                C1736r c1736r2 = new C1736r(c1339vh, c1737s, fragment3);
                c1736r2.f16264e = 1;
                c1736r2.m10102i();
                fragment3.mRemoving = true;
                c1736r2.m10102i();
            }
        }
        ArrayList<String> arrayList = c6307kY.f36528b;
        c1737s.f16265a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentM10108b = c1737s.m10108b(str3);
                if (fragmentM10108b == null) {
                    throw new IllegalStateException(AbstractC7222ym.m26234k("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragmentM10108b.toString();
                }
                c1737s.m10107a(fragmentM10108b);
            }
        }
        if (c6307kY.f36529c != null) {
            this.f16216d = new ArrayList(c6307kY.f36529c.length);
            int i2 = 0;
            while (true) {
                C1720b[] c1720bArr = c6307kY.f36529c;
                if (i2 >= c1720bArr.length) {
                    break;
                }
                C1720b c1720b = c1720bArr[i2];
                c1720b.getClass();
                C1719a c1719a = new C1719a(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = c1720b.f16161a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    C6893tY c6893tY = new C6893tY();
                    int i5 = i3 + 1;
                    c6893tY.f43124a = iArr[i3];
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(c1719a);
                        int i6 = iArr[i5];
                    }
                    c6893tY.f43131h = EnumC7434Ci0.values()[c1720b.f16163c[i4]];
                    c6893tY.f43132i = EnumC7434Ci0.values()[c1720b.f16164d[i4]];
                    int i7 = i3 + 2;
                    c6893tY.f43126c = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    c6893tY.f43127d = i8;
                    int i9 = iArr[i3 + 3];
                    c6893tY.f43128e = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    c6893tY.f43129f = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    c6893tY.f43130g = i12;
                    c1719a.f43733b = i8;
                    c1719a.f43734c = i9;
                    c1719a.f43735d = i11;
                    c1719a.f43736e = i12;
                    c1719a.m25200b(c6893tY);
                    i4++;
                }
                c1719a.f43737f = c1720b.f16165e;
                c1719a.f43739h = c1720b.f16166f;
                c1719a.f43738g = true;
                c1719a.f43740i = c1720b.f16168h;
                c1719a.f43741j = c1720b.f16169i;
                c1719a.f43742k = c1720b.f16170j;
                c1719a.f43743l = c1720b.f16171k;
                c1719a.f43744m = c1720b.f16172l;
                c1719a.f43745n = c1720b.f16173m;
                c1719a.f43746o = c1720b.f16174n;
                c1719a.f16160s = c1720b.f16167g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = c1720b.f16162b;
                    if (i13 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i13);
                    if (str4 != null) {
                        ((C6893tY) c1719a.f43732a.get(i13)).f43125b = c1737s.m10108b(str4);
                    }
                    i13++;
                }
                c1719a.m10014e(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    c1719a.toString();
                    PrintWriter printWriter = new PrintWriter(new C10817ql0());
                    c1719a.m10017h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f16216d.add(c1719a);
                i2++;
            }
            i = 0;
        } else {
            i = 0;
            this.f16216d = null;
        }
        this.f16221i.set(c6307kY.f36530d);
        String str5 = c6307kY.f36531e;
        if (str5 != null) {
            Fragment fragmentM10108b2 = c1737s.m10108b(str5);
            this.f16235w = fragmentM10108b2;
            m10081q(fragmentM10108b2);
        }
        ArrayList arrayList3 = c6307kY.f36532f;
        if (arrayList3 != null) {
            for (int i14 = i; i14 < arrayList3.size(); i14++) {
                this.f16222j.put((String) arrayList3.get(i14), (C6963uf) c6307kY.f36533g.get(i14));
            }
        }
        this.f16202C = new ArrayDeque(c6307kY.f36534h);
    }

    /* renamed from: V */
    public final Bundle m10056V() {
        ArrayList arrayList;
        C1720b[] c1720bArr;
        int size;
        Bundle bundle = new Bundle();
        m10040D();
        Iterator it = m10069e().iterator();
        while (it.hasNext()) {
            ((C1724f) it.next()).m10029g();
        }
        m10088x(true);
        this.f16204E = true;
        this.f16211L.f16245i = true;
        C1737s c1737s = this.f16215c;
        c1737s.getClass();
        HashMap map = c1737s.f16266b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C1736r c1736r : map.values()) {
            if (c1736r != null) {
                Fragment fragment = c1736r.f16262c;
                c1737s.m10115i(c1736r.m10105l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f16215c.f16267c;
        if (!map2.isEmpty()) {
            C1737s c1737s2 = this.f16215c;
            synchronized (c1737s2.f16265a) {
                try {
                    if (c1737s2.f16265a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(c1737s2.f16265a.size());
                        Iterator it2 = c1737s2.f16265a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment2 = (Fragment) it2.next();
                            arrayList.add(fragment2.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                fragment2.toString();
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f16216d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c1720bArr = null;
            } else {
                c1720bArr = new C1720b[size];
                for (int i = 0; i < size; i++) {
                    c1720bArr[i] = new C1720b((C1719a) this.f16216d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(this.f16216d.get(i));
                    }
                }
            }
            C6307kY c6307kY = new C6307kY();
            c6307kY.f36531e = null;
            ArrayList arrayList4 = new ArrayList();
            c6307kY.f36532f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            c6307kY.f36533g = arrayList5;
            c6307kY.f36527a = arrayList2;
            c6307kY.f36528b = arrayList;
            c6307kY.f36529c = c1720bArr;
            c6307kY.f36530d = this.f16221i.get();
            Fragment fragment3 = this.f16235w;
            if (fragment3 != null) {
                c6307kY.f36531e = fragment3.mWho;
            }
            arrayList4.addAll(this.f16222j.keySet());
            arrayList5.addAll(this.f16222j.values());
            c6307kY.f36534h = new ArrayList(this.f16202C);
            bundle.putParcelable("state", c6307kY);
            for (String str : this.f16223k.keySet()) {
                bundle.putBundle(AbstractC7222ym.m26245v("result_", str), (Bundle) this.f16223k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(AbstractC7222ym.m26245v("fragment_", str2), (Bundle) map2.get(str2));
            }
        }
        return bundle;
    }

    /* renamed from: W */
    public final void m10057W() {
        synchronized (this.f16213a) {
            try {
                if (this.f16213a.size() == 1) {
                    this.f16232t.f14958c.removeCallbacks(this.f16212M);
                    this.f16232t.f14958c.post(this.f16212M);
                    m10068d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: X */
    public final void m10058X(Fragment fragment, boolean z) {
        ViewGroup viewGroupM10041E = m10041E(fragment);
        if (viewGroupM10041E == null || !(viewGroupM10041E instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM10041E).setDrawDisappearingViewsLast(!z);
    }

    /* renamed from: Y */
    public final void m10059Y(Fragment fragment, EnumC7434Ci0 enumC7434Ci0) {
        if (fragment.equals(this.f16215c.m10108b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = enumC7434Ci0;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: Z */
    public final void m10060Z(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f16215c.m10108b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f16235w;
        this.f16235w = fragment;
        m10081q(fragment2);
        m10081q(this.f16235w);
    }

    /* renamed from: a */
    public final C1736r m10061a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            AbstractC6750rY.m24400c(fragment, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
        C1736r c1736rM10070f = m10070f(fragment);
        fragment.mFragmentManager = this;
        C1737s c1737s = this.f16215c;
        c1737s.m10113g(c1736rM10070f);
        if (!fragment.mDetached) {
            c1737s.m10107a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m10036I(fragment)) {
                this.f16203D = true;
            }
        }
        return c1736rM10070f;
    }

    /* renamed from: a0 */
    public final void m10062a0(Fragment fragment) {
        ViewGroup viewGroupM10041E = m10041E(fragment);
        if (viewGroupM10041E != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupM10041E.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM10041E.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupM10041E.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m10063b(AbstractC1607ZX abstractC1607ZX, AbstractC1544YX abstractC1544YX, Fragment fragment) {
        if (this.f16232t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f16232t = abstractC1607ZX;
        this.f16233u = abstractC1544YX;
        this.f16234v = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16225m;
        if (fragment != null) {
            copyOnWriteArrayList.add(new C3997eY(fragment));
        } else if (abstractC1607ZX instanceof InterfaceC6433mY) {
            copyOnWriteArrayList.add((InterfaceC6433mY) abstractC1607ZX);
        }
        if (this.f16234v != null) {
            m10068d0();
        }
        if (abstractC1607ZX instanceof InterfaceC7880Kx0) {
            InterfaceC7880Kx0 interfaceC7880Kx0 = (InterfaceC7880Kx0) abstractC1607ZX;
            C1690a onBackPressedDispatcher = interfaceC7880Kx0.getOnBackPressedDispatcher();
            this.f16219g = onBackPressedDispatcher;
            InterfaceC7902Li0 interfaceC7902Li0 = interfaceC7880Kx0;
            if (fragment != null) {
                interfaceC7902Li0 = fragment;
            }
            onBackPressedDispatcher.m9819a(interfaceC7902Li0, this.f16220h);
        }
        if (fragment != null) {
            C1734p c1734p = fragment.mFragmentManager.f16211L;
            HashMap map = c1734p.f16241e;
            C1734p c1734p2 = (C1734p) map.get(fragment.mWho);
            if (c1734p2 == null) {
                c1734p2 = new C1734p(c1734p.f16243g);
                map.put(fragment.mWho, c1734p2);
            }
            this.f16211L = c1734p2;
        } else if (abstractC1607ZX instanceof InterfaceC8635Zk1) {
            this.f16211L = (C1734p) new C10189lr0(((InterfaceC8635Zk1) abstractC1607ZX).getViewModelStore(), C1734p.f16239j).m22554L(C1734p.class);
        } else {
            this.f16211L = new C1734p(false);
        }
        this.f16211L.f16245i = m10046L();
        this.f16215c.f16268d = this.f16211L;
        Object obj = this.f16232t;
        if ((obj instanceof InterfaceC10401nV0) && fragment == null) {
            C10145lV0 savedStateRegistry = ((InterfaceC10401nV0) obj).getSavedStateRegistry();
            savedStateRegistry.m22443c("android:support:fragments", new C7042vv(2, this));
            Bundle bundleM22441a = savedStateRegistry.m22441a("android:support:fragments");
            if (bundleM22441a != null) {
                m10055U(bundleM22441a);
            }
        }
        Object obj2 = this.f16232t;
        if (obj2 instanceof InterfaceC1640a3) {
            AbstractC1576Z2 activityResultRegistry = ((InterfaceC1640a3) obj2).getActivityResultRegistry();
            String strM26245v = AbstractC7222ym.m26245v("FragmentManager:", fragment != null ? AbstractC1374Vq.m8593l(new StringBuilder(), fragment.mWho, StringUtils.PROCESS_POSTFIX_DELIMITER) : "");
            this.f16238z = activityResultRegistry.m9456c(AbstractC7222ym.m26232i(strM26245v, "StartActivityForResult"), new C1135S2(2), new G10(16, this));
            this.f16200A = activityResultRegistry.m9456c(AbstractC7222ym.m26232i(strM26245v, "StartIntentSenderForResult"), new C1135S2(4), new C7978Mu0(17, this));
            this.f16201B = activityResultRegistry.m9456c(AbstractC7222ym.m26232i(strM26245v, "RequestPermissions"), new C1135S2(1), new C7621Fx1(this));
        }
        Object obj3 = this.f16232t;
        if (obj3 instanceof InterfaceC8140Px0) {
            ((InterfaceC8140Px0) obj3).addOnConfigurationChangedListener(this.f16226n);
        }
        Object obj4 = this.f16232t;
        if (obj4 instanceof InterfaceC9563gy0) {
            ((InterfaceC9563gy0) obj4).addOnTrimMemoryListener(this.f16227o);
        }
        Object obj5 = this.f16232t;
        if (obj5 instanceof InterfaceC8556Xx0) {
            ((InterfaceC8556Xx0) obj5).addOnMultiWindowModeChangedListener(this.f16228p);
        }
        Object obj6 = this.f16232t;
        if (obj6 instanceof InterfaceC8608Yx0) {
            ((InterfaceC8608Yx0) obj6).addOnPictureInPictureModeChangedListener(this.f16229q);
        }
        Object obj7 = this.f16232t;
        if ((obj7 instanceof InterfaceC7554Eq0) && fragment == null) {
            ((InterfaceC7554Eq0) obj7).addMenuProvider(this.f16230r);
        }
    }

    /* renamed from: b0 */
    public final void m10064b0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C10817ql0());
        AbstractC1607ZX abstractC1607ZX = this.f16232t;
        try {
            if (abstractC1607ZX != null) {
                ((C1418WX) abstractC1607ZX).f13247e.dump("  ", null, printWriter, new String[0]);
            } else {
                m10085u("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    /* renamed from: c */
    public final void m10065c(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f16215c.m10107a(fragment);
            if (Log.isLoggable("FragmentManager", 2)) {
                fragment.toString();
            }
            if (m10036I(fragment)) {
                this.f16203D = true;
            }
        }
    }

    /* renamed from: c0 */
    public final void m10066c0(AbstractC4060fY abstractC4060fY) {
        C1339VH c1339vh = this.f16224l;
        synchronized (((CopyOnWriteArrayList) c1339vh.f12486b)) {
            try {
                int size = ((CopyOnWriteArrayList) c1339vh.f12486b).size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (((C1671aY) ((CopyOnWriteArrayList) c1339vh.f12486b).get(i)).f15554a == abstractC4060fY) {
                        ((CopyOnWriteArrayList) c1339vh.f12486b).remove(i);
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m10067d() {
        this.f16214b = false;
        this.f16209J.clear();
        this.f16208I.clear();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [FZ, mZ] */
    /* JADX WARN: Type inference failed for: r1v10, types: [FZ, mZ] */
    /* renamed from: d0 */
    public final void m10068d0() {
        synchronized (this.f16213a) {
            try {
                if (!this.f16213a.isEmpty()) {
                    C0767MB c0767mb = this.f16220h;
                    c0767mb.f7026a = true;
                    ?? r1 = c0767mb.f7028c;
                    if (r1 != 0) {
                        r1.invoke();
                    }
                    return;
                }
                C0767MB c0767mb2 = this.f16220h;
                ArrayList arrayList = this.f16216d;
                c0767mb2.f7026a = (arrayList != null ? arrayList.size() : 0) > 0 && m10037K(this.f16234v);
                ?? r0 = c0767mb2.f7028c;
                if (r0 != 0) {
                    r0.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final HashSet m10069e() {
        C1724f c1724f;
        HashSet hashSet = new HashSet();
        Iterator it = this.f16215c.m10110d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C1736r) it.next()).f16262c.mContainer;
            if (viewGroup != null) {
                O90.m5968f(m10043G(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C1724f) {
                    c1724f = (C1724f) tag;
                } else {
                    c1724f = new C1724f(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c1724f);
                }
                hashSet.add(c1724f);
            }
        }
        return hashSet;
    }

    /* renamed from: f */
    public final C1736r m10070f(Fragment fragment) {
        String str = fragment.mWho;
        C1737s c1737s = this.f16215c;
        C1736r c1736r = (C1736r) c1737s.f16266b.get(str);
        if (c1736r != null) {
            return c1736r;
        }
        C1736r c1736r2 = new C1736r(this.f16224l, c1737s, fragment);
        c1736r2.m10103j(this.f16232t.f14957b.getClassLoader());
        c1736r2.f16264e = this.f16231s;
        return c1736r2;
    }

    /* renamed from: g */
    public final void m10071g(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Log.isLoggable("FragmentManager", 2)) {
                fragment.toString();
            }
            C1737s c1737s = this.f16215c;
            synchronized (c1737s.f16265a) {
                c1737s.f16265a.remove(fragment);
            }
            fragment.mAdded = false;
            if (m10036I(fragment)) {
                this.f16203D = true;
            }
            m10062a0(fragment);
        }
    }

    /* renamed from: h */
    public final void m10072h(boolean z, Configuration configuration) {
        if (z && (this.f16232t instanceof InterfaceC8140Px0)) {
            m10064b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f16215c.m10112f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.m10072h(true, configuration);
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m10073i(MenuItem menuItem) {
        if (this.f16231s < 1) {
            return false;
        }
        for (Fragment fragment : this.f16215c.m10112f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m10074j(Menu menu, MenuInflater menuInflater) {
        if (this.f16231s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f16215c.m10112f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f16217e != null) {
            for (int i = 0; i < this.f16217e.size(); i++) {
                Fragment fragment2 = (Fragment) this.f16217e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f16217e = arrayList;
        return z;
    }

    /* renamed from: k */
    public final void m10075k() {
        boolean zIsChangingConfigurations = true;
        this.f16206G = true;
        m10088x(true);
        Iterator it = m10069e().iterator();
        while (it.hasNext()) {
            ((C1724f) it.next()).m10029g();
        }
        AbstractC1607ZX abstractC1607ZX = this.f16232t;
        boolean z = abstractC1607ZX instanceof InterfaceC8635Zk1;
        C1737s c1737s = this.f16215c;
        if (z) {
            zIsChangingConfigurations = c1737s.f16268d.f16244h;
        } else {
            AbstractActivityC1730l abstractActivityC1730l = abstractC1607ZX.f14957b;
            if (abstractActivityC1730l instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC1730l.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f16222j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C6963uf) it2.next()).f43787a.iterator();
                while (it3.hasNext()) {
                    c1737s.f16268d.m10092d((String) it3.next());
                }
            }
        }
        m10084t(-1);
        Object obj = this.f16232t;
        if (obj instanceof InterfaceC9563gy0) {
            ((InterfaceC9563gy0) obj).removeOnTrimMemoryListener(this.f16227o);
        }
        Object obj2 = this.f16232t;
        if (obj2 instanceof InterfaceC8140Px0) {
            ((InterfaceC8140Px0) obj2).removeOnConfigurationChangedListener(this.f16226n);
        }
        Object obj3 = this.f16232t;
        if (obj3 instanceof InterfaceC8556Xx0) {
            ((InterfaceC8556Xx0) obj3).removeOnMultiWindowModeChangedListener(this.f16228p);
        }
        Object obj4 = this.f16232t;
        if (obj4 instanceof InterfaceC8608Yx0) {
            ((InterfaceC8608Yx0) obj4).removeOnPictureInPictureModeChangedListener(this.f16229q);
        }
        Object obj5 = this.f16232t;
        if ((obj5 instanceof InterfaceC7554Eq0) && this.f16234v == null) {
            ((InterfaceC7554Eq0) obj5).removeMenuProvider(this.f16230r);
        }
        this.f16232t = null;
        this.f16233u = null;
        this.f16234v = null;
        if (this.f16219g != null) {
            Iterator it4 = this.f16220h.f7027b.iterator();
            while (it4.hasNext()) {
                ((InterfaceC0430Gp) it4.next()).cancel();
            }
            this.f16219g = null;
        }
        C1513Y2 c1513y2 = this.f16238z;
        if (c1513y2 != null) {
            c1513y2.m9206b();
            this.f16200A.m9206b();
            this.f16201B.m9206b();
        }
    }

    /* renamed from: l */
    public final void m10076l(boolean z) {
        if (z && (this.f16232t instanceof InterfaceC9563gy0)) {
            m10064b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f16215c.m10112f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.m10076l(true);
                }
            }
        }
    }

    /* renamed from: m */
    public final void m10077m(boolean z, boolean z2) {
        if (z2 && (this.f16232t instanceof InterfaceC8556Xx0)) {
            m10064b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f16215c.m10112f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m10077m(z, true);
                }
            }
        }
    }

    /* renamed from: n */
    public final void m10078n() {
        Iterator it = this.f16215c.m10111e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.m10078n();
            }
        }
    }

    /* renamed from: o */
    public final boolean m10079o(MenuItem menuItem) {
        if (this.f16231s < 1) {
            return false;
        }
        for (Fragment fragment : this.f16215c.m10112f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void m10080p(Menu menu) {
        if (this.f16231s < 1) {
            return;
        }
        for (Fragment fragment : this.f16215c.m10112f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: q */
    public final void m10081q(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f16215c.m10108b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* renamed from: r */
    public final void m10082r(boolean z, boolean z2) {
        if (z2 && (this.f16232t instanceof InterfaceC8608Yx0)) {
            m10064b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f16215c.m10112f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m10082r(z, true);
                }
            }
        }
    }

    /* renamed from: s */
    public final boolean m10083s(Menu menu) {
        boolean z = false;
        if (this.f16231s < 1) {
            return false;
        }
        for (Fragment fragment : this.f16215c.m10112f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: t */
    public final void m10084t(int i) {
        try {
            this.f16214b = true;
            for (C1736r c1736r : this.f16215c.f16266b.values()) {
                if (c1736r != null) {
                    c1736r.f16264e = i;
                }
            }
            m10047M(i, false);
            Iterator it = m10069e().iterator();
            while (it.hasNext()) {
                ((C1724f) it.next()).m10029g();
            }
            this.f16214b = false;
            m10088x(true);
        } catch (Throwable th) {
            this.f16214b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f16234v;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f16234v)));
            sb.append("}");
        } else {
            AbstractC1607ZX abstractC1607ZX = this.f16232t;
            if (abstractC1607ZX != null) {
                sb.append(abstractC1607ZX.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f16232t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m10085u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM26232i = AbstractC7222ym.m26232i(str, "    ");
        C1737s c1737s = this.f16215c;
        c1737s.getClass();
        String str2 = str + "    ";
        HashMap map = c1737s.f16266b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1736r c1736r : map.values()) {
                printWriter.print(str);
                if (c1736r != null) {
                    Fragment fragment = c1736r.f16262c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = c1737s.f16265a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f16217e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment3 = (Fragment) this.f16217e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.f16216d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C1719a c1719a = (C1719a) this.f16216d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c1719a.toString());
                c1719a.m10017h(strM26232i, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f16221i.get());
        synchronized (this.f16213a) {
            try {
                int size4 = this.f16213a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC4186hY) this.f16213a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f16232t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f16233u);
        if (this.f16234v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f16234v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f16231s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f16204E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f16205F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f16206G);
        if (this.f16203D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f16203D);
        }
    }

    /* renamed from: v */
    public final void m10086v(InterfaceC4186hY interfaceC4186hY, boolean z) {
        if (!z) {
            if (this.f16232t == null) {
                if (!this.f16206G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m10046L()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f16213a) {
            try {
                if (this.f16232t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f16213a.add(interfaceC4186hY);
                    m10057W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: w */
    public final void m10087w(boolean z) {
        if (this.f16214b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f16232t == null) {
            if (!this.f16206G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f16232t.f14958c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && m10046L()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f16208I == null) {
            this.f16208I = new ArrayList();
            this.f16209J = new ArrayList();
        }
    }

    /* renamed from: x */
    public final boolean m10088x(boolean z) {
        boolean zMo10012a;
        m10087w(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f16208I;
            ArrayList arrayList2 = this.f16209J;
            synchronized (this.f16213a) {
                if (this.f16213a.isEmpty()) {
                    zMo10012a = false;
                } else {
                    try {
                        int size = this.f16213a.size();
                        zMo10012a = false;
                        for (int i = 0; i < size; i++) {
                            zMo10012a |= ((InterfaceC4186hY) this.f16213a.get(i)).mo10012a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zMo10012a) {
                break;
            }
            this.f16214b = true;
            try {
                m10054T(this.f16208I, this.f16209J);
                m10067d();
                z2 = true;
            } catch (Throwable th) {
                m10067d();
                throw th;
            }
        }
        m10068d0();
        if (this.f16207H) {
            this.f16207H = false;
            Iterator it = this.f16215c.m10110d().iterator();
            while (it.hasNext()) {
                C1736r c1736r = (C1736r) it.next();
                Fragment fragment = c1736r.f16262c;
                if (fragment.mDeferStart) {
                    if (this.f16214b) {
                        this.f16207H = true;
                    } else {
                        fragment.mDeferStart = false;
                        c1736r.m10102i();
                    }
                }
            }
        }
        this.f16215c.f16266b.values().removeAll(Collections.singleton(null));
        return z2;
    }

    /* renamed from: y */
    public final void m10089y(C1719a c1719a, boolean z) {
        if (z && (this.f16232t == null || this.f16206G)) {
            return;
        }
        m10087w(z);
        c1719a.mo10012a(this.f16208I, this.f16209J);
        this.f16214b = true;
        try {
            m10054T(this.f16208I, this.f16209J);
            m10067d();
            m10068d0();
            boolean z2 = this.f16207H;
            C1737s c1737s = this.f16215c;
            if (z2) {
                this.f16207H = false;
                Iterator it = c1737s.m10110d().iterator();
                while (it.hasNext()) {
                    C1736r c1736r = (C1736r) it.next();
                    Fragment fragment = c1736r.f16262c;
                    if (fragment.mDeferStart) {
                        if (this.f16214b) {
                            this.f16207H = true;
                        } else {
                            fragment.mDeferStart = false;
                            c1736r.m10102i();
                        }
                    }
                }
            }
            c1737s.f16266b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m10067d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:329:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0226 A[PHI: r14
  0x0226: PHI (r14v9 int) = (r14v8 int), (r14v10 int) binds: [B:368:0x0216, B:373:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10090z(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC1733o.m10090z(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }
}
