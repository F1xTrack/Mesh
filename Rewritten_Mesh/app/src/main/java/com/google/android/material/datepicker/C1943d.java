package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;
import p000.AO0;
import p000.AbstractC10554oh1;
import p000.AbstractC10899rO0;
import p000.C6763rl;
import p000.C8286Ss0;
import p000.C9196e41;
import p000.C9315f11;
import p000.C9927jo0;
import p000.OO0;
import ru.mes.dnevnik.R;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public final class C1943d extends AbstractC10899rO0 {

    /* renamed from: d */
    public final C6763rl f18210d;

    /* renamed from: e */
    public final C9315f11 f18211e;

    /* renamed from: f */
    public final C9196e41 f18212f;

    /* renamed from: g */
    public final int f18213g;

    public C1943d(ContextThemeWrapper contextThemeWrapper, C9315f11 c9315f11, C6763rl c6763rl, C9196e41 c9196e41) {
        C8286Ss0 c8286Ss0 = c6763rl.f41848a;
        C8286Ss0 c8286Ss02 = c6763rl.f41851d;
        if (c8286Ss0.compareTo(c8286Ss02) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c8286Ss02.compareTo(c6763rl.f41849b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f18213g = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C1940a.f18199f) + (C9927jo0.m22103v(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f18210d = c6763rl;
        this.f18211e = c9315f11;
        this.f18212f = c9196e41;
        if (this.f41641a.m24729a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f41642b = true;
    }

    @Override // p000.AbstractC10899rO0
    /* renamed from: a */
    public final int mo3173a() {
        return this.f18210d.f41854g;
    }

    @Override // p000.AbstractC10899rO0
    /* renamed from: b */
    public final long mo11246b(int i) {
        Calendar calendarM23523d = AbstractC10554oh1.m23523d(this.f18210d.f41848a.f11016a);
        calendarM23523d.add(2, i);
        calendarM23523d.set(5, 1);
        Calendar calendarM23523d2 = AbstractC10554oh1.m23523d(calendarM23523d);
        calendarM23523d2.get(2);
        calendarM23523d2.get(1);
        calendarM23523d2.getMaximum(7);
        calendarM23523d2.getActualMaximum(5);
        calendarM23523d2.getTimeInMillis();
        return calendarM23523d2.getTimeInMillis();
    }

    @Override // p000.AbstractC10899rO0
    /* renamed from: c */
    public final void mo3174c(OO0 oo0, int i) {
        C1942c c1942c = (C1942c) oo0;
        C6763rl c6763rl = this.f18210d;
        Calendar calendarM23523d = AbstractC10554oh1.m23523d(c6763rl.f41848a.f11016a);
        calendarM23523d.add(2, i);
        C8286Ss0 c8286Ss0 = new C8286Ss0(calendarM23523d);
        c1942c.f18208u.setText(c8286Ss0.m7459d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c1942c.f18209v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m11239a() == null || !c8286Ss0.equals(materialCalendarGridView.m11239a().f18201a)) {
            C1940a c1940a = new C1940a(c8286Ss0, this.f18211e, c6763rl);
            materialCalendarGridView.setNumColumns(c8286Ss0.f11019d);
            materialCalendarGridView.setAdapter((ListAdapter) c1940a);
        } else {
            materialCalendarGridView.invalidate();
            C1940a c1940aM11239a = materialCalendarGridView.m11239a();
            Iterator it = c1940aM11239a.f18203c.iterator();
            while (it.hasNext()) {
                c1940aM11239a.m11245e(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            C9315f11 c9315f11 = c1940aM11239a.f18202b;
            if (c9315f11 != null) {
                Iterator it2 = c9315f11.m18154a().iterator();
                while (it2.hasNext()) {
                    c1940aM11239a.m11245e(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                c1940aM11239a.f18203c = c9315f11.m18154a();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C1941b(this, materialCalendarGridView));
    }

    @Override // p000.AbstractC10899rO0
    /* renamed from: d */
    public final OO0 mo3175d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C9927jo0.m22103v(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C1942c(linearLayout, false);
        }
        linearLayout.setLayoutParams(new AO0(-1, this.f18213g));
        return new C1942c(linearLayout, true);
    }
}
