package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import p000.C10156la1;
import p000.N91;

/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
public final class C1945a extends N91 {

    /* renamed from: a */
    public final /* synthetic */ ChipTextInputComboView f18391a;

    public C1945a(ChipTextInputComboView chipTextInputComboView) {
        this.f18391a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f18391a;
        if (zIsEmpty) {
            chipTextInputComboView.f18340a.setText(C10156la1.m22510a(chipTextInputComboView.getResources(), "00", "%02d"));
            return;
        }
        int i = ChipTextInputComboView.f18339f;
        String strM22510a = C10156la1.m22510a(chipTextInputComboView.getResources(), editable, "%02d");
        if (TextUtils.isEmpty(strM22510a)) {
            strM22510a = C10156la1.m22510a(chipTextInputComboView.getResources(), "00", "%02d");
        }
        chipTextInputComboView.f18340a.setText(strM22510a);
    }
}
