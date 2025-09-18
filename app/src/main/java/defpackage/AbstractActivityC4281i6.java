package defpackage;

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
import androidx.fragment.app.l;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: i6 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC4281i6 extends l implements InterfaceC5821m6 {
    public H6 f;

    public AbstractActivityC4281i6() {
        getSavedStateRegistry().c("androidx:appcompat", new C3899g6(this));
        addOnContextAvailableListener(new C4090h6(this));
    }

    @Override // defpackage.AbstractActivityC0629Hv, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        i();
        H6 h6 = (H6) g();
        h6.w();
        ((ViewGroup) h6.A.findViewById(R.id.content)).addView(view, layoutParams);
        h6.m.a(h6.l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        H6 h6 = (H6) g();
        h6.O = true;
        int i = h6.S;
        if (i == -100) {
            i = AbstractC7348u6.b;
        }
        int iD = h6.D(context, i);
        if (AbstractC7348u6.b(context) && AbstractC7348u6.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC7348u6.i) {
                    try {
                        C0675Ik0 c0675Ik0 = AbstractC7348u6.c;
                        if (c0675Ik0 == null) {
                            if (AbstractC7348u6.d == null) {
                                AbstractC7348u6.d = C0675Ik0.b(AbstractC2136aS.d(context));
                            }
                            if (!AbstractC7348u6.d.a.isEmpty()) {
                                AbstractC7348u6.c = AbstractC7348u6.d;
                            }
                        } else if (!c0675Ik0.equals(AbstractC7348u6.d)) {
                            C0675Ik0 c0675Ik02 = AbstractC7348u6.c;
                            AbstractC7348u6.d = c0675Ik02;
                            AbstractC2136aS.c(context, c0675Ik02.a.a());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC7348u6.f) {
                AbstractC7348u6.a.execute(new RunnableC6585q6(context, 0));
            }
        }
        C0675Ik0 c0675Ik0P = H6.p(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(H6.t(context, iD, c0675Ik0P, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C1417Ry) {
            try {
                ((C1417Ry) context).a(H6.t(context, iD, c0675Ik0P, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (H6.u1) {
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
                        AbstractC8109y6.a(configuration3, configuration4, configuration);
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
            Configuration configurationT = H6.t(context, iD, c0675Ik0P, configuration, true);
            C1417Ry c1417Ry = new C1417Ry(context, ru.mes.dnevnik.R.style.Theme_AppCompat_Empty);
            c1417Ry.a(configurationT);
            try {
                if (context.getTheme() != null) {
                    IQ1.c(c1417Ry.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c1417Ry;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        FM1 fm1H = h();
        if (getWindow().hasFeature(0)) {
            if (fm1H == null || !fm1H.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.AbstractActivityC0551Gv, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int keyCode = keyEvent.getKeyCode();
        FM1 fm1H = h();
        if (keyCode == 82 && fm1H != null && fm1H.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H6 h6 = (H6) g();
        h6.w();
        return h6.l.findViewById(i);
    }

    public final AbstractC7348u6 g() {
        if (this.f == null) {
            ExecutorC7157t6 executorC7157t6 = AbstractC7348u6.a;
            this.f = new H6(this, null, this, this);
        }
        return this.f;
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H6 h6 = (H6) g();
        if (h6.p == null) {
            h6.B();
            FM1 fm1 = h6.o;
            h6.p = new C8111y61(fm1 != null ? fm1.e() : h6.k);
        }
        return h6.p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC7655vi1.a;
        return super.getResources();
    }

    public final FM1 h() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H6 h6 = (H6) g();
        h6.B();
        return h6.o;
    }

    public final void i() {
        O02.b(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        O90.f(decorView, "<this>");
        decorView.setTag(ru.mes.dnevnik.R.id.view_tree_view_model_store_owner, this);
        Q02.b(getWindow().getDecorView(), this);
        P02.f(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        g().a();
    }

    public final void j(Toolbar toolbar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H6 h6 = (H6) g();
        if (h6.j instanceof Activity) {
            h6.B();
            FM1 fm1 = h6.o;
            if (fm1 instanceof C8240yn1) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            h6.p = null;
            if (fm1 != null) {
                fm1.h();
            }
            h6.o = null;
            if (toolbar != null) {
                Object obj = h6.j;
                C3612eb1 c3612eb1 = new C3612eb1(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : h6.q, h6.m);
                h6.o = c3612eb1;
                h6.m.b = c3612eb1.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                h6.m.b = null;
            }
            h6.a();
        }
    }

    @Override // defpackage.AbstractActivityC0629Hv, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        H6 h6 = (H6) g();
        if (h6.F && h6.z) {
            h6.B();
            FM1 fm1 = h6.o;
            if (fm1 != null) {
                fm1.g();
            }
        }
        J6 j6A = J6.a();
        Context context = h6.k;
        synchronized (j6A) {
            j6A.a.l(context);
        }
        h6.R = new Configuration(h6.k.getResources().getConfiguration());
        h6.n(false, false);
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        g().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.l, defpackage.AbstractActivityC0629Hv, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intent intentA;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        FM1 fm1H = h();
        if (menuItem.getItemId() == 16908332 && fm1H != null && (fm1H.d() & 4) != 0 && (intentA = TB1.a(this)) != null) {
            if (!shouldUpRecreateTask(intentA)) {
                navigateUpTo(intentA);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentA2 = TB1.a(this);
            if (intentA2 == null) {
                intentA2 = TB1.a(this);
            }
            if (intentA2 != null) {
                ComponentName component = intentA2.getComponent();
                if (component == null) {
                    component = intentA2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentB = TB1.b(this, component);
                    while (intentB != null) {
                        arrayList.add(size, intentB);
                        intentB = TB1.b(this, intentB.getComponent());
                    }
                    arrayList.add(intentA2);
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
        ((H6) g()).w();
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        H6 h6 = (H6) g();
        h6.B();
        FM1 fm1 = h6.o;
        if (fm1 != null) {
            fm1.q(true);
        }
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onStart();
        ((H6) g()).n(true, false);
    }

    @Override // androidx.fragment.app.l, android.app.Activity
    public void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        H6 h6 = (H6) g();
        h6.B();
        FM1 fm1 = h6.o;
        if (fm1 != null) {
            fm1.q(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        g().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        FM1 fm1H = h();
        if (getWindow().hasFeature(0)) {
            if (fm1H == null || !fm1H.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.AbstractActivityC0629Hv, android.app.Activity
    public final void setContentView(int i) {
        i();
        g().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((H6) g()).T = i;
    }

    @Override // defpackage.AbstractActivityC0629Hv, android.app.Activity
    public void setContentView(View view) {
        i();
        g().i(view);
    }

    @Override // defpackage.AbstractActivityC0629Hv, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        g().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
