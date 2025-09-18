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
import androidx.fragment.app.o;
import defpackage.AbstractC1705Vq;
import defpackage.AbstractC3792fY;
import defpackage.AbstractC6859rY;
import defpackage.AbstractC8235ym;
import defpackage.C0318Dv0;
import defpackage.C0481Fx1;
import defpackage.C1016Mu0;
import defpackage.C2154aY;
import defpackage.C2345bY;
import defpackage.C2535cY;
import defpackage.C3411dY;
import defpackage.C3601eY;
import defpackage.C5523kY;
import defpackage.C5706lV0;
import defpackage.C5772lr0;
import defpackage.C6709ql0;
import defpackage.C7241tY;
import defpackage.C7453uf;
import defpackage.C7692vv;
import defpackage.EnumC0201Ci0;
import defpackage.G10;
import defpackage.GR0;
import defpackage.InterfaceC0381Eq0;
import defpackage.InterfaceC0533Gp;
import defpackage.InterfaceC0870Kx0;
import defpackage.InterfaceC0903Li0;
import defpackage.InterfaceC1259Px0;
import defpackage.InterfaceC1883Xx0;
import defpackage.InterfaceC1961Yx0;
import defpackage.InterfaceC2001Zk1;
import defpackage.InterfaceC2060a3;
import defpackage.InterfaceC4062gy0;
import defpackage.InterfaceC4174hY;
import defpackage.InterfaceC5905mY;
import defpackage.InterfaceC6088nV0;
import defpackage.InterfaceC6556py;
import defpackage.MB;
import defpackage.O90;
import defpackage.S2;
import defpackage.VH;
import defpackage.WX;
import defpackage.Y2;
import defpackage.YX;
import defpackage.Z2;
import defpackage.ZX;
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
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class o {
    public Y2 A;
    public Y2 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public p L;
    public final GR0 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public androidx.activity.a g;
    public final VH l;
    public final CopyOnWriteArrayList m;
    public final C2345bY n;
    public final C2345bY o;
    public final C2345bY p;
    public final C2345bY q;
    public final C2535cY r;
    public int s;
    public ZX t;
    public YX u;
    public Fragment v;
    public Fragment w;
    public final C3411dY x;
    public final C0318Dv0 y;
    public Y2 z;
    public final ArrayList a = new ArrayList();
    public final s c = new s();
    public final n f = new n(this);
    public final MB h = new MB(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [bY] */
    /* JADX WARN: Type inference failed for: r0v13, types: [bY] */
    /* JADX WARN: Type inference failed for: r0v14, types: [bY] */
    /* JADX WARN: Type inference failed for: r0v15, types: [bY] */
    public o() {
        Collections.synchronizedMap(new HashMap());
        this.l = new VH(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new InterfaceC6556py(this) { // from class: bY
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC6556py
            public final void b(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        o oVar = this.b;
                        if (oVar.J()) {
                            oVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        o oVar2 = this.b;
                        if (oVar2.J() && num.intValue() == 80) {
                            oVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C6923rt0 c6923rt0 = (C6923rt0) obj;
                        o oVar3 = this.b;
                        if (oVar3.J()) {
                            oVar3.m(c6923rt0.a, false);
                            break;
                        }
                        break;
                    default:
                        C3343dB0 c3343dB0 = (C3343dB0) obj;
                        o oVar4 = this.b;
                        if (oVar4.J()) {
                            oVar4.r(c3343dB0.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new InterfaceC6556py(this) { // from class: bY
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC6556py
            public final void b(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        o oVar = this.b;
                        if (oVar.J()) {
                            oVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        o oVar2 = this.b;
                        if (oVar2.J() && num.intValue() == 80) {
                            oVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C6923rt0 c6923rt0 = (C6923rt0) obj;
                        o oVar3 = this.b;
                        if (oVar3.J()) {
                            oVar3.m(c6923rt0.a, false);
                            break;
                        }
                        break;
                    default:
                        C3343dB0 c3343dB0 = (C3343dB0) obj;
                        o oVar4 = this.b;
                        if (oVar4.J()) {
                            oVar4.r(c3343dB0.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new InterfaceC6556py(this) { // from class: bY
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC6556py
            public final void b(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        o oVar = this.b;
                        if (oVar.J()) {
                            oVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        o oVar2 = this.b;
                        if (oVar2.J() && num.intValue() == 80) {
                            oVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C6923rt0 c6923rt0 = (C6923rt0) obj;
                        o oVar3 = this.b;
                        if (oVar3.J()) {
                            oVar3.m(c6923rt0.a, false);
                            break;
                        }
                        break;
                    default:
                        C3343dB0 c3343dB0 = (C3343dB0) obj;
                        o oVar4 = this.b;
                        if (oVar4.J()) {
                            oVar4.r(c3343dB0.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new InterfaceC6556py(this) { // from class: bY
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC6556py
            public final void b(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        o oVar = this.b;
                        if (oVar.J()) {
                            oVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        o oVar2 = this.b;
                        if (oVar2.J() && num.intValue() == 80) {
                            oVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C6923rt0 c6923rt0 = (C6923rt0) obj;
                        o oVar3 = this.b;
                        if (oVar3.J()) {
                            oVar3.m(c6923rt0.a, false);
                            break;
                        }
                        break;
                    default:
                        C3343dB0 c3343dB0 = (C3343dB0) obj;
                        o oVar4 = this.b;
                        if (oVar4.J()) {
                            oVar4.r(c3343dB0.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new C2535cY(this);
        this.s = -1;
        this.x = new C3411dY(this);
        this.y = new C0318Dv0(14);
        this.C = new ArrayDeque();
        this.M = new GR0(23, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static Fragment C(ViewGroup viewGroup) {
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

    public static boolean I(Fragment fragment) {
        if (!fragment.mHasMenu || !fragment.mMenuVisible) {
            Iterator it = fragment.mChildFragmentManager.c.e().iterator();
            boolean zI = false;
            while (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    zI = I(fragment2);
                }
                if (zI) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean K(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        o oVar = fragment.mFragmentManager;
        return fragment.equals(oVar.w) && K(oVar.v);
    }

    public final Fragment A(int i) {
        s sVar = this.c;
        ArrayList arrayList = sVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (r rVar : sVar.b.values()) {
            if (rVar != null) {
                Fragment fragment2 = rVar.c;
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment B(String str) {
        s sVar = this.c;
        ArrayList arrayList = sVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
        for (r rVar : sVar.b.values()) {
            if (rVar != null) {
                Fragment fragment2 = rVar.c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.e) {
                fVar.e = false;
                fVar.d();
            }
        }
    }

    public final ViewGroup E(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.u.c()) {
            View viewB = this.u.b(fragment.mContainerId);
            if (viewB instanceof ViewGroup) {
                return (ViewGroup) viewB;
            }
        }
        return null;
    }

    public final C3411dY F() {
        Fragment fragment = this.v;
        return fragment != null ? fragment.mFragmentManager.F() : this.x;
    }

    public final C0318Dv0 G() {
        Fragment fragment = this.v;
        return fragment != null ? fragment.mFragmentManager.G() : this.y;
    }

    public final void H(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        a0(fragment);
    }

    public final boolean J() {
        Fragment fragment = this.v;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.v.getParentFragmentManager().J();
    }

    public final boolean L() {
        return this.E || this.F;
    }

    public final void M(int i, boolean z) {
        HashMap map;
        ZX zx;
        if (this.t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.s) {
            this.s = i;
            s sVar = this.c;
            Iterator it = sVar.a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = sVar.b;
                if (!zHasNext) {
                    break;
                }
                r rVar = (r) map.get(((Fragment) it.next()).mWho);
                if (rVar != null) {
                    rVar.i();
                }
            }
            for (r rVar2 : map.values()) {
                if (rVar2 != null) {
                    rVar2.i();
                    Fragment fragment = rVar2.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !sVar.c.containsKey(fragment.mWho)) {
                            sVar.i(rVar2.l(), fragment.mWho);
                        }
                        sVar.h(rVar2);
                    }
                }
            }
            Iterator it2 = sVar.d().iterator();
            while (it2.hasNext()) {
                r rVar3 = (r) it2.next();
                Fragment fragment2 = rVar3.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        fragment2.mDeferStart = false;
                        rVar3.i();
                    }
                }
            }
            if (this.D && (zx = this.t) != null && this.s == 7) {
                ((WX) zx).e.invalidateMenu();
                this.D = false;
            }
        }
    }

    public final void N() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.i = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean O() {
        return P(-1, 0);
    }

    public final boolean P(int i, int i2) {
        x(false);
        w(true);
        Fragment fragment = this.w;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().O()) {
            return true;
        }
        boolean zQ = Q(this.I, this.J, i, i2);
        if (zQ) {
            this.b = true;
            try {
                T(this.I, this.J);
            } finally {
                d();
            }
        }
        d0();
        boolean z = this.H;
        s sVar = this.c;
        if (z) {
            this.H = false;
            Iterator it = sVar.d().iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                Fragment fragment2 = rVar.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        fragment2.mDeferStart = false;
                        rVar.i();
                    }
                }
            }
        }
        sVar.b.values().removeAll(Collections.singleton(null));
        return zQ;
    }

    public final boolean Q(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.d.get(size2);
                    if (i >= 0 && i == aVar.s) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z) {
                        while (size2 > 0) {
                            a aVar2 = (a) this.d.get(size2 - 1);
                            if (i < 0 || i != aVar2.s) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.d.size() - 1) {
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
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void R(AbstractC3792fY abstractC3792fY) {
        ((CopyOnWriteArrayList) this.l.b).add(new C2154aY(abstractC3792fY));
    }

    public final void S(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
            int i = fragment.mBackStackNesting;
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        s sVar = this.c;
        synchronized (sVar.a) {
            sVar.a.remove(fragment);
        }
        fragment.mAdded = false;
        if (I(fragment)) {
            this.D = true;
        }
        fragment.mRemoving = true;
        a0(fragment);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((a) arrayList.get(i)).o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((a) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                z(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            z(arrayList, arrayList2, i2, size);
        }
    }

    public final void U(Bundle bundle) {
        VH vh;
        int i;
        r rVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.t.b.getClassLoader());
                this.k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.t.b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        s sVar = this.c;
        HashMap map2 = sVar.c;
        map2.clear();
        map2.putAll(map);
        C5523kY c5523kY = (C5523kY) bundle.getParcelable("state");
        if (c5523kY == null) {
            return;
        }
        HashMap map3 = sVar.b;
        map3.clear();
        Iterator it = c5523kY.a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            vh = this.l;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = sVar.i(null, (String) it.next());
            if (bundleI != null) {
                Fragment fragment = (Fragment) this.L.d.get(((q) bundleI.getParcelable("state")).b);
                if (fragment != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragment.toString();
                    }
                    rVar = new r(vh, sVar, fragment, bundleI);
                } else {
                    rVar = new r(this.l, this.c, this.t.b.getClassLoader(), F(), bundleI);
                }
                Fragment fragment2 = rVar.c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment2.toString();
                }
                rVar.j(this.t.b.getClassLoader());
                sVar.g(rVar);
                rVar.e = this.s;
            }
        }
        p pVar = this.L;
        pVar.getClass();
        Iterator it2 = new ArrayList(pVar.d.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (map3.get(fragment3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment3.toString();
                    Objects.toString(c5523kY.a);
                }
                this.L.e(fragment3);
                fragment3.mFragmentManager = this;
                r rVar2 = new r(vh, sVar, fragment3);
                rVar2.e = 1;
                rVar2.i();
                fragment3.mRemoving = true;
                rVar2.i();
            }
        }
        ArrayList<String> arrayList = c5523kY.b;
        sVar.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = sVar.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(AbstractC8235ym.k("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragmentB.toString();
                }
                sVar.a(fragmentB);
            }
        }
        if (c5523kY.c != null) {
            this.d = new ArrayList(c5523kY.c.length);
            int i2 = 0;
            while (true) {
                b[] bVarArr = c5523kY.c;
                if (i2 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i2];
                bVar.getClass();
                a aVar = new a(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = bVar.a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    C7241tY c7241tY = new C7241tY();
                    int i5 = i3 + 1;
                    c7241tY.a = iArr[i3];
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(aVar);
                        int i6 = iArr[i5];
                    }
                    c7241tY.h = EnumC0201Ci0.values()[bVar.c[i4]];
                    c7241tY.i = EnumC0201Ci0.values()[bVar.d[i4]];
                    int i7 = i3 + 2;
                    c7241tY.c = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    c7241tY.d = i8;
                    int i9 = iArr[i3 + 3];
                    c7241tY.e = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    c7241tY.f = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    c7241tY.g = i12;
                    aVar.b = i8;
                    aVar.c = i9;
                    aVar.d = i11;
                    aVar.e = i12;
                    aVar.b(c7241tY);
                    i4++;
                }
                aVar.f = bVar.e;
                aVar.h = bVar.f;
                aVar.g = true;
                aVar.i = bVar.h;
                aVar.j = bVar.i;
                aVar.k = bVar.j;
                aVar.l = bVar.k;
                aVar.m = bVar.l;
                aVar.n = bVar.m;
                aVar.o = bVar.n;
                aVar.s = bVar.g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = bVar.b;
                    if (i13 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i13);
                    if (str4 != null) {
                        ((C7241tY) aVar.a.get(i13)).b = sVar.b(str4);
                    }
                    i13++;
                }
                aVar.e(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new C6709ql0());
                    aVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i2++;
            }
            i = 0;
        } else {
            i = 0;
            this.d = null;
        }
        this.i.set(c5523kY.d);
        String str5 = c5523kY.e;
        if (str5 != null) {
            Fragment fragmentB2 = sVar.b(str5);
            this.w = fragmentB2;
            q(fragmentB2);
        }
        ArrayList arrayList3 = c5523kY.f;
        if (arrayList3 != null) {
            for (int i14 = i; i14 < arrayList3.size(); i14++) {
                this.j.put((String) arrayList3.get(i14), (C7453uf) c5523kY.g.get(i14));
            }
        }
        this.C = new ArrayDeque(c5523kY.h);
    }

    public final Bundle V() {
        ArrayList arrayList;
        b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        D();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((f) it.next()).g();
        }
        x(true);
        this.E = true;
        this.L.i = true;
        s sVar = this.c;
        sVar.getClass();
        HashMap map = sVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (r rVar : map.values()) {
            if (rVar != null) {
                Fragment fragment = rVar.c;
                sVar.i(rVar.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.c.c;
        if (!map2.isEmpty()) {
            s sVar2 = this.c;
            synchronized (sVar2.a) {
                try {
                    if (sVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(sVar2.a.size());
                        Iterator it2 = sVar2.a.iterator();
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
            ArrayList arrayList3 = this.d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new b[size];
                for (int i = 0; i < size; i++) {
                    bVarArr[i] = new b((a) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(this.d.get(i));
                    }
                }
            }
            C5523kY c5523kY = new C5523kY();
            c5523kY.e = null;
            ArrayList arrayList4 = new ArrayList();
            c5523kY.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            c5523kY.g = arrayList5;
            c5523kY.a = arrayList2;
            c5523kY.b = arrayList;
            c5523kY.c = bVarArr;
            c5523kY.d = this.i.get();
            Fragment fragment3 = this.w;
            if (fragment3 != null) {
                c5523kY.e = fragment3.mWho;
            }
            arrayList4.addAll(this.j.keySet());
            arrayList5.addAll(this.j.values());
            c5523kY.h = new ArrayList(this.C);
            bundle.putParcelable("state", c5523kY);
            for (String str : this.k.keySet()) {
                bundle.putBundle(AbstractC8235ym.v("result_", str), (Bundle) this.k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(AbstractC8235ym.v("fragment_", str2), (Bundle) map2.get(str2));
            }
        }
        return bundle;
    }

    public final void W() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.t.c.removeCallbacks(this.M);
                    this.t.c.post(this.M);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(Fragment fragment, boolean z) {
        ViewGroup viewGroupE = E(fragment);
        if (viewGroupE == null || !(viewGroupE instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupE).setDrawDisappearingViewsLast(!z);
    }

    public final void Y(Fragment fragment, EnumC0201Ci0 enumC0201Ci0) {
        if (fragment.equals(this.c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = enumC0201Ci0;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.w;
        this.w = fragment;
        q(fragment2);
        q(this.w);
    }

    public final r a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            AbstractC6859rY.c(fragment, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
        r rVarF = f(fragment);
        fragment.mFragmentManager = this;
        s sVar = this.c;
        sVar.g(rVarF);
        if (!fragment.mDetached) {
            sVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (I(fragment)) {
                this.D = true;
            }
        }
        return rVarF;
    }

    public final void a0(Fragment fragment) {
        ViewGroup viewGroupE = E(fragment);
        if (viewGroupE != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupE.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupE.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupE.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ZX zx, YX yx, Fragment fragment) {
        if (this.t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.t = zx;
        this.u = yx;
        this.v = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (fragment != null) {
            copyOnWriteArrayList.add(new C3601eY(fragment));
        } else if (zx instanceof InterfaceC5905mY) {
            copyOnWriteArrayList.add((InterfaceC5905mY) zx);
        }
        if (this.v != null) {
            d0();
        }
        if (zx instanceof InterfaceC0870Kx0) {
            InterfaceC0870Kx0 interfaceC0870Kx0 = (InterfaceC0870Kx0) zx;
            androidx.activity.a onBackPressedDispatcher = interfaceC0870Kx0.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            InterfaceC0903Li0 interfaceC0903Li0 = interfaceC0870Kx0;
            if (fragment != null) {
                interfaceC0903Li0 = fragment;
            }
            onBackPressedDispatcher.a(interfaceC0903Li0, this.h);
        }
        if (fragment != null) {
            p pVar = fragment.mFragmentManager.L;
            HashMap map = pVar.e;
            p pVar2 = (p) map.get(fragment.mWho);
            if (pVar2 == null) {
                pVar2 = new p(pVar.g);
                map.put(fragment.mWho, pVar2);
            }
            this.L = pVar2;
        } else if (zx instanceof InterfaceC2001Zk1) {
            this.L = (p) new C5772lr0(((InterfaceC2001Zk1) zx).getViewModelStore(), p.j).L(p.class);
        } else {
            this.L = new p(false);
        }
        this.L.i = L();
        this.c.d = this.L;
        Object obj = this.t;
        if ((obj instanceof InterfaceC6088nV0) && fragment == null) {
            C5706lV0 savedStateRegistry = ((InterfaceC6088nV0) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C7692vv(2, this));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                U(bundleA);
            }
        }
        Object obj2 = this.t;
        if (obj2 instanceof InterfaceC2060a3) {
            Z2 activityResultRegistry = ((InterfaceC2060a3) obj2).getActivityResultRegistry();
            String strV = AbstractC8235ym.v("FragmentManager:", fragment != null ? AbstractC1705Vq.l(new StringBuilder(), fragment.mWho, StringUtils.PROCESS_POSTFIX_DELIMITER) : "");
            this.z = activityResultRegistry.c(AbstractC8235ym.i(strV, "StartActivityForResult"), new S2(2), new G10(16, this));
            this.A = activityResultRegistry.c(AbstractC8235ym.i(strV, "StartIntentSenderForResult"), new S2(4), new C1016Mu0(17, this));
            this.B = activityResultRegistry.c(AbstractC8235ym.i(strV, "RequestPermissions"), new S2(1), new C0481Fx1(this));
        }
        Object obj3 = this.t;
        if (obj3 instanceof InterfaceC1259Px0) {
            ((InterfaceC1259Px0) obj3).addOnConfigurationChangedListener(this.n);
        }
        Object obj4 = this.t;
        if (obj4 instanceof InterfaceC4062gy0) {
            ((InterfaceC4062gy0) obj4).addOnTrimMemoryListener(this.o);
        }
        Object obj5 = this.t;
        if (obj5 instanceof InterfaceC1883Xx0) {
            ((InterfaceC1883Xx0) obj5).addOnMultiWindowModeChangedListener(this.p);
        }
        Object obj6 = this.t;
        if (obj6 instanceof InterfaceC1961Yx0) {
            ((InterfaceC1961Yx0) obj6).addOnPictureInPictureModeChangedListener(this.q);
        }
        Object obj7 = this.t;
        if ((obj7 instanceof InterfaceC0381Eq0) && fragment == null) {
            ((InterfaceC0381Eq0) obj7).addMenuProvider(this.r);
        }
    }

    public final void b0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C6709ql0());
        ZX zx = this.t;
        try {
            if (zx != null) {
                ((WX) zx).e.dump("  ", null, printWriter, new String[0]);
            } else {
                u("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    public final void c(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (Log.isLoggable("FragmentManager", 2)) {
                fragment.toString();
            }
            if (I(fragment)) {
                this.D = true;
            }
        }
    }

    public final void c0(AbstractC3792fY abstractC3792fY) {
        VH vh = this.l;
        synchronized (((CopyOnWriteArrayList) vh.b)) {
            try {
                int size = ((CopyOnWriteArrayList) vh.b).size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (((C2154aY) ((CopyOnWriteArrayList) vh.b).get(i)).a == abstractC3792fY) {
                        ((CopyOnWriteArrayList) vh.b).remove(i);
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [FZ, mZ] */
    /* JADX WARN: Type inference failed for: r1v10, types: [FZ, mZ] */
    public final void d0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    MB mb = this.h;
                    mb.a = true;
                    ?? r1 = mb.c;
                    if (r1 != 0) {
                        r1.invoke();
                    }
                    return;
                }
                MB mb2 = this.h;
                ArrayList arrayList = this.d;
                mb2.a = (arrayList != null ? arrayList.size() : 0) > 0 && K(this.v);
                ?? r0 = mb2.c;
                if (r0 != 0) {
                    r0.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet e() {
        f fVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((r) it.next()).c.mContainer;
            if (viewGroup != null) {
                O90.f(G(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof f) {
                    fVar = (f) tag;
                } else {
                    fVar = new f(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, fVar);
                }
                hashSet.add(fVar);
            }
        }
        return hashSet;
    }

    public final r f(Fragment fragment) {
        String str = fragment.mWho;
        s sVar = this.c;
        r rVar = (r) sVar.b.get(str);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this.l, sVar, fragment);
        rVar2.j(this.t.b.getClassLoader());
        rVar2.e = this.s;
        return rVar2;
    }

    public final void g(Fragment fragment) {
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
            s sVar = this.c;
            synchronized (sVar.a) {
                sVar.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (I(fragment)) {
                this.D = true;
            }
            a0(fragment);
        }
    }

    public final void h(boolean z, Configuration configuration) {
        if (z && (this.t instanceof InterfaceC1259Px0)) {
            b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Fragment fragment2 = (Fragment) this.e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((f) it.next()).g();
        }
        ZX zx = this.t;
        boolean z = zx instanceof InterfaceC2001Zk1;
        s sVar = this.c;
        if (z) {
            zIsChangingConfigurations = sVar.d.h;
        } else {
            l lVar = zx.b;
            if (lVar instanceof Activity) {
                zIsChangingConfigurations = true ^ lVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C7453uf) it2.next()).a.iterator();
                while (it3.hasNext()) {
                    sVar.d.d((String) it3.next());
                }
            }
        }
        t(-1);
        Object obj = this.t;
        if (obj instanceof InterfaceC4062gy0) {
            ((InterfaceC4062gy0) obj).removeOnTrimMemoryListener(this.o);
        }
        Object obj2 = this.t;
        if (obj2 instanceof InterfaceC1259Px0) {
            ((InterfaceC1259Px0) obj2).removeOnConfigurationChangedListener(this.n);
        }
        Object obj3 = this.t;
        if (obj3 instanceof InterfaceC1883Xx0) {
            ((InterfaceC1883Xx0) obj3).removeOnMultiWindowModeChangedListener(this.p);
        }
        Object obj4 = this.t;
        if (obj4 instanceof InterfaceC1961Yx0) {
            ((InterfaceC1961Yx0) obj4).removeOnPictureInPictureModeChangedListener(this.q);
        }
        Object obj5 = this.t;
        if ((obj5 instanceof InterfaceC0381Eq0) && this.v == null) {
            ((InterfaceC0381Eq0) obj5).removeMenuProvider(this.r);
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            Iterator it4 = this.h.b.iterator();
            while (it4.hasNext()) {
                ((InterfaceC0533Gp) it4.next()).cancel();
            }
            this.g = null;
        }
        Y2 y2 = this.z;
        if (y2 != null) {
            y2.b();
            this.A.b();
            this.B.b();
        }
    }

    public final void l(boolean z) {
        if (z && (this.t instanceof InterfaceC4062gy0)) {
            b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z, boolean z2) {
        if (z2 && (this.t instanceof InterfaceC1883Xx0)) {
            b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m(z, true);
                }
            }
        }
    }

    public final void n() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.s < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z, boolean z2) {
        if (z2 && (this.t instanceof InterfaceC1961Yx0)) {
            b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.r(z, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z = false;
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (r rVar : this.c.b.values()) {
                if (rVar != null) {
                    rVar.e = i;
                }
            }
            M(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((f) it.next()).g();
            }
            this.b = false;
            x(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.v;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            ZX zx = this.t;
            if (zx != null) {
                sb.append(zx.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strI = AbstractC8235ym.i(str, "    ");
        s sVar = this.c;
        sVar.getClass();
        String str2 = str + "    ";
        HashMap map = sVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (r rVar : map.values()) {
                printWriter.print(str);
                if (rVar != null) {
                    Fragment fragment = rVar.c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = sVar.a;
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
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment3 = (Fragment) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = (a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(strI, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC4174hY) this.a.get(i4);
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
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void v(InterfaceC4174hY interfaceC4174hY, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (L()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(interfaceC4174hY);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.t.c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && L()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean x(boolean z) {
        boolean zA;
        w(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((InterfaceC4174hY) this.a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.b = true;
            try {
                T(this.I, this.J);
                d();
                z2 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        d0();
        if (this.H) {
            this.H = false;
            Iterator it = this.c.d().iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                Fragment fragment = rVar.c;
                if (fragment.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        fragment.mDeferStart = false;
                        rVar.i();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void y(a aVar, boolean z) {
        if (z && (this.t == null || this.G)) {
            return;
        }
        w(z);
        aVar.a(this.I, this.J);
        this.b = true;
        try {
            T(this.I, this.J);
            d();
            d0();
            boolean z2 = this.H;
            s sVar = this.c;
            if (z2) {
                this.H = false;
                Iterator it = sVar.d().iterator();
                while (it.hasNext()) {
                    r rVar = (r) it.next();
                    Fragment fragment = rVar.c;
                    if (fragment.mDeferStart) {
                        if (this.b) {
                            this.H = true;
                        } else {
                            fragment.mDeferStart = false;
                            rVar.i();
                        }
                    }
                }
            }
            sVar.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:329:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0226 A[PHI: r14
  0x0226: PHI (r14v9 int) = (r14v8 int), (r14v10 int) binds: [B:368:0x0216, B:373:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.z(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }
}
