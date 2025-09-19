package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC10554oh1;
import p000.C0197D7;
import p000.C4218i3;
import p000.C6763rl;
import p000.C8286Ss0;
import p000.C8664Zz0;
import p000.C9315f11;
import ru.mes.dnevnik.R;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes.dex */
public final class C1940a extends BaseAdapter {

    /* renamed from: f */
    public static final int f18199f = AbstractC10554oh1.m23526g(null).getMaximum(4);

    /* renamed from: g */
    public static final int f18200g = (AbstractC10554oh1.m23526g(null).getMaximum(7) + AbstractC10554oh1.m23526g(null).getMaximum(5)) - 1;

    /* renamed from: a */
    public final C8286Ss0 f18201a;

    /* renamed from: b */
    public final C9315f11 f18202b;

    /* renamed from: c */
    public ArrayList f18203c;

    /* renamed from: d */
    public C0197D7 f18204d;

    /* renamed from: e */
    public final C6763rl f18205e;

    public C1940a(C8286Ss0 c8286Ss0, C9315f11 c9315f11, C6763rl c6763rl) {
        this.f18201a = c8286Ss0;
        this.f18202b = c9315f11;
        this.f18205e = c6763rl;
        this.f18203c = c9315f11.m18154a();
    }

    /* renamed from: a */
    public final int m11241a() {
        int firstDayOfWeek = this.f18205e.f41852e;
        C8286Ss0 c8286Ss0 = this.f18201a;
        Calendar calendar = c8286Ss0.f11016a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + c8286Ss0.f11019d : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final Long getItem(int i) {
        if (i < m11241a() || i > m11243c()) {
            return null;
        }
        int iM11241a = (i - m11241a()) + 1;
        Calendar calendarM23523d = AbstractC10554oh1.m23523d(this.f18201a.f11016a);
        calendarM23523d.set(5, iM11241a);
        return Long.valueOf(calendarM23523d.getTimeInMillis());
    }

    /* renamed from: c */
    public final int m11243c() {
        return (m11241a() + this.f18201a.f11020e) - 1;
    }

    /* renamed from: d */
    public final void m11244d(TextView textView, long j) {
        boolean z;
        boolean z2;
        String str;
        C4218i3 c4218i3;
        boolean z3 = true;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = AbstractC10554oh1.m23525f().getTimeInMillis() == j;
        C9315f11 c9315f11 = this.f18202b;
        c9315f11.getClass();
        Iterator it = new ArrayList().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Object obj = ((C8664Zz0) it.next()).f15267a;
            if (obj != null && ((Long) obj).longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator it2 = new ArrayList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Object obj2 = ((C8664Zz0) it2.next()).f15268b;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar calendarM23525f = AbstractC10554oh1.m23525f();
        Calendar calendarM23526g = AbstractC10554oh1.m23526g(null);
        calendarM23526g.setTimeInMillis(j);
        if (calendarM23525f.get(1) == calendarM23526g.get(1)) {
            Locale locale = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? AbstractC10554oh1.m23522c("MMMMEEEEd", locale).format(new Date(j)) : AbstractC10554oh1.m23524e(0, locale).format(new Date(j));
        } else {
            Locale locale2 = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? AbstractC10554oh1.m23522c("yMMMMEEEEd", locale2).format(new Date(j)) : AbstractC10554oh1.m23524e(0, locale2).format(new Date(j));
        }
        if (z4) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z2) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f18205e.f41850c.mo7464S(j)) {
            textView.setEnabled(true);
            Iterator it3 = c9315f11.m18154a().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else if (AbstractC10554oh1.m23520a(j) == AbstractC10554oh1.m23520a(((Long) it3.next()).longValue())) {
                    break;
                }
            }
            textView.setSelected(z3);
            c4218i3 = z3 ? (C4218i3) this.f18204d.f1848c : AbstractC10554oh1.m23525f().getTimeInMillis() == j ? (C4218i3) this.f18204d.f1849d : (C4218i3) this.f18204d.f1847b;
        } else {
            textView.setEnabled(false);
            c4218i3 = (C4218i3) this.f18204d.f1846a;
        }
        c4218i3.m18958w(textView);
    }

    /* renamed from: e */
    public final void m11245e(MaterialCalendarGridView materialCalendarGridView, long j) {
        C8286Ss0 c8286Ss0M7457c = C8286Ss0.m7457c(j);
        C8286Ss0 c8286Ss0 = this.f18201a;
        if (c8286Ss0M7457c.equals(c8286Ss0)) {
            Calendar calendarM23523d = AbstractC10554oh1.m23523d(c8286Ss0.f11016a);
            calendarM23523d.setTimeInMillis(j);
            m11244d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.m11239a().m11241a() + (calendarM23523d.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f18200g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f18201a.f11019d;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            android.content.Context r2 = r7.getContext()
            D7 r3 = r4.f18204d
            if (r3 != 0) goto L11
            D7 r3 = new D7
            r3.<init>(r2)
            r4.f18204d = r3
        L11:
            r2 = r6
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r6 != 0) goto L28
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r2 = 2131558500(0x7f0d0064, float:1.8742318E38)
            android.view.View r6 = r6.inflate(r2, r7, r1)
            r2 = r6
            android.widget.TextView r2 = (android.widget.TextView) r2
        L28:
            int r6 = r4.m11241a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            Ss0 r7 = r4.f18201a
            int r3 = r7.f11020e
            if (r6 < r3) goto L37
            goto L5d
        L37:
            int r6 = r6 + r0
            r2.setTag(r7)
            android.content.res.Resources r7 = r2.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r1] = r6
            java.lang.String r6 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r6, r3)
            r2.setText(r6)
            r2.setVisibility(r1)
            r2.setEnabled(r0)
            goto L65
        L5d:
            r6 = 8
            r2.setVisibility(r6)
            r2.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L73
        L6c:
            long r5 = r5.longValue()
            r4.m11244d(r2, r5)
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C1940a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
