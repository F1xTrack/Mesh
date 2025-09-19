package com.google.android.material.timepicker;

import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import java.util.Locale;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.C10156la1;
import p000.C10540oa1;
import p000.InterfaceC10796qa1;
import p000.InterfaceC6771rt;
import ru.mes.dnevnik.R;

/* renamed from: com.google.android.material.timepicker.f */
/* loaded from: classes.dex */
public final class C1950f implements InterfaceC6771rt, InterfaceC10796qa1 {

    /* renamed from: f */
    public static final String[] f18417f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: g */
    public static final String[] f18418g = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* renamed from: h */
    public static final String[] f18419h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: a */
    public final TimePickerView f18420a;

    /* renamed from: b */
    public final C10156la1 f18421b;

    /* renamed from: c */
    public float f18422c;

    /* renamed from: d */
    public float f18423d;

    /* renamed from: e */
    public boolean f18424e = false;

    public C1950f(TimePickerView timePickerView, C10156la1 c10156la1) {
        this.f18420a = timePickerView;
        this.f18421b = c10156la1;
        if (c10156la1.f37170c == 0) {
            timePickerView.f18387t.setVisibility(0);
        }
        timePickerView.f18385r.f18370j.add(this);
        timePickerView.f18389v = this;
        timePickerView.f18388u = this;
        timePickerView.f18385r.f18378r = this;
        String[] strArr = f18417f;
        for (int i = 0; i < 12; i++) {
            strArr[i] = C10156la1.m22510a(this.f18420a.getResources(), strArr[i], "%d");
        }
        String[] strArr2 = f18419h;
        for (int i2 = 0; i2 < 12; i2++) {
            strArr2[i2] = C10156la1.m22510a(this.f18420a.getResources(), strArr2[i2], "%02d");
        }
        invalidate();
    }

    @Override // p000.InterfaceC6771rt
    /* renamed from: a */
    public final void mo11277a(float f, boolean z) {
        if (this.f18424e) {
            return;
        }
        C10156la1 c10156la1 = this.f18421b;
        int i = c10156la1.f37171d;
        int i2 = c10156la1.f37172e;
        int iRound = Math.round(f);
        int i3 = c10156la1.f37173f;
        TimePickerView timePickerView = this.f18420a;
        if (i3 == 12) {
            c10156la1.m22513d((iRound + 3) / 6);
            this.f18422c = (float) Math.floor(c10156la1.f37172e * 6);
        } else {
            int i4 = (iRound + 15) / 30;
            if (c10156la1.f37170c == 1) {
                i4 %= 12;
                if (timePickerView.f18386s.f18352s.f18381u == 2) {
                    i4 += 12;
                }
            }
            c10156la1.m22512c(i4);
            this.f18423d = (c10156la1.m22511b() * 30) % 360;
        }
        if (z) {
            return;
        }
        m11288e();
        if (c10156la1.f37172e == i2 && c10156la1.f37171d == i) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    @Override // p000.InterfaceC10796qa1
    /* renamed from: b */
    public final void mo11285b() {
        this.f18420a.setVisibility(0);
    }

    @Override // p000.InterfaceC10796qa1
    /* renamed from: c */
    public final void mo11286c() {
        this.f18420a.setVisibility(8);
    }

    /* renamed from: d */
    public final void m11287d(int i, boolean z) {
        boolean z2 = i == 12;
        TimePickerView timePickerView = this.f18420a;
        timePickerView.f18385r.f18364d = z2;
        C10156la1 c10156la1 = this.f18421b;
        c10156la1.f37173f = i;
        int i2 = c10156la1.f37170c;
        String[] strArr = z2 ? f18419h : i2 == 1 ? f18418g : f18417f;
        int i3 = z2 ? R.string.material_minute_suffix : i2 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
        ClockFaceView clockFaceView = timePickerView.f18386s;
        clockFaceView.m11279i(i3, strArr);
        int i4 = (c10156la1.f37173f == 10 && i2 == 1 && c10156la1.f37171d >= 12) ? 2 : 1;
        ClockHandView clockHandView = clockFaceView.f18352s;
        clockHandView.f18381u = i4;
        clockHandView.invalidate();
        timePickerView.f18385r.m11282c(z2 ? this.f18422c : this.f18423d, z);
        boolean z3 = i == 12;
        Chip chip = timePickerView.f18383p;
        chip.setChecked(z3);
        int i5 = z3 ? 2 : 0;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        chip.setAccessibilityLiveRegion(i5);
        boolean z4 = i == 10;
        Chip chip2 = timePickerView.f18384q;
        chip2.setChecked(z4);
        chip2.setAccessibilityLiveRegion(z4 ? 2 : 0);
        AbstractC10944rk1.m24482n(chip2, new C10540oa1(this, timePickerView.getContext(), 0));
        AbstractC10944rk1.m24482n(chip, new C10540oa1(this, timePickerView.getContext(), 1));
    }

    /* renamed from: e */
    public final void m11288e() {
        C10156la1 c10156la1 = this.f18421b;
        int i = c10156la1.f37174g;
        int iM22511b = c10156la1.m22511b();
        int i2 = c10156la1.f37172e;
        TimePickerView timePickerView = this.f18420a;
        timePickerView.getClass();
        timePickerView.f18387t.m11220b(i == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i2));
        String str2 = String.format(locale, "%02d", Integer.valueOf(iM22511b));
        Chip chip = timePickerView.f18383p;
        if (!TextUtils.equals(chip.getText(), str)) {
            chip.setText(str);
        }
        Chip chip2 = timePickerView.f18384q;
        if (TextUtils.equals(chip2.getText(), str2)) {
            return;
        }
        chip2.setText(str2);
    }

    @Override // p000.InterfaceC10796qa1
    public final void invalidate() {
        C10156la1 c10156la1 = this.f18421b;
        this.f18423d = (c10156la1.m22511b() * 30) % 360;
        this.f18422c = c10156la1.f37172e * 6;
        m11287d(c10156la1.f37173f, false);
        m11288e();
    }
}
