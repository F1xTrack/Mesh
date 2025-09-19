package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import defpackage.C5722la1;
import defpackage.N91;

/* loaded from: classes.dex */
public final class a extends N91 {
    public final /* synthetic */ ChipTextInputComboView a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.a;
        if (zIsEmpty) {
            chipTextInputComboView.a.setText(C5722la1.a(chipTextInputComboView.getResources(), "00", "%02d"));
            return;
        }
        int i = ChipTextInputComboView.f;
        String strA = C5722la1.a(chipTextInputComboView.getResources(), editable, "%02d");
        if (TextUtils.isEmpty(strA)) {
            strA = C5722la1.a(chipTextInputComboView.getResources(), "00", "%02d");
        }
        chipTextInputComboView.a.setText(strA);
    }
}
