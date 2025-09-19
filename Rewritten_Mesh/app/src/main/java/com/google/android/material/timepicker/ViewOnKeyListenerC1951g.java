package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import p000.C10156la1;

/* renamed from: com.google.android.material.timepicker.g */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1951g implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a */
    public final ChipTextInputComboView f18425a;

    /* renamed from: b */
    public final ChipTextInputComboView f18426b;

    /* renamed from: c */
    public final C10156la1 f18427c;

    /* renamed from: d */
    public boolean f18428d = false;

    public ViewOnKeyListenerC1951g(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, C10156la1 c10156la1) {
        this.f18425a = chipTextInputComboView;
        this.f18426b = chipTextInputComboView2;
        this.f18427c = c10156la1;
    }

    /* renamed from: a */
    public final void m11289a(int i) {
        this.f18426b.setChecked(i == 12);
        this.f18425a.setChecked(i == 10);
        this.f18427c.f37173f = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            m11289a(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f18428d) {
            return false;
        }
        boolean z = true;
        this.f18428d = true;
        EditText editText = (EditText) view;
        if (this.f18427c.f37173f != 12) {
            Editable text = editText.getText();
            if (text == null) {
                z = false;
            } else if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                m11289a(12);
            } else {
                if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
                z = false;
            }
        } else if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            m11289a(10);
        } else {
            if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                editText.getText().clear();
            }
            z = false;
        }
        this.f18428d = false;
        return z;
    }
}
