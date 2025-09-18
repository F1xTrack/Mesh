package com.google.android.material.timepicker;

import android.view.View;
import ru.mes.dnevnik.R;

/* renamed from: com.google.android.material.timepicker.j */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1954j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f18439a;

    public ViewOnClickListenerC1954j(TimePickerView timePickerView) {
        this.f18439a = timePickerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1950f c1950f = this.f18439a.f18389v;
        if (c1950f != null) {
            c1950f.m11287d(((Integer) view.getTag(R.id.selection_type)).intValue(), true);
        }
    }
}
