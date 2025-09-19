package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import defpackage.AO0;
import defpackage.AbstractC6316oh1;
import defpackage.AbstractC6830rO0;
import defpackage.C1478Ss0;
import defpackage.C3513e41;
import defpackage.C3692f11;
import defpackage.C5381jo0;
import defpackage.C6898rl;
import defpackage.OO0;
import java.util.Calendar;
import java.util.Iterator;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class d extends AbstractC6830rO0 {
    public final C6898rl d;
    public final C3692f11 e;
    public final C3513e41 f;
    public final int g;

    public d(ContextThemeWrapper contextThemeWrapper, C3692f11 c3692f11, C6898rl c6898rl, C3513e41 c3513e41) {
        C1478Ss0 c1478Ss0 = c6898rl.a;
        C1478Ss0 c1478Ss02 = c6898rl.d;
        if (c1478Ss0.compareTo(c1478Ss02) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c1478Ss02.compareTo(c6898rl.b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * a.f) + (C5381jo0.v(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = c6898rl;
        this.e = c3692f11;
        this.f = c3513e41;
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = true;
    }

    @Override // defpackage.AbstractC6830rO0
    public final int a() {
        return this.d.g;
    }

    @Override // defpackage.AbstractC6830rO0
    public final long b(int i) {
        Calendar calendarD = AbstractC6316oh1.d(this.d.a.a);
        calendarD.add(2, i);
        calendarD.set(5, 1);
        Calendar calendarD2 = AbstractC6316oh1.d(calendarD);
        calendarD2.get(2);
        calendarD2.get(1);
        calendarD2.getMaximum(7);
        calendarD2.getActualMaximum(5);
        calendarD2.getTimeInMillis();
        return calendarD2.getTimeInMillis();
    }

    @Override // defpackage.AbstractC6830rO0
    public final void c(OO0 oo0, int i) {
        c cVar = (c) oo0;
        C6898rl c6898rl = this.d;
        Calendar calendarD = AbstractC6316oh1.d(c6898rl.a.a);
        calendarD.add(2, i);
        C1478Ss0 c1478Ss0 = new C1478Ss0(calendarD);
        cVar.u.setText(c1478Ss0.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) cVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !c1478Ss0.equals(materialCalendarGridView.a().a)) {
            a aVar = new a(c1478Ss0, this.e, c6898rl);
            materialCalendarGridView.setNumColumns(c1478Ss0.d);
            materialCalendarGridView.setAdapter((ListAdapter) aVar);
        } else {
            materialCalendarGridView.invalidate();
            a aVarA = materialCalendarGridView.a();
            Iterator it = aVarA.c.iterator();
            while (it.hasNext()) {
                aVarA.e(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            C3692f11 c3692f11 = aVarA.b;
            if (c3692f11 != null) {
                Iterator it2 = c3692f11.a().iterator();
                while (it2.hasNext()) {
                    aVarA.e(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                aVarA.c = c3692f11.a();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new b(this, materialCalendarGridView));
    }

    @Override // defpackage.AbstractC6830rO0
    public final OO0 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C5381jo0.v(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new c(linearLayout, false);
        }
        linearLayout.setLayoutParams(new AO0(-1, this.g));
        return new c(linearLayout, true);
    }
}
