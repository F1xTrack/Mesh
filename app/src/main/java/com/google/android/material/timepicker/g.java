package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.C5722la1;

/* loaded from: classes.dex */
public final class g implements TextView.OnEditorActionListener, View.OnKeyListener {
    public final ChipTextInputComboView a;
    public final ChipTextInputComboView b;
    public final C5722la1 c;
    public boolean d = false;

    public g(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, C5722la1 c5722la1) {
        this.a = chipTextInputComboView;
        this.b = chipTextInputComboView2;
        this.c = c5722la1;
    }

    public final void a(int i) {
        this.b.setChecked(i == 12);
        this.a.setChecked(i == 10);
        this.c.f = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            a(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.d) {
            return false;
        }
        boolean z = true;
        this.d = true;
        EditText editText = (EditText) view;
        if (this.c.f != 12) {
            Editable text = editText.getText();
            if (text == null) {
                z = false;
            } else if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                a(12);
            } else {
                if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
                z = false;
            }
        } else if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            a(10);
        } else {
            if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                editText.getText().clear();
            }
            z = false;
        }
        this.d = false;
        return z;
    }
}
