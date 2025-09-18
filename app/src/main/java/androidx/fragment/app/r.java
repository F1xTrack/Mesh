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
import defpackage.AbstractC1705Vq;
import defpackage.AbstractC3319d31;
import defpackage.AbstractC3639ek1;
import defpackage.AbstractC6859rY;
import defpackage.AbstractC6897rk1;
import defpackage.AbstractC8235ym;
import defpackage.C3411dY;
import defpackage.C6096nY;
import defpackage.C6669qY;
import defpackage.C7050sY;
import defpackage.EnumC0201Ci0;
import defpackage.InterfaceC2001Zk1;
import defpackage.NX;
import defpackage.O90;
import defpackage.VH;
import defpackage.ViewOnAttachStateChangeListenerC8247yq;
import defpackage.ZX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class r {
    public final VH a;
    public final s b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public r(VH vh, s sVar, Fragment fragment) {
        this.a = vh;
        this.b = sVar;
        this.c = fragment;
    }

    public final void a() {
        View view;
        View view2;
        int iIndexOfChild = -1;
        Fragment fragment = this.c;
        Fragment fragmentC = o.C(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (fragmentC != null && !fragmentC.equals(parentFragment)) {
            int i = fragment.mContainerId;
            C6669qY c6669qY = AbstractC6859rY.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment);
            sb.append(" within the view of parent fragment ");
            sb.append(fragmentC);
            sb.append(" via container with ID ");
            AbstractC6859rY.b(new C6096nY(fragment, AbstractC1705Vq.j(sb, i, " without using parent's childFragmentManager")));
            AbstractC6859rY.a(fragment).getClass();
        }
        s sVar = this.b;
        sVar.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = sVar.a;
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

    public final void b() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        r rVar = null;
        s sVar = this.b;
        if (fragment2 != null) {
            r rVar2 = (r) sVar.b.get(fragment2.mWho);
            if (rVar2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            rVar = rVar2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (rVar = (r) sVar.b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC1705Vq.l(sb, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (rVar != null) {
            rVar.i();
        }
        o oVar = fragment.mFragmentManager;
        fragment.mHost = oVar.t;
        fragment.mParentFragment = oVar.v;
        VH vh = this.a;
        vh.q(fragment, false);
        fragment.performAttach();
        vh.l(fragment, false);
    }

    public final int c() {
        Object next;
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.e;
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
                iMin = Math.max(this.e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            f fVarH = f.h(viewGroup, fragment.getParentFragmentManager());
            fVarH.getClass();
            v vVarF = fVarH.f(fragment);
            int i = vVarF != null ? vVarF.b : 0;
            Iterator it = fVarH.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                v vVar = (v) next;
                if (O90.a(vVar.c, fragment) && !vVar.f) {
                    break;
                }
            }
            v vVar2 = (v) next;
            i = vVar2 != null ? vVar2.b : 0;
            int i2 = i == 0 ? -1 : AbstractC3319d31.a[AbstractC8235ym.x(i)];
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

    public final void d() throws Resources.NotFoundException {
        String resourceName;
        Fragment fragment = this.c;
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
                    throw new IllegalArgumentException(NX.h("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.u.b(i);
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
                    C6669qY c6669qY = AbstractC6859rY.a;
                    AbstractC6859rY.b(new C7050sY(fragment, viewGroup, 1));
                    AbstractC6859rY.a(fragment).getClass();
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
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            if (view.isAttachedToWindow()) {
                AbstractC3639ek1.c(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC8247yq(3, view2));
            }
            fragment.performViewCreated();
            this.a.w(fragment, fragment.mView, bundle2, false);
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

    public final void e() {
        Fragment fragmentB;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        s sVar = this.b;
        if (z && !fragment.mBeingSaved) {
            sVar.i(null, fragment.mWho);
        }
        if (!z) {
            p pVar = sVar.d;
            if (!((pVar.d.containsKey(fragment.mWho) && pVar.g) ? pVar.h : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = sVar.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        ZX zx = fragment.mHost;
        if (zx instanceof InterfaceC2001Zk1) {
            zIsChangingConfigurations = sVar.d.h;
        } else {
            l lVar = zx.b;
            if (lVar instanceof Activity) {
                zIsChangingConfigurations = true ^ lVar.isChangingConfigurations();
            }
        }
        if ((z && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            p pVar2 = sVar.d;
            pVar2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(fragment);
            }
            pVar2.d(fragment.mWho);
        }
        fragment.performDestroy();
        this.a.n(fragment, false);
        Iterator it = sVar.d().iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = rVar.c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = sVar.b(str3);
        }
        sVar.h(this);
    }

    public final void f() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.a.x(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.j(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.a.o(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            p pVar = this.b.d;
            boolean z = true;
            if (pVar.d.containsKey(fragment.mWho) && pVar.g) {
                z = pVar.h;
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

    public final void h() {
        Fragment fragment = this.c;
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
                this.a.w(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:350:0x0183, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.i():void");
    }

    public final void j(ClassLoader classLoader) {
        Fragment fragment = this.c;
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
        q qVar = (q) fragment.mSavedFragmentState.getParcelable("state");
        if (qVar != null) {
            fragment.mTargetWho = qVar.l;
            fragment.mTargetRequestCode = qVar.m;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = qVar.n;
            }
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r5 = this;
            java.lang.String r0 = "FragmentManager"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            androidx.fragment.app.Fragment r2 = r5.c
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
            VH r1 = r5.a
            r3 = 0
            r1.s(r2, r3)
            androidx.fragment.app.s r1 = r5.b
            java.lang.String r3 = r2.mWho
            r1.i(r0, r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.k():void");
    }

    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new q(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.t(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleV = fragment.mChildFragmentManager.V();
            if (!bundleV.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleV);
            }
            if (fragment.mView != null) {
                m();
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

    public final void m() {
        Fragment fragment = this.c;
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
        fragment.mViewLifecycleOwner.f.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public r(VH vh, s sVar, ClassLoader classLoader, C3411dY c3411dY, Bundle bundle) {
        this.a = vh;
        this.b = sVar;
        q qVar = (q) bundle.getParcelable("state");
        Fragment fragmentInstantiate = Fragment.instantiate(c3411dY.a.t.b, qVar.a, null);
        fragmentInstantiate.mWho = qVar.b;
        fragmentInstantiate.mFromLayout = qVar.c;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = qVar.d;
        fragmentInstantiate.mContainerId = qVar.e;
        fragmentInstantiate.mTag = qVar.f;
        fragmentInstantiate.mRetainInstance = qVar.g;
        fragmentInstantiate.mRemoving = qVar.h;
        fragmentInstantiate.mDetached = qVar.i;
        fragmentInstantiate.mHidden = qVar.j;
        fragmentInstantiate.mMaxState = EnumC0201Ci0.values()[qVar.k];
        fragmentInstantiate.mTargetWho = qVar.l;
        fragmentInstantiate.mTargetRequestCode = qVar.m;
        fragmentInstantiate.mUserVisibleHint = qVar.n;
        this.c = fragmentInstantiate;
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

    public r(VH vh, s sVar, Fragment fragment, Bundle bundle) {
        this.a = vh;
        this.b = sVar;
        this.c = fragment;
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
