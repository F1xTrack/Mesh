package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC1743b;
import androidx.lifecycle.C1742a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC0003A2;
import p000.AbstractC0066B2;
import p000.AbstractC0129C2;
import p000.AbstractC0696L2;
import p000.AbstractC0852NX;
import p000.AbstractC10080l01;
import p000.AbstractC10815qk0;
import p000.AbstractC1198T2;
import p000.AbstractC1229TX;
import p000.AbstractC1544YX;
import p000.AbstractC1576Z2;
import p000.AbstractC1607ZX;
import p000.AbstractC4100gB;
import p000.AbstractC6750rY;
import p000.AbstractC7222ym;
import p000.AbstractC7538Ei0;
import p000.C0915OX;
import p000.C10145lV0;
import p000.C10273mV0;
import p000.C10352n61;
import p000.C1041QX;
import p000.C10529oV0;
import p000.C10613p90;
import p000.C10943rk0;
import p000.C1103RX;
import p000.C1166SX;
import p000.C1292UX;
import p000.C1418WX;
import p000.C3935dY;
import p000.C4049fN;
import p000.C4123gY;
import p000.C6244jY;
import p000.C6496nY;
import p000.C6687qY;
import p000.C6838sg;
import p000.C7508Dt0;
import p000.C7560Et0;
import p000.C8583Yk1;
import p000.C8797b10;
import p000.C8925c10;
import p000.C8932c31;
import p000.EnumC7382Bi0;
import p000.EnumC7434Ci0;
import p000.GR0;
import p000.H20;
import p000.InterfaceC0570J2;
import p000.InterfaceC10401nV0;
import p000.InterfaceC6433mY;
import p000.InterfaceC6894tZ;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7902Li0;
import p000.InterfaceC8531Xk1;
import p000.InterfaceC8635Zk1;
import p000.LB1;
import p000.O02;
import p000.O90;
import p000.Q02;
import p000.RunnableC0978PX;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC7902Li0, InterfaceC8635Zk1, H20, InterfaceC10401nV0 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C1166SX mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    InterfaceC8531Xk1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    AbstractC1733o mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC1607ZX mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C1742a mLifecycleRegistry;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C10273mV0 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    View mView;
    C1738t mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    AbstractC1733o mChildFragmentManager = new C6244jY();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new RunnableC0978PX(this, 0);
    EnumC7434Ci0 mMaxState = EnumC7434Ci0.f1590e;
    C7560Et0 mViewLifecycleOwnerLiveData = new C7560Et0();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<AbstractC1229TX> mOnPreAttachedListeners = new ArrayList<>();
    private final AbstractC1229TX mSavedStateAttachListener = new C1727i(this);

    /* renamed from: androidx.fragment.app.Fragment$6 */
    public class C17186 implements InterfaceC7746Ii0 {
        public C17186() {
        }

        @Override // p000.InterfaceC7746Ii0
        /* renamed from: f */
        public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
            View view;
            if (enumC7382Bi0 != EnumC7382Bi0.ON_STOP || (view = Fragment.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public Fragment() {
        m10009p();
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* renamed from: c */
    public Activity mo10005c() {
        return getActivity();
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        AbstractC1733o abstractC1733o;
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx != null) {
            c1166sx.f10842s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC1733o = this.mFragmentManager) == null) {
            return;
        }
        C1724f c1724fM10024h = C1724f.m10024h(viewGroup, abstractC1733o);
        c1724fM10024h.m10030i();
        if (z) {
            this.mHost.f14958c.post(new GR0(22, c1724fM10024h));
        } else {
            c1724fM10024h.m10027d();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public AbstractC1544YX createFragmentContainer() {
        return new C1728j(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment fragmentM10008o = m10008o(false);
        if (fragmentM10008o != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentM10008o);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC10815qk0.m24054a(this).m24976b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.mChildFragmentManager.m10085u(AbstractC7222ym.m26232i(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f16215c.m10109c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final AbstractActivityC1730l getActivity() {
        AbstractC1607ZX abstractC1607ZX = this.mHost;
        if (abstractC1607ZX == null) {
            return null;
        }
        return abstractC1607ZX.f14956a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null || (bool = c1166sx.f10839p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null || (bool = c1166sx.f10838o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return null;
        }
        c1166sx.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AbstractC1733o getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        AbstractC1607ZX abstractC1607ZX = this.mHost;
        if (abstractC1607ZX == null) {
            return null;
        }
        return abstractC1607ZX.f14957b;
    }

    @Override // p000.H20
    public AbstractC4100gB getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        C7508Dt0 c7508Dt0 = new C7508Dt0(0);
        LinkedHashMap linkedHashMap = c7508Dt0.f27599a;
        if (application != null) {
            linkedHashMap.put(C4049fN.f27162g, application);
        }
        linkedHashMap.put(LB1.f6544a, this);
        linkedHashMap.put(LB1.f6545b, this);
        if (getArguments() != null) {
            linkedHashMap.put(LB1.f6546c, getArguments());
        }
        return c7508Dt0;
    }

    @Override // p000.H20
    public InterfaceC8531Xk1 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new C10529oV0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return 0;
        }
        return c1166sx.f10825b;
    }

    public Object getEnterTransition() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return null;
        }
        return c1166sx.f10832i;
    }

    public AbstractC10080l01 getEnterTransitionCallback() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return null;
        }
        c1166sx.getClass();
        return null;
    }

    public int getExitAnim() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return 0;
        }
        return c1166sx.f10826c;
    }

    public Object getExitTransition() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return null;
        }
        return c1166sx.f10834k;
    }

    public AbstractC10080l01 getExitTransitionCallback() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return null;
        }
        c1166sx.getClass();
        return null;
    }

    public View getFocusedView() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return null;
        }
        return c1166sx.f10841r;
    }

    @Deprecated
    public final AbstractC1733o getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC1607ZX abstractC1607ZX = this.mHost;
        if (abstractC1607ZX == null) {
            return null;
        }
        return ((C1418WX) abstractC1607ZX).f13247e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // p000.InterfaceC7902Li0
    public AbstractC7538Ei0 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC10815qk0 getLoaderManager() {
        return AbstractC10815qk0.m24054a(this);
    }

    public int getNextTransition() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return 0;
        }
        return c1166sx.f10829f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final AbstractC1733o getParentFragmentManager() {
        AbstractC1733o abstractC1733o = this.mFragmentManager;
        if (abstractC1733o != null) {
            return abstractC1733o;
        }
        throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return false;
        }
        return c1166sx.f10824a;
    }

    public int getPopEnterAnim() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return 0;
        }
        return c1166sx.f10827d;
    }

    public int getPopExitAnim() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return 0;
        }
        return c1166sx.f10828e;
    }

    public float getPostOnViewCreatedAlpha() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return 1.0f;
        }
        return c1166sx.f10840q;
    }

    public Object getReenterTransition() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return null;
        }
        Object obj = c1166sx.f10835l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C6687qY c6687qY = AbstractC6750rY.f41724a;
        AbstractC6750rY.m24399b(new C8797b10(this, "Attempting to get retain instance for fragment " + this));
        AbstractC6750rY.m24398a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return null;
        }
        Object obj = c1166sx.f10833j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p000.InterfaceC10401nV0
    public final C10145lV0 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f37730b;
    }

    public Object getSharedElementEnterTransition() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return null;
        }
        return c1166sx.f10836m;
    }

    public Object getSharedElementReturnTransition() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return null;
        }
        Object obj = c1166sx.f10837n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C1166SX c1166sx = this.mAnimationInfo;
        return (c1166sx == null || (arrayList = c1166sx.f10830g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C1166SX c1166sx = this.mAnimationInfo;
        return (c1166sx == null || (arrayList = c1166sx.f10831h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return m10008o(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C6687qY c6687qY = AbstractC6750rY.f41724a;
        AbstractC6750rY.m24399b(new C8925c10(this, "Attempting to get target request code from fragment " + this));
        AbstractC6750rY.m24398a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC7902Li0 getViewLifecycleOwner() {
        C1738t c1738t = this.mViewLifecycleOwner;
        if (c1738t != null) {
            return c1738t;
        }
        throw new IllegalStateException(AbstractC0852NX.m5759h("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public AbstractC1743b getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // p000.InterfaceC8635Zk1
    public C8583Yk1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m10007n() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.f16211L.f16242f;
        C8583Yk1 c8583Yk1 = (C8583Yk1) map.get(this.mWho);
        if (c8583Yk1 != null) {
            return c8583Yk1;
        }
        C8583Yk1 c8583Yk12 = new C8583Yk1();
        map.put(this.mWho, c8583Yk12);
        return c8583Yk12;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        m10009p();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C6244jY();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            AbstractC1733o abstractC1733o = this.mFragmentManager;
            if (abstractC1733o == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            abstractC1733o.getClass();
            if (!(fragment == null ? false : fragment.isHidden())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null ? true : fragment.isMenuVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        C1166SX c1166sx = this.mAnimationInfo;
        if (c1166sx == null) {
            return false;
        }
        return c1166sx.f10842s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        AbstractC1733o abstractC1733o = this.mFragmentManager;
        if (abstractC1733o == null) {
            return false;
        }
        return abstractC1733o.m10046L();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    /* renamed from: m */
    public final C1166SX m10006m() {
        if (this.mAnimationInfo == null) {
            C1166SX c1166sx = new C1166SX();
            c1166sx.f10832i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            c1166sx.f10833j = obj;
            c1166sx.f10834k = null;
            c1166sx.f10835l = obj;
            c1166sx.f10836m = null;
            c1166sx.f10837n = obj;
            c1166sx.f10840q = 1.0f;
            c1166sx.f10841r = null;
            this.mAnimationInfo = c1166sx;
        }
        return this.mAnimationInfo;
    }

    /* renamed from: n */
    public final int m10007n() {
        EnumC7434Ci0 enumC7434Ci0 = this.mMaxState;
        return (enumC7434Ci0 == EnumC7434Ci0.f1587b || this.mParentFragment == null) ? enumC7434Ci0.ordinal() : Math.min(enumC7434Ci0.ordinal(), this.mParentFragment.m10007n());
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m10048N();
    }

    /* renamed from: o */
    public final Fragment m10008o(boolean z) {
        String str;
        if (z) {
            C6687qY c6687qY = AbstractC6750rY.f41724a;
            AbstractC6750rY.m24399b(new C8925c10(this, "Attempting to get target fragment from fragment " + this));
            AbstractC6750rY.m24398a(this).getClass();
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        AbstractC1733o abstractC1733o = this.mFragmentManager;
        if (abstractC1733o == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC1733o.f16215c.m10108b(str);
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC1607ZX abstractC1607ZX = this.mHost;
        AbstractActivityC1730l abstractActivityC1730l = abstractC1607ZX == null ? null : abstractC1607ZX.f14956a;
        if (abstractActivityC1730l != null) {
            this.mCalled = false;
            onAttach((Activity) abstractActivityC1730l);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        AbstractC1733o abstractC1733o = this.mChildFragmentManager;
        if (abstractC1733o.f16231s >= 1) {
            return;
        }
        abstractC1733o.f16204E = false;
        abstractC1733o.f16205F = false;
        abstractC1733o.f16211L.f16245i = false;
        abstractC1733o.m10084t(1);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC1607ZX abstractC1607ZX = this.mHost;
        AbstractActivityC1730l abstractActivityC1730l = abstractC1607ZX == null ? null : abstractC1607ZX.f14956a;
        if (abstractActivityC1730l != null) {
            this.mCalled = false;
            onInflate((Activity) abstractActivityC1730l, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    /* renamed from: p */
    public final void m10009p() {
        this.mLifecycleRegistry = new C1742a(this);
        this.mSavedStateRegistryController = new C10273mV0(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        AbstractC1229TX abstractC1229TX = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            abstractC1229TX.mo7030a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC1229TX);
        }
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m10048N();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        AbstractC1733o abstractC1733o = this.mChildFragmentManager;
        abstractC1733o.f16204E = false;
        abstractC1733o.f16205F = false;
        abstractC1733o.f16211L.f16245i = false;
        abstractC1733o.m10084t(4);
    }

    public void performAttach() {
        Iterator<AbstractC1229TX> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo7030a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m10063b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f14957b);
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it2 = this.mFragmentManager.f16225m.iterator();
        while (it2.hasNext()) {
            ((InterfaceC6433mY) it2.next()).mo8804a(this);
        }
        AbstractC1733o abstractC1733o = this.mChildFragmentManager;
        abstractC1733o.f16204E = false;
        abstractC1733o.f16205F = false;
        abstractC1733o.f16211L.f16245i = false;
        abstractC1733o.m10084t(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m10073i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m10048N();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo2368a(new InterfaceC7746Ii0() { // from class: androidx.fragment.app.Fragment.6
            public C17186() {
            }

            @Override // p000.InterfaceC7746Ii0
            /* renamed from: f */
            public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
                View view;
                if (enumC7382Bi0 != EnumC7382Bi0.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.m10126e(EnumC7382Bi0.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.m10074j(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m10048N();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C1738t(this, getViewModelStore(), new RunnableC1726h(this));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f16273e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.m10117b();
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(this.mView);
            toString();
        }
        O02.m5927b(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        C1738t c1738t = this.mViewLifecycleOwner;
        O90.m5968f(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, c1738t);
        Q02.m6528b(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.mo2439j(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m10075k();
        this.mLifecycleRegistry.m10126e(EnumC7382Bi0.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m10084t(1);
        if (this.mView != null) {
            C1738t c1738t = this.mViewLifecycleOwner;
            c1738t.m10117b();
            if (c1738t.f16273e.f16309c.compareTo(EnumC7434Ci0.f1588c) >= 0) {
                this.mViewLifecycleOwner.m10116a(EnumC7382Bi0.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        C8932c31 c8932c31 = AbstractC10815qk0.m24054a(this).f43234b.f42582d;
        int i = c8932c31.f17276c;
        for (int i2 = 0; i2 < i; i2++) {
            ((C10943rk0) c8932c31.f17275b[i2]).m24468l();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onDetach()"));
        }
        AbstractC1733o abstractC1733o = this.mChildFragmentManager;
        if (abstractC1733o.f16206G) {
            return;
        }
        abstractC1733o.m10075k();
        this.mChildFragmentManager = new C6244jY();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m10079o(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m10080p(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m10084t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10116a(EnumC7382Bi0.ON_PAUSE);
        }
        this.mLifecycleRegistry.m10126e(EnumC7382Bi0.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.m10083s(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM10037K = AbstractC1733o.m10037K(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM10037K) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM10037K);
            onPrimaryNavigationFragmentChanged(zM10037K);
            AbstractC1733o abstractC1733o = this.mChildFragmentManager;
            abstractC1733o.m10068d0();
            abstractC1733o.m10081q(abstractC1733o.f16235w);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m10048N();
        this.mChildFragmentManager.m10088x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onResume()"));
        }
        C1742a c1742a = this.mLifecycleRegistry;
        EnumC7382Bi0 enumC7382Bi0 = EnumC7382Bi0.ON_RESUME;
        c1742a.m10126e(enumC7382Bi0);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f16273e.m10126e(enumC7382Bi0);
        }
        AbstractC1733o abstractC1733o = this.mChildFragmentManager;
        abstractC1733o.f16204E = false;
        abstractC1733o.f16205F = false;
        abstractC1733o.f16211L.f16245i = false;
        abstractC1733o.m10084t(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.m10048N();
        this.mChildFragmentManager.m10088x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onStart()"));
        }
        C1742a c1742a = this.mLifecycleRegistry;
        EnumC7382Bi0 enumC7382Bi0 = EnumC7382Bi0.ON_START;
        c1742a.m10126e(enumC7382Bi0);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f16273e.m10126e(enumC7382Bi0);
        }
        AbstractC1733o abstractC1733o = this.mChildFragmentManager;
        abstractC1733o.f16204E = false;
        abstractC1733o.f16205F = false;
        abstractC1733o.f16211L.f16245i = false;
        abstractC1733o.m10084t(5);
    }

    public void performStop() {
        AbstractC1733o abstractC1733o = this.mChildFragmentManager;
        abstractC1733o.f16205F = true;
        abstractC1733o.f16211L.f16245i = true;
        abstractC1733o.m10084t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10116a(EnumC7382Bi0.ON_STOP);
        }
        this.mLifecycleRegistry.m10126e(EnumC7382Bi0.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.m10084t(2);
    }

    public void postponeEnterTransition() {
        m10006m().f10842s = true;
    }

    /* renamed from: q */
    public final C0915OX m10010q(AbstractC0696L2 abstractC0696L2, InterfaceC6894tZ interfaceC6894tZ, InterfaceC0570J2 interfaceC0570J2) {
        if (this.mState > 1) {
            throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        C1103RX c1103rx = new C1103RX(this, interfaceC6894tZ, atomicReference, abstractC0696L2, interfaceC0570J2);
        if (this.mState >= 0) {
            c1103rx.mo7030a();
        } else {
            this.mOnPreAttachedListeners.add(c1103rx);
        }
        return new C0915OX(atomicReference);
    }

    public final <I, O> AbstractC1198T2 registerForActivityResult(AbstractC0696L2 abstractC0696L2, InterfaceC0570J2 interfaceC0570J2) {
        return m10010q(abstractC0696L2, new C1729k(this), interfaceC0570J2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) throws Exception {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " not attached to Activity"));
        }
        AbstractC1733o parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f16201B == null) {
            parentFragmentManager.f16232t.getClass();
            return;
        }
        parentFragmentManager.f16202C.addLast(new C4123gY(this.mWho, i));
        parentFragmentManager.f16201B.mo6082a(strArr);
    }

    public final AbstractActivityC1730l requireActivity() {
        AbstractActivityC1730l activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final AbstractC1733o requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.m10055U(bundle);
        AbstractC1733o abstractC1733o = this.mChildFragmentManager;
        abstractC1733o.f16204E = false;
        abstractC1733o.f16205F = false;
        abstractC1733o.f16211L.f16245i = false;
        abstractC1733o.m10084t(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C10352n61(AbstractC0852NX.m5759h("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10116a(EnumC7382Bi0.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        m10006m().f10839p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        m10006m().f10838o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m10006m().f10825b = i;
        m10006m().f10826c = i2;
        m10006m().f10827d = i3;
        m10006m().f10828e = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC10080l01 abstractC10080l01) {
        m10006m().getClass();
    }

    public void setEnterTransition(Object obj) {
        m10006m().f10832i = obj;
    }

    public void setExitSharedElementCallback(AbstractC10080l01 abstractC10080l01) {
        m10006m().getClass();
    }

    public void setExitTransition(Object obj) {
        m10006m().f10834k = obj;
    }

    public void setFocusedView(View view) {
        m10006m().f10841r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((C1418WX) this.mHost).f13247e.invalidateMenu();
        }
    }

    public void setInitialSavedState(C1292UX c1292ux) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c1292ux == null || (bundle = c1292ux.f11900a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((C1418WX) this.mHost).f13247e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        m10006m();
        this.mAnimationInfo.f10829f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m10006m().f10824a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        m10006m().f10840q = f;
    }

    public void setReenterTransition(Object obj) {
        m10006m().f10835l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C6687qY c6687qY = AbstractC6750rY.f41724a;
        AbstractC6750rY.m24399b(new C8797b10(this, "Attempting to set retain instance for fragment " + this));
        AbstractC6750rY.m24398a(this).getClass();
        this.mRetainInstance = z;
        AbstractC1733o abstractC1733o = this.mFragmentManager;
        if (abstractC1733o == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            abstractC1733o.f16211L.m10091c(this);
        } else {
            abstractC1733o.f16211L.m10093e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        m10006m().f10833j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m10006m().f10836m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m10006m();
        C1166SX c1166sx = this.mAnimationInfo;
        c1166sx.f10830g = arrayList;
        c1166sx.f10831h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m10006m().f10837n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            C6687qY c6687qY = AbstractC6750rY.f41724a;
            AbstractC6750rY.m24399b(new C8925c10(this, "Attempting to set target fragment " + fragment + " with request code " + i + " for fragment " + this));
            AbstractC6750rY.m24398a(this).getClass();
        }
        AbstractC1733o abstractC1733o = this.mFragmentManager;
        AbstractC1733o abstractC1733o2 = fragment != null ? fragment.mFragmentManager : null;
        if (abstractC1733o != null && abstractC1733o2 != null && abstractC1733o != abstractC1733o2) {
            throw new IllegalArgumentException(AbstractC0852NX.m5759h("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragmentM10008o = fragment; fragmentM10008o != null; fragmentM10008o = fragmentM10008o.m10008o(false)) {
            if (fragmentM10008o.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        C6687qY c6687qY = AbstractC6750rY.f41724a;
        AbstractC6750rY.m24399b(new C6496nY(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        AbstractC6750rY.m24398a(this).getClass();
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            AbstractC1733o abstractC1733o = this.mFragmentManager;
            C1736r c1736rM10070f = abstractC1733o.m10070f(this);
            Fragment fragment = c1736rM10070f.f16262c;
            if (fragment.mDeferStart) {
                if (abstractC1733o.f16214b) {
                    abstractC1733o.f16207H = true;
                } else {
                    fragment.mDeferStart = false;
                    c1736rM10070f.m10102i();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC1607ZX abstractC1607ZX = this.mHost;
        if (abstractC1607ZX == null) {
            return false;
        }
        AbstractActivityC1730l abstractActivityC1730l = ((C1418WX) abstractC1607ZX).f13247e;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i >= 32 ? AbstractC0129C2.m951a(abstractActivityC1730l, str) : i == 31 ? AbstractC0066B2.m467b(abstractActivityC1730l, str) : AbstractC0003A2.m29c(abstractActivityC1730l, str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) throws Exception {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws Exception {
        Intent intent2;
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " not attached to Activity"));
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        AbstractC1733o parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f16200A == null) {
            AbstractC1607ZX abstractC1607ZX = parentFragmentManager.f16232t;
            if (i == -1) {
                abstractC1607ZX.f14956a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                abstractC1607ZX.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        O90.m5968f(intentSender, "intentSender");
        C10613p90 c10613p90 = new C10613p90(intentSender, intent2, i2, i3);
        parentFragmentManager.f16202C.addLast(new C4123gY(this.mWho, i));
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        parentFragmentManager.f16200A.mo6082a(c10613p90);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m10006m().f10842s) {
            return;
        }
        if (this.mHost == null) {
            m10006m().f10842s = false;
        } else if (Looper.myLooper() != this.mHost.f14958c.getLooper()) {
            this.mHost.f14958c.postAtFrontOfQueue(new RunnableC0978PX(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C3935dY.m17706b(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e) {
            throw new C6838sg(AbstractC7222ym.m26234k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C6838sg(AbstractC7222ym.m26234k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C6838sg(AbstractC7222ym.m26234k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C6838sg(AbstractC7222ym.m26234k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        m10006m().f10842s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        AbstractC1733o abstractC1733o = this.mFragmentManager;
        if (abstractC1733o != null) {
            this.mPostponedHandler = abstractC1733o.f16232t.f14958c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> AbstractC1198T2 registerForActivityResult(AbstractC0696L2 abstractC0696L2, AbstractC1576Z2 abstractC1576Z2, InterfaceC0570J2 interfaceC0570J2) {
        return m10010q(abstractC0696L2, new C1041QX(abstractC1576Z2), interfaceC0570J2);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC1607ZX abstractC1607ZX = this.mHost;
        if (abstractC1607ZX == null) {
            throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " not attached to Activity"));
        }
        abstractC1607ZX.f14957b.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) throws Exception {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC0852NX.m5759h("Fragment ", this, " not attached to Activity"));
        }
        AbstractC1733o parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f16238z != null) {
            parentFragmentManager.f16202C.addLast(new C4123gY(this.mWho, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f16238z.mo6082a(intent);
            return;
        }
        AbstractC1607ZX abstractC1607ZX = parentFragmentManager.f16232t;
        if (i == -1) {
            abstractC1607ZX.f14957b.startActivity(intent, bundle);
        } else {
            abstractC1607ZX.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC1607ZX abstractC1607ZX = this.mHost;
        if (abstractC1607ZX != null) {
            AbstractActivityC1730l abstractActivityC1730l = ((C1418WX) abstractC1607ZX).f13247e;
            LayoutInflater layoutInflaterCloneInContext = abstractActivityC1730l.getLayoutInflater().cloneInContext(abstractActivityC1730l);
            layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f16218f);
            return layoutInflaterCloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
