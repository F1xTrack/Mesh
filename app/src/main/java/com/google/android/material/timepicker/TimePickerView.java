package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p000.InterfaceC8484Wn0;
import p000.ViewOnTouchListenerC7644Gj0;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: x */
    public static final /* synthetic */ int f18382x = 0;

    /* renamed from: p */
    public final Chip f18383p;

    /* renamed from: q */
    public final Chip f18384q;

    /* renamed from: r */
    public final ClockHandView f18385r;

    /* renamed from: s */
    public final ClockFaceView f18386s;

    /* renamed from: t */
    public final MaterialButtonToggleGroup f18387t;

    /* renamed from: u */
    public C1950f f18388u;

    /* renamed from: v */
    public C1950f f18389v;

    /* renamed from: w */
    public C1949e f18390w;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC1954j viewOnClickListenerC1954j = new ViewOnClickListenerC1954j(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f18386s = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f18387t = materialButtonToggleGroup;
        materialButtonToggleGroup.f18165c.add(new InterfaceC8484Wn0() { // from class: com.google.android.material.timepicker.i
            @Override // p000.InterfaceC8484Wn0
            /* renamed from: a */
            public final void mo8859a(int i, boolean z) {
                TimePickerView timePickerView = this.f18438a;
                if (!z) {
                    int i2 = TimePickerView.f18382x;
                    timePickerView.getClass();
                } else {
                    C1950f c1950f = timePickerView.f18388u;
                    if (c1950f != null) {
                        c1950f.f18421b.m22514e(i == R.id.material_clock_period_pm_button ? 1 : 0);
                    }
                }
            }
        });
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f18383p = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f18384q = chip2;
        this.f18385r = (ClockHandView) findViewById(R.id.material_clock_hand);
        ViewOnTouchListenerC7644Gj0 viewOnTouchListenerC7644Gj0 = new ViewOnTouchListenerC7644Gj0(1, new GestureDetector(getContext(), new C1955k(this)));
        chip.setOnTouchListener(viewOnTouchListenerC7644Gj0);
        chip2.setOnTouchListener(viewOnTouchListenerC7644Gj0);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC1954j);
        chip2.setOnClickListener(viewOnClickListenerC1954j);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f18384q.sendAccessibilityEvent(8);
        }
    }
}
