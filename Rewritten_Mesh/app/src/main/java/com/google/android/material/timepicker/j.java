package com.google.android.material.timepicker;

import android.view.View;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {
    public final /* synthetic */ TimePickerView a;

    public j(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f fVar = this.a.v;
        if (fVar != null) {
            fVar.d(((Integer) view.getTag(R.id.selection_type)).intValue(), true);
        }
    }
}
