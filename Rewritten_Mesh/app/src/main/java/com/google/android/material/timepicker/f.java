package com.google.android.material.timepicker;

import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import defpackage.AbstractC6897rk1;
import defpackage.C5722la1;
import defpackage.C6295oa1;
import defpackage.InterfaceC6677qa1;
import defpackage.InterfaceC6922rt;
import java.util.Locale;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class f implements InterfaceC6922rt, InterfaceC6677qa1 {
    public static final String[] f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    public static final String[] g = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    public static final String[] h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public final TimePickerView a;
    public final C5722la1 b;
    public float c;
    public float d;
    public boolean e = false;

    public f(TimePickerView timePickerView, C5722la1 c5722la1) {
        this.a = timePickerView;
        this.b = c5722la1;
        if (c5722la1.c == 0) {
            timePickerView.t.setVisibility(0);
        }
        timePickerView.r.j.add(this);
        timePickerView.v = this;
        timePickerView.u = this;
        timePickerView.r.r = this;
        String[] strArr = f;
        for (int i = 0; i < 12; i++) {
            strArr[i] = C5722la1.a(this.a.getResources(), strArr[i], "%d");
        }
        String[] strArr2 = h;
        for (int i2 = 0; i2 < 12; i2++) {
            strArr2[i2] = C5722la1.a(this.a.getResources(), strArr2[i2], "%02d");
        }
        invalidate();
    }

    @Override // defpackage.InterfaceC6922rt
    public final void a(float f2, boolean z) {
        if (this.e) {
            return;
        }
        C5722la1 c5722la1 = this.b;
        int i = c5722la1.d;
        int i2 = c5722la1.e;
        int iRound = Math.round(f2);
        int i3 = c5722la1.f;
        TimePickerView timePickerView = this.a;
        if (i3 == 12) {
            c5722la1.d((iRound + 3) / 6);
            this.c = (float) Math.floor(c5722la1.e * 6);
        } else {
            int i4 = (iRound + 15) / 30;
            if (c5722la1.c == 1) {
                i4 %= 12;
                if (timePickerView.s.s.u == 2) {
                    i4 += 12;
                }
            }
            c5722la1.c(i4);
            this.d = (c5722la1.b() * 30) % 360;
        }
        if (z) {
            return;
        }
        e();
        if (c5722la1.e == i2 && c5722la1.d == i) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    @Override // defpackage.InterfaceC6677qa1
    public final void b() {
        this.a.setVisibility(0);
    }

    @Override // defpackage.InterfaceC6677qa1
    public final void c() {
        this.a.setVisibility(8);
    }

    public final void d(int i, boolean z) {
        boolean z2 = i == 12;
        TimePickerView timePickerView = this.a;
        timePickerView.r.d = z2;
        C5722la1 c5722la1 = this.b;
        c5722la1.f = i;
        int i2 = c5722la1.c;
        String[] strArr = z2 ? h : i2 == 1 ? g : f;
        int i3 = z2 ? R.string.material_minute_suffix : i2 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
        ClockFaceView clockFaceView = timePickerView.s;
        clockFaceView.i(i3, strArr);
        int i4 = (c5722la1.f == 10 && i2 == 1 && c5722la1.d >= 12) ? 2 : 1;
        ClockHandView clockHandView = clockFaceView.s;
        clockHandView.u = i4;
        clockHandView.invalidate();
        timePickerView.r.c(z2 ? this.c : this.d, z);
        boolean z3 = i == 12;
        Chip chip = timePickerView.p;
        chip.setChecked(z3);
        int i5 = z3 ? 2 : 0;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        chip.setAccessibilityLiveRegion(i5);
        boolean z4 = i == 10;
        Chip chip2 = timePickerView.q;
        chip2.setChecked(z4);
        chip2.setAccessibilityLiveRegion(z4 ? 2 : 0);
        AbstractC6897rk1.n(chip2, new C6295oa1(this, timePickerView.getContext(), 0));
        AbstractC6897rk1.n(chip, new C6295oa1(this, timePickerView.getContext(), 1));
    }

    public final void e() {
        C5722la1 c5722la1 = this.b;
        int i = c5722la1.g;
        int iB = c5722la1.b();
        int i2 = c5722la1.e;
        TimePickerView timePickerView = this.a;
        timePickerView.getClass();
        timePickerView.t.b(i == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i2));
        String str2 = String.format(locale, "%02d", Integer.valueOf(iB));
        Chip chip = timePickerView.p;
        if (!TextUtils.equals(chip.getText(), str)) {
            chip.setText(str);
        }
        Chip chip2 = timePickerView.q;
        if (TextUtils.equals(chip2.getText(), str2)) {
            return;
        }
        chip2.setText(str2);
    }

    @Override // defpackage.InterfaceC6677qa1
    public final void invalidate() {
        C5722la1 c5722la1 = this.b;
        this.d = (c5722la1.b() * 30) % 360;
        this.c = c5722la1.e * 6;
        d(c5722la1.f, false);
        e();
    }
}
