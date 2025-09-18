package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.widget.BaseAdapter;
import android.widget.TextView;
import defpackage.AbstractC6316oh1;
import defpackage.C1478Ss0;
import defpackage.C2045Zz0;
import defpackage.C3692f11;
import defpackage.C4271i3;
import defpackage.C6898rl;
import defpackage.D7;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class a extends BaseAdapter {
    public static final int f = AbstractC6316oh1.g(null).getMaximum(4);
    public static final int g = (AbstractC6316oh1.g(null).getMaximum(7) + AbstractC6316oh1.g(null).getMaximum(5)) - 1;
    public final C1478Ss0 a;
    public final C3692f11 b;
    public ArrayList c;
    public D7 d;
    public final C6898rl e;

    public a(C1478Ss0 c1478Ss0, C3692f11 c3692f11, C6898rl c6898rl) {
        this.a = c1478Ss0;
        this.b = c3692f11;
        this.e = c6898rl;
        this.c = c3692f11.a();
    }

    public final int a() {
        int firstDayOfWeek = this.e.e;
        C1478Ss0 c1478Ss0 = this.a;
        Calendar calendar = c1478Ss0.a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + c1478Ss0.d : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int iA = (i - a()) + 1;
        Calendar calendarD = AbstractC6316oh1.d(this.a.a);
        calendarD.set(5, iA);
        return Long.valueOf(calendarD.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.e) - 1;
    }

    public final void d(TextView textView, long j) {
        boolean z;
        boolean z2;
        String str;
        C4271i3 c4271i3;
        boolean z3 = true;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = AbstractC6316oh1.f().getTimeInMillis() == j;
        C3692f11 c3692f11 = this.b;
        c3692f11.getClass();
        Iterator it = new ArrayList().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Object obj = ((C2045Zz0) it.next()).a;
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
            Object obj2 = ((C2045Zz0) it2.next()).b;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar calendarF = AbstractC6316oh1.f();
        Calendar calendarG = AbstractC6316oh1.g(null);
        calendarG.setTimeInMillis(j);
        if (calendarF.get(1) == calendarG.get(1)) {
            Locale locale = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? AbstractC6316oh1.c("MMMMEEEEd", locale).format(new Date(j)) : AbstractC6316oh1.e(0, locale).format(new Date(j));
        } else {
            Locale locale2 = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? AbstractC6316oh1.c("yMMMMEEEEd", locale2).format(new Date(j)) : AbstractC6316oh1.e(0, locale2).format(new Date(j));
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
        if (this.e.c.S(j)) {
            textView.setEnabled(true);
            Iterator it3 = c3692f11.a().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else if (AbstractC6316oh1.a(j) == AbstractC6316oh1.a(((Long) it3.next()).longValue())) {
                    break;
                }
            }
            textView.setSelected(z3);
            c4271i3 = z3 ? (C4271i3) this.d.c : AbstractC6316oh1.f().getTimeInMillis() == j ? (C4271i3) this.d.d : (C4271i3) this.d.b;
        } else {
            textView.setEnabled(false);
            c4271i3 = (C4271i3) this.d.a;
        }
        c4271i3.w(textView);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j) {
        C1478Ss0 c1478Ss0C = C1478Ss0.c(j);
        C1478Ss0 c1478Ss0 = this.a;
        if (c1478Ss0C.equals(c1478Ss0)) {
            Calendar calendarD = AbstractC6316oh1.d(c1478Ss0.a);
            calendarD.setTimeInMillis(j);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (calendarD.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.d;
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
            D7 r3 = r4.d
            if (r3 != 0) goto L11
            D7 r3 = new D7
            r3.<init>(r2)
            r4.d = r3
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
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            Ss0 r7 = r4.a
            int r3 = r7.e
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
            r4.d(r2, r5)
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
