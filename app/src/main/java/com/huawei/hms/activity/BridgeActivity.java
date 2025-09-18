package com.huawei.hms.activity;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.p016ui.SafeIntent;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResolutionFlagUtil;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import java.lang.reflect.InvocationTargetException;
import p000.AbstractC0852NX;

/* loaded from: classes.dex */
public class BridgeActivity extends Activity {
    public static final String EXTRA_DELEGATE_CLASS_NAME = "intent.extra.DELEGATE_CLASS_OBJECT";
    public static final String EXTRA_DELEGATE_UPDATE_INFO = "intent.extra.update.info";
    public static final String EXTRA_INTENT = "intent.extra.intent";
    public static final String EXTRA_IS_FULLSCREEN = "intent.extra.isfullscreen";
    public static final String EXTRA_RESULT = "intent.extra.RESULT";

    /* renamed from: b */
    private static final int f18690b = m11381a("ro.build.hw_emui_api_level", 0);

    /* renamed from: a */
    private IBridgeActivityDelegate f18691a;

    /* renamed from: com.huawei.hms.activity.BridgeActivity$a */
    public class ViewOnApplyWindowInsetsListenerC2015a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f18692a;

        public ViewOnApplyWindowInsetsListenerC2015a(ViewGroup viewGroup) {
            this.f18692a = viewGroup;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                Object objInvoke = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx").getMethod("getDisplaySideRegion", WindowInsets.class).invoke(null, windowInsets);
                if (objInvoke == null) {
                    HMSLog.m12622i("BridgeActivity", "sideRegion is null");
                } else {
                    Rect rect = (Rect) Class.forName("com.huawei.android.view.DisplaySideRegionEx").getMethod("getSafeInsets", null).invoke(objInvoke, null);
                    ViewGroup viewGroup = this.f18692a;
                    if (viewGroup != null) {
                        viewGroup.setPadding(rect.left, 0, rect.right, 0);
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                HMSLog.m12620e("BridgeActivity", "An exception occurred while reading: onApplyWindowInsets" + e.getMessage());
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    /* renamed from: a */
    private static void m11383a(Window window, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            window.getClass().getMethod("setHwFloating", Boolean.TYPE).invoke(window, Boolean.valueOf(z));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("In setHwFloating, Failed to call Window.setHwFloating()."), "BridgeActivity");
        }
    }

    /* renamed from: b */
    private void m11384b() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        View viewFindViewById = getWindow().findViewById(R.id.content);
        if (viewFindViewById == null || !(viewFindViewById instanceof ViewGroup)) {
            HMSLog.m12620e("BridgeActivity", "rootView is null or not ViewGroup");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx");
            cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(cls.getDeclaredConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 1);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("An exception occurred while reading: setDisplaySideMode"), "BridgeActivity");
        }
        getWindow().getDecorView().setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC2015a(viewGroup));
    }

    /* renamed from: c */
    private boolean m11385c() {
        Intent intent = getIntent();
        if (intent == null) {
            HMSLog.m12620e("BridgeActivity", "In initialize, Must not pass in a null intent.");
            return false;
        }
        if (intent.getBooleanExtra(EXTRA_IS_FULLSCREEN, false)) {
            getWindow().setFlags(1024, 1024);
        }
        try {
            String stringExtra = intent.getStringExtra(EXTRA_DELEGATE_CLASS_NAME);
            if (stringExtra == null) {
                HMSLog.m12620e("BridgeActivity", "In initialize, Must not pass in a null or non class object.");
                return false;
            }
            IBridgeActivityDelegate iBridgeActivityDelegate = (IBridgeActivityDelegate) Class.forName(stringExtra).asSubclass(IBridgeActivityDelegate.class).newInstance();
            this.f18691a = iBridgeActivityDelegate;
            try {
                iBridgeActivityDelegate.onBridgeActivityCreate(this);
                return true;
            } catch (Throwable th) {
                HMSLog.m12620e("BridgeActivity", "onBridgeActivityCreate Exception." + th.getMessage());
                return false;
            }
        } catch (ClassCastException e) {
            e = e;
            AbstractC0852NX.m5766o(e, new StringBuilder("In initialize, Failed to create 'IUpdateWizard' instance."), "BridgeActivity");
            return false;
        } catch (ClassNotFoundException e2) {
            e = e2;
            AbstractC0852NX.m5766o(e, new StringBuilder("In initialize, Failed to create 'IUpdateWizard' instance."), "BridgeActivity");
            return false;
        } catch (IllegalAccessException e3) {
            e = e3;
            AbstractC0852NX.m5766o(e, new StringBuilder("In initialize, Failed to create 'IUpdateWizard' instance."), "BridgeActivity");
            return false;
        } catch (IllegalStateException e4) {
            e = e4;
            AbstractC0852NX.m5766o(e, new StringBuilder("In initialize, Failed to create 'IUpdateWizard' instance."), "BridgeActivity");
            return false;
        } catch (InstantiationException e5) {
            e = e5;
            AbstractC0852NX.m5766o(e, new StringBuilder("In initialize, Failed to create 'IUpdateWizard' instance."), "BridgeActivity");
            return false;
        } catch (Throwable unused) {
            HMSLog.m12620e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance, throwable occur.");
            return false;
        }
    }

    /* renamed from: d */
    private void m11386d() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            requestWindowFeature(1);
        } catch (Exception e) {
            HMSLog.m12623w("BridgeActivity", "requestWindowFeature " + e.getMessage());
        }
        Window window = getWindow();
        if (f18690b >= 9) {
            window.addFlags(67108864);
            m11383a(window, true);
        }
        window.getDecorView().setSystemUiVisibility(0);
    }

    public static Intent getIntentStartBridgeActivity(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, UIUtil.isActivityFullscreen(activity));
        return intent;
    }

    public static void setFullScreenWindowLayoutInDisplayCutout(Window window) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
            window.getDecorView().setSystemUiVisibility(1280);
            return;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes2), 65536);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.m12620e("BridgeActivity", "com.huawei.android.view.LayoutParamsEx fail");
        }
    }

    @Override // android.app.Activity
    public void finish() {
        HMSLog.m12622i("BridgeActivity", "Enter finish.");
        super.finish();
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        Intent intentModifyIntentBehaviorsSafe = UIUtil.modifyIntentBehaviorsSafe(super.getIntent());
        if (intentModifyIntentBehaviorsSafe != null) {
            return new SafeIntent(intentModifyIntentBehaviorsSafe);
        }
        return null;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean zOnBridgeActivityResult;
        SafeIntent safeIntent = new SafeIntent(intent);
        super.onActivityResult(i, i2, safeIntent);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f18691a;
        if (iBridgeActivityDelegate != null) {
            try {
                zOnBridgeActivityResult = iBridgeActivityDelegate.onBridgeActivityResult(i, i2, safeIntent);
            } catch (Throwable unused) {
                HMSLog.m12623w("BridgeActivity", "onBridgeActivityResult failed, throwable occur.");
                zOnBridgeActivityResult = false;
            }
            if (zOnBridgeActivityResult || isFinishing()) {
                return;
            }
            setResult(i2, UIUtil.modifyIntentBehaviorsSafe(safeIntent));
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f18691a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeConfigurationChanged();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        HMSLog.m12622i("BridgeActivity", "BridgeActivity onCreate");
        if (getIntent() == null) {
            setResult(1, null);
            finish();
            return;
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        m11386d();
        m11384b();
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(getApplicationContext());
        }
        setFullScreenWindowLayoutInDisplayCutout(getWindow());
        if (m11385c()) {
            return;
        }
        setResult(1, null);
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            ResolutionFlagUtil.getInstance().removeResolutionFlag(new SafeIntent(getIntent()).getStringExtra(CommonCode.MapKey.TRANSACTION_ID));
        } catch (Throwable th) {
            HMSLog.m12623w("BridgeActivity", "get transaction_id from intent fail: ".concat(th.getClass().getSimpleName()));
        }
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f18691a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeActivityDestroy();
        }
        HMSLog.m12622i("BridgeActivity", "BridgeActivity onDestroy");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f18691a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onResume() {
        try {
            super.onResume();
        } catch (Throwable th) {
            HMSLog.m12621e("BridgeActivity", "super.onResume has an exception", th);
            m11382a();
        }
    }

    public static Intent getIntentStartBridgeActivity(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, false);
        return intent;
    }

    /* renamed from: a */
    private void m11382a() {
        try {
            if (isFinishing() || isDestroyed()) {
                return;
            }
            setResult(1, null);
            finish();
        } catch (Throwable th) {
            HMSLog.m12621e("BridgeActivity", "finishBridgeActivity has an exception", th);
            throw new IllegalArgumentException("finishBridgeActivity has an exception ", th);
        }
    }

    /* renamed from: a */
    private static int m11381a(String str, int i) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(cls, str, Integer.valueOf(i))).intValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.m12620e("BridgeActivity", "An exception occurred while reading: EMUI_SDK_INT");
            return i;
        }
    }
}
