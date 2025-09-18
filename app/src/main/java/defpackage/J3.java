package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class J3 extends DialogC0785Jv implements DialogInterface, InterfaceC5821m6 {
    public H6 d;
    public final I6 e;
    public final H3 f;

    /* JADX WARN: Type inference failed for: r2v2, types: [I6] */
    public J3(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iG = g(contextThemeWrapper, i);
        if (iG == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iG;
        }
        super(contextThemeWrapper, i2);
        this.e = new InterfaceC0816Kf0() { // from class: I6
            @Override // defpackage.InterfaceC0816Kf0
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.a.i(keyEvent);
            }
        };
        AbstractC7348u6 abstractC7348u6D = d();
        if (iG == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iG = typedValue2.resourceId;
        }
        ((H6) abstractC7348u6D).T = iG;
        abstractC7348u6D.c();
        this.f = new H3(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.DialogC0785Jv, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H6 h6 = (H6) d();
        h6.w();
        ((ViewGroup) h6.A.findViewById(android.R.id.content)).addView(view, layoutParams);
        h6.m.a(h6.l.getCallback());
    }

    public final AbstractC7348u6 d() {
        if (this.d == null) {
            ExecutorC7157t6 executorC7157t6 = AbstractC7348u6.a;
            this.d = new H6(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC7341u32.b(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        O02.b(getWindow().getDecorView(), this);
        Q02.b(getWindow().getDecorView(), this);
        P02.f(getWindow().getDecorView(), this);
    }

    public final void f(Bundle bundle) {
        H6 h6 = (H6) d();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(h6.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(h6);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof H6;
        }
        super.onCreate(bundle);
        d().c();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H6 h6 = (H6) d();
        h6.w();
        return h6.l.findViewById(i);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().m(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().a();
    }

    @Override // defpackage.DialogC0785Jv, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        f(bundle);
        H3 h3 = this.f;
        h3.b.setContentView(h3.z);
        Window window = h3.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = h3.g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !H3.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (h3.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (h3.f != null) {
                ((LinearLayout.LayoutParams) ((C1682Vi0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = H3.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = H3.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = H3.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        h3.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        h3.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        h3.v = textView;
        if (textView != null) {
            CharSequence charSequence = h3.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                h3.r.removeView(h3.v);
                if (h3.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) h3.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(h3.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(h3.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        h3.i = button;
        ViewOnClickListenerC2437c2 viewOnClickListenerC2437c2 = h3.F;
        button.setOnClickListener(viewOnClickListenerC2437c2);
        if (TextUtils.isEmpty(h3.j)) {
            h3.i.setVisibility(8);
            i = 0;
        } else {
            h3.i.setText(h3.j);
            h3.i.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        h3.l = button2;
        button2.setOnClickListener(viewOnClickListenerC2437c2);
        if (TextUtils.isEmpty(h3.m)) {
            h3.l.setVisibility(8);
        } else {
            h3.l.setText(h3.m);
            h3.l.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        h3.o = button3;
        button3.setOnClickListener(viewOnClickListenerC2437c2);
        if (TextUtils.isEmpty(h3.p)) {
            h3.o.setVisibility(8);
        } else {
            h3.o.setText(h3.p);
            h3.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        h3.a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i2 = 2;
        } else if (i == 1) {
            Button button4 = h3.i;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i2 = 2;
        } else {
            i2 = 2;
            if (i == 2) {
                Button button5 = h3.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = h3.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (h3.w != null) {
            viewGroupB.addView(h3.w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            h3.t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(h3.d) || !h3.D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                h3.t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                h3.u = textView2;
                textView2.setText(h3.d);
                Drawable drawable = h3.s;
                if (drawable != null) {
                    h3.t.setImageDrawable(drawable);
                } else {
                    h3.u.setPadding(h3.t.getPaddingLeft(), h3.t.getPaddingTop(), h3.t.getPaddingRight(), h3.t.getPaddingBottom());
                    h3.t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = h3.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (h3.e == null && h3.f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = h3.f;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || i3 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
            }
        }
        if (!z2) {
            View view2 = h3.f;
            if (view2 == null) {
                view2 = h3.r;
            }
            if (view2 != null) {
                int i4 = z3 ? i2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                AbstractC4212hk1.d(view2, i3 | i4, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = h3.f;
        if (alertController$RecycleListView2 == null || (listAdapter = h3.x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = h3.y;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.r;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.r;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.DialogC0785Jv, android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        H6 h6 = (H6) d();
        h6.B();
        FM1 fm1 = h6.o;
        if (fm1 != null) {
            fm1.q(false);
        }
    }

    @Override // defpackage.DialogC0785Jv, android.app.Dialog
    public final void setContentView(int i) {
        e();
        d().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().m(getContext().getString(i));
    }

    @Override // defpackage.DialogC0785Jv, android.app.Dialog
    public final void setContentView(View view) {
        e();
        d().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        H3 h3 = this.f;
        h3.d = charSequence;
        TextView textView = h3.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.DialogC0785Jv, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().j(view, layoutParams);
    }
}
