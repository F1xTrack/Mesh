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
import com.google.android.material.timepicker.C1952h;
import java.util.Arrays;
import java.util.Locale;
import p000.AbstractC0691Ky;
import p000.AbstractC10944rk1;
import p000.C10156la1;
import p000.C11052sa1;
import p000.C11180ta1;
import p000.InterfaceC10796qa1;
import p000.InterfaceC8484Wn0;
import p000.ViewOnClickListenerC1822c2;
import ru.mes.dnevnik.R;

/* renamed from: com.google.android.material.timepicker.h */
/* loaded from: classes.dex */
public final class C1952h implements InterfaceC10796qa1 {

    /* renamed from: a */
    public final LinearLayout f18429a;

    /* renamed from: b */
    public final C10156la1 f18430b;

    /* renamed from: c */
    public final C11052sa1 f18431c;

    /* renamed from: d */
    public final C11052sa1 f18432d;

    /* renamed from: e */
    public final ChipTextInputComboView f18433e;

    /* renamed from: f */
    public final ChipTextInputComboView f18434f;

    /* renamed from: g */
    public final EditText f18435g;

    /* renamed from: h */
    public final EditText f18436h;

    /* renamed from: i */
    public final MaterialButtonToggleGroup f18437i;

    public C1952h(LinearLayout linearLayout, C10156la1 c10156la1) {
        C11052sa1 c11052sa1 = new C11052sa1(0, this);
        this.f18431c = c11052sa1;
        C11052sa1 c11052sa12 = new C11052sa1(1, this);
        this.f18432d = c11052sa12;
        this.f18429a = linearLayout;
        this.f18430b = c10156la1;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f18433e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f18434f = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(R.id.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(R.id.material_label);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (c10156la1.f37170c == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.f18437i = materialButtonToggleGroup;
            materialButtonToggleGroup.f18165c.add(new InterfaceC8484Wn0() { // from class: ra1
                @Override // p000.InterfaceC8484Wn0
                /* renamed from: a */
                public final void mo8859a(int i, boolean z) {
                    C1952h c1952h = this.f41737a;
                    c1952h.getClass();
                    if (z) {
                        c1952h.f18430b.m22514e(i == R.id.material_clock_period_pm_button ? 1 : 0);
                    }
                }
            });
            this.f18437i.setVisibility(0);
            m11293f();
        }
        ViewOnClickListenerC1822c2 viewOnClickListenerC1822c2 = new ViewOnClickListenerC1822c2(5, this);
        chipTextInputComboView2.setOnClickListener(viewOnClickListenerC1822c2);
        chipTextInputComboView.setOnClickListener(viewOnClickListenerC1822c2);
        EditText editText = chipTextInputComboView2.f18342c;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = c10156la1.f37169b;
        editText.setFilters(inputFilterArr);
        EditText editText2 = chipTextInputComboView.f18342c;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = c10156la1.f37168a;
        editText2.setFilters(inputFilterArr2);
        TextInputLayout textInputLayout = chipTextInputComboView2.f18341b;
        EditText editText3 = textInputLayout.getEditText();
        this.f18435g = editText3;
        TextInputLayout textInputLayout2 = chipTextInputComboView.f18341b;
        EditText editText4 = textInputLayout2.getEditText();
        this.f18436h = editText4;
        ViewOnKeyListenerC1951g viewOnKeyListenerC1951g = new ViewOnKeyListenerC1951g(chipTextInputComboView2, chipTextInputComboView, c10156la1);
        AbstractC10944rk1.m24482n(chipTextInputComboView2.f18340a, new C11180ta1(linearLayout.getContext(), c10156la1, 0));
        AbstractC10944rk1.m24482n(chipTextInputComboView.f18340a, new C11180ta1(linearLayout.getContext(), c10156la1, 1));
        editText3.addTextChangedListener(c11052sa12);
        editText4.addTextChangedListener(c11052sa1);
        m11292e(c10156la1);
        EditText editText5 = textInputLayout.getEditText();
        EditText editText6 = textInputLayout2.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(viewOnKeyListenerC1951g);
        editText5.setOnKeyListener(viewOnKeyListenerC1951g);
        editText6.setOnKeyListener(viewOnKeyListenerC1951g);
    }

    /* renamed from: a */
    public final void m11290a(int i) {
        this.f18430b.f37173f = i;
        this.f18433e.setChecked(i == 12);
        this.f18434f.setChecked(i == 10);
        m11293f();
    }

    @Override // p000.InterfaceC10796qa1
    /* renamed from: b */
    public final void mo11285b() {
        this.f18429a.setVisibility(0);
        m11290a(this.f18430b.f37173f);
    }

    @Override // p000.InterfaceC10796qa1
    /* renamed from: c */
    public final void mo11286c() {
        InputMethodManager inputMethodManager;
        LinearLayout linearLayout = this.f18429a;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null && (inputMethodManager = (InputMethodManager) AbstractC0691Ky.m4784b(focusedChild.getContext(), InputMethodManager.class)) != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        linearLayout.setVisibility(8);
    }

    /* renamed from: d */
    public final void m11291d() {
        C10156la1 c10156la1 = this.f18430b;
        this.f18433e.setChecked(c10156la1.f37173f == 12);
        this.f18434f.setChecked(c10156la1.f37173f == 10);
    }

    /* renamed from: e */
    public final void m11292e(C10156la1 c10156la1) {
        C11052sa1 c11052sa1 = this.f18432d;
        EditText editText = this.f18435g;
        editText.removeTextChangedListener(c11052sa1);
        C11052sa1 c11052sa12 = this.f18431c;
        EditText editText2 = this.f18436h;
        editText2.removeTextChangedListener(c11052sa12);
        Locale locale = this.f18429a.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(c10156la1.f37172e));
        String str2 = String.format(locale, "%02d", Integer.valueOf(c10156la1.m22511b()));
        ChipTextInputComboView chipTextInputComboView = this.f18433e;
        String strM22510a = C10156la1.m22510a(chipTextInputComboView.getResources(), str, "%02d");
        chipTextInputComboView.f18340a.setText(strM22510a);
        if (!TextUtils.isEmpty(strM22510a)) {
            C1945a c1945a = chipTextInputComboView.f18343d;
            EditText editText3 = chipTextInputComboView.f18342c;
            editText3.removeTextChangedListener(c1945a);
            editText3.setText(strM22510a);
            editText3.addTextChangedListener(c1945a);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.f18434f;
        String strM22510a2 = C10156la1.m22510a(chipTextInputComboView2.getResources(), str2, "%02d");
        chipTextInputComboView2.f18340a.setText(strM22510a2);
        if (!TextUtils.isEmpty(strM22510a2)) {
            C1945a c1945a2 = chipTextInputComboView2.f18343d;
            EditText editText4 = chipTextInputComboView2.f18342c;
            editText4.removeTextChangedListener(c1945a2);
            editText4.setText(strM22510a2);
            editText4.addTextChangedListener(c1945a2);
        }
        editText.addTextChangedListener(c11052sa1);
        editText2.addTextChangedListener(c11052sa12);
        m11293f();
    }

    /* renamed from: f */
    public final void m11293f() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f18437i;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.m11220b(this.f18430b.f37174g == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button, true);
    }

    @Override // p000.InterfaceC10796qa1
    public final void invalidate() {
        m11292e(this.f18430b);
    }
}
