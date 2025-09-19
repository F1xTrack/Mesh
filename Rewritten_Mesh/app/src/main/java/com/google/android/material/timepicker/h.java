package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.h;
import defpackage.AbstractC0872Ky;
import defpackage.AbstractC6897rk1;
import defpackage.C5722la1;
import defpackage.C7058sa1;
import defpackage.C7249ta1;
import defpackage.InterfaceC1775Wn0;
import defpackage.InterfaceC6677qa1;
import defpackage.ViewOnClickListenerC2437c2;
import java.util.Arrays;
import java.util.Locale;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class h implements InterfaceC6677qa1 {
    public final LinearLayout a;
    public final C5722la1 b;
    public final C7058sa1 c;
    public final C7058sa1 d;
    public final ChipTextInputComboView e;
    public final ChipTextInputComboView f;
    public final EditText g;
    public final EditText h;
    public final MaterialButtonToggleGroup i;

    public h(LinearLayout linearLayout, C5722la1 c5722la1) {
        C7058sa1 c7058sa1 = new C7058sa1(0, this);
        this.c = c7058sa1;
        C7058sa1 c7058sa12 = new C7058sa1(1, this);
        this.d = c7058sa12;
        this.a = linearLayout;
        this.b = c5722la1;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(R.id.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(R.id.material_label);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (c5722la1.c == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.i = materialButtonToggleGroup;
            materialButtonToggleGroup.c.add(new InterfaceC1775Wn0() { // from class: ra1
                @Override // defpackage.InterfaceC1775Wn0
                public final void a(int i, boolean z) {
                    h hVar = this.a;
                    hVar.getClass();
                    if (z) {
                        hVar.b.e(i == R.id.material_clock_period_pm_button ? 1 : 0);
                    }
                }
            });
            this.i.setVisibility(0);
            f();
        }
        ViewOnClickListenerC2437c2 viewOnClickListenerC2437c2 = new ViewOnClickListenerC2437c2(5, this);
        chipTextInputComboView2.setOnClickListener(viewOnClickListenerC2437c2);
        chipTextInputComboView.setOnClickListener(viewOnClickListenerC2437c2);
        EditText editText = chipTextInputComboView2.c;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = c5722la1.b;
        editText.setFilters(inputFilterArr);
        EditText editText2 = chipTextInputComboView.c;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = c5722la1.a;
        editText2.setFilters(inputFilterArr2);
        TextInputLayout textInputLayout = chipTextInputComboView2.b;
        EditText editText3 = textInputLayout.getEditText();
        this.g = editText3;
        TextInputLayout textInputLayout2 = chipTextInputComboView.b;
        EditText editText4 = textInputLayout2.getEditText();
        this.h = editText4;
        g gVar = new g(chipTextInputComboView2, chipTextInputComboView, c5722la1);
        AbstractC6897rk1.n(chipTextInputComboView2.a, new C7249ta1(linearLayout.getContext(), c5722la1, 0));
        AbstractC6897rk1.n(chipTextInputComboView.a, new C7249ta1(linearLayout.getContext(), c5722la1, 1));
        editText3.addTextChangedListener(c7058sa12);
        editText4.addTextChangedListener(c7058sa1);
        e(c5722la1);
        EditText editText5 = textInputLayout.getEditText();
        EditText editText6 = textInputLayout2.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(gVar);
        editText5.setOnKeyListener(gVar);
        editText6.setOnKeyListener(gVar);
    }

    public final void a(int i) {
        this.b.f = i;
        this.e.setChecked(i == 12);
        this.f.setChecked(i == 10);
        f();
    }

    @Override // defpackage.InterfaceC6677qa1
    public final void b() {
        this.a.setVisibility(0);
        a(this.b.f);
    }

    @Override // defpackage.InterfaceC6677qa1
    public final void c() {
        InputMethodManager inputMethodManager;
        LinearLayout linearLayout = this.a;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null && (inputMethodManager = (InputMethodManager) AbstractC0872Ky.b(focusedChild.getContext(), InputMethodManager.class)) != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        linearLayout.setVisibility(8);
    }

    public final void d() {
        C5722la1 c5722la1 = this.b;
        this.e.setChecked(c5722la1.f == 12);
        this.f.setChecked(c5722la1.f == 10);
    }

    public final void e(C5722la1 c5722la1) {
        C7058sa1 c7058sa1 = this.d;
        EditText editText = this.g;
        editText.removeTextChangedListener(c7058sa1);
        C7058sa1 c7058sa12 = this.c;
        EditText editText2 = this.h;
        editText2.removeTextChangedListener(c7058sa12);
        Locale locale = this.a.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(c5722la1.e));
        String str2 = String.format(locale, "%02d", Integer.valueOf(c5722la1.b()));
        ChipTextInputComboView chipTextInputComboView = this.e;
        String strA = C5722la1.a(chipTextInputComboView.getResources(), str, "%02d");
        chipTextInputComboView.a.setText(strA);
        if (!TextUtils.isEmpty(strA)) {
            a aVar = chipTextInputComboView.d;
            EditText editText3 = chipTextInputComboView.c;
            editText3.removeTextChangedListener(aVar);
            editText3.setText(strA);
            editText3.addTextChangedListener(aVar);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.f;
        String strA2 = C5722la1.a(chipTextInputComboView2.getResources(), str2, "%02d");
        chipTextInputComboView2.a.setText(strA2);
        if (!TextUtils.isEmpty(strA2)) {
            a aVar2 = chipTextInputComboView2.d;
            EditText editText4 = chipTextInputComboView2.c;
            editText4.removeTextChangedListener(aVar2);
            editText4.setText(strA2);
            editText4.addTextChangedListener(aVar2);
        }
        editText.addTextChangedListener(c7058sa1);
        editText2.addTextChangedListener(c7058sa12);
        f();
    }

    public final void f() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.i;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.b(this.b.g == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button, true);
    }

    @Override // defpackage.InterfaceC6677qa1
    public final void invalidate() {
        e(this.b);
    }
}
