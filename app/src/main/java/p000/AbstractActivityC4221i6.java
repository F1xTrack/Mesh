package p000;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC1730l;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: i6 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC4221i6 extends AbstractActivityC1730l implements InterfaceC6405m6 {

    /* renamed from: f */
    public LayoutInflaterFactory2C0448H6 f28818f;

    public AbstractActivityC4221i6() {
        getSavedStateRegistry().m22443c("androidx:appcompat", new C4095g6(this));
        addOnContextAvailableListener(new C4158h6(this));
    }

    @Override // p000.AbstractActivityC0499Hv, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m18966i();
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m18964g();
        layoutInflaterFactory2C0448H6.m3294w();
        ((ViewGroup) layoutInflaterFactory2C0448H6.f4059A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0448H6.f4093m.m492a(layoutInflaterFactory2C0448H6.f4092l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m18964g();
        layoutInflaterFactory2C0448H6.f4073O = true;
        int i = layoutInflaterFactory2C0448H6.f4077S;
        if (i == -100) {
            i = AbstractC6928u6.f43505b;
        }
        int iM3272D = layoutInflaterFactory2C0448H6.m3272D(context, i);
        if (AbstractC6928u6.m25106b(context) && AbstractC6928u6.m25106b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC6928u6.f43512i) {
                    try {
                        C7750Ik0 c7750Ik0 = AbstractC6928u6.f43506c;
                        if (c7750Ik0 == null) {
                            if (AbstractC6928u6.f43507d == null) {
                                AbstractC6928u6.f43507d = C7750Ik0.m3994b(AbstractC1665aS.m9746d(context));
                            }
                            if (!AbstractC6928u6.f43507d.f5121a.isEmpty()) {
                                AbstractC6928u6.f43506c = AbstractC6928u6.f43507d;
                            }
                        } else if (!c7750Ik0.equals(AbstractC6928u6.f43507d)) {
                            C7750Ik0 c7750Ik02 = AbstractC6928u6.f43506c;
                            AbstractC6928u6.f43507d = c7750Ik02;
                            AbstractC1665aS.m9745c(context, c7750Ik02.f5121a.mo4399a());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC6928u6.f43509f) {
                AbstractC6928u6.f43504a.execute(new RunnableC6659q6(context, 0));
            }
        }
        C7750Ik0 c7750Ik0M3266p = LayoutInflaterFactory2C0448H6.m3266p(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0448H6.m3267t(context, iM3272D, c7750Ik0M3266p, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C1130Ry) {
            try {
                ((C1130Ry) context).m7134a(LayoutInflaterFactory2C0448H6.m3267t(context, iM3272D, c7750Ik0M3266p, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (LayoutInflaterFactory2C0448H6.f4058u1) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 24) {
                        AbstractC7180y6.m26044a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    if (i6 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i27 = configuration3.uiMode & 15;
                    int i28 = configuration4.uiMode & 15;
                    if (i27 != i28) {
                        configuration.uiMode |= i28;
                    }
                    int i29 = configuration3.uiMode & 48;
                    int i30 = configuration4.uiMode & 48;
                    if (i29 != i30) {
                        configuration.uiMode |= i30;
                    }
                    int i31 = configuration3.screenWidthDp;
                    int i32 = configuration4.screenWidthDp;
                    if (i31 != i32) {
                        configuration.screenWidthDp = i32;
                    }
                    int i33 = configuration3.screenHeightDp;
                    int i34 = configuration4.screenHeightDp;
                    if (i33 != i34) {
                        configuration.screenHeightDp = i34;
                    }
                    int i35 = configuration3.smallestScreenWidthDp;
                    int i36 = configuration4.smallestScreenWidthDp;
                    if (i35 != i36) {
                        configuration.smallestScreenWidthDp = i36;
                    }
                    int i37 = configuration3.densityDpi;
                    int i38 = configuration4.densityDpi;
                    if (i37 != i38) {
                        configuration.densityDpi = i38;
                    }
                }
            }
            Configuration configurationM3267t = LayoutInflaterFactory2C0448H6.m3267t(context, iM3272D, c7750Ik0M3266p, configuration, true);
            C1130Ry c1130Ry = new C1130Ry(context, ru.mes.dnevnik.R.style.Theme_AppCompat_Empty);
            c1130Ry.m7134a(configurationM3267t);
            try {
                if (context.getTheme() != null) {
                    IQ1.m3860c(c1130Ry.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c1130Ry;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        FM1 fm1M18965h = m18965h();
        if (getWindow().hasFeature(0)) {
            if (fm1M18965h == null || !fm1M18965h.mo2586a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p000.AbstractActivityC0436Gv, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int keyCode = keyEvent.getKeyCode();
        FM1 fm1M18965h = m18965h();
        if (keyCode == 82 && fm1M18965h != null && fm1M18965h.mo2595j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m18964g();
        layoutInflaterFactory2C0448H6.m3294w();
        return layoutInflaterFactory2C0448H6.f4092l.findViewById(i);
    }

    /* renamed from: g */
    public final AbstractC6928u6 m18964g() {
        if (this.f28818f == null) {
            ExecutorC6865t6 executorC6865t6 = AbstractC6928u6.f43504a;
            this.f28818f = new LayoutInflaterFactory2C0448H6(this, null, this, this);
        }
        return this.f28818f;
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m18964g();
        if (layoutInflaterFactory2C0448H6.f4096p == null) {
            layoutInflaterFactory2C0448H6.m3270B();
            FM1 fm1 = layoutInflaterFactory2C0448H6.f4095o;
            layoutInflaterFactory2C0448H6.f4096p = new C11757y61(fm1 != null ? fm1.mo2590e() : layoutInflaterFactory2C0448H6.f4091k);
        }
        return layoutInflaterFactory2C0448H6.f4096p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC11452vi1.f44502a;
        return super.getResources();
    }

    /* renamed from: h */
    public final FM1 m18965h() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m18964g();
        layoutInflaterFactory2C0448H6.m3270B();
        return layoutInflaterFactory2C0448H6.f4095o;
    }

    /* renamed from: i */
    public final void m18966i() {
        O02.m5927b(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        O90.m5968f(decorView, "<this>");
        decorView.setTag(ru.mes.dnevnik.R.id.view_tree_view_model_store_owner, this);
        Q02.m6528b(getWindow().getDecorView(), this);
        P02.m6201f(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m18964g().mo3279a();
    }

    /* renamed from: j */
    public final void m18967j(Toolbar toolbar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m18964g();
        if (layoutInflaterFactory2C0448H6.f4090j instanceof Activity) {
            layoutInflaterFactory2C0448H6.m3270B();
            FM1 fm1 = layoutInflaterFactory2C0448H6.f4095o;
            if (fm1 instanceof C11843yn1) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C0448H6.f4096p = null;
            if (fm1 != null) {
                fm1.mo2593h();
            }
            layoutInflaterFactory2C0448H6.f4095o = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C0448H6.f4090j;
                C9262eb1 c9262eb1 = new C9262eb1(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C0448H6.f4097q, layoutInflaterFactory2C0448H6.f4093m);
                layoutInflaterFactory2C0448H6.f4095o = c9262eb1;
                layoutInflaterFactory2C0448H6.f4093m.f564b = c9262eb1.f26765c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C0448H6.f4093m.f564b = null;
            }
            layoutInflaterFactory2C0448H6.mo3279a();
        }
    }

    @Override // p000.AbstractActivityC0499Hv, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m18964g();
        if (layoutInflaterFactory2C0448H6.f4064F && layoutInflaterFactory2C0448H6.f4108z) {
            layoutInflaterFactory2C0448H6.m3270B();
            FM1 fm1 = layoutInflaterFactory2C0448H6.f4095o;
            if (fm1 != null) {
                fm1.mo2592g();
            }
        }
        C0574J6 c0574j6M4154a = C0574J6.m4154a();
        Context context = layoutInflaterFactory2C0448H6.f4091k;
        synchronized (c0574j6M4154a) {
            c0574j6M4154a.f5338a.m25629l(context);
        }
        layoutInflaterFactory2C0448H6.f4076R = new Configuration(layoutInflaterFactory2C0448H6.f4091k.getResources().getConfiguration());
        layoutInflaterFactory2C0448H6.m3287n(false, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m18964g().mo3281d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, p000.AbstractActivityC0499Hv, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intent intentM7622a;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        FM1 fm1M18965h = m18965h();
        if (menuItem.getItemId() == 16908332 && fm1M18965h != null && (fm1M18965h.mo2589d() & 4) != 0 && (intentM7622a = TB1.m7622a(this)) != null) {
            if (!shouldUpRecreateTask(intentM7622a)) {
                navigateUpTo(intentM7622a);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM7622a2 = TB1.m7622a(this);
            if (intentM7622a2 == null) {
                intentM7622a2 = TB1.m7622a(this);
            }
            if (intentM7622a2 != null) {
                ComponentName component = intentM7622a2.getComponent();
                if (component == null) {
                    component = intentM7622a2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentM7623b = TB1.m7623b(this, component);
                    while (intentM7623b != null) {
                        arrayList.add(size, intentM7623b);
                        intentM7623b = TB1.m7623b(this, intentM7623b.getComponent());
                    }
                    arrayList.add(intentM7622a2);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0448H6) m18964g()).m3294w();
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m18964g();
        layoutInflaterFactory2C0448H6.m3270B();
        FM1 fm1 = layoutInflaterFactory2C0448H6.f4095o;
        if (fm1 != null) {
            fm1.mo2601q(true);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onStart();
        ((LayoutInflaterFactory2C0448H6) m18964g()).m3287n(true, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, android.app.Activity
    public void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m18964g();
        layoutInflaterFactory2C0448H6.m3270B();
        FM1 fm1 = layoutInflaterFactory2C0448H6.f4095o;
        if (fm1 != null) {
            fm1.mo2601q(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m18964g().mo3286m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        FM1 fm1M18965h = m18965h();
        if (getWindow().hasFeature(0)) {
            if (fm1M18965h == null || !fm1M18965h.mo2596k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p000.AbstractActivityC0499Hv, android.app.Activity
    public final void setContentView(int i) {
        m18966i();
        m18964g().mo3283h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0448H6) m18964g()).f4078T = i;
    }

    @Override // p000.AbstractActivityC0499Hv, android.app.Activity
    public void setContentView(View view) {
        m18966i();
        m18964g().mo3284i(view);
    }

    @Override // p000.AbstractActivityC0499Hv, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m18966i();
        m18964g().mo3285j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
