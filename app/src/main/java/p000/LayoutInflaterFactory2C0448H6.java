package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: H6 */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0448H6 extends AbstractC6928u6 implements InterfaceC7346Aq0, LayoutInflater.Factory2 {

    /* renamed from: s1 */
    public static final L01 f4056s1 = new L01();

    /* renamed from: t1 */
    public static final int[] f4057t1 = {R.attr.windowBackground};

    /* renamed from: u1 */
    public static final boolean f4058u1 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A */
    public ViewGroup f4059A;

    /* renamed from: B */
    public TextView f4060B;

    /* renamed from: C */
    public View f4061C;

    /* renamed from: D */
    public boolean f4062D;

    /* renamed from: E */
    public boolean f4063E;

    /* renamed from: F */
    public boolean f4064F;

    /* renamed from: G */
    public boolean f4065G;

    /* renamed from: H */
    public boolean f4066H;

    /* renamed from: I */
    public boolean f4067I;

    /* renamed from: J */
    public boolean f4068J;

    /* renamed from: K */
    public boolean f4069K;

    /* renamed from: L */
    public C0385G6[] f4070L;

    /* renamed from: M */
    public C0385G6 f4071M;

    /* renamed from: N */
    public boolean f4072N;

    /* renamed from: O */
    public boolean f4073O;

    /* renamed from: P */
    public boolean f4074P;

    /* renamed from: Q */
    public boolean f4075Q;

    /* renamed from: R */
    public Configuration f4076R;

    /* renamed from: S */
    public final int f4077S;

    /* renamed from: T */
    public int f4078T;

    /* renamed from: U */
    public int f4079U;

    /* renamed from: V */
    public boolean f4080V;

    /* renamed from: W */
    public C0133C6 f4081W;

    /* renamed from: X */
    public C0133C6 f4082X;

    /* renamed from: Y */
    public boolean f4083Y;

    /* renamed from: Z */
    public int f4084Z;

    /* renamed from: b0 */
    public boolean f4086b0;

    /* renamed from: c0 */
    public Rect f4087c0;

    /* renamed from: d0 */
    public Rect f4088d0;

    /* renamed from: e0 */
    public C0008A7 f4089e0;

    /* renamed from: j */
    public final Object f4090j;

    /* renamed from: k */
    public final Context f4091k;

    /* renamed from: l */
    public Window f4092l;

    /* renamed from: m */
    public WindowCallbackC0070B6 f4093m;

    /* renamed from: n */
    public final Object f4094n;

    /* renamed from: o */
    public FM1 f4095o;

    /* renamed from: p */
    public C11757y61 f4096p;

    /* renamed from: q */
    public CharSequence f4097q;

    /* renamed from: q1 */
    public OnBackInvokedDispatcher f4098q1;

    /* renamed from: r */
    public InterfaceC3915dE f4099r;

    /* renamed from: r1 */
    public OnBackInvokedCallback f4100r1;

    /* renamed from: s */
    public QQ0 f4101s;

    /* renamed from: t */
    public C9196e41 f4102t;

    /* renamed from: u */
    public AbstractC6798s2 f4103u;

    /* renamed from: v */
    public ActionBarContextView f4104v;

    /* renamed from: w */
    public PopupWindow f4105w;

    /* renamed from: x */
    public RunnableC6991v6 f4106x;

    /* renamed from: z */
    public boolean f4108z;

    /* renamed from: y */
    public C10690pl1 f4107y = null;

    /* renamed from: a0 */
    public final RunnableC6991v6 f4085a0 = new RunnableC6991v6(this, 0);

    public LayoutInflaterFactory2C0448H6(Context context, Window window, InterfaceC6405m6 interfaceC6405m6, Object obj) {
        AbstractActivityC4221i6 abstractActivityC4221i6;
        this.f4077S = -100;
        this.f4091k = context;
        this.f4090j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC4221i6)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC4221i6 = (AbstractActivityC4221i6) context;
                    break;
                }
            }
            abstractActivityC4221i6 = null;
            if (abstractActivityC4221i6 != null) {
                this.f4077S = ((LayoutInflaterFactory2C0448H6) abstractActivityC4221i6.m18964g()).f4077S;
            }
        }
        if (this.f4077S == -100) {
            L01 l01 = f4056s1;
            Integer num = (Integer) l01.getOrDefault(this.f4090j.getClass().getName(), null);
            if (num != null) {
                this.f4077S = num.intValue();
                l01.remove(this.f4090j.getClass().getName());
            }
        }
        if (window != null) {
            m3288o(window);
        }
        C0574J6.m4156d();
    }

    /* renamed from: p */
    public static C7750Ik0 m3266p(Context context) {
        C7750Ik0 c7750Ik0;
        C7750Ik0 c7750Ik0M3994b;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c7750Ik0 = AbstractC6928u6.f43506c) == null) {
            return null;
        }
        C7750Ik0 c7750Ik0M3268z = m3268z(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC7854Kk0 interfaceC7854Kk0 = c7750Ik0.f5121a;
        int i2 = 0;
        if (i < 24) {
            c7750Ik0M3994b = interfaceC7854Kk0.isEmpty() ? C7750Ik0.f5120b : C7750Ik0.m3994b(AbstractC7117x6.m25759b(interfaceC7854Kk0.get(0)));
        } else if (interfaceC7854Kk0.isEmpty()) {
            c7750Ik0M3994b = C7750Ik0.f5120b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i2 < c7750Ik0M3268z.f5121a.size() + interfaceC7854Kk0.size()) {
                Locale locale = i2 < interfaceC7854Kk0.size() ? interfaceC7854Kk0.get(i2) : c7750Ik0M3268z.f5121a.get(i2 - interfaceC7854Kk0.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            c7750Ik0M3994b = C7750Ik0.m3993a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return c7750Ik0M3994b.f5121a.isEmpty() ? c7750Ik0M3268z : c7750Ik0M3994b;
    }

    /* renamed from: t */
    public static Configuration m3267t(Context context, int i, C7750Ik0 c7750Ik0, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c7750Ik0 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC7180y6.m26047d(configuration2, c7750Ik0);
            } else {
                InterfaceC7854Kk0 interfaceC7854Kk0 = c7750Ik0.f5121a;
                configuration2.setLocale(interfaceC7854Kk0.get(0));
                configuration2.setLayoutDirection(interfaceC7854Kk0.get(0));
            }
        }
        return configuration2;
    }

    /* renamed from: z */
    public static C7750Ik0 m3268z(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC7180y6.m26045b(configuration) : C7750Ik0.m3994b(AbstractC7117x6.m25759b(configuration.locale));
    }

    /* renamed from: A */
    public final C0385G6 m3269A(int i) {
        C0385G6[] c0385g6Arr = this.f4070L;
        if (c0385g6Arr == null || c0385g6Arr.length <= i) {
            C0385G6[] c0385g6Arr2 = new C0385G6[i + 1];
            if (c0385g6Arr != null) {
                System.arraycopy(c0385g6Arr, 0, c0385g6Arr2, 0, c0385g6Arr.length);
            }
            this.f4070L = c0385g6Arr2;
            c0385g6Arr = c0385g6Arr2;
        }
        C0385G6 c0385g6 = c0385g6Arr[i];
        if (c0385g6 != null) {
            return c0385g6;
        }
        C0385G6 c0385g62 = new C0385G6();
        c0385g62.f3569a = i;
        c0385g62.f3582n = false;
        c0385g6Arr[i] = c0385g62;
        return c0385g62;
    }

    /* renamed from: B */
    public final void m3270B() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m3294w();
        if (this.f4064F && this.f4095o == null) {
            Object obj = this.f4090j;
            if (obj instanceof Activity) {
                this.f4095o = new C11843yn1((Activity) obj, this.f4065G);
            } else if (obj instanceof Dialog) {
                this.f4095o = new C11843yn1((Dialog) obj);
            }
            FM1 fm1 = this.f4095o;
            if (fm1 != null) {
                fm1.mo2597m(this.f4086b0);
            }
        }
    }

    /* renamed from: C */
    public final void m3271C(int i) {
        this.f4084Z = (1 << i) | this.f4084Z;
        if (this.f4083Y) {
            return;
        }
        View decorView = this.f4092l.getDecorView();
        RunnableC6991v6 runnableC6991v6 = this.f4085a0;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        decorView.postOnAnimation(runnableC6991v6);
        this.f4083Y = true;
    }

    /* renamed from: D */
    public final int m3272D(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return m3296y(context).mo982e();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f4082X == null) {
                    this.f4082X = new C0133C6(this, context);
                }
                return this.f4082X.mo982e();
            }
        }
        return i;
    }

    /* renamed from: E */
    public final boolean m3273E() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = this.f4072N;
        this.f4072N = false;
        C0385G6 c0385g6M3269A = m3269A(0);
        if (c0385g6M3269A.f3581m) {
            if (!z) {
                m3291s(c0385g6M3269A, true);
            }
            return true;
        }
        AbstractC6798s2 abstractC6798s2 = this.f4103u;
        if (abstractC6798s2 != null) {
            abstractC6798s2.mo18163b();
            return true;
        }
        m3270B();
        FM1 fm1 = this.f4095o;
        return fm1 != null && fm1.mo2587b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0173, code lost:
    
        if (r3.f343f.getCount() > 0) goto L195;
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3274F(p000.C0385G6 r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0448H6.m3274F(G6, android.view.KeyEvent):void");
    }

    /* renamed from: G */
    public final boolean m3275G(C0385G6 c0385g6, int i, KeyEvent keyEvent) {
        MenuC7450Cq0 menuC7450Cq0;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0385g6.f3579k || m3276H(c0385g6, keyEvent)) && (menuC7450Cq0 = c0385g6.f3576h) != null) {
            return menuC7450Cq0.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m3276H(C0385G6 c0385g6, KeyEvent keyEvent) {
        InterfaceC3915dE interfaceC3915dE;
        InterfaceC3915dE interfaceC3915dE2;
        Resources.Theme themeNewTheme;
        InterfaceC3915dE interfaceC3915dE3;
        InterfaceC3915dE interfaceC3915dE4;
        if (this.f4075Q) {
            return false;
        }
        if (c0385g6.f3579k) {
            return true;
        }
        C0385G6 c0385g62 = this.f4071M;
        if (c0385g62 != null && c0385g62 != c0385g6) {
            m3291s(c0385g62, false);
        }
        Window.Callback callback = this.f4092l.getCallback();
        int i = c0385g6.f3569a;
        if (callback != null) {
            c0385g6.f3575g = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC3915dE4 = this.f4099r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3915dE4;
            actionBarOverlayLayout.m9842k();
            ((C9518gb1) actionBarOverlayLayout.f15819e).f27873l = true;
        }
        if (c0385g6.f3575g == null && (!z || !(this.f4095o instanceof C9262eb1))) {
            MenuC7450Cq0 menuC7450Cq0 = c0385g6.f3576h;
            if (menuC7450Cq0 == null || c0385g6.f3583o) {
                if (menuC7450Cq0 == null) {
                    Context context = this.f4091k;
                    if ((i == 0 || i == 108) && this.f4099r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(ru.mes.dnevnik.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(ru.mes.dnevnik.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(ru.mes.dnevnik.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C1130Ry c1130Ry = new C1130Ry(context, 0);
                            c1130Ry.getTheme().setTo(themeNewTheme);
                            context = c1130Ry;
                        }
                    }
                    MenuC7450Cq0 menuC7450Cq02 = new MenuC7450Cq0(context);
                    menuC7450Cq02.f1706e = this;
                    MenuC7450Cq0 menuC7450Cq03 = c0385g6.f3576h;
                    if (menuC7450Cq02 != menuC7450Cq03) {
                        if (menuC7450Cq03 != null) {
                            menuC7450Cq03.m1419r(c0385g6.f3577i);
                        }
                        c0385g6.f3576h = menuC7450Cq02;
                        C7332Aj0 c7332Aj0 = c0385g6.f3577i;
                        if (c7332Aj0 != null) {
                            menuC7450Cq02.m1403b(c7332Aj0, menuC7450Cq02.f1702a);
                        }
                    }
                    if (c0385g6.f3576h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC3915dE2 = this.f4099r) != null) {
                    if (this.f4101s == null) {
                        this.f4101s = new QQ0(this);
                    }
                    ((ActionBarOverlayLayout) interfaceC3915dE2).m9843l(c0385g6.f3576h, this.f4101s);
                }
                c0385g6.f3576h.m1424w();
                if (!callback.onCreatePanelMenu(i, c0385g6.f3576h)) {
                    MenuC7450Cq0 menuC7450Cq04 = c0385g6.f3576h;
                    if (menuC7450Cq04 != null) {
                        if (menuC7450Cq04 != null) {
                            menuC7450Cq04.m1419r(c0385g6.f3577i);
                        }
                        c0385g6.f3576h = null;
                    }
                    if (z && (interfaceC3915dE = this.f4099r) != null) {
                        ((ActionBarOverlayLayout) interfaceC3915dE).m9843l(null, this.f4101s);
                    }
                    return false;
                }
                c0385g6.f3583o = false;
            }
            c0385g6.f3576h.m1424w();
            Bundle bundle = c0385g6.f3584p;
            if (bundle != null) {
                c0385g6.f3576h.m1420s(bundle);
                c0385g6.f3584p = null;
            }
            if (!callback.onPreparePanel(0, c0385g6.f3575g, c0385g6.f3576h)) {
                if (z && (interfaceC3915dE3 = this.f4099r) != null) {
                    ((ActionBarOverlayLayout) interfaceC3915dE3).m9843l(null, this.f4101s);
                }
                c0385g6.f3576h.m1423v();
                return false;
            }
            c0385g6.f3576h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c0385g6.f3576h.m1423v();
        }
        c0385g6.f3579k = true;
        c0385g6.f3580l = false;
        this.f4071M = c0385g6;
        return true;
    }

    /* renamed from: I */
    public final void m3277I() {
        if (this.f4108z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: J */
    public final void m3278J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f4098q1 != null && (m3269A(0).f3581m || this.f4103u != null)) {
                z = true;
            }
            if (z && this.f4100r1 == null) {
                this.f4100r1 = AbstractC0007A6.m51b(this.f4098q1, this);
            } else {
                if (z || (onBackInvokedCallback = this.f4100r1) == null) {
                    return;
                }
                AbstractC0007A6.m52c(this.f4098q1, onBackInvokedCallback);
                this.f4100r1 = null;
            }
        }
    }

    @Override // p000.AbstractC6928u6
    /* renamed from: a */
    public final void mo3279a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f4095o != null) {
            m3270B();
            if (this.f4095o.mo2591f()) {
                return;
            }
            m3271C(0);
        }
    }

    @Override // p000.AbstractC6928u6
    /* renamed from: c */
    public final void mo3280c() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strM7624c;
        this.f4073O = true;
        m3287n(false, true);
        m3295x();
        Object obj = this.f4090j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM7624c = TB1.m7624c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM7624c = null;
            }
            if (strM7624c != null) {
                FM1 fm1 = this.f4095o;
                if (fm1 == null) {
                    this.f4086b0 = true;
                } else {
                    fm1.mo2597m(true);
                }
            }
            synchronized (AbstractC6928u6.f43511h) {
                AbstractC6928u6.m25107e(this);
                AbstractC6928u6.f43510g.add(new WeakReference(this));
            }
        }
        this.f4076R = new Configuration(this.f4091k.getResources().getConfiguration());
        this.f4074P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x004d  */
    @Override // p000.AbstractC6928u6
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3281d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4090j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = p000.AbstractC6928u6.f43511h
            monitor-enter(r0)
            p000.AbstractC6928u6.m25107e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f4083Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f4092l
            android.view.View r0 = r0.getDecorView()
            v6 r1 = r3.f4085a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f4075Q = r0
            int r0 = r3.f4077S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f4090j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            L01 r0 = p000.LayoutInflaterFactory2C0448H6.f4056s1
            java.lang.Object r1 = r3.f4090j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f4077S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            L01 r0 = p000.LayoutInflaterFactory2C0448H6.f4056s1
            java.lang.Object r1 = r3.f4090j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            FM1 r0 = r3.f4095o
            if (r0 == 0) goto L63
            r0.mo2593h()
        L63:
            C6 r0 = r3.f4081W
            if (r0 == 0) goto L6a
            r0.m2027c()
        L6a:
            C6 r0 = r3.f4082X
            if (r0 == 0) goto L71
            r0.m2027c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0448H6.mo3281d():void");
    }

    @Override // p000.AbstractC6928u6
    /* renamed from: f */
    public final boolean mo3282f(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f4068J && i == 108) {
            return false;
        }
        if (this.f4064F && i == 1) {
            this.f4064F = false;
        }
        if (i == 1) {
            m3277I();
            this.f4068J = true;
            return true;
        }
        if (i == 2) {
            m3277I();
            this.f4062D = true;
            return true;
        }
        if (i == 5) {
            m3277I();
            this.f4063E = true;
            return true;
        }
        if (i == 10) {
            m3277I();
            this.f4066H = true;
            return true;
        }
        if (i == 108) {
            m3277I();
            this.f4064F = true;
            return true;
        }
        if (i != 109) {
            return this.f4092l.requestFeature(i);
        }
        m3277I();
        this.f4065G = true;
        return true;
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: g */
    public final boolean mo346g(MenuC7450Cq0 menuC7450Cq0, MenuItem menuItem) {
        C0385G6 c0385g6;
        Window.Callback callback = this.f4092l.getCallback();
        if (callback != null && !this.f4075Q) {
            MenuC7450Cq0 menuC7450Cq0Mo1412k = menuC7450Cq0.mo1412k();
            C0385G6[] c0385g6Arr = this.f4070L;
            int length = c0385g6Arr != null ? c0385g6Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0385g6 = c0385g6Arr[i];
                    if (c0385g6 != null && c0385g6.f3576h == menuC7450Cq0Mo1412k) {
                        break;
                    }
                    i++;
                } else {
                    c0385g6 = null;
                    break;
                }
            }
            if (c0385g6 != null) {
                return callback.onMenuItemSelected(c0385g6.f3569a, menuItem);
            }
        }
        return false;
    }

    @Override // p000.AbstractC6928u6
    /* renamed from: h */
    public final void mo3283h(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m3294w();
        ViewGroup viewGroup = (ViewGroup) this.f4059A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4091k).inflate(i, viewGroup);
        this.f4093m.m492a(this.f4092l.getCallback());
    }

    @Override // p000.AbstractC6928u6
    /* renamed from: i */
    public final void mo3284i(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m3294w();
        ViewGroup viewGroup = (ViewGroup) this.f4059A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4093m.m492a(this.f4092l.getCallback());
    }

    @Override // p000.AbstractC6928u6
    /* renamed from: j */
    public final void mo3285j(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m3294w();
        ViewGroup viewGroup = (ViewGroup) this.f4059A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4093m.m492a(this.f4092l.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0048, code lost:
    
        if (r6.m23312j() != false) goto L75;
     */
    @Override // p000.InterfaceC7346Aq0
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo347k(p000.MenuC7450Cq0 r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            dE r6 = r5.f4099r
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.m9842k()
            eE r6 = r6.f15819e
            gb1 r6 = (p000.C9518gb1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f27862a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f15889a
            if (r6 == 0) goto Ld3
            boolean r6 = r6.f15845s
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.f4091k
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            dE r6 = r5.f4099r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.m9842k()
            eE r6 = r6.f15819e
            gb1 r6 = (p000.C9518gb1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f27862a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f15889a
            if (r6 == 0) goto Ld3
            o2 r6 = r6.f15846t
            if (r6 == 0) goto Ld3
            XZ r2 = r6.f38710u
            if (r2 != 0) goto L4a
            boolean r6 = r6.m23312j()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.f4092l
            android.view.Window$Callback r6 = r6.getCallback()
            dE r2 = r5.f4099r
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.m9842k()
            eE r2 = r2.f15819e
            gb1 r2 = (p000.C9518gb1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f27862a
            boolean r2 = r2.m9864p()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            dE r0 = r5.f4099r
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.m9842k()
            eE r0 = r0.f15819e
            gb1 r0 = (p000.C9518gb1) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f27862a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f15889a
            if (r0 == 0) goto L7e
            o2 r0 = r0.f15846t
            if (r0 == 0) goto L7e
            boolean r0 = r0.m23311b()
        L7e:
            boolean r0 = r5.f4075Q
            if (r0 != 0) goto Le0
            G6 r0 = r5.m3269A(r1)
            Cq0 r0 = r0.f3576h
            r6.onPanelClosed(r3, r0)
            goto Le0
        L8c:
            if (r6 == 0) goto Le0
            boolean r2 = r5.f4075Q
            if (r2 != 0) goto Le0
            boolean r2 = r5.f4083Y
            if (r2 == 0) goto La9
            int r2 = r5.f4084Z
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.f4092l
            android.view.View r0 = r0.getDecorView()
            v6 r2 = r5.f4085a0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            G6 r0 = r5.m3269A(r1)
            Cq0 r2 = r0.f3576h
            if (r2 == 0) goto Le0
            boolean r4 = r0.f3583o
            if (r4 != 0) goto Le0
            android.view.View r4 = r0.f3575g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Le0
            Cq0 r0 = r0.f3576h
            r6.onMenuOpened(r3, r0)
            dE r6 = r5.f4099r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.m9842k()
            eE r6 = r6.f15819e
            gb1 r6 = (p000.C9518gb1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f27862a
            r6.m9870v()
            goto Le0
        Ld3:
            G6 r6 = r5.m3269A(r1)
            r6.f3582n = r0
            r5.m3291s(r6, r1)
            r0 = 0
            r5.m3274F(r6, r0)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0448H6.mo347k(Cq0):void");
    }

    @Override // p000.AbstractC6928u6
    /* renamed from: m */
    public final void mo3286m(CharSequence charSequence) {
        this.f4097q = charSequence;
        InterfaceC3915dE interfaceC3915dE = this.f4099r;
        if (interfaceC3915dE != null) {
            interfaceC3915dE.setWindowTitle(charSequence);
            return;
        }
        FM1 fm1 = this.f4095o;
        if (fm1 != null) {
            fm1.mo2603s(charSequence);
            return;
        }
        TextView textView = this.f4060B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00f8  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3287n(boolean r17, boolean r18) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0448H6.m3287n(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0074  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3288o(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.f4092l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof p000.WindowCallbackC0070B6
            if (r2 != 0) goto L7a
            B6 r1 = new B6
            r1.<init>(r7, r0)
            r7.f4093m = r1
            r8.setCallback(r1)
            int[] r0 = p000.LayoutInflaterFactory2C0448H6.f4057t1
            android.content.Context r1 = r7.f4091k
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            J6 r4 = p000.C0574J6.m4154a()
            monitor-enter(r4)
            wS0 r5 = r4.f5338a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.m25626g(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.f4092l = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f4098q1
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.f4100r1
            if (r0 == 0) goto L5f
            p000.AbstractC0007A6.m52c(r8, r0)
            r7.f4100r1 = r2
        L5f:
            java.lang.Object r8 = r7.f4090j
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = p000.AbstractC0007A6.m50a(r8)
            r7.f4098q1 = r8
            goto L76
        L74:
            r7.f4098q1 = r2
        L76:
            r7.m3278J()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0448H6.m3288o(android.view.Window):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x007b  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0448H6.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: q */
    public final void m3289q(int i, C0385G6 c0385g6, MenuC7450Cq0 menuC7450Cq0) {
        if (menuC7450Cq0 == null) {
            if (c0385g6 == null && i >= 0) {
                C0385G6[] c0385g6Arr = this.f4070L;
                if (i < c0385g6Arr.length) {
                    c0385g6 = c0385g6Arr[i];
                }
            }
            if (c0385g6 != null) {
                menuC7450Cq0 = c0385g6.f3576h;
            }
        }
        if ((c0385g6 == null || c0385g6.f3581m) && !this.f4075Q) {
            WindowCallbackC0070B6 windowCallbackC0070B6 = this.f4093m;
            Window.Callback callback = this.f4092l.getCallback();
            windowCallbackC0070B6.getClass();
            try {
                windowCallbackC0070B6.f567e = true;
                callback.onPanelClosed(i, menuC7450Cq0);
            } finally {
                windowCallbackC0070B6.f567e = false;
            }
        }
    }

    /* renamed from: r */
    public final void m3290r(MenuC7450Cq0 menuC7450Cq0) {
        C6527o2 c6527o2;
        if (this.f4069K) {
            return;
        }
        this.f4069K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4099r;
        actionBarOverlayLayout.m9842k();
        ActionMenuView actionMenuView = ((C9518gb1) actionBarOverlayLayout.f15819e).f27862a.f15889a;
        if (actionMenuView != null && (c6527o2 = actionMenuView.f15846t) != null) {
            c6527o2.m23311b();
            C6338l2 c6338l2 = c6527o2.f38709t;
            if (c6338l2 != null && c6338l2.m7121b()) {
                c6338l2.f10453i.dismiss();
            }
        }
        Window.Callback callback = this.f4092l.getCallback();
        if (callback != null && !this.f4075Q) {
            callback.onPanelClosed(108, menuC7450Cq0);
        }
        this.f4069K = false;
    }

    /* renamed from: s */
    public final void m3291s(C0385G6 c0385g6, boolean z) {
        C0322F6 c0322f6;
        InterfaceC3915dE interfaceC3915dE;
        if (z && c0385g6.f3569a == 0 && (interfaceC3915dE = this.f4099r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3915dE;
            actionBarOverlayLayout.m9842k();
            if (((C9518gb1) actionBarOverlayLayout.f15819e).f27862a.m9864p()) {
                m3290r(c0385g6.f3576h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f4091k.getSystemService("window");
        if (windowManager != null && c0385g6.f3581m && (c0322f6 = c0385g6.f3573e) != null) {
            windowManager.removeView(c0322f6);
            if (z) {
                m3289q(c0385g6.f3569a, c0385g6, null);
            }
        }
        c0385g6.f3579k = false;
        c0385g6.f3580l = false;
        c0385g6.f3581m = false;
        c0385g6.f3574f = null;
        c0385g6.f3582n = true;
        if (this.f4071M == c0385g6) {
            this.f4071M = null;
        }
        if (c0385g6.f3569a == 0) {
            m3278J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x00f2  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3292u(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0448H6.m3292u(android.view.KeyEvent):boolean");
    }

    /* renamed from: v */
    public final void m3293v(int i) {
        C0385G6 c0385g6M3269A = m3269A(i);
        if (c0385g6M3269A.f3576h != null) {
            Bundle bundle = new Bundle();
            c0385g6M3269A.f3576h.m1421t(bundle);
            if (bundle.size() > 0) {
                c0385g6M3269A.f3584p = bundle;
            }
            c0385g6M3269A.f3576h.m1424w();
            c0385g6M3269A.f3576h.clear();
        }
        c0385g6M3269A.f3583o = true;
        c0385g6M3269A.f3582n = true;
        if ((i == 108 || i == 0) && this.f4099r != null) {
            C0385G6 c0385g6M3269A2 = m3269A(0);
            c0385g6M3269A2.f3579k = false;
            m3276H(c0385g6M3269A2, null);
        }
    }

    /* renamed from: w */
    public final void m3294w() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.f4108z) {
            return;
        }
        int[] iArr = AbstractC8704aH0.f15432j;
        Context context = this.f4091k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo3282f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo3282f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo3282f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo3282f(10);
        }
        this.f4067I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m3295x();
        this.f4092l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f4068J) {
            viewGroup = this.f4066H ? (ViewGroup) layoutInflaterFrom.inflate(ru.mes.dnevnik.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(ru.mes.dnevnik.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f4067I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ru.mes.dnevnik.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f4065G = false;
            this.f4064F = false;
        } else if (this.f4064F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ru.mes.dnevnik.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1130Ry(context, typedValue.resourceId) : context).inflate(ru.mes.dnevnik.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC3915dE interfaceC3915dE = (InterfaceC3915dE) viewGroup.findViewById(ru.mes.dnevnik.R.id.decor_content_parent);
            this.f4099r = interfaceC3915dE;
            interfaceC3915dE.setWindowCallback(this.f4092l.getCallback());
            if (this.f4065G) {
                ((ActionBarOverlayLayout) this.f4099r).m9841j(109);
            }
            if (this.f4062D) {
                ((ActionBarOverlayLayout) this.f4099r).m9841j(2);
            }
            if (this.f4063E) {
                ((ActionBarOverlayLayout) this.f4099r).m9841j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f4064F);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f4065G);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f4067I);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f4066H);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(AbstractC7222ym.m26236m(sb, this.f4068J, " }"));
        }
        C1643a6 c1643a6 = new C1643a6(1, this);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9536gk1.m18626u(viewGroup, c1643a6);
        if (this.f4099r == null) {
            this.f4060B = (TextView) viewGroup.findViewById(ru.mes.dnevnik.R.id.title);
        }
        boolean z = AbstractC7337Al1.f354a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ru.mes.dnevnik.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f4092l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f4092l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C8170Qm0(2, this));
        this.f4059A = viewGroup;
        Object obj = this.f4090j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f4097q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC3915dE interfaceC3915dE2 = this.f4099r;
            if (interfaceC3915dE2 != null) {
                interfaceC3915dE2.setWindowTitle(title);
            } else {
                FM1 fm1 = this.f4095o;
                if (fm1 != null) {
                    fm1.mo2603s(title);
                } else {
                    TextView textView = this.f4060B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f4059A.findViewById(R.id.content);
        View decorView = this.f4092l.getDecorView();
        contentFrameLayout2.f15863g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f4108z = true;
        C0385G6 c0385g6M3269A = m3269A(0);
        if (this.f4075Q || c0385g6M3269A.f3576h != null) {
            return;
        }
        m3271C(108);
    }

    /* renamed from: x */
    public final void m3295x() {
        if (this.f4092l == null) {
            Object obj = this.f4090j;
            if (obj instanceof Activity) {
                m3288o(((Activity) obj).getWindow());
            }
        }
        if (this.f4092l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: y */
    public final AbstractC0259E6 m3296y(Context context) {
        if (this.f4081W == null) {
            if (C10189lr0.f37321h == null) {
                Context applicationContext = context.getApplicationContext();
                C10189lr0.f37321h = new C10189lr0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4081W = new C0133C6(this, C10189lr0.f37321h);
        }
        return this.f4081W;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
