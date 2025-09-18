package defpackage;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ImmLeaksCleaner;
import androidx.activity.a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.AbstractActivityC0629Hv;
import defpackage.EnumC0123Bi0;
import defpackage.InterfaceC0903Li0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import ru.mes.dnevnik.R;

/* renamed from: Hv */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0629Hv extends AbstractActivityC0551Gv implements InterfaceC2001Zk1, H20, InterfaceC6088nV0, InterfaceC0870Kx0, InterfaceC2060a3, InterfaceC1259Px0, InterfaceC4062gy0, InterfaceC1883Xx0, InterfaceC1961Yx0, InterfaceC0381Eq0 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C8452zv Companion = new C8452zv();
    private C1923Yk1 _viewModelStore;
    private final Z2 activityResultRegistry;
    private int contentLayoutId;
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<InterfaceC6556py> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC6556py> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC6556py> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC6556py> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC6556py> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC0239Cv reportFullyDrawnExecutor;
    private final C5897mV0 savedStateRegistryController;
    private final C0638Hy contextAwareHelper = new C0638Hy();
    private final C0615Hq0 menuHostHelper = new C0615Hq0(new RunnableC7310tv(this, 0));

    public AbstractActivityC0629Hv() {
        C5897mV0 c5897mV0 = new C5897mV0(this);
        this.savedStateRegistryController = c5897mV0;
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC0317Dv(this);
        this.fullyDrawnReporter$delegate = LB.b(new C0473Fv(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C0395Ev(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new C7501uv(0, this));
        getLifecycle().a(new C7501uv(1, this));
        getLifecycle().a(new InterfaceC0669Ii0() { // from class: androidx.activity.ComponentActivity$4
            @Override // defpackage.InterfaceC0669Ii0
            public final void f(InterfaceC0903Li0 interfaceC0903Li0, EnumC0123Bi0 enumC0123Bi0) {
                AbstractActivityC0629Hv abstractActivityC0629Hv = this.a;
                AbstractActivityC0629Hv.access$ensureViewModelStore(abstractActivityC0629Hv);
                abstractActivityC0629Hv.getLifecycle().b(this);
            }
        });
        c5897mV0.a();
        LB1.b(this);
        if (Build.VERSION.SDK_INT <= 23) {
            getLifecycle().a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new C7692vv(0, this));
        addOnContextAvailableListener(new C7882wv(this, 0));
        this.defaultViewModelProviderFactory$delegate = LB.b(new C0473Fv(this, 0));
        this.onBackPressedDispatcher$delegate = LB.b(new C0473Fv(this, 3));
    }

    public static final void access$ensureViewModelStore(AbstractActivityC0629Hv abstractActivityC0629Hv) {
        if (abstractActivityC0629Hv._viewModelStore == null) {
            C0161Bv c0161Bv = (C0161Bv) abstractActivityC0629Hv.getLastNonConfigurationInstance();
            if (c0161Bv != null) {
                abstractActivityC0629Hv._viewModelStore = c0161Bv.b;
            }
            if (abstractActivityC0629Hv._viewModelStore == null) {
                abstractActivityC0629Hv._viewModelStore = new C1923Yk1();
            }
        }
    }

    public static void b(AbstractActivityC0629Hv abstractActivityC0629Hv, AbstractActivityC0629Hv abstractActivityC0629Hv2) {
        O90.f(abstractActivityC0629Hv2, "it");
        Bundle bundleA = abstractActivityC0629Hv.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            Z2 z2 = abstractActivityC0629Hv.activityResultRegistry;
            z2.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                z2.d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = z2.g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = z2.b;
                boolean zContainsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = z2.a;
                if (zContainsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        AbstractC5543ke1.b(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                O90.e(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                O90.e(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    public static void c(AbstractActivityC0629Hv abstractActivityC0629Hv, InterfaceC0903Li0 interfaceC0903Li0, EnumC0123Bi0 enumC0123Bi0) {
        if (enumC0123Bi0 == EnumC0123Bi0.ON_DESTROY) {
            abstractActivityC0629Hv.contextAwareHelper.b = null;
            if (!abstractActivityC0629Hv.isChangingConfigurations()) {
                abstractActivityC0629Hv.getViewModelStore().a();
            }
            ViewTreeObserverOnDrawListenerC0317Dv viewTreeObserverOnDrawListenerC0317Dv = (ViewTreeObserverOnDrawListenerC0317Dv) abstractActivityC0629Hv.reportFullyDrawnExecutor;
            AbstractActivityC0629Hv abstractActivityC0629Hv2 = viewTreeObserverOnDrawListenerC0317Dv.d;
            abstractActivityC0629Hv2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0317Dv);
            abstractActivityC0629Hv2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0317Dv);
        }
    }

    public static Bundle d(AbstractActivityC0629Hv abstractActivityC0629Hv) {
        Bundle bundle = new Bundle();
        Z2 z2 = abstractActivityC0629Hv.activityResultRegistry;
        z2.getClass();
        LinkedHashMap linkedHashMap = z2.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(z2.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(z2.g));
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0239Cv interfaceExecutorC0239Cv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        O90.e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0317Dv) interfaceExecutorC0239Cv).a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.InterfaceC0381Eq0
    public void addMenuProvider(InterfaceC1940Yq0 interfaceC1940Yq0) {
        O90.f(interfaceC1940Yq0, "provider");
        C0615Hq0 c0615Hq0 = this.menuHostHelper;
        c0615Hq0.b.add(interfaceC1940Yq0);
        c0615Hq0.a.run();
    }

    @Override // defpackage.InterfaceC1259Px0
    public final void addOnConfigurationChangedListener(InterfaceC6556py interfaceC6556py) {
        O90.f(interfaceC6556py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onConfigurationChangedListeners.add(interfaceC6556py);
    }

    public final void addOnContextAvailableListener(InterfaceC1337Qx0 interfaceC1337Qx0) {
        O90.f(interfaceC1337Qx0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C0638Hy c0638Hy = this.contextAwareHelper;
        c0638Hy.getClass();
        AbstractActivityC0629Hv abstractActivityC0629Hv = c0638Hy.b;
        if (abstractActivityC0629Hv != null) {
            interfaceC1337Qx0.a(abstractActivityC0629Hv);
        }
        c0638Hy.a.add(interfaceC1337Qx0);
    }

    @Override // defpackage.InterfaceC1883Xx0
    public final void addOnMultiWindowModeChangedListener(InterfaceC6556py interfaceC6556py) {
        O90.f(interfaceC6556py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onMultiWindowModeChangedListeners.add(interfaceC6556py);
    }

    public final void addOnNewIntentListener(InterfaceC6556py interfaceC6556py) {
        O90.f(interfaceC6556py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onNewIntentListeners.add(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC1961Yx0
    public final void addOnPictureInPictureModeChangedListener(InterfaceC6556py interfaceC6556py) {
        O90.f(interfaceC6556py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onPictureInPictureModeChangedListeners.add(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC4062gy0
    public final void addOnTrimMemoryListener(InterfaceC6556py interfaceC6556py) {
        O90.f(interfaceC6556py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onTrimMemoryListeners.add(interfaceC6556py);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        O90.f(runnable, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // defpackage.InterfaceC2060a3
    public final Z2 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.H20
    public AbstractC3914gB getDefaultViewModelCreationExtras() {
        C0312Dt0 c0312Dt0 = new C0312Dt0(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0312Dt0.a;
        if (application != null) {
            C3759fN c3759fN = C3759fN.g;
            Application application2 = getApplication();
            O90.e(application2, "application");
            linkedHashMap.put(c3759fN, application2);
        }
        linkedHashMap.put(LB1.a, this);
        linkedHashMap.put(LB1.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(LB1.c, extras);
        }
        return c0312Dt0;
    }

    @Override // defpackage.H20
    public InterfaceC1845Xk1 getDefaultViewModelProviderFactory() {
        return (InterfaceC1845Xk1) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C5717lZ getFullyDrawnReporter() {
        return (C5717lZ) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0161Bv c0161Bv = (C0161Bv) getLastNonConfigurationInstance();
        if (c0161Bv != null) {
            return c0161Bv.a;
        }
        return null;
    }

    @Override // defpackage.AbstractActivityC0551Gv, defpackage.InterfaceC0903Li0
    public AbstractC0357Ei0 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.InterfaceC0870Kx0
    public final a getOnBackPressedDispatcher() {
        return (a) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.InterfaceC6088nV0
    public final C5706lV0 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.InterfaceC2001Zk1
    public C1923Yk1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            C0161Bv c0161Bv = (C0161Bv) getLastNonConfigurationInstance();
            if (c0161Bv != null) {
                this._viewModelStore = c0161Bv.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C1923Yk1();
            }
        }
        C1923Yk1 c1923Yk1 = this._viewModelStore;
        O90.c(c1923Yk1);
        return c1923Yk1;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        O90.e(decorView, "window.decorView");
        O02.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        O90.e(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        O90.e(decorView3, "window.decorView");
        Q02.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        O90.e(decorView4, "window.decorView");
        P02.f(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        O90.e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        O90.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC6556py> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().b(configuration);
        }
    }

    @Override // defpackage.AbstractActivityC0551Gv, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C0638Hy c0638Hy = this.contextAwareHelper;
        c0638Hy.getClass();
        c0638Hy.b = this;
        Iterator it = c0638Hy.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1337Qx0) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = FragmentC5503kR0.b;
        AbstractC7028sQ1.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        O90.f(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C0615Hq0 c0615Hq0 = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = c0615Hq0.b.iterator();
        while (it.hasNext()) {
            ((C2535cY) ((InterfaceC1940Yq0) it.next())).a.j(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        O90.f(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC6556py> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().b(new C6923rt0(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        O90.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.onNewIntent(intent);
        Iterator<InterfaceC6556py> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().b(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        O90.f(menu, "menu");
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((C2535cY) ((InterfaceC1940Yq0) it.next())).a.p(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC6556py> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().b(new C3343dB0(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        O90.f(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((C2535cY) ((InterfaceC1940Yq0) it.next())).a.s(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        O90.f(strArr, "permissions");
        O90.f(iArr, "grantResults");
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0161Bv c0161Bv;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C1923Yk1 c1923Yk1 = this._viewModelStore;
        if (c1923Yk1 == null && (c0161Bv = (C0161Bv) getLastNonConfigurationInstance()) != null) {
            c1923Yk1 = c0161Bv.b;
        }
        if (c1923Yk1 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0161Bv c0161Bv2 = new C0161Bv();
        c0161Bv2.a = objOnRetainCustomNonConfigurationInstance;
        c0161Bv2.b = c1923Yk1;
        return c0161Bv2;
    }

    @Override // defpackage.AbstractActivityC0551Gv, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        O90.f(bundle, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.a) {
            AbstractC0357Ei0 lifecycle = getLifecycle();
            O90.d(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.a) lifecycle).g(EnumC0201Ci0.c);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC6556py> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().b(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> T2 registerForActivityResult(L2 l2, Z2 z2, J2 j2) {
        O90.f(l2, "contract");
        O90.f(z2, "registry");
        O90.f(j2, "callback");
        return z2.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, l2, j2);
    }

    @Override // defpackage.InterfaceC0381Eq0
    public void removeMenuProvider(InterfaceC1940Yq0 interfaceC1940Yq0) {
        O90.f(interfaceC1940Yq0, "provider");
        this.menuHostHelper.b(interfaceC1940Yq0);
    }

    @Override // defpackage.InterfaceC1259Px0
    public final void removeOnConfigurationChangedListener(InterfaceC6556py interfaceC6556py) {
        O90.f(interfaceC6556py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onConfigurationChangedListeners.remove(interfaceC6556py);
    }

    public final void removeOnContextAvailableListener(InterfaceC1337Qx0 interfaceC1337Qx0) {
        O90.f(interfaceC1337Qx0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C0638Hy c0638Hy = this.contextAwareHelper;
        c0638Hy.getClass();
        c0638Hy.a.remove(interfaceC1337Qx0);
    }

    @Override // defpackage.InterfaceC1883Xx0
    public final void removeOnMultiWindowModeChangedListener(InterfaceC6556py interfaceC6556py) {
        O90.f(interfaceC6556py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onMultiWindowModeChangedListeners.remove(interfaceC6556py);
    }

    public final void removeOnNewIntentListener(InterfaceC6556py interfaceC6556py) {
        O90.f(interfaceC6556py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onNewIntentListeners.remove(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC1961Yx0
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC6556py interfaceC6556py) {
        O90.f(interfaceC6556py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onPictureInPictureModeChangedListeners.remove(interfaceC6556py);
    }

    @Override // defpackage.InterfaceC4062gy0
    public final void removeOnTrimMemoryListener(InterfaceC6556py interfaceC6556py) {
        O90.f(interfaceC6556py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onTrimMemoryListeners.remove(interfaceC6556py);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        O90.f(runnable, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (OY1.d()) {
                Trace.beginSection(OY1.f("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            C5717lZ fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    Iterator it = fullyDrawnReporter.c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5908mZ) it.next()).invoke();
                    }
                    fullyDrawnReporter.c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        InterfaceExecutorC0239Cv interfaceExecutorC0239Cv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        O90.e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0317Dv) interfaceExecutorC0239Cv).a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        O90.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        O90.f(intentSender, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        O90.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        O90.f(intentSender, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final <I, O> T2 registerForActivityResult(L2 l2, J2 j2) {
        O90.f(l2, "contract");
        O90.f(j2, "callback");
        return registerForActivityResult(l2, this.activityResultRegistry, j2);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        O90.f(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC6556py> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().b(new C6923rt0(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        O90.f(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC6556py> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().b(new C3343dB0(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC0239Cv interfaceExecutorC0239Cv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        O90.e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0317Dv) interfaceExecutorC0239Cv).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC1940Yq0 interfaceC1940Yq0, InterfaceC0903Li0 interfaceC0903Li0) {
        O90.f(interfaceC1940Yq0, "provider");
        O90.f(interfaceC0903Li0, "owner");
        C0615Hq0 c0615Hq0 = this.menuHostHelper;
        c0615Hq0.b.add(interfaceC1940Yq0);
        c0615Hq0.a.run();
        AbstractC0357Ei0 lifecycle = interfaceC0903Li0.getLifecycle();
        HashMap map = c0615Hq0.c;
        C0537Gq0 c0537Gq0 = (C0537Gq0) map.remove(interfaceC1940Yq0);
        if (c0537Gq0 != null) {
            c0537Gq0.a.b(c0537Gq0.b);
            c0537Gq0.b = null;
        }
        map.put(interfaceC1940Yq0, new C0537Gq0(lifecycle, new C8072xv(c0615Hq0, 1, interfaceC1940Yq0)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0239Cv interfaceExecutorC0239Cv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        O90.e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0317Dv) interfaceExecutorC0239Cv).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC1940Yq0 interfaceC1940Yq0, InterfaceC0903Li0 interfaceC0903Li0, final EnumC0201Ci0 enumC0201Ci0) {
        O90.f(interfaceC1940Yq0, "provider");
        O90.f(interfaceC0903Li0, "owner");
        O90.f(enumC0201Ci0, "state");
        final C0615Hq0 c0615Hq0 = this.menuHostHelper;
        c0615Hq0.getClass();
        AbstractC0357Ei0 lifecycle = interfaceC0903Li0.getLifecycle();
        HashMap map = c0615Hq0.c;
        C0537Gq0 c0537Gq0 = (C0537Gq0) map.remove(interfaceC1940Yq0);
        if (c0537Gq0 != null) {
            c0537Gq0.a.b(c0537Gq0.b);
            c0537Gq0.b = null;
        }
        map.put(interfaceC1940Yq0, new C0537Gq0(lifecycle, new InterfaceC0669Ii0() { // from class: Fq0
            @Override // defpackage.InterfaceC0669Ii0
            public final void f(InterfaceC0903Li0 interfaceC0903Li02, EnumC0123Bi0 enumC0123Bi0) {
                C0615Hq0 c0615Hq02 = c0615Hq0;
                c0615Hq02.getClass();
                EnumC0123Bi0.Companion.getClass();
                EnumC0201Ci0 enumC0201Ci02 = enumC0201Ci0;
                EnumC0123Bi0 enumC0123Bi0C = C8414zi0.c(enumC0201Ci02);
                Runnable runnable = c0615Hq02.a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0615Hq02.b;
                InterfaceC1940Yq0 interfaceC1940Yq02 = interfaceC1940Yq0;
                if (enumC0123Bi0 == enumC0123Bi0C) {
                    copyOnWriteArrayList.add(interfaceC1940Yq02);
                    runnable.run();
                } else if (enumC0123Bi0 == EnumC0123Bi0.ON_DESTROY) {
                    c0615Hq02.b(interfaceC1940Yq02);
                } else if (enumC0123Bi0 == C8414zi0.a(enumC0201Ci02)) {
                    copyOnWriteArrayList.remove(interfaceC1940Yq02);
                    runnable.run();
                }
            }
        }));
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
