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
import com.google.android.material.button.MaterialButton;
import defpackage.AbstractC4021gk1;
import defpackage.AbstractC5340ja1;
import defpackage.AbstractC6897rk1;
import defpackage.AbstractC7209tN0;
import defpackage.C5722la1;
import defpackage.C6145no0;
import defpackage.DE;
import defpackage.NG0;
import defpackage.ViewOnClickListenerC6718qo0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class e extends androidx.fragment.app.g {
    public TimePickerView e;
    public ViewStub f;
    public f g;
    public h h;
    public Object i;
    public int j;
    public int k;
    public CharSequence m;
    public CharSequence o;
    public CharSequence q;
    public MaterialButton r;
    public Button s;
    public C5722la1 u;
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();
    public int l = 0;
    public int n = 0;
    public int p = 0;
    public int t = 0;
    public int v = 0;

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle == null) {
            return;
        }
        C5722la1 c5722la1 = (C5722la1) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.u = c5722la1;
        if (c5722la1 == null) {
            this.u = new C5722la1(0);
        }
        this.t = bundle.getInt("TIME_PICKER_INPUT_MODE", this.u.c != 1 ? 0 : 1);
        this.l = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.m = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.n = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.o = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.p = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.q = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.v = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        int i = this.v;
        if (i == 0) {
            TypedValue typedValueA = AbstractC5340ja1.a(requireContext(), R.attr.materialTimePickerTheme);
            i = typedValueA == null ? 0 : typedValueA.data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        C6145no0 c6145no0 = new C6145no0(context, null, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, NG0.v, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        this.k = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.j = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c6145no0.h(context);
        c6145no0.j(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(c6145no0);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        View decorView = window.getDecorView();
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        c6145no0.i(AbstractC4021gk1.i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.e = timePickerView;
        timePickerView.w = this;
        this.f = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.r = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i = this.l;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.m)) {
            textView.setText(this.m);
        }
        s(this.r);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new ViewOnClickListenerC6718qo0(this, 0));
        int i2 = this.n;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.o)) {
            button.setText(this.o);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.s = button2;
        button2.setOnClickListener(new ViewOnClickListenerC6718qo0(this, 1));
        int i3 = this.p;
        if (i3 != 0) {
            this.s.setText(i3);
        } else if (!TextUtils.isEmpty(this.q)) {
            this.s.setText(this.q);
        }
        Button button3 = this.s;
        if (button3 != null) {
            button3.setVisibility(isCancelable() ? 0 : 8);
        }
        this.r.setOnClickListener(new ViewOnClickListenerC6718qo0(this, 2));
        return viewGroup2;
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.i = null;
        this.g = null;
        this.h = null;
        TimePickerView timePickerView = this.e;
        if (timePickerView != null) {
            timePickerView.w = null;
            this.e = null;
        }
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.u);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.t);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.l);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.m);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.n);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.o);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.p);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.q);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.v);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.i instanceof h) {
            view.postDelayed(new DE(25, this), 100L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, qa1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qa1] */
    public final void s(MaterialButton materialButton) {
        h hVar;
        Pair pair;
        if (materialButton == null || this.e == null || this.f == null) {
            return;
        }
        ?? r0 = this.i;
        if (r0 != 0) {
            r0.c();
        }
        int i = this.t;
        TimePickerView timePickerView = this.e;
        ViewStub viewStub = this.f;
        if (i == 0) {
            f fVar = this.g;
            f fVar2 = fVar;
            if (fVar == null) {
                fVar2 = new f(timePickerView, this.u);
            }
            this.g = fVar2;
            hVar = fVar2;
        } else {
            if (this.h == null) {
                this.h = new h((LinearLayout) viewStub.inflate(), this.u);
            }
            h hVar2 = this.h;
            hVar2.e.setChecked(false);
            hVar2.f.setChecked(false);
            hVar = this.h;
        }
        this.i = hVar;
        hVar.b();
        this.i.invalidate();
        int i2 = this.t;
        if (i2 == 0) {
            pair = new Pair(Integer.valueOf(this.j), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException(AbstractC7209tN0.u(i2, "no icon for mode: "));
            }
            pair = new Pair(Integer.valueOf(this.k), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.g
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        Button button = this.s;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }
}
