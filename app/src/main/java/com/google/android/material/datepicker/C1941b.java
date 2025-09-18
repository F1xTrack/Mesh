package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import p000.C8898bo0;
import p000.C9196e41;
import p000.C9799io0;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C1941b implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f18206a;

    /* renamed from: b */
    public final /* synthetic */ C1943d f18207b;

    public C1941b(C1943d c1943d, MaterialCalendarGridView materialCalendarGridView) {
        this.f18207b = c1943d;
        this.f18206a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f18206a;
        C1940a c1940aM11239a = materialCalendarGridView.m11239a();
        if (i < c1940aM11239a.m11241a() || i > c1940aM11239a.m11243c()) {
            return;
        }
        C9196e41 c9196e41 = this.f18207b.f18212f;
        Long item = materialCalendarGridView.m11239a().getItem(i);
        long jLongValue = item.longValue();
        C8898bo0 c8898bo0 = (C8898bo0) c9196e41.f26532b;
        if (c8898bo0.f17162d.f41850c.mo7464S(jLongValue)) {
            c8898bo0.f17161c.f27015a = item;
            Iterator it = c8898bo0.f16856a.iterator();
            while (it.hasNext()) {
                ((C9799io0) it.next()).m21930b(c8898bo0.f17161c.f27015a);
            }
            c8898bo0.f17167i.getAdapter().f41641a.m24730b();
            RecyclerView recyclerView = c8898bo0.f17166h;
            if (recyclerView != null) {
                recyclerView.getAdapter().f41641a.m24730b();
            }
        }
    }
}
