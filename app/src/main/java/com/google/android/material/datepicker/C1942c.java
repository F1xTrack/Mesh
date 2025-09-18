package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.C9019ck1;
import p000.OO0;
import ru.mes.dnevnik.R;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C1942c extends OO0 {

    /* renamed from: u */
    public final TextView f18208u;

    /* renamed from: v */
    public final MaterialCalendarGridView f18209v;

    public C1942c(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f18208u = textView;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        new C9019ck1(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).m9817e(textView, Boolean.TRUE);
        this.f18209v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
