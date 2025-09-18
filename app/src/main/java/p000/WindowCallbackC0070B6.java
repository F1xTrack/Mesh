package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: B6 */
/* loaded from: classes.dex */
public final class WindowCallbackC0070B6 implements Window.Callback {

    /* renamed from: a */
    public final Window.Callback f563a;

    /* renamed from: b */
    public C10909rT0 f564b;

    /* renamed from: c */
    public boolean f565c;

    /* renamed from: d */
    public boolean f566d;

    /* renamed from: e */
    public boolean f567e;

    /* renamed from: f */
    public final /* synthetic */ LayoutInflaterFactory2C0448H6 f568f;

    public WindowCallbackC0070B6(LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6, Window.Callback callback) {
        this.f568f = layoutInflaterFactory2C0448H6;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f563a = callback;
    }

    /* renamed from: a */
    public final void m492a(Window.Callback callback) {
        try {
            this.f565c = true;
            callback.onContentChanged();
        } finally {
            this.f565c = false;
        }
    }

    /* renamed from: b */
    public final boolean m493b(int i, Menu menu) {
        return this.f563a.onMenuOpened(i, menu);
    }

    /* renamed from: c */
    public final void m494c(int i, Menu menu) {
        this.f563a.onPanelClosed(i, menu);
    }

    /* renamed from: d */
    public final void m495d(List list, Menu menu, int i) {
        AbstractC11206tn1.m24987a(this.f563a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f563a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f566d;
        Window.Callback callback = this.f563a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f568f.m3292u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f563a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = this.f568f;
        layoutInflaterFactory2C0448H6.m3270B();
        FM1 fm1 = layoutInflaterFactory2C0448H6.f4095o;
        if (fm1 != null && fm1.mo2594i(keyCode, keyEvent)) {
            return true;
        }
        C0385G6 c0385g6 = layoutInflaterFactory2C0448H6.f4071M;
        if (c0385g6 != null && layoutInflaterFactory2C0448H6.m3275G(c0385g6, keyEvent.getKeyCode(), keyEvent)) {
            C0385G6 c0385g62 = layoutInflaterFactory2C0448H6.f4071M;
            if (c0385g62 == null) {
                return true;
            }
            c0385g62.f3580l = true;
            return true;
        }
        if (layoutInflaterFactory2C0448H6.f4071M == null) {
            C0385G6 c0385g6M3269A = layoutInflaterFactory2C0448H6.m3269A(0);
            layoutInflaterFactory2C0448H6.m3276H(c0385g6M3269A, keyEvent);
            boolean zM3275G = layoutInflaterFactory2C0448H6.m3275G(c0385g6M3269A, keyEvent.getKeyCode(), keyEvent);
            c0385g6M3269A.f3579k = false;
            if (zM3275G) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f563a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f563a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f563a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f563a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f563a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f563a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f565c) {
            this.f563a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC7450Cq0)) {
            return this.f563a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C10909rT0 c10909rT0 = this.f564b;
        if (c10909rT0 != null) {
            View view = i == 0 ? new View(((C9262eb1) c10909rT0.f41672a).f26763a.f27862a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f563a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f563a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f563a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m493b(i, menu);
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = this.f568f;
        if (i == 108) {
            layoutInflaterFactory2C0448H6.m3270B();
            FM1 fm1 = layoutInflaterFactory2C0448H6.f4095o;
            if (fm1 != null) {
                fm1.mo2588c(true);
            }
        } else {
            layoutInflaterFactory2C0448H6.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f567e) {
            this.f563a.onPanelClosed(i, menu);
            return;
        }
        m494c(i, menu);
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = this.f568f;
        if (i == 108) {
            layoutInflaterFactory2C0448H6.m3270B();
            FM1 fm1 = layoutInflaterFactory2C0448H6.f4095o;
            if (fm1 != null) {
                fm1.mo2588c(false);
                return;
            }
            return;
        }
        if (i != 0) {
            layoutInflaterFactory2C0448H6.getClass();
            return;
        }
        C0385G6 c0385g6M3269A = layoutInflaterFactory2C0448H6.m3269A(i);
        if (c0385g6M3269A.f3581m) {
            layoutInflaterFactory2C0448H6.m3291s(c0385g6M3269A, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC11334un1.m25238a(this.f563a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC7450Cq0 menuC7450Cq0 = menu instanceof MenuC7450Cq0 ? (MenuC7450Cq0) menu : null;
        if (i == 0 && menuC7450Cq0 == null) {
            return false;
        }
        if (menuC7450Cq0 != null) {
            menuC7450Cq0.f1725x = true;
        }
        C10909rT0 c10909rT0 = this.f564b;
        if (c10909rT0 != null && i == 0) {
            C9262eb1 c9262eb1 = (C9262eb1) c10909rT0.f41672a;
            if (!c9262eb1.f26766d) {
                c9262eb1.f26763a.f27873l = true;
                c9262eb1.f26766d = true;
            }
        }
        boolean zOnPreparePanel = this.f563a.onPreparePanel(i, view, menu);
        if (menuC7450Cq0 != null) {
            menuC7450Cq0.f1725x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC7450Cq0 menuC7450Cq0 = this.f568f.m3269A(0).f3576h;
        if (menuC7450Cq0 != null) {
            m495d(list, menuC7450Cq0, i);
        } else {
            m495d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC11078sn1.m24790a(this.f563a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f563a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f563a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = this.f568f;
        layoutInflaterFactory2C0448H6.getClass();
        if (i != 0) {
            return AbstractC11078sn1.m24791b(this.f563a, callback, i);
        }
        C10919rY0 c10919rY0 = new C10919rY0(layoutInflaterFactory2C0448H6.f4091k, callback);
        AbstractC6798s2 abstractC6798s2 = layoutInflaterFactory2C0448H6.f4103u;
        if (abstractC6798s2 != null) {
            abstractC6798s2.mo18163b();
        }
        C1339VH c1339vh = new C1339VH(layoutInflaterFactory2C0448H6, 3, c10919rY0);
        layoutInflaterFactory2C0448H6.m3270B();
        FM1 fm1 = layoutInflaterFactory2C0448H6.f4095o;
        if (fm1 != null) {
            layoutInflaterFactory2C0448H6.f4103u = fm1.mo2604t(c1339vh);
        }
        if (layoutInflaterFactory2C0448H6.f4103u == null) {
            C10690pl1 c10690pl1 = layoutInflaterFactory2C0448H6.f4107y;
            if (c10690pl1 != null) {
                c10690pl1.m23871b();
            }
            AbstractC6798s2 abstractC6798s22 = layoutInflaterFactory2C0448H6.f4103u;
            if (abstractC6798s22 != null) {
                abstractC6798s22.mo18163b();
            }
            if (layoutInflaterFactory2C0448H6.f4104v == null) {
                boolean z = layoutInflaterFactory2C0448H6.f4067I;
                Context context = layoutInflaterFactory2C0448H6.f4091k;
                if (z) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C1130Ry c1130Ry = new C1130Ry(context, 0);
                        c1130Ry.getTheme().setTo(themeNewTheme);
                        context = c1130Ry;
                    }
                    layoutInflaterFactory2C0448H6.f4104v = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0448H6.f4105w = popupWindow;
                    AbstractC10235mC0.m22702d(popupWindow, 2);
                    layoutInflaterFactory2C0448H6.f4105w.setContentView(layoutInflaterFactory2C0448H6.f4104v);
                    layoutInflaterFactory2C0448H6.f4105w.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0448H6.f4104v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0448H6.f4105w.setHeight(-2);
                    layoutInflaterFactory2C0448H6.f4106x = new RunnableC6991v6(layoutInflaterFactory2C0448H6, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0448H6.f4059A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0448H6.m3270B();
                        FM1 fm12 = layoutInflaterFactory2C0448H6.f4095o;
                        Context contextMo2590e = fm12 != null ? fm12.mo2590e() : null;
                        if (contextMo2590e != null) {
                            context = contextMo2590e;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C0448H6.f4104v = (ActionBarContextView) viewStubCompat.m9872a();
                    }
                }
            }
            if (layoutInflaterFactory2C0448H6.f4104v != null) {
                C10690pl1 c10690pl12 = layoutInflaterFactory2C0448H6.f4107y;
                if (c10690pl12 != null) {
                    c10690pl12.m23871b();
                }
                layoutInflaterFactory2C0448H6.f4104v.m9835e();
                Context context2 = layoutInflaterFactory2C0448H6.f4104v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0448H6.f4104v;
                C9324f41 c9324f41 = new C9324f41();
                c9324f41.f27041d = context2;
                c9324f41.f27042e = actionBarContextView;
                c9324f41.f27043f = c1339vh;
                MenuC7450Cq0 menuC7450Cq0 = new MenuC7450Cq0(actionBarContextView.getContext());
                menuC7450Cq0.f1713l = 1;
                c9324f41.f27046i = menuC7450Cq0;
                menuC7450Cq0.f1706e = c9324f41;
                if (((C10919rY0) c1339vh.f12486b).m24405D(c9324f41, menuC7450Cq0)) {
                    c9324f41.mo18169j();
                    layoutInflaterFactory2C0448H6.f4104v.m9833c(c9324f41);
                    layoutInflaterFactory2C0448H6.f4103u = c9324f41;
                    if (layoutInflaterFactory2C0448H6.f4108z && (viewGroup = layoutInflaterFactory2C0448H6.f4059A) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0448H6.f4104v.setAlpha(0.0f);
                        C10690pl1 c10690pl1M24469a = AbstractC10944rk1.m24469a(layoutInflaterFactory2C0448H6.f4104v);
                        c10690pl1M24469a.m23870a(1.0f);
                        layoutInflaterFactory2C0448H6.f4107y = c10690pl1M24469a;
                        c10690pl1M24469a.m23873d(new C7054w6(1, layoutInflaterFactory2C0448H6));
                    } else {
                        layoutInflaterFactory2C0448H6.f4104v.setAlpha(1.0f);
                        layoutInflaterFactory2C0448H6.f4104v.setVisibility(0);
                        if (layoutInflaterFactory2C0448H6.f4104v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0448H6.f4104v.getParent();
                            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                            AbstractC9280ek1.m18029c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0448H6.f4105w != null) {
                        layoutInflaterFactory2C0448H6.f4092l.getDecorView().post(layoutInflaterFactory2C0448H6.f4106x);
                    }
                } else {
                    layoutInflaterFactory2C0448H6.f4103u = null;
                }
            }
            layoutInflaterFactory2C0448H6.m3278J();
            layoutInflaterFactory2C0448H6.f4103u = layoutInflaterFactory2C0448H6.f4103u;
        }
        layoutInflaterFactory2C0448H6.m3278J();
        AbstractC6798s2 abstractC6798s23 = layoutInflaterFactory2C0448H6.f4103u;
        if (abstractC6798s23 != null) {
            return c10919rY0.m24424w(abstractC6798s23);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f563a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
