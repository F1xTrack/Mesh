package defpackage;

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
import androidx.fragment.app.a;
import androidx.fragment.app.g;
import androidx.fragment.app.o;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: jo0 */
/* loaded from: classes.dex */
public final class C5381jo0<S> extends g {
    public boolean A;
    public CharSequence B;
    public CharSequence C;
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();
    public int e;
    public C3692f11 f;
    public AbstractC2277bB0 g;
    public C6898rl h;
    public C2394bo0 i;
    public int j;
    public CharSequence k;
    public boolean l;
    public int m;
    public int n;
    public CharSequence o;
    public int p;
    public CharSequence q;
    public int r;
    public CharSequence s;
    public int t;
    public CharSequence u;
    public TextView v;
    public TextView w;
    public CheckableImageButton x;
    public C6145no0 y;
    public Button z;

    public static int u(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarF = AbstractC6316oh1.f();
        calendarF.set(5, 1);
        Calendar calendarD = AbstractC6316oh1.d(calendarF);
        calendarD.get(2);
        calendarD.get(1);
        int maximum = calendarD.getMaximum(7);
        calendarD.getActualMaximum(5);
        calendarD.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean v(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC5340ja1.c(context, R.attr.materialCalendarStyle, C2394bo0.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f = (C3692f11) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.h = (C6898rl) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.j = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.k = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.m = bundle.getInt("INPUT_MODE_KEY");
        this.n = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.o = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.p = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.q = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.r = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.s = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.t = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.u = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.k;
        if (text == null) {
            text = requireContext().getResources().getText(this.j);
        }
        this.B = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.C = text;
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int i = this.e;
        if (i == 0) {
            s().getClass();
            i = AbstractC5340ja1.c(contextRequireContext2, R.attr.materialCalendarTheme, C5381jo0.class.getCanonicalName()).data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        this.l = v(context, android.R.attr.windowFullscreen);
        this.y = new C6145no0(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, NG0.o, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.y.h(context);
        this.y.j(ColorStateList.valueOf(color));
        C6145no0 c6145no0 = this.y;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        c6145no0.i(AbstractC4021gk1.i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.l ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.l) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(u(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(u(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.w = textView;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        textView.setAccessibilityLiveRegion(1);
        this.x = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.v = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.x.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.x;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC8352zN1.b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC8352zN1.b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.x.setChecked(this.m != 0);
        AbstractC6897rk1.n(this.x, null);
        y(this.x);
        this.x.setOnClickListener(new ViewOnClickListenerC1555Ts(4, this));
        this.z = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (s().a != null) {
            this.z.setEnabled(true);
        } else {
            this.z.setEnabled(false);
        }
        this.z.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.o;
        if (charSequence != null) {
            this.z.setText(charSequence);
        } else {
            int i = this.n;
            if (i != 0) {
                this.z.setText(i);
            }
        }
        CharSequence charSequence2 = this.q;
        if (charSequence2 != null) {
            this.z.setContentDescription(charSequence2);
        } else if (this.p != 0) {
            this.z.setContentDescription(getContext().getResources().getText(this.p));
        }
        this.z.setOnClickListener(new ViewOnClickListenerC4032go0(this, 0));
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.s;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.r;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        CharSequence charSequence4 = this.u;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.t != 0) {
            button.setContentDescription(getContext().getResources().getText(this.t));
        }
        button.setOnClickListener(new ViewOnClickListenerC4032go0(this, 1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f);
        C6898rl c6898rl = this.h;
        C6517pl c6517pl = new C6517pl();
        c6517pl.a = C6517pl.f;
        c6517pl.b = C6517pl.g;
        c6517pl.e = new C6796rD(Long.MIN_VALUE);
        c6517pl.a = c6898rl.a.f;
        c6517pl.b = c6898rl.b.f;
        c6517pl.c = Long.valueOf(c6898rl.d.f);
        c6517pl.d = c6898rl.e;
        c6517pl.e = c6898rl.c;
        C2394bo0 c2394bo0 = this.i;
        C1478Ss0 c1478Ss0 = c2394bo0 == null ? null : c2394bo0.e;
        if (c1478Ss0 != null) {
            c6517pl.c = Long.valueOf(c1478Ss0.f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c6517pl.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.j);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.k);
        bundle.putInt("INPUT_MODE_KEY", this.m);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.n);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.o);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.p);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.q);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.r);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.s);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.t);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() throws Resources.NotFoundException {
        C1776Wn1 c1854Xn1;
        C1776Wn1 c1854Xn12;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.l) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.y);
            if (!this.A) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListA = AbstractC3308d02.a(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iF = AbstractC5543ke1.f(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iF);
                }
                AbstractC3502e12.c(window, false);
                window.getContext();
                int iF2 = i < 27 ? AbstractC0937Lu.f(AbstractC5543ke1.f(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iF2);
                boolean z3 = AbstractC5543ke1.g(0) || AbstractC5543ke1.g(numValueOf.intValue());
                C6446pN0 c6446pN0 = new C6446pN0(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    C2010Zn1 c2010Zn1 = new C2010Zn1(window.getInsetsController(), c6446pN0);
                    c2010Zn1.d = window;
                    c1854Xn1 = c2010Zn1;
                } else {
                    c1854Xn1 = i2 >= 26 ? new C1854Xn1(window, c6446pN0) : new C1776Wn1(window, c6446pN0);
                }
                c1854Xn1.g(z3);
                boolean zG = AbstractC5543ke1.g(iF);
                if (AbstractC5543ke1.g(iF2) || (iF2 == 0 && zG)) {
                    z = true;
                }
                C6446pN0 c6446pN02 = new C6446pN0(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    C2010Zn1 c2010Zn12 = new C2010Zn1(window.getInsetsController(), c6446pN02);
                    c2010Zn12.d = window;
                    c1854Xn12 = c2010Zn12;
                } else {
                    c1854Xn12 = i3 >= 26 ? new C1854Xn1(window, c6446pN02) : new C1776Wn1(window, c6446pN02);
                }
                c1854Xn12.f(z);
                C4223ho0 c4223ho0 = new C4223ho0(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                AbstractC4021gk1.u(viewFindViewById, c4223ho0);
                this.A = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.y, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new H80(requireDialog(), rect));
        }
        w();
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStop() {
        this.g.a.clear();
        super.onStop();
    }

    public final C3692f11 s() {
        if (this.f == null) {
            this.f = (C3692f11) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f;
    }

    public final String t() {
        C3692f11 c3692f11S = s();
        Context context = getContext();
        c3692f11S.getClass();
        Resources resources = context.getResources();
        Long l = c3692f11S.a;
        return l == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, AbstractC6292oZ1.a(l.longValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.fragment.app.Fragment, oo0] */
    public final void w() {
        Context contextRequireContext = requireContext();
        int i = this.e;
        if (i == 0) {
            s().getClass();
            i = AbstractC5340ja1.c(contextRequireContext, R.attr.materialCalendarTheme, C5381jo0.class.getCanonicalName()).data;
        }
        C3692f11 c3692f11S = s();
        C6898rl c6898rl = this.h;
        C2394bo0 c2394bo0 = new C2394bo0();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", c3692f11S);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c6898rl);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c6898rl.d);
        c2394bo0.setArguments(bundle);
        this.i = c2394bo0;
        if (this.m == 1) {
            C3692f11 c3692f11S2 = s();
            C6898rl c6898rl2 = this.h;
            ?? c6336oo0 = new C6336oo0();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", c3692f11S2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c6898rl2);
            c6336oo0.setArguments(bundle2);
            c2394bo0 = c6336oo0;
        }
        this.g = c2394bo0;
        this.v.setText((this.m == 1 && getResources().getConfiguration().orientation == 2) ? this.C : this.B);
        x(t());
        o childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        a aVar = new a(childFragmentManager);
        aVar.c(R.id.mtrl_calendar_frame, this.g, null, 2);
        if (aVar.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar.q.y(aVar, false);
        this.g.r(new C5191io0(this, 0));
    }

    public final void x(String str) {
        TextView textView = this.w;
        C3692f11 c3692f11S = s();
        Context contextRequireContext = requireContext();
        c3692f11S.getClass();
        Resources resources = contextRequireContext.getResources();
        Long l = c3692f11S.a;
        textView.setContentDescription(resources.getString(R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : AbstractC6292oZ1.a(l.longValue())));
        this.w.setText(str);
    }

    public final void y(CheckableImageButton checkableImageButton) {
        this.x.setContentDescription(this.m == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }
}
