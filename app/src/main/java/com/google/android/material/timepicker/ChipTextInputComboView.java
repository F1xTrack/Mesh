package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.K21;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: f */
    public static final /* synthetic */ int f18339f = 0;

    /* renamed from: a */
    public final Chip f18340a;

    /* renamed from: b */
    public final TextInputLayout f18341b;

    /* renamed from: c */
    public final EditText f18342c;

    /* renamed from: d */
    public final C1945a f18343d;

    /* renamed from: e */
    public final TextView f18344e;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f18340a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f18341b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f18342c = editText;
        editText.setVisibility(4);
        C1945a c1945a = new C1945a(this);
        this.f18343d = c1945a;
        editText.addTextChangedListener(c1945a);
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        this.f18344e = textView;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f18340a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f18342c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        Chip chip = this.f18340a;
        chip.setChecked(z);
        int i = z ? 0 : 4;
        EditText editText = this.f18342c;
        editText.setVisibility(i);
        chip.setVisibility(z ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new K21(1, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18340a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f18340a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f18340a.toggle();
    }
}
