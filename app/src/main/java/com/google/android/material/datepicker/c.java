package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.AbstractC6897rk1;
import defpackage.C2573ck1;
import defpackage.OO0;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class c extends OO0 {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public c(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        new C2573ck1(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).e(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
