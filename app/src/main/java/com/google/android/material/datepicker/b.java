package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.C2394bo0;
import defpackage.C3513e41;
import defpackage.C5191io0;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ d b;

    public b(d dVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = dVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        a aVarA = materialCalendarGridView.a();
        if (i < aVarA.a() || i > aVarA.c()) {
            return;
        }
        C3513e41 c3513e41 = this.b.f;
        Long item = materialCalendarGridView.a().getItem(i);
        long jLongValue = item.longValue();
        C2394bo0 c2394bo0 = (C2394bo0) c3513e41.b;
        if (c2394bo0.d.c.S(jLongValue)) {
            c2394bo0.c.a = item;
            Iterator it = c2394bo0.a.iterator();
            while (it.hasNext()) {
                ((C5191io0) it.next()).b(c2394bo0.c.a);
            }
            c2394bo0.i.getAdapter().a.b();
            RecyclerView recyclerView = c2394bo0.h;
            if (recyclerView != null) {
                recyclerView.getAdapter().a.b();
            }
        }
    }
}
