package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.C1719a;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: jo0 */
/* loaded from: classes.dex */
public final class C9927jo0<S> extends DialogInterfaceOnCancelListenerC1725g {

    /* renamed from: A */
    public boolean f35383A;

    /* renamed from: B */
    public CharSequence f35384B;

    /* renamed from: C */
    public CharSequence f35385C;

    /* renamed from: a */
    public final LinkedHashSet f35386a = new LinkedHashSet();

    /* renamed from: b */
    public final LinkedHashSet f35387b = new LinkedHashSet();

    /* renamed from: c */
    public final LinkedHashSet f35388c = new LinkedHashSet();

    /* renamed from: d */
    public final LinkedHashSet f35389d = new LinkedHashSet();

    /* renamed from: e */
    public int f35390e;

    /* renamed from: f */
    public C9315f11 f35391f;

    /* renamed from: g */
    public AbstractC8820bB0 f35392g;

    /* renamed from: h */
    public C6763rl f35393h;

    /* renamed from: i */
    public C8898bo0 f35394i;

    /* renamed from: j */
    public int f35395j;

    /* renamed from: k */
    public CharSequence f35396k;

    /* renamed from: l */
    public boolean f35397l;

    /* renamed from: m */
    public int f35398m;

    /* renamed from: n */
    public int f35399n;

    /* renamed from: o */
    public CharSequence f35400o;

    /* renamed from: p */
    public int f35401p;

    /* renamed from: q */
    public CharSequence f35402q;

    /* renamed from: r */
    public int f35403r;

    /* renamed from: s */
    public CharSequence f35404s;

    /* renamed from: t */
    public int f35405t;

    /* renamed from: u */
    public CharSequence f35406u;

    /* renamed from: v */
    public TextView f35407v;

    /* renamed from: w */
    public TextView f35408w;

    /* renamed from: x */
    public CheckableImageButton f35409x;

    /* renamed from: y */
    public C10439no0 f35410y;

    /* renamed from: z */
    public Button f35411z;

    /* renamed from: u */
    public static int m22102u(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM23525f = AbstractC10554oh1.m23525f();
        calendarM23525f.set(5, 1);
        Calendar calendarM23523d = AbstractC10554oh1.m23523d(calendarM23525f);
        calendarM23523d.get(2);
        calendarM23523d.get(1);
        int maximum = calendarM23523d.getMaximum(7);
        calendarM23523d.getActualMaximum(5);
        calendarM23523d.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: v */
    public static boolean m22103v(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC9900ja1.m22074c(context, R.attr.materialCalendarStyle, C8898bo0.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f35388c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f35390e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f35391f = (C9315f11) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f35393h = (C6763rl) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f35395j = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f35396k = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f35398m = bundle.getInt("INPUT_MODE_KEY");
        this.f35399n = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f35400o = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f35401p = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f35402q = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f35403r = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f35404s = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f35405t = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f35406u = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f35396k;
        if (text == null) {
            text = requireContext().getResources().getText(this.f35395j);
        }
        this.f35384B = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f35385C = text;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int i = this.f35390e;
        if (i == 0) {
            m22104s().getClass();
            i = AbstractC9900ja1.m22074c(contextRequireContext2, R.attr.materialCalendarTheme, C9927jo0.class.getCanonicalName()).data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        this.f35397l = m22103v(context, android.R.attr.windowFullscreen);
        this.f35410y = new C10439no0(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, NG0.f7701o, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f35410y.m23236h(context);
        this.f35410y.m23238j(ColorStateList.valueOf(color));
        C10439no0 c10439no0 = this.f35410y;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        c10439no0.m23237i(AbstractC9536gk1.m18614i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f35397l ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f35397l) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m22102u(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m22102u(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f35408w = textView;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        textView.setAccessibilityLiveRegion(1);
        this.f35409x = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f35407v = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f35409x.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f35409x;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC11918zN1.m26394b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC11918zN1.m26394b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f35409x.setChecked(this.f35398m != 0);
        AbstractC10944rk1.m24482n(this.f35409x, null);
        m22108y(this.f35409x);
        this.f35409x.setOnClickListener(new ViewOnClickListenerC1250Ts(4, this));
        this.f35411z = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (m22104s().f27015a != null) {
            this.f35411z.setEnabled(true);
        } else {
            this.f35411z.setEnabled(false);
        }
        this.f35411z.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f35400o;
        if (charSequence != null) {
            this.f35411z.setText(charSequence);
        } else {
            int i = this.f35399n;
            if (i != 0) {
                this.f35411z.setText(i);
            }
        }
        CharSequence charSequence2 = this.f35402q;
        if (charSequence2 != null) {
            this.f35411z.setContentDescription(charSequence2);
        } else if (this.f35401p != 0) {
            this.f35411z.setContentDescription(getContext().getResources().getText(this.f35401p));
        }
        this.f35411z.setOnClickListener(new ViewOnClickListenerC9543go0(this, 0));
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f35404s;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.f35403r;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        CharSequence charSequence4 = this.f35406u;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f35405t != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f35405t));
        }
        button.setOnClickListener(new ViewOnClickListenerC9543go0(this, 1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f35389d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f35390e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f35391f);
        C6763rl c6763rl = this.f35393h;
        C6637pl c6637pl = new C6637pl();
        c6637pl.f40360a = C6637pl.f40358f;
        c6637pl.f40361b = C6637pl.f40359g;
        c6637pl.f40364e = new C6729rD(Long.MIN_VALUE);
        c6637pl.f40360a = c6763rl.f41848a.f11021f;
        c6637pl.f40361b = c6763rl.f41849b.f11021f;
        c6637pl.f40362c = Long.valueOf(c6763rl.f41851d.f11021f);
        c6637pl.f40363d = c6763rl.f41852e;
        c6637pl.f40364e = c6763rl.f41850c;
        C8898bo0 c8898bo0 = this.f35394i;
        C8286Ss0 c8286Ss0 = c8898bo0 == null ? null : c8898bo0.f17163e;
        if (c8286Ss0 != null) {
            c6637pl.f40362c = Long.valueOf(c8286Ss0.f11021f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c6637pl.m23860a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f35395j);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f35396k);
        bundle.putInt("INPUT_MODE_KEY", this.f35398m);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f35399n);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f35400o);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f35401p);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f35402q);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f35403r);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f35404s);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f35405t);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f35406u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, androidx.fragment.app.Fragment
    public final void onStart() throws Resources.NotFoundException {
        C8485Wn1 c8537Xn1;
        C8485Wn1 c8537Xn12;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f35397l) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f35410y);
            if (!this.f35383A) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM17462a = AbstractC9057d02.m17462a(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM17462a != null ? Integer.valueOf(colorStateListM17462a.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iM22231f = AbstractC10036ke1.m22231f(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iM22231f);
                }
                AbstractC9188e12.m17819c(window, false);
                window.getContext();
                int iM5133f = i < 27 ? AbstractC0749Lu.m5133f(AbstractC10036ke1.m22231f(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iM5133f);
                boolean z3 = AbstractC10036ke1.m22232g(0) || AbstractC10036ke1.m22232g(numValueOf.intValue());
                C10641pN0 c10641pN0 = new C10641pN0(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    C8641Zn1 c8641Zn1 = new C8641Zn1(window.getInsetsController(), c10641pN0);
                    c8641Zn1.f15132d = window;
                    c8537Xn1 = c8641Zn1;
                } else {
                    c8537Xn1 = i2 >= 26 ? new C8537Xn1(window, c10641pN0) : new C8485Wn1(window, c10641pN0);
                }
                c8537Xn1.mo8863g(z3);
                boolean zM22232g = AbstractC10036ke1.m22232g(iM22231f);
                if (AbstractC10036ke1.m22232g(iM5133f) || (iM5133f == 0 && zM22232g)) {
                    z = true;
                }
                C10641pN0 c10641pN02 = new C10641pN0(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    C8641Zn1 c8641Zn12 = new C8641Zn1(window.getInsetsController(), c10641pN02);
                    c8641Zn12.f15132d = window;
                    c8537Xn12 = c8641Zn12;
                } else {
                    c8537Xn12 = i3 >= 26 ? new C8537Xn1(window, c10641pN02) : new C8485Wn1(window, c10641pN02);
                }
                c8537Xn12.mo9116f(z);
                C9671ho0 c9671ho0 = new C9671ho0(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                AbstractC9536gk1.m18626u(viewFindViewById, c9671ho0);
                this.f35383A = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f35410y, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new H80(requireDialog(), rect));
        }
        m22106w();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f35392g.f16856a.clear();
        super.onStop();
    }

    /* renamed from: s */
    public final C9315f11 m22104s() {
        if (this.f35391f == null) {
            this.f35391f = (C9315f11) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f35391f;
    }

    /* renamed from: t */
    public final String m22105t() {
        C9315f11 c9315f11M22104s = m22104s();
        Context context = getContext();
        c9315f11M22104s.getClass();
        Resources resources = context.getResources();
        Long l = c9315f11M22104s.f27015a;
        return l == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, AbstractC10538oZ1.m23503a(l.longValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.fragment.app.Fragment, oo0] */
    /* renamed from: w */
    public final void m22106w() {
        Context contextRequireContext = requireContext();
        int i = this.f35390e;
        if (i == 0) {
            m22104s().getClass();
            i = AbstractC9900ja1.m22074c(contextRequireContext, R.attr.materialCalendarTheme, C9927jo0.class.getCanonicalName()).data;
        }
        C9315f11 c9315f11M22104s = m22104s();
        C6763rl c6763rl = this.f35393h;
        C8898bo0 c8898bo0 = new C8898bo0();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", c9315f11M22104s);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c6763rl);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c6763rl.f41851d);
        c8898bo0.setArguments(bundle);
        this.f35394i = c8898bo0;
        if (this.f35398m == 1) {
            C9315f11 c9315f11M22104s2 = m22104s();
            C6763rl c6763rl2 = this.f35393h;
            ?? c10567oo0 = new C10567oo0();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", c9315f11M22104s2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c6763rl2);
            c10567oo0.setArguments(bundle2);
            c8898bo0 = c10567oo0;
        }
        this.f35392g = c8898bo0;
        this.f35407v.setText((this.f35398m == 1 && getResources().getConfiguration().orientation == 2) ? this.f35385C : this.f35384B);
        m22107x(m22105t());
        AbstractC1733o childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1719a c1719a = new C1719a(childFragmentManager);
        c1719a.mo10013c(R.id.mtrl_calendar_frame, this.f35392g, null, 2);
        if (c1719a.f43738g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c1719a.f16158q.m10089y(c1719a, false);
        this.f35392g.mo10432r(new C9799io0(this, 0));
    }

    /* renamed from: x */
    public final void m22107x(String str) {
        TextView textView = this.f35408w;
        C9315f11 c9315f11M22104s = m22104s();
        Context contextRequireContext = requireContext();
        c9315f11M22104s.getClass();
        Resources resources = contextRequireContext.getResources();
        Long l = c9315f11M22104s.f27015a;
        textView.setContentDescription(resources.getString(R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : AbstractC10538oZ1.m23503a(l.longValue())));
        this.f35408w.setText(str);
    }

    /* renamed from: y */
    public final void m22108y(CheckableImageButton checkableImageButton) {
        this.f35409x.setContentDescription(this.f35398m == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }
}
