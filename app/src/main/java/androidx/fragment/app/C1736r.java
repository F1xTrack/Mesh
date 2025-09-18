package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p000.AbstractC0852NX;
import p000.AbstractC10944rk1;
import p000.AbstractC1374Vq;
import p000.AbstractC1607ZX;
import p000.AbstractC6750rY;
import p000.AbstractC7222ym;
import p000.AbstractC9065d31;
import p000.AbstractC9280ek1;
import p000.C1339VH;
import p000.C3935dY;
import p000.C6496nY;
import p000.C6687qY;
import p000.C6830sY;
import p000.EnumC7434Ci0;
import p000.InterfaceC8635Zk1;
import p000.O90;
import p000.ViewOnAttachStateChangeListenerC7226yq;
import ru.mes.dnevnik.R;

/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public final class C1736r {

    /* renamed from: a */
    public final C1339VH f16260a;

    /* renamed from: b */
    public final C1737s f16261b;

    /* renamed from: c */
    public final Fragment f16262c;

    /* renamed from: d */
    public boolean f16263d = false;

    /* renamed from: e */
    public int f16264e = -1;

    public C1736r(C1339VH c1339vh, C1737s c1737s, Fragment fragment) {
        this.f16260a = c1339vh;
        this.f16261b = c1737s;
        this.f16262c = fragment;
    }

    /* renamed from: a */
    public final void m10094a() {
        View view;
        View view2;
        int iIndexOfChild = -1;
        Fragment fragment = this.f16262c;
        Fragment fragmentM10035C = AbstractC1733o.m10035C(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (fragmentM10035C != null && !fragmentM10035C.equals(parentFragment)) {
            int i = fragment.mContainerId;
            C6687qY c6687qY = AbstractC6750rY.f41724a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment);
            sb.append(" within the view of parent fragment ");
            sb.append(fragmentM10035C);
            sb.append(" via container with ID ");
            AbstractC6750rY.m24399b(new C6496nY(fragment, AbstractC1374Vq.m8591j(sb, i, " without using parent's childFragmentManager")));
            AbstractC6750rY.m24398a(fragment).getClass();
        }
        C1737s c1737s = this.f16261b;
        c1737s.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = c1737s.f16265a;
            int iIndexOf = arrayList.indexOf(fragment);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(iIndexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i2);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    /* renamed from: b */
    public final void m10095b() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f16262c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        C1736r c1736r = null;
        C1737s c1737s = this.f16261b;
        if (fragment2 != null) {
            C1736r c1736r2 = (C1736r) c1737s.f16266b.get(fragment2.mWho);
            if (c1736r2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            c1736r = c1736r2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c1736r = (C1736r) c1737s.f16266b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC1374Vq.m8593l(sb, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (c1736r != null) {
            c1736r.m10102i();
        }
        AbstractC1733o abstractC1733o = fragment.mFragmentManager;
        fragment.mHost = abstractC1733o.f16232t;
        fragment.mParentFragment = abstractC1733o.f16234v;
        C1339VH c1339vh = this.f16260a;
        c1339vh.m8375q(fragment, false);
        fragment.performAttach();
        c1339vh.m8370l(fragment, false);
    }

    /* renamed from: c */
    public final int m10096c() {
        Object next;
        Fragment fragment = this.f16262c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f16264e;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.f16264e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f16264e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            C1724f c1724fM10024h = C1724f.m10024h(viewGroup, fragment.getParentFragmentManager());
            c1724fM10024h.getClass();
            C1740v c1740vM10028f = c1724fM10024h.m10028f(fragment);
            int i = c1740vM10028f != null ? c1740vM10028f.f16278b : 0;
            Iterator it = c1724fM10024h.f16185c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C1740v c1740v = (C1740v) next;
                if (O90.m5963a(c1740v.f16279c, fragment) && !c1740v.f16282f) {
                    break;
                }
            }
            C1740v c1740v2 = (C1740v) next;
            i = c1740v2 != null ? c1740v2.f16278b : 0;
            int i2 = i == 0 ? -1 : AbstractC9065d31.f25786a[AbstractC7222ym.m26247x(i)];
            if (i2 != -1 && i2 != 1) {
                i = i;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        return iMin;
    }

    /* renamed from: d */
    public final void m10097d() throws Resources.NotFoundException {
        String resourceName;
        Fragment fragment = this.f16262c;
        if (fragment.mFromLayout) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(AbstractC0852NX.m5759h("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f16233u.mo2122b(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C6687qY c6687qY = AbstractC6750rY.f41724a;
                    AbstractC6750rY.m24399b(new C6830sY(fragment, viewGroup, 1));
                    AbstractC6750rY.m24398a(fragment).getClass();
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                m10094a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            if (view.isAttachedToWindow()) {
                AbstractC9280ek1.m18029c(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7226yq(3, view2));
            }
            fragment.performViewCreated();
            this.f16260a.m8381w(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        viewFindFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    /* renamed from: e */
    public final void m10098e() {
        Fragment fragmentM10108b;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f16262c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        C1737s c1737s = this.f16261b;
        if (z && !fragment.mBeingSaved) {
            c1737s.m10115i(null, fragment.mWho);
        }
        if (!z) {
            C1734p c1734p = c1737s.f16268d;
            if (!((c1734p.f16240d.containsKey(fragment.mWho) && c1734p.f16243g) ? c1734p.f16244h : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentM10108b = c1737s.m10108b(str)) != null && fragmentM10108b.mRetainInstance) {
                    fragment.mTarget = fragmentM10108b;
                }
                fragment.mState = 0;
                return;
            }
        }
        AbstractC1607ZX abstractC1607ZX = fragment.mHost;
        if (abstractC1607ZX instanceof InterfaceC8635Zk1) {
            zIsChangingConfigurations = c1737s.f16268d.f16244h;
        } else {
            AbstractActivityC1730l abstractActivityC1730l = abstractC1607ZX.f14957b;
            if (abstractActivityC1730l instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC1730l.isChangingConfigurations();
            }
        }
        if ((z && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            C1734p c1734p2 = c1737s.f16268d;
            c1734p2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(fragment);
            }
            c1734p2.m10092d(fragment.mWho);
        }
        fragment.performDestroy();
        this.f16260a.m8372n(fragment, false);
        Iterator it = c1737s.m10110d().iterator();
        while (it.hasNext()) {
            C1736r c1736r = (C1736r) it.next();
            if (c1736r != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = c1736r.f16262c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = c1737s.m10108b(str3);
        }
        c1737s.m10114h(this);
    }

    /* renamed from: f */
    public final void m10099f() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f16262c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f16260a.m8382x(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.mo2439j(null);
        fragment.mInLayout = false;
    }

    /* renamed from: g */
    public final void m10100g() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f16262c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.f16260a.m8373o(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            C1734p c1734p = this.f16261b.f16268d;
            boolean z = true;
            if (c1734p.f16240d.containsKey(fragment.mWho) && c1734p.f16243g) {
                z = c1734p.f16244h;
            }
            if (!z) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    /* renamed from: h */
    public final void m10101h() {
        Fragment fragment = this.f16262c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f16260a.m8381w(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:350:0x0183, code lost:
    
        continue;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10102i() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1736r.m10102i():void");
    }

    /* renamed from: j */
    public final void m10103j(ClassLoader classLoader) {
        Fragment fragment = this.f16262c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        C1735q c1735q = (C1735q) fragment.mSavedFragmentState.getParcelable("state");
        if (c1735q != null) {
            fragment.mTargetWho = c1735q.f16257l;
            fragment.mTargetRequestCode = c1735q.f16258m;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = c1735q.f16259n;
            }
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10104k() {
        /*
            r5 = this;
            java.lang.String r0 = "FragmentManager"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            androidx.fragment.app.Fragment r2 = r5.f16262c
            if (r1 == 0) goto Le
            java.util.Objects.toString(r2)
        Le:
            android.view.View r1 = r2.getFocusedView()
            if (r1 == 0) goto L42
            android.view.View r3 = r2.mView
            if (r1 != r3) goto L19
            goto L23
        L19:
            android.view.ViewParent r3 = r1.getParent()
        L1d:
            if (r3 == 0) goto L42
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L3d
        L23:
            r1.requestFocus()
            r3 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L42
            r1.toString()
            java.util.Objects.toString(r2)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
            goto L42
        L3d:
            android.view.ViewParent r3 = r3.getParent()
            goto L1d
        L42:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            VH r1 = r5.f16260a
            r3 = 0
            r1.m8377s(r2, r3)
            androidx.fragment.app.s r1 = r5.f16261b
            java.lang.String r3 = r2.mWho
            r1.m10115i(r0, r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1736r.m10104k():void");
    }

    /* renamed from: l */
    public final Bundle m10105l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f16262c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C1735q(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f16260a.m8378t(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.m22832c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleM10056V = fragment.mChildFragmentManager.m10056V();
            if (!bundleM10056V.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleM10056V);
            }
            if (fragment.mView != null) {
                m10106m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* renamed from: m */
    public final void m10106m() {
        Fragment fragment = this.f16262c;
        if (fragment.mView == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f16274f.m22832c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public C1736r(C1339VH c1339vh, C1737s c1737s, ClassLoader classLoader, C3935dY c3935dY, Bundle bundle) {
        this.f16260a = c1339vh;
        this.f16261b = c1737s;
        C1735q c1735q = (C1735q) bundle.getParcelable("state");
        Fragment fragmentInstantiate = Fragment.instantiate(c3935dY.f26137a.f16232t.f14957b, c1735q.f16246a, null);
        fragmentInstantiate.mWho = c1735q.f16247b;
        fragmentInstantiate.mFromLayout = c1735q.f16248c;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = c1735q.f16249d;
        fragmentInstantiate.mContainerId = c1735q.f16250e;
        fragmentInstantiate.mTag = c1735q.f16251f;
        fragmentInstantiate.mRetainInstance = c1735q.f16252g;
        fragmentInstantiate.mRemoving = c1735q.f16253h;
        fragmentInstantiate.mDetached = c1735q.f16254i;
        fragmentInstantiate.mHidden = c1735q.f16255j;
        fragmentInstantiate.mMaxState = EnumC7434Ci0.values()[c1735q.f16256k];
        fragmentInstantiate.mTargetWho = c1735q.f16257l;
        fragmentInstantiate.mTargetRequestCode = c1735q.f16258m;
        fragmentInstantiate.mUserVisibleHint = c1735q.f16259n;
        this.f16262c = fragmentInstantiate;
        fragmentInstantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragmentInstantiate);
        }
    }

    public C1736r(C1339VH c1339vh, C1737s c1737s, Fragment fragment, Bundle bundle) {
        this.f16260a = c1339vh;
        this.f16261b = c1737s;
        this.f16262c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
