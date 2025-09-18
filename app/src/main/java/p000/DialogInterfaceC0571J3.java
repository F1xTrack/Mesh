package p000;

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

/* renamed from: J3 */
/* loaded from: classes.dex */
public final class DialogInterfaceC0571J3 extends DialogC0625Jv implements DialogInterface, InterfaceC6405m6 {

    /* renamed from: d */
    public LayoutInflaterFactory2C0448H6 f5290d;

    /* renamed from: e */
    public final C0511I6 f5291e;

    /* renamed from: f */
    public final C0445H3 f5292f;

    /* JADX WARN: Type inference failed for: r2v2, types: [I6] */
    public DialogInterfaceC0571J3(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM4145g = m4145g(contextThemeWrapper, i);
        if (iM4145g == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM4145g;
        }
        super(contextThemeWrapper, i2);
        this.f5291e = new InterfaceC7844Kf0() { // from class: I6
            @Override // p000.InterfaceC7844Kf0
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f4697a.m4150i(keyEvent);
            }
        };
        AbstractC6928u6 abstractC6928u6M4146d = m4146d();
        if (iM4145g == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM4145g = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0448H6) abstractC6928u6M4146d).f4078T = iM4145g;
        abstractC6928u6M4146d.mo3280c();
        this.f5292f = new C0445H3(getContext(), this, getWindow());
    }

    /* renamed from: g */
    public static int m4145g(Context context, int i) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p000.DialogC0625Jv, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m4146d();
        layoutInflaterFactory2C0448H6.m3294w();
        ((ViewGroup) layoutInflaterFactory2C0448H6.f4059A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0448H6.f4093m.m492a(layoutInflaterFactory2C0448H6.f4092l.getCallback());
    }

    /* renamed from: d */
    public final AbstractC6928u6 m4146d() {
        if (this.f5290d == null) {
            ExecutorC6865t6 executorC6865t6 = AbstractC6928u6.f43504a;
            this.f5290d = new LayoutInflaterFactory2C0448H6(getContext(), getWindow(), this, this);
        }
        return this.f5290d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m4146d().mo3281d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC11242u32.m25099b(this.f5291e, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public final void m4147e() {
        O02.m5927b(getWindow().getDecorView(), this);
        Q02.m6528b(getWindow().getDecorView(), this);
        P02.m6201f(getWindow().getDecorView(), this);
    }

    /* renamed from: f */
    public final void m4148f(Bundle bundle) {
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m4146d();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C0448H6.f4091k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C0448H6);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0448H6;
        }
        super.onCreate(bundle);
        m4146d().mo3280c();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m4146d();
        layoutInflaterFactory2C0448H6.m3294w();
        return layoutInflaterFactory2C0448H6.f4092l.findViewById(i);
    }

    /* renamed from: h */
    public final void m4149h(CharSequence charSequence) {
        super.setTitle(charSequence);
        m4146d().mo3286m(charSequence);
    }

    /* renamed from: i */
    public final boolean m4150i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m4146d().mo3279a();
    }

    @Override // p000.DialogC0625Jv, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        m4148f(bundle);
        C0445H3 c0445h3 = this.f5292f;
        c0445h3.f4004b.setContentView(c0445h3.f4028z);
        Window window = c0445h3.f4005c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = c0445h3.f4009g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !C0445H3.m3248a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c0445h3.f4010h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c0445h3.f4008f != null) {
                ((LinearLayout.LayoutParams) ((C8422Vi0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM3249b = C0445H3.m3249b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM3249b2 = C0445H3.m3249b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM3249b3 = C0445H3.m3249b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0445h3.f4020r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0445h3.f4020r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM3249b2.findViewById(android.R.id.message);
        c0445h3.f4024v = textView;
        if (textView != null) {
            CharSequence charSequence = c0445h3.f4007e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c0445h3.f4020r.removeView(c0445h3.f4024v);
                if (c0445h3.f4008f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0445h3.f4020r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c0445h3.f4020r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c0445h3.f4008f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM3249b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM3249b3.findViewById(android.R.id.button1);
        c0445h3.f4011i = button;
        ViewOnClickListenerC1822c2 viewOnClickListenerC1822c2 = c0445h3.f4002F;
        button.setOnClickListener(viewOnClickListenerC1822c2);
        if (TextUtils.isEmpty(c0445h3.f4012j)) {
            c0445h3.f4011i.setVisibility(8);
            i = 0;
        } else {
            c0445h3.f4011i.setText(c0445h3.f4012j);
            c0445h3.f4011i.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM3249b3.findViewById(android.R.id.button2);
        c0445h3.f4014l = button2;
        button2.setOnClickListener(viewOnClickListenerC1822c2);
        if (TextUtils.isEmpty(c0445h3.f4015m)) {
            c0445h3.f4014l.setVisibility(8);
        } else {
            c0445h3.f4014l.setText(c0445h3.f4015m);
            c0445h3.f4014l.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM3249b3.findViewById(android.R.id.button3);
        c0445h3.f4017o = button3;
        button3.setOnClickListener(viewOnClickListenerC1822c2);
        if (TextUtils.isEmpty(c0445h3.f4018p)) {
            c0445h3.f4017o.setVisibility(8);
        } else {
            c0445h3.f4017o.setText(c0445h3.f4018p);
            c0445h3.f4017o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0445h3.f4003a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i2 = 2;
        } else if (i == 1) {
            Button button4 = c0445h3.f4011i;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i2 = 2;
        } else {
            i2 = 2;
            if (i == 2) {
                Button button5 = c0445h3.f4014l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0445h3.f4017o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM3249b3.setVisibility(8);
        }
        if (c0445h3.f4025w != null) {
            viewGroupM3249b.addView(c0445h3.f4025w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0445h3.f4022t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0445h3.f4006d) || !c0445h3.f4000D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0445h3.f4022t.setVisibility(8);
                viewGroupM3249b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0445h3.f4023u = textView2;
                textView2.setText(c0445h3.f4006d);
                Drawable drawable = c0445h3.f4021s;
                if (drawable != null) {
                    c0445h3.f4022t.setImageDrawable(drawable);
                } else {
                    c0445h3.f4023u.setPadding(c0445h3.f4022t.getPaddingLeft(), c0445h3.f4022t.getPaddingTop(), c0445h3.f4022t.getPaddingRight(), c0445h3.f4022t.getPaddingBottom());
                    c0445h3.f4022t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupM3249b == null || viewGroupM3249b.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM3249b3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupM3249b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = c0445h3.f4020r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c0445h3.f4007e == null && c0445h3.f4008f == null) ? null : viewGroupM3249b.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM3249b2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0445h3.f4008f;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || i3 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f15749a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f15750b);
            }
        }
        if (!z2) {
            View view2 = c0445h3.f4008f;
            if (view2 == null) {
                view2 = c0445h3.f4020r;
            }
            if (view2 != null) {
                int i4 = z3 ? i2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                AbstractC9664hk1.m18874d(view2, i3 | i4, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM3249b2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM3249b2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0445h3.f4008f;
        if (alertController$RecycleListView2 == null || (listAdapter = c0445h3.f4026x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = c0445h3.f4027y;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f5292f.f4020r;
        if (nestedScrollView == null || !nestedScrollView.m9986j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f5292f.f4020r;
        if (nestedScrollView == null || !nestedScrollView.m9986j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p000.DialogC0625Jv, android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) m4146d();
        layoutInflaterFactory2C0448H6.m3270B();
        FM1 fm1 = layoutInflaterFactory2C0448H6.f4095o;
        if (fm1 != null) {
            fm1.mo2601q(false);
        }
    }

    @Override // p000.DialogC0625Jv, android.app.Dialog
    public final void setContentView(int i) {
        m4147e();
        m4146d().mo3283h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m4146d().mo3286m(getContext().getString(i));
    }

    @Override // p000.DialogC0625Jv, android.app.Dialog
    public final void setContentView(View view) {
        m4147e();
        m4146d().mo3284i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m4149h(charSequence);
        C0445H3 c0445h3 = this.f5292f;
        c0445h3.f4006d = charSequence;
        TextView textView = c0445h3.f4023u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // p000.DialogC0625Jv, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4147e();
        m4146d().mo3285j(view, layoutParams);
    }
}
