package defpackage;

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

/* loaded from: classes.dex */
public final class H6 extends AbstractC7348u6 implements InterfaceC0069Aq0, LayoutInflater.Factory2 {
    public static final L01 s1 = new L01();
    public static final int[] t1 = {R.attr.windowBackground};
    public static final boolean u1 = !"robolectric".equals(Build.FINGERPRINT);
    public ViewGroup A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public G6[] L;
    public G6 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Configuration R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public C6 W;
    public C6 X;
    public boolean Y;
    public int Z;
    public boolean b0;
    public Rect c0;
    public Rect d0;
    public A7 e0;
    public final Object j;
    public final Context k;
    public Window l;
    public B6 m;
    public final Object n;
    public FM1 o;
    public C8111y61 p;
    public CharSequence q;
    public OnBackInvokedDispatcher q1;
    public InterfaceC3351dE r;
    public OnBackInvokedCallback r1;
    public QQ0 s;
    public C3513e41 t;
    public AbstractC6952s2 u;
    public ActionBarContextView v;
    public PopupWindow w;
    public RunnableC7539v6 x;
    public boolean z;
    public C6519pl1 y = null;
    public final RunnableC7539v6 a0 = new RunnableC7539v6(this, 0);

    public H6(Context context, Window window, InterfaceC5821m6 interfaceC5821m6, Object obj) {
        AbstractActivityC4281i6 abstractActivityC4281i6;
        this.S = -100;
        this.k = context;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC4281i6)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC4281i6 = (AbstractActivityC4281i6) context;
                    break;
                }
            }
            abstractActivityC4281i6 = null;
            if (abstractActivityC4281i6 != null) {
                this.S = ((H6) abstractActivityC4281i6.g()).S;
            }
        }
        if (this.S == -100) {
            L01 l01 = s1;
            Integer num = (Integer) l01.getOrDefault(this.j.getClass().getName(), null);
            if (num != null) {
                this.S = num.intValue();
                l01.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        J6.d();
    }

    public static C0675Ik0 p(Context context) {
        C0675Ik0 c0675Ik0;
        C0675Ik0 c0675Ik0B;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c0675Ik0 = AbstractC7348u6.c) == null) {
            return null;
        }
        C0675Ik0 c0675Ik0Z = z(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC0831Kk0 interfaceC0831Kk0 = c0675Ik0.a;
        int i2 = 0;
        if (i < 24) {
            c0675Ik0B = interfaceC0831Kk0.isEmpty() ? C0675Ik0.b : C0675Ik0.b(AbstractC7919x6.b(interfaceC0831Kk0.get(0)));
        } else if (interfaceC0831Kk0.isEmpty()) {
            c0675Ik0B = C0675Ik0.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i2 < c0675Ik0Z.a.size() + interfaceC0831Kk0.size()) {
                Locale locale = i2 < interfaceC0831Kk0.size() ? interfaceC0831Kk0.get(i2) : c0675Ik0Z.a.get(i2 - interfaceC0831Kk0.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            c0675Ik0B = C0675Ik0.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return c0675Ik0B.a.isEmpty() ? c0675Ik0Z : c0675Ik0B;
    }

    public static Configuration t(Context context, int i, C0675Ik0 c0675Ik0, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c0675Ik0 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC8109y6.d(configuration2, c0675Ik0);
            } else {
                InterfaceC0831Kk0 interfaceC0831Kk0 = c0675Ik0.a;
                configuration2.setLocale(interfaceC0831Kk0.get(0));
                configuration2.setLayoutDirection(interfaceC0831Kk0.get(0));
            }
        }
        return configuration2;
    }

    public static C0675Ik0 z(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC8109y6.b(configuration) : C0675Ik0.b(AbstractC7919x6.b(configuration.locale));
    }

    public final G6 A(int i) {
        G6[] g6Arr = this.L;
        if (g6Arr == null || g6Arr.length <= i) {
            G6[] g6Arr2 = new G6[i + 1];
            if (g6Arr != null) {
                System.arraycopy(g6Arr, 0, g6Arr2, 0, g6Arr.length);
            }
            this.L = g6Arr2;
            g6Arr = g6Arr2;
        }
        G6 g6 = g6Arr[i];
        if (g6 != null) {
            return g6;
        }
        G6 g62 = new G6();
        g62.a = i;
        g62.n = false;
        g6Arr[i] = g62;
        return g62;
    }

    public final void B() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        if (this.F && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new C8240yn1((Activity) obj, this.G);
            } else if (obj instanceof Dialog) {
                this.o = new C8240yn1((Dialog) obj);
            }
            FM1 fm1 = this.o;
            if (fm1 != null) {
                fm1.m(this.b0);
            }
        }
    }

    public final void C(int i) {
        this.Z = (1 << i) | this.Z;
        if (this.Y) {
            return;
        }
        View decorView = this.l.getDecorView();
        RunnableC7539v6 runnableC7539v6 = this.a0;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        decorView.postOnAnimation(runnableC7539v6);
        this.Y = true;
    }

    public final int D(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return y(context).e();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.X == null) {
                    this.X = new C6(this, context);
                }
                return this.X.e();
            }
        }
        return i;
    }

    public final boolean E() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = this.N;
        this.N = false;
        G6 g6A = A(0);
        if (g6A.m) {
            if (!z) {
                s(g6A, true);
            }
            return true;
        }
        AbstractC6952s2 abstractC6952s2 = this.u;
        if (abstractC6952s2 != null) {
            abstractC6952s2.b();
            return true;
        }
        B();
        FM1 fm1 = this.o;
        return fm1 != null && fm1.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0173, code lost:
    
        if (r3.f.getCount() > 0) goto L195;
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(defpackage.G6 r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H6.F(G6, android.view.KeyEvent):void");
    }

    public final boolean G(G6 g6, int i, KeyEvent keyEvent) {
        MenuC0225Cq0 menuC0225Cq0;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((g6.k || H(g6, keyEvent)) && (menuC0225Cq0 = g6.h) != null) {
            return menuC0225Cq0.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean H(G6 g6, KeyEvent keyEvent) {
        InterfaceC3351dE interfaceC3351dE;
        InterfaceC3351dE interfaceC3351dE2;
        Resources.Theme themeNewTheme;
        InterfaceC3351dE interfaceC3351dE3;
        InterfaceC3351dE interfaceC3351dE4;
        if (this.Q) {
            return false;
        }
        if (g6.k) {
            return true;
        }
        G6 g62 = this.M;
        if (g62 != null && g62 != g6) {
            s(g62, false);
        }
        Window.Callback callback = this.l.getCallback();
        int i = g6.a;
        if (callback != null) {
            g6.g = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC3351dE4 = this.r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3351dE4;
            actionBarOverlayLayout.k();
            ((C3994gb1) actionBarOverlayLayout.e).l = true;
        }
        if (g6.g == null && (!z || !(this.o instanceof C3612eb1))) {
            MenuC0225Cq0 menuC0225Cq0 = g6.h;
            if (menuC0225Cq0 == null || g6.o) {
                if (menuC0225Cq0 == null) {
                    Context context = this.k;
                    if ((i == 0 || i == 108) && this.r != null) {
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
                            C1417Ry c1417Ry = new C1417Ry(context, 0);
                            c1417Ry.getTheme().setTo(themeNewTheme);
                            context = c1417Ry;
                        }
                    }
                    MenuC0225Cq0 menuC0225Cq02 = new MenuC0225Cq0(context);
                    menuC0225Cq02.e = this;
                    MenuC0225Cq0 menuC0225Cq03 = g6.h;
                    if (menuC0225Cq02 != menuC0225Cq03) {
                        if (menuC0225Cq03 != null) {
                            menuC0225Cq03.r(g6.i);
                        }
                        g6.h = menuC0225Cq02;
                        C0048Aj0 c0048Aj0 = g6.i;
                        if (c0048Aj0 != null) {
                            menuC0225Cq02.b(c0048Aj0, menuC0225Cq02.a);
                        }
                    }
                    if (g6.h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC3351dE2 = this.r) != null) {
                    if (this.s == null) {
                        this.s = new QQ0(this);
                    }
                    ((ActionBarOverlayLayout) interfaceC3351dE2).l(g6.h, this.s);
                }
                g6.h.w();
                if (!callback.onCreatePanelMenu(i, g6.h)) {
                    MenuC0225Cq0 menuC0225Cq04 = g6.h;
                    if (menuC0225Cq04 != null) {
                        if (menuC0225Cq04 != null) {
                            menuC0225Cq04.r(g6.i);
                        }
                        g6.h = null;
                    }
                    if (z && (interfaceC3351dE = this.r) != null) {
                        ((ActionBarOverlayLayout) interfaceC3351dE).l(null, this.s);
                    }
                    return false;
                }
                g6.o = false;
            }
            g6.h.w();
            Bundle bundle = g6.p;
            if (bundle != null) {
                g6.h.s(bundle);
                g6.p = null;
            }
            if (!callback.onPreparePanel(0, g6.g, g6.h)) {
                if (z && (interfaceC3351dE3 = this.r) != null) {
                    ((ActionBarOverlayLayout) interfaceC3351dE3).l(null, this.s);
                }
                g6.h.v();
                return false;
            }
            g6.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            g6.h.v();
        }
        g6.k = true;
        g6.l = false;
        this.M = g6;
        return true;
    }

    public final void I() {
        if (this.z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.q1 != null && (A(0).m || this.u != null)) {
                z = true;
            }
            if (z && this.r1 == null) {
                this.r1 = A6.b(this.q1, this);
            } else {
                if (z || (onBackInvokedCallback = this.r1) == null) {
                    return;
                }
                A6.c(this.q1, onBackInvokedCallback);
                this.r1 = null;
            }
        }
    }

    @Override // defpackage.AbstractC7348u6
    public final void a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.o != null) {
            B();
            if (this.o.f()) {
                return;
            }
            C(0);
        }
    }

    @Override // defpackage.AbstractC7348u6
    public final void c() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strC;
        this.O = true;
        n(false, true);
        x();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = TB1.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                FM1 fm1 = this.o;
                if (fm1 == null) {
                    this.b0 = true;
                } else {
                    fm1.m(true);
                }
            }
            synchronized (AbstractC7348u6.h) {
                AbstractC7348u6.e(this);
                AbstractC7348u6.g.add(new WeakReference(this));
            }
        }
        this.R = new Configuration(this.k.getResources().getConfiguration());
        this.P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x004d  */
    @Override // defpackage.AbstractC7348u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.AbstractC7348u6.h
            monitor-enter(r0)
            defpackage.AbstractC7348u6.e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            v6 r1 = r3.a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.Q = r0
            int r0 = r3.S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            L01 r0 = defpackage.H6.s1
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            L01 r0 = defpackage.H6.s1
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            FM1 r0 = r3.o
            if (r0 == 0) goto L63
            r0.h()
        L63:
            C6 r0 = r3.W
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            C6 r0 = r3.X
            if (r0 == 0) goto L71
            r0.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H6.d():void");
    }

    @Override // defpackage.AbstractC7348u6
    public final boolean f(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.J && i == 108) {
            return false;
        }
        if (this.F && i == 1) {
            this.F = false;
        }
        if (i == 1) {
            I();
            this.J = true;
            return true;
        }
        if (i == 2) {
            I();
            this.D = true;
            return true;
        }
        if (i == 5) {
            I();
            this.E = true;
            return true;
        }
        if (i == 10) {
            I();
            this.H = true;
            return true;
        }
        if (i == 108) {
            I();
            this.F = true;
            return true;
        }
        if (i != 109) {
            return this.l.requestFeature(i);
        }
        I();
        this.G = true;
        return true;
    }

    @Override // defpackage.InterfaceC0069Aq0
    public final boolean g(MenuC0225Cq0 menuC0225Cq0, MenuItem menuItem) {
        G6 g6;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.Q) {
            MenuC0225Cq0 menuC0225Cq0K = menuC0225Cq0.k();
            G6[] g6Arr = this.L;
            int length = g6Arr != null ? g6Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    g6 = g6Arr[i];
                    if (g6 != null && g6.h == menuC0225Cq0K) {
                        break;
                    }
                    i++;
                } else {
                    g6 = null;
                    break;
                }
            }
            if (g6 != null) {
                return callback.onMenuItemSelected(g6.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC7348u6
    public final void h(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.AbstractC7348u6
    public final void i(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.AbstractC7348u6
    public final void j(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0048, code lost:
    
        if (r6.j() != false) goto L75;
     */
    @Override // defpackage.InterfaceC0069Aq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.MenuC0225Cq0 r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            dE r6 = r5.r
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            eE r6 = r6.e
            gb1 r6 = (defpackage.C3994gb1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto Ld3
            boolean r6 = r6.s
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.k
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            dE r6 = r5.r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            eE r6 = r6.e
            gb1 r6 = (defpackage.C3994gb1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto Ld3
            o2 r6 = r6.t
            if (r6 == 0) goto Ld3
            XZ r2 = r6.u
            if (r2 != 0) goto L4a
            boolean r6 = r6.j()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.l
            android.view.Window$Callback r6 = r6.getCallback()
            dE r2 = r5.r
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            eE r2 = r2.e
            gb1 r2 = (defpackage.C3994gb1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            boolean r2 = r2.p()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            dE r0 = r5.r
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            eE r0 = r0.e
            gb1 r0 = (defpackage.C3994gb1) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L7e
            o2 r0 = r0.t
            if (r0 == 0) goto L7e
            boolean r0 = r0.b()
        L7e:
            boolean r0 = r5.Q
            if (r0 != 0) goto Le0
            G6 r0 = r5.A(r1)
            Cq0 r0 = r0.h
            r6.onPanelClosed(r3, r0)
            goto Le0
        L8c:
            if (r6 == 0) goto Le0
            boolean r2 = r5.Q
            if (r2 != 0) goto Le0
            boolean r2 = r5.Y
            if (r2 == 0) goto La9
            int r2 = r5.Z
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.l
            android.view.View r0 = r0.getDecorView()
            v6 r2 = r5.a0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            G6 r0 = r5.A(r1)
            Cq0 r2 = r0.h
            if (r2 == 0) goto Le0
            boolean r4 = r0.o
            if (r4 != 0) goto Le0
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Le0
            Cq0 r0 = r0.h
            r6.onMenuOpened(r3, r0)
            dE r6 = r5.r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            eE r6 = r6.e
            gb1 r6 = (defpackage.C3994gb1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            r6.v()
            goto Le0
        Ld3:
            G6 r6 = r5.A(r1)
            r6.n = r0
            r5.s(r6, r1)
            r0 = 0
            r5.F(r6, r0)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H6.k(Cq0):void");
    }

    @Override // defpackage.AbstractC7348u6
    public final void m(CharSequence charSequence) {
        this.q = charSequence;
        InterfaceC3351dE interfaceC3351dE = this.r;
        if (interfaceC3351dE != null) {
            interfaceC3351dE.setWindowTitle(charSequence);
            return;
        }
        FM1 fm1 = this.o;
        if (fm1 != null) {
            fm1.s(charSequence);
            return;
        }
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(boolean r17, boolean r18) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H6.n(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof defpackage.B6
            if (r2 != 0) goto L7a
            B6 r1 = new B6
            r1.<init>(r7, r0)
            r7.m = r1
            r8.setCallback(r1)
            int[] r0 = defpackage.H6.t1
            android.content.Context r1 = r7.k
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            J6 r4 = defpackage.J6.a()
            monitor-enter(r4)
            wS0 r5 = r4.a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.g(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
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
            r7.l = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.q1
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.r1
            if (r0 == 0) goto L5f
            defpackage.A6.c(r8, r0)
            r7.r1 = r2
        L5f:
            java.lang.Object r8 = r7.j
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = defpackage.A6.a(r8)
            r7.q1 = r8
            goto L76
        L74:
            r7.q1 = r2
        L76:
            r7.J()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H6.o(android.view.Window):void");
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H6.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void q(int i, G6 g6, MenuC0225Cq0 menuC0225Cq0) {
        if (menuC0225Cq0 == null) {
            if (g6 == null && i >= 0) {
                G6[] g6Arr = this.L;
                if (i < g6Arr.length) {
                    g6 = g6Arr[i];
                }
            }
            if (g6 != null) {
                menuC0225Cq0 = g6.h;
            }
        }
        if ((g6 == null || g6.m) && !this.Q) {
            B6 b6 = this.m;
            Window.Callback callback = this.l.getCallback();
            b6.getClass();
            try {
                b6.e = true;
                callback.onPanelClosed(i, menuC0225Cq0);
            } finally {
                b6.e = false;
            }
        }
    }

    public final void r(MenuC0225Cq0 menuC0225Cq0) {
        C6189o2 c6189o2;
        if (this.K) {
            return;
        }
        this.K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((C3994gb1) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (c6189o2 = actionMenuView.t) != null) {
            c6189o2.b();
            C5616l2 c5616l2 = c6189o2.t;
            if (c5616l2 != null && c5616l2.b()) {
                c5616l2.i.dismiss();
            }
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.Q) {
            callback.onPanelClosed(108, menuC0225Cq0);
        }
        this.K = false;
    }

    public final void s(G6 g6, boolean z) {
        F6 f6;
        InterfaceC3351dE interfaceC3351dE;
        if (z && g6.a == 0 && (interfaceC3351dE = this.r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3351dE;
            actionBarOverlayLayout.k();
            if (((C3994gb1) actionBarOverlayLayout.e).a.p()) {
                r(g6.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && g6.m && (f6 = g6.e) != null) {
            windowManager.removeView(f6);
            if (z) {
                q(g6.a, g6, null);
            }
        }
        g6.k = false;
        g6.l = false;
        g6.m = false;
        g6.f = null;
        g6.n = true;
        if (this.M == g6) {
            this.M = null;
        }
        if (g6.a == 0) {
            J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H6.u(android.view.KeyEvent):boolean");
    }

    public final void v(int i) {
        G6 g6A = A(i);
        if (g6A.h != null) {
            Bundle bundle = new Bundle();
            g6A.h.t(bundle);
            if (bundle.size() > 0) {
                g6A.p = bundle;
            }
            g6A.h.w();
            g6A.h.clear();
        }
        g6A.o = true;
        g6A.n = true;
        if ((i == 108 || i == 0) && this.r != null) {
            G6 g6A2 = A(0);
            g6A2.k = false;
            H(g6A2, null);
        }
    }

    public final void w() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.z) {
            return;
        }
        int[] iArr = AbstractC2104aH0.j;
        Context context = this.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            f(10);
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.J) {
            viewGroup = this.H ? (ViewGroup) layoutInflaterFrom.inflate(ru.mes.dnevnik.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(ru.mes.dnevnik.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ru.mes.dnevnik.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ru.mes.dnevnik.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1417Ry(context, typedValue.resourceId) : context).inflate(ru.mes.dnevnik.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC3351dE interfaceC3351dE = (InterfaceC3351dE) viewGroup.findViewById(ru.mes.dnevnik.R.id.decor_content_parent);
            this.r = interfaceC3351dE;
            interfaceC3351dE.setWindowCallback(this.l.getCallback());
            if (this.G) {
                ((ActionBarOverlayLayout) this.r).j(109);
            }
            if (this.D) {
                ((ActionBarOverlayLayout) this.r).j(2);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.F);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.G);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.I);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.H);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(AbstractC8235ym.m(sb, this.J, " }"));
        }
        C2070a6 c2070a6 = new C2070a6(1, this);
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        AbstractC4021gk1.u(viewGroup, c2070a6);
        if (this.r == null) {
            this.B = (TextView) viewGroup.findViewById(ru.mes.dnevnik.R.id.title);
        }
        boolean z = AbstractC0055Al1.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ru.mes.dnevnik.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
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
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C1304Qm0(2, this));
        this.A = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC3351dE interfaceC3351dE2 = this.r;
            if (interfaceC3351dE2 != null) {
                interfaceC3351dE2.setWindowTitle(title);
            } else {
                FM1 fm1 = this.o;
                if (fm1 != null) {
                    fm1.s(title);
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.z = true;
        G6 g6A = A(0);
        if (this.Q || g6A.h != null) {
            return;
        }
        C(108);
    }

    public final void x() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final E6 y(Context context) {
        if (this.W == null) {
            if (C5772lr0.h == null) {
                Context applicationContext = context.getApplicationContext();
                C5772lr0.h = new C5772lr0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.W = new C6(this, C5772lr0.h);
        }
        return this.W;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
