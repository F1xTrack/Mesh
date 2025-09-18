package defpackage;

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

/* loaded from: classes.dex */
public final class B6 implements Window.Callback {
    public final Window.Callback a;
    public C6845rT0 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ H6 f;

    public B6(H6 h6, Window.Callback callback) {
        this.f = h6;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        AbstractC7288tn1.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.d;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        H6 h6 = this.f;
        h6.B();
        FM1 fm1 = h6.o;
        if (fm1 != null && fm1.i(keyCode, keyEvent)) {
            return true;
        }
        G6 g6 = h6.M;
        if (g6 != null && h6.G(g6, keyEvent.getKeyCode(), keyEvent)) {
            G6 g62 = h6.M;
            if (g62 == null) {
                return true;
            }
            g62.l = true;
            return true;
        }
        if (h6.M == null) {
            G6 g6A = h6.A(0);
            h6.H(g6A, keyEvent);
            boolean zG = h6.G(g6A, keyEvent.getKeyCode(), keyEvent);
            g6A.k = false;
            if (zG) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0225Cq0)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C6845rT0 c6845rT0 = this.b;
        if (c6845rT0 != null) {
            View view = i == 0 ? new View(((C3612eb1) c6845rT0.a).a.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        H6 h6 = this.f;
        if (i == 108) {
            h6.B();
            FM1 fm1 = h6.o;
            if (fm1 != null) {
                fm1.c(true);
            }
        } else {
            h6.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.e) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        H6 h6 = this.f;
        if (i == 108) {
            h6.B();
            FM1 fm1 = h6.o;
            if (fm1 != null) {
                fm1.c(false);
                return;
            }
            return;
        }
        if (i != 0) {
            h6.getClass();
            return;
        }
        G6 g6A = h6.A(i);
        if (g6A.m) {
            h6.s(g6A, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC7479un1.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0225Cq0 menuC0225Cq0 = menu instanceof MenuC0225Cq0 ? (MenuC0225Cq0) menu : null;
        if (i == 0 && menuC0225Cq0 == null) {
            return false;
        }
        if (menuC0225Cq0 != null) {
            menuC0225Cq0.x = true;
        }
        C6845rT0 c6845rT0 = this.b;
        if (c6845rT0 != null && i == 0) {
            C3612eb1 c3612eb1 = (C3612eb1) c6845rT0.a;
            if (!c3612eb1.d) {
                c3612eb1.a.l = true;
                c3612eb1.d = true;
            }
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (menuC0225Cq0 != null) {
            menuC0225Cq0.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0225Cq0 menuC0225Cq0 = this.f.A(0).h;
        if (menuC0225Cq0 != null) {
            d(list, menuC0225Cq0, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC7097sn1.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        H6 h6 = this.f;
        h6.getClass();
        if (i != 0) {
            return AbstractC7097sn1.b(this.a, callback, i);
        }
        C6860rY0 c6860rY0 = new C6860rY0(h6.k, callback);
        AbstractC6952s2 abstractC6952s2 = h6.u;
        if (abstractC6952s2 != null) {
            abstractC6952s2.b();
        }
        VH vh = new VH(h6, 3, c6860rY0);
        h6.B();
        FM1 fm1 = h6.o;
        if (fm1 != null) {
            h6.u = fm1.t(vh);
        }
        if (h6.u == null) {
            C6519pl1 c6519pl1 = h6.y;
            if (c6519pl1 != null) {
                c6519pl1.b();
            }
            AbstractC6952s2 abstractC6952s22 = h6.u;
            if (abstractC6952s22 != null) {
                abstractC6952s22.b();
            }
            if (h6.v == null) {
                boolean z = h6.I;
                Context context = h6.k;
                if (z) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C1417Ry c1417Ry = new C1417Ry(context, 0);
                        c1417Ry.getTheme().setTo(themeNewTheme);
                        context = c1417Ry;
                    }
                    h6.v = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    h6.w = popupWindow;
                    AbstractC5840mC0.d(popupWindow, 2);
                    h6.w.setContentView(h6.v);
                    h6.w.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    h6.v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    h6.w.setHeight(-2);
                    h6.x = new RunnableC7539v6(h6, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) h6.A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        h6.B();
                        FM1 fm12 = h6.o;
                        Context contextE = fm12 != null ? fm12.e() : null;
                        if (contextE != null) {
                            context = contextE;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        h6.v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (h6.v != null) {
                C6519pl1 c6519pl12 = h6.y;
                if (c6519pl12 != null) {
                    c6519pl12.b();
                }
                h6.v.e();
                Context context2 = h6.v.getContext();
                ActionBarContextView actionBarContextView = h6.v;
                C3704f41 c3704f41 = new C3704f41();
                c3704f41.d = context2;
                c3704f41.e = actionBarContextView;
                c3704f41.f = vh;
                MenuC0225Cq0 menuC0225Cq0 = new MenuC0225Cq0(actionBarContextView.getContext());
                menuC0225Cq0.l = 1;
                c3704f41.i = menuC0225Cq0;
                menuC0225Cq0.e = c3704f41;
                if (((C6860rY0) vh.b).D(c3704f41, menuC0225Cq0)) {
                    c3704f41.j();
                    h6.v.c(c3704f41);
                    h6.u = c3704f41;
                    if (h6.z && (viewGroup = h6.A) != null && viewGroup.isLaidOut()) {
                        h6.v.setAlpha(0.0f);
                        C6519pl1 c6519pl1A = AbstractC6897rk1.a(h6.v);
                        c6519pl1A.a(1.0f);
                        h6.y = c6519pl1A;
                        c6519pl1A.d(new C7729w6(1, h6));
                    } else {
                        h6.v.setAlpha(1.0f);
                        h6.v.setVisibility(0);
                        if (h6.v.getParent() instanceof View) {
                            View view = (View) h6.v.getParent();
                            WeakHashMap weakHashMap = AbstractC6897rk1.a;
                            AbstractC3639ek1.c(view);
                        }
                    }
                    if (h6.w != null) {
                        h6.l.getDecorView().post(h6.x);
                    }
                } else {
                    h6.u = null;
                }
            }
            h6.J();
            h6.u = h6.u;
        }
        h6.J();
        AbstractC6952s2 abstractC6952s23 = h6.u;
        if (abstractC6952s23 != null) {
            return c6860rY0.w(abstractC6952s23);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
