package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC11153tN0;
import p000.AbstractC9536gk1;
import p000.AbstractC9900ja1;
import p000.C10156la1;
import p000.C10439no0;
import p000.NG0;
import p000.RunnableC0204DE;
import p000.ViewOnClickListenerC10823qo0;
import ru.mes.dnevnik.R;

/* renamed from: com.google.android.material.timepicker.e */
/* loaded from: classes.dex */
public final class C1949e extends DialogInterfaceOnCancelListenerC1725g {

    /* renamed from: e */
    public TimePickerView f18399e;

    /* renamed from: f */
    public ViewStub f18400f;

    /* renamed from: g */
    public C1950f f18401g;

    /* renamed from: h */
    public C1952h f18402h;

    /* renamed from: i */
    public Object f18403i;

    /* renamed from: j */
    public int f18404j;

    /* renamed from: k */
    public int f18405k;

    /* renamed from: m */
    public CharSequence f18407m;

    /* renamed from: o */
    public CharSequence f18409o;

    /* renamed from: q */
    public CharSequence f18411q;

    /* renamed from: r */
    public MaterialButton f18412r;

    /* renamed from: s */
    public Button f18413s;

    /* renamed from: u */
    public C10156la1 f18415u;

    /* renamed from: a */
    public final LinkedHashSet f18395a = new LinkedHashSet();

    /* renamed from: b */
    public final LinkedHashSet f18396b = new LinkedHashSet();

    /* renamed from: c */
    public final LinkedHashSet f18397c = new LinkedHashSet();

    /* renamed from: d */
    public final LinkedHashSet f18398d = new LinkedHashSet();

    /* renamed from: l */
    public int f18406l = 0;

    /* renamed from: n */
    public int f18408n = 0;

    /* renamed from: p */
    public int f18410p = 0;

    /* renamed from: t */
    public int f18414t = 0;

    /* renamed from: v */
    public int f18416v = 0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f18397c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle == null) {
            return;
        }
        C10156la1 c10156la1 = (C10156la1) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f18415u = c10156la1;
        if (c10156la1 == null) {
            this.f18415u = new C10156la1(0);
        }
        this.f18414t = bundle.getInt("TIME_PICKER_INPUT_MODE", this.f18415u.f37170c != 1 ? 0 : 1);
        this.f18406l = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f18407m = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f18408n = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f18409o = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f18410p = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f18411q = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.f18416v = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        int i = this.f18416v;
        if (i == 0) {
            TypedValue typedValueM22072a = AbstractC9900ja1.m22072a(requireContext(), R.attr.materialTimePickerTheme);
            i = typedValueM22072a == null ? 0 : typedValueM22072a.data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        C10439no0 c10439no0 = new C10439no0(context, null, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, NG0.f7708v, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        this.f18405k = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.f18404j = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c10439no0.m23236h(context);
        c10439no0.m23238j(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(c10439no0);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        View decorView = window.getDecorView();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        c10439no0.m23237i(AbstractC9536gk1.m18614i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f18399e = timePickerView;
        timePickerView.f18390w = this;
        this.f18400f = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f18412r = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i = this.f18406l;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.f18407m)) {
            textView.setText(this.f18407m);
        }
        m11284s(this.f18412r);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new ViewOnClickListenerC10823qo0(this, 0));
        int i2 = this.f18408n;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.f18409o)) {
            button.setText(this.f18409o);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f18413s = button2;
        button2.setOnClickListener(new ViewOnClickListenerC10823qo0(this, 1));
        int i3 = this.f18410p;
        if (i3 != 0) {
            this.f18413s.setText(i3);
        } else if (!TextUtils.isEmpty(this.f18411q)) {
            this.f18413s.setText(this.f18411q);
        }
        Button button3 = this.f18413s;
        if (button3 != null) {
            button3.setVisibility(isCancelable() ? 0 : 8);
        }
        this.f18412r.setOnClickListener(new ViewOnClickListenerC10823qo0(this, 2));
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18403i = null;
        this.f18401g = null;
        this.f18402h = null;
        TimePickerView timePickerView = this.f18399e;
        if (timePickerView != null) {
            timePickerView.f18390w = null;
            this.f18399e = null;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f18398d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f18415u);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f18414t);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f18406l);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f18407m);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f18408n);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f18409o);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f18410p);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f18411q);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f18416v);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f18403i instanceof C1952h) {
            view.postDelayed(new RunnableC0204DE(25, this), 100L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, qa1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qa1] */
    /* renamed from: s */
    public final void m11284s(MaterialButton materialButton) {
        C1952h c1952h;
        Pair pair;
        if (materialButton == null || this.f18399e == null || this.f18400f == null) {
            return;
        }
        ?? r0 = this.f18403i;
        if (r0 != 0) {
            r0.mo11286c();
        }
        int i = this.f18414t;
        TimePickerView timePickerView = this.f18399e;
        ViewStub viewStub = this.f18400f;
        if (i == 0) {
            C1950f c1950f = this.f18401g;
            C1950f c1950f2 = c1950f;
            if (c1950f == null) {
                c1950f2 = new C1950f(timePickerView, this.f18415u);
            }
            this.f18401g = c1950f2;
            c1952h = c1950f2;
        } else {
            if (this.f18402h == null) {
                this.f18402h = new C1952h((LinearLayout) viewStub.inflate(), this.f18415u);
            }
            C1952h c1952h2 = this.f18402h;
            c1952h2.f18433e.setChecked(false);
            c1952h2.f18434f.setChecked(false);
            c1952h = this.f18402h;
        }
        this.f18403i = c1952h;
        c1952h.mo11285b();
        this.f18403i.invalidate();
        int i2 = this.f18414t;
        if (i2 == 0) {
            pair = new Pair(Integer.valueOf(this.f18404j), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "no icon for mode: "));
            }
            pair = new Pair(Integer.valueOf(this.f18405k), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        Button button = this.f18413s;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }
}
