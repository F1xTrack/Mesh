package p000;

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
import androidx.activity.C1690a;
import androidx.activity.ImmLeaksCleaner;
import androidx.lifecycle.C1742a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import p000.AbstractActivityC0499Hv;
import p000.EnumC7382Bi0;
import p000.InterfaceC7902Li0;
import ru.mes.dnevnik.R;

/* renamed from: Hv */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0499Hv extends AbstractActivityC0436Gv implements InterfaceC8635Zk1, H20, InterfaceC10401nV0, InterfaceC7880Kx0, InterfaceC1640a3, InterfaceC8140Px0, InterfaceC9563gy0, InterfaceC8556Xx0, InterfaceC8608Yx0, InterfaceC7554Eq0 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C7294zv Companion = new C7294zv();
    private C8583Yk1 _viewModelStore;
    private final AbstractC1576Z2 activityResultRegistry;
    private int contentLayoutId;
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<InterfaceC6650py> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC6650py> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC6650py> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC6650py> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC6650py> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC0184Cv reportFullyDrawnExecutor;
    private final C10273mV0 savedStateRegistryController;
    private final C0502Hy contextAwareHelper = new C0502Hy();
    private final C7710Hq0 menuHostHelper = new C7710Hq0(new RunnableC6916tv(this, 0));

    public AbstractActivityC0499Hv() {
        C10273mV0 c10273mV0 = new C10273mV0(this);
        this.savedStateRegistryController = c10273mV0;
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC0247Dv(this);
        this.fullyDrawnReporter$delegate = AbstractC0705LB.m4915b(new C0373Fv(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C0310Ev(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().mo2368a(new C6979uv(0, this));
        getLifecycle().mo2368a(new C6979uv(1, this));
        getLifecycle().mo2368a(new InterfaceC7746Ii0() { // from class: androidx.activity.ComponentActivity$4
            @Override // p000.InterfaceC7746Ii0
            /* renamed from: f */
            public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
                AbstractActivityC0499Hv abstractActivityC0499Hv = this.f15735a;
                AbstractActivityC0499Hv.access$ensureViewModelStore(abstractActivityC0499Hv);
                abstractActivityC0499Hv.getLifecycle().mo2369b(this);
            }
        });
        c10273mV0.m22830a();
        LB1.m4918b(this);
        if (Build.VERSION.SDK_INT <= 23) {
            getLifecycle().mo2368a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().m22443c(ACTIVITY_RESULT_TAG, new C7042vv(0, this));
        addOnContextAvailableListener(new C7105wv(this, 0));
        this.defaultViewModelProviderFactory$delegate = AbstractC0705LB.m4915b(new C0373Fv(this, 0));
        this.onBackPressedDispatcher$delegate = AbstractC0705LB.m4915b(new C0373Fv(this, 3));
    }

    public static final void access$ensureViewModelStore(AbstractActivityC0499Hv abstractActivityC0499Hv) {
        if (abstractActivityC0499Hv._viewModelStore == null) {
            C0121Bv c0121Bv = (C0121Bv) abstractActivityC0499Hv.getLastNonConfigurationInstance();
            if (c0121Bv != null) {
                abstractActivityC0499Hv._viewModelStore = c0121Bv.f1076b;
            }
            if (abstractActivityC0499Hv._viewModelStore == null) {
                abstractActivityC0499Hv._viewModelStore = new C8583Yk1();
            }
        }
    }

    /* renamed from: b */
    public static void m3646b(AbstractActivityC0499Hv abstractActivityC0499Hv, AbstractActivityC0499Hv abstractActivityC0499Hv2) {
        O90.m5968f(abstractActivityC0499Hv2, "it");
        Bundle bundleM22441a = abstractActivityC0499Hv.getSavedStateRegistry().m22441a(ACTIVITY_RESULT_TAG);
        if (bundleM22441a != null) {
            AbstractC1576Z2 abstractC1576Z2 = abstractActivityC0499Hv.activityResultRegistry;
            abstractC1576Z2.getClass();
            ArrayList<Integer> integerArrayList = bundleM22441a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM22441a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleM22441a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC1576Z2.f14653d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleM22441a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC1576Z2.f14656g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = abstractC1576Z2.f14651b;
                boolean zContainsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = abstractC1576Z2.f14650a;
                if (zContainsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        AbstractC10036ke1.m22227b(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                O90.m5967e(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                O90.m5967e(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* renamed from: c */
    public static void m3647c(AbstractActivityC0499Hv abstractActivityC0499Hv, InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        if (enumC7382Bi0 == EnumC7382Bi0.ON_DESTROY) {
            abstractActivityC0499Hv.contextAwareHelper.f4619b = null;
            if (!abstractActivityC0499Hv.isChangingConfigurations()) {
                abstractActivityC0499Hv.getViewModelStore().m9352a();
            }
            ViewTreeObserverOnDrawListenerC0247Dv viewTreeObserverOnDrawListenerC0247Dv = (ViewTreeObserverOnDrawListenerC0247Dv) abstractActivityC0499Hv.reportFullyDrawnExecutor;
            AbstractActivityC0499Hv abstractActivityC0499Hv2 = viewTreeObserverOnDrawListenerC0247Dv.f2298d;
            abstractActivityC0499Hv2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0247Dv);
            abstractActivityC0499Hv2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0247Dv);
        }
    }

    /* renamed from: d */
    public static Bundle m3648d(AbstractActivityC0499Hv abstractActivityC0499Hv) {
        Bundle bundle = new Bundle();
        AbstractC1576Z2 abstractC1576Z2 = abstractActivityC0499Hv.activityResultRegistry;
        abstractC1576Z2.getClass();
        LinkedHashMap linkedHashMap = abstractC1576Z2.f14651b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC1576Z2.f14653d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC1576Z2.f14656g));
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0184Cv interfaceExecutorC0184Cv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        O90.m5967e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0247Dv) interfaceExecutorC0184Cv).m1925a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // p000.InterfaceC7554Eq0
    public void addMenuProvider(InterfaceC8594Yq0 interfaceC8594Yq0) {
        O90.m5968f(interfaceC8594Yq0, "provider");
        C7710Hq0 c7710Hq0 = this.menuHostHelper;
        c7710Hq0.f4549b.add(interfaceC8594Yq0);
        c7710Hq0.f4548a.run();
    }

    @Override // p000.InterfaceC8140Px0
    public final void addOnConfigurationChangedListener(InterfaceC6650py interfaceC6650py) {
        O90.m5968f(interfaceC6650py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onConfigurationChangedListeners.add(interfaceC6650py);
    }

    public final void addOnContextAvailableListener(InterfaceC8192Qx0 interfaceC8192Qx0) {
        O90.m5968f(interfaceC8192Qx0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C0502Hy c0502Hy = this.contextAwareHelper;
        c0502Hy.getClass();
        AbstractActivityC0499Hv abstractActivityC0499Hv = c0502Hy.f4619b;
        if (abstractActivityC0499Hv != null) {
            interfaceC8192Qx0.mo6835a(abstractActivityC0499Hv);
        }
        c0502Hy.f4618a.add(interfaceC8192Qx0);
    }

    @Override // p000.InterfaceC8556Xx0
    public final void addOnMultiWindowModeChangedListener(InterfaceC6650py interfaceC6650py) {
        O90.m5968f(interfaceC6650py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onMultiWindowModeChangedListeners.add(interfaceC6650py);
    }

    public final void addOnNewIntentListener(InterfaceC6650py interfaceC6650py) {
        O90.m5968f(interfaceC6650py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onNewIntentListeners.add(interfaceC6650py);
    }

    @Override // p000.InterfaceC8608Yx0
    public final void addOnPictureInPictureModeChangedListener(InterfaceC6650py interfaceC6650py) {
        O90.m5968f(interfaceC6650py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onPictureInPictureModeChangedListeners.add(interfaceC6650py);
    }

    @Override // p000.InterfaceC9563gy0
    public final void addOnTrimMemoryListener(InterfaceC6650py interfaceC6650py) {
        O90.m5968f(interfaceC6650py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onTrimMemoryListeners.add(interfaceC6650py);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        O90.m5968f(runnable, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // p000.InterfaceC1640a3
    public final AbstractC1576Z2 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // p000.H20
    public AbstractC4100gB getDefaultViewModelCreationExtras() {
        C7508Dt0 c7508Dt0 = new C7508Dt0(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c7508Dt0.f27599a;
        if (application != null) {
            C4049fN c4049fN = C4049fN.f27162g;
            Application application2 = getApplication();
            O90.m5967e(application2, "application");
            linkedHashMap.put(c4049fN, application2);
        }
        linkedHashMap.put(LB1.f6544a, this);
        linkedHashMap.put(LB1.f6545b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(LB1.f6546c, extras);
        }
        return c7508Dt0;
    }

    @Override // p000.H20
    public InterfaceC8531Xk1 getDefaultViewModelProviderFactory() {
        return (InterfaceC8531Xk1) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C6371lZ getFullyDrawnReporter() {
        return (C6371lZ) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0121Bv c0121Bv = (C0121Bv) getLastNonConfigurationInstance();
        if (c0121Bv != null) {
            return c0121Bv.f1075a;
        }
        return null;
    }

    @Override // p000.AbstractActivityC0436Gv, p000.InterfaceC7902Li0
    public AbstractC7538Ei0 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // p000.InterfaceC7880Kx0
    public final C1690a getOnBackPressedDispatcher() {
        return (C1690a) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // p000.InterfaceC10401nV0
    public final C10145lV0 getSavedStateRegistry() {
        return this.savedStateRegistryController.f37730b;
    }

    @Override // p000.InterfaceC8635Zk1
    public C8583Yk1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            C0121Bv c0121Bv = (C0121Bv) getLastNonConfigurationInstance();
            if (c0121Bv != null) {
                this._viewModelStore = c0121Bv.f1076b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C8583Yk1();
            }
        }
        C8583Yk1 c8583Yk1 = this._viewModelStore;
        O90.m5965c(c8583Yk1);
        return c8583Yk1;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        O90.m5967e(decorView, "window.decorView");
        O02.m5927b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        O90.m5967e(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        O90.m5967e(decorView3, "window.decorView");
        Q02.m6528b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        O90.m5967e(decorView4, "window.decorView");
        P02.m6201f(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        O90.m5967e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.m9455a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().m9821c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        O90.m5968f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC6650py> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo3020b(configuration);
        }
    }

    @Override // p000.AbstractActivityC0436Gv, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.m22831b(bundle);
        C0502Hy c0502Hy = this.contextAwareHelper;
        c0502Hy.getClass();
        c0502Hy.f4619b = this;
        Iterator it = c0502Hy.f4618a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8192Qx0) it.next()).mo6835a(this);
        }
        super.onCreate(bundle);
        int i = FragmentC10009kR0.f36503b;
        AbstractC11032sQ1.m24740b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        O90.m5968f(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C7710Hq0 c7710Hq0 = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = c7710Hq0.f4549b.iterator();
        while (it.hasNext()) {
            ((C1854cY) ((InterfaceC8594Yq0) it.next())).f17597a.m10074j(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        O90.m5968f(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.m3607a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC6650py> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo3020b(new C10961rt0(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.onNewIntent(intent);
        Iterator<InterfaceC6650py> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().mo3020b(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        O90.m5968f(menu, "menu");
        Iterator it = this.menuHostHelper.f4549b.iterator();
        while (it.hasNext()) {
            ((C1854cY) ((InterfaceC8594Yq0) it.next())).f17597a.m10080p(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC6650py> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo3020b(new C9081dB0(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        O90.m5968f(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.f4549b.iterator();
        while (it.hasNext()) {
            ((C1854cY) ((InterfaceC8594Yq0) it.next())).f17597a.m10083s(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        O90.m5968f(strArr, "permissions");
        O90.m5968f(iArr, "grantResults");
        if (this.activityResultRegistry.m9455a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0121Bv c0121Bv;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C8583Yk1 c8583Yk1 = this._viewModelStore;
        if (c8583Yk1 == null && (c0121Bv = (C0121Bv) getLastNonConfigurationInstance()) != null) {
            c8583Yk1 = c0121Bv.f1076b;
        }
        if (c8583Yk1 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0121Bv c0121Bv2 = new C0121Bv();
        c0121Bv2.f1075a = objOnRetainCustomNonConfigurationInstance;
        c0121Bv2.f1076b = c8583Yk1;
        return c0121Bv2;
    }

    @Override // p000.AbstractActivityC0436Gv, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        O90.m5968f(bundle, "outState");
        if (getLifecycle() instanceof C1742a) {
            AbstractC7538Ei0 lifecycle = getLifecycle();
            O90.m5966d(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1742a) lifecycle).m10128g(EnumC7434Ci0.f1588c);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.m22832c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC6650py> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().mo3020b(Integer.valueOf(i));
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
        return this.contextAwareHelper.f4619b;
    }

    public final <I, O> AbstractC1198T2 registerForActivityResult(AbstractC0696L2 abstractC0696L2, AbstractC1576Z2 abstractC1576Z2, InterfaceC0570J2 interfaceC0570J2) {
        O90.m5968f(abstractC0696L2, "contract");
        O90.m5968f(abstractC1576Z2, "registry");
        O90.m5968f(interfaceC0570J2, "callback");
        return abstractC1576Z2.m9457d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, abstractC0696L2, interfaceC0570J2);
    }

    @Override // p000.InterfaceC7554Eq0
    public void removeMenuProvider(InterfaceC8594Yq0 interfaceC8594Yq0) {
        O90.m5968f(interfaceC8594Yq0, "provider");
        this.menuHostHelper.m3608b(interfaceC8594Yq0);
    }

    @Override // p000.InterfaceC8140Px0
    public final void removeOnConfigurationChangedListener(InterfaceC6650py interfaceC6650py) {
        O90.m5968f(interfaceC6650py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onConfigurationChangedListeners.remove(interfaceC6650py);
    }

    public final void removeOnContextAvailableListener(InterfaceC8192Qx0 interfaceC8192Qx0) {
        O90.m5968f(interfaceC8192Qx0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C0502Hy c0502Hy = this.contextAwareHelper;
        c0502Hy.getClass();
        c0502Hy.f4618a.remove(interfaceC8192Qx0);
    }

    @Override // p000.InterfaceC8556Xx0
    public final void removeOnMultiWindowModeChangedListener(InterfaceC6650py interfaceC6650py) {
        O90.m5968f(interfaceC6650py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onMultiWindowModeChangedListeners.remove(interfaceC6650py);
    }

    public final void removeOnNewIntentListener(InterfaceC6650py interfaceC6650py) {
        O90.m5968f(interfaceC6650py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onNewIntentListeners.remove(interfaceC6650py);
    }

    @Override // p000.InterfaceC8608Yx0
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC6650py interfaceC6650py) {
        O90.m5968f(interfaceC6650py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onPictureInPictureModeChangedListeners.remove(interfaceC6650py);
    }

    @Override // p000.InterfaceC9563gy0
    public final void removeOnTrimMemoryListener(InterfaceC6650py interfaceC6650py) {
        O90.m5968f(interfaceC6650py, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onTrimMemoryListeners.remove(interfaceC6650py);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        O90.m5968f(runnable, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (OY1.m6086d()) {
                Trace.beginSection(OY1.m6088f("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            C6371lZ fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f37149a) {
                try {
                    fullyDrawnReporter.f37150b = true;
                    Iterator it = fullyDrawnReporter.f37151c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC6434mZ) it.next()).invoke();
                    }
                    fullyDrawnReporter.f37151c.clear();
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
        InterfaceExecutorC0184Cv interfaceExecutorC0184Cv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        O90.m5967e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0247Dv) interfaceExecutorC0184Cv).m1925a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        O90.m5968f(intentSender, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        O90.m5968f(intentSender, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final <I, O> AbstractC1198T2 registerForActivityResult(AbstractC0696L2 abstractC0696L2, InterfaceC0570J2 interfaceC0570J2) {
        O90.m5968f(abstractC0696L2, "contract");
        O90.m5968f(interfaceC0570J2, "callback");
        return registerForActivityResult(abstractC0696L2, this.activityResultRegistry, interfaceC0570J2);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        O90.m5968f(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC6650py> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().mo3020b(new C10961rt0(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        O90.m5968f(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC6650py> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().mo3020b(new C9081dB0(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC0184Cv interfaceExecutorC0184Cv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        O90.m5967e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0247Dv) interfaceExecutorC0184Cv).m1925a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC8594Yq0 interfaceC8594Yq0, InterfaceC7902Li0 interfaceC7902Li0) {
        O90.m5968f(interfaceC8594Yq0, "provider");
        O90.m5968f(interfaceC7902Li0, "owner");
        C7710Hq0 c7710Hq0 = this.menuHostHelper;
        c7710Hq0.f4549b.add(interfaceC8594Yq0);
        c7710Hq0.f4548a.run();
        AbstractC7538Ei0 lifecycle = interfaceC7902Li0.getLifecycle();
        HashMap map = c7710Hq0.f4550c;
        C7658Gq0 c7658Gq0 = (C7658Gq0) map.remove(interfaceC8594Yq0);
        if (c7658Gq0 != null) {
            c7658Gq0.f3923a.mo2369b(c7658Gq0.f3924b);
            c7658Gq0.f3924b = null;
        }
        map.put(interfaceC8594Yq0, new C7658Gq0(lifecycle, new C7168xv(c7710Hq0, 1, interfaceC8594Yq0)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0184Cv interfaceExecutorC0184Cv = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        O90.m5967e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0247Dv) interfaceExecutorC0184Cv).m1925a(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC8594Yq0 interfaceC8594Yq0, InterfaceC7902Li0 interfaceC7902Li0, final EnumC7434Ci0 enumC7434Ci0) {
        O90.m5968f(interfaceC8594Yq0, "provider");
        O90.m5968f(interfaceC7902Li0, "owner");
        O90.m5968f(enumC7434Ci0, "state");
        final C7710Hq0 c7710Hq0 = this.menuHostHelper;
        c7710Hq0.getClass();
        AbstractC7538Ei0 lifecycle = interfaceC7902Li0.getLifecycle();
        HashMap map = c7710Hq0.f4550c;
        C7658Gq0 c7658Gq0 = (C7658Gq0) map.remove(interfaceC8594Yq0);
        if (c7658Gq0 != null) {
            c7658Gq0.f3923a.mo2369b(c7658Gq0.f3924b);
            c7658Gq0.f3924b = null;
        }
        map.put(interfaceC8594Yq0, new C7658Gq0(lifecycle, new InterfaceC7746Ii0() { // from class: Fq0
            @Override // p000.InterfaceC7746Ii0
            /* renamed from: f */
            public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li02, EnumC7382Bi0 enumC7382Bi0) {
                C7710Hq0 c7710Hq02 = c7710Hq0;
                c7710Hq02.getClass();
                EnumC7382Bi0.Companion.getClass();
                EnumC7434Ci0 enumC7434Ci02 = enumC7434Ci0;
                EnumC7382Bi0 enumC7382Bi0M26518c = C11959zi0.m26518c(enumC7434Ci02);
                Runnable runnable = c7710Hq02.f4548a;
                CopyOnWriteArrayList copyOnWriteArrayList = c7710Hq02.f4549b;
                InterfaceC8594Yq0 interfaceC8594Yq02 = interfaceC8594Yq0;
                if (enumC7382Bi0 == enumC7382Bi0M26518c) {
                    copyOnWriteArrayList.add(interfaceC8594Yq02);
                    runnable.run();
                } else if (enumC7382Bi0 == EnumC7382Bi0.ON_DESTROY) {
                    c7710Hq02.m3608b(interfaceC8594Yq02);
                } else if (enumC7382Bi0 == C11959zi0.m26516a(enumC7434Ci02)) {
                    copyOnWriteArrayList.remove(interfaceC8594Yq02);
                    runnable.run();
                }
            }
        }));
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
