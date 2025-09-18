package p000;

import android.R;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import androidx.fragment.app.AbstractActivityC1730l;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: yH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TimePickerDialogC11778yH0 extends TimePickerDialog {

    /* renamed from: h */
    public static final /* synthetic */ int f46167h = 0;

    /* renamed from: a */
    public TimePicker f46168a;

    /* renamed from: b */
    public final int f46169b;

    /* renamed from: c */
    public final int f46170c;

    /* renamed from: d */
    public final DialogInterfaceOnDismissListenerC10668pa1 f46171d;

    /* renamed from: e */
    public final Handler f46172e;

    /* renamed from: f */
    public RunnableC8648Zr0 f46173f;

    /* renamed from: g */
    public final AbstractActivityC1730l f46174g;

    public TimePickerDialogC11778yH0(AbstractActivityC1730l abstractActivityC1730l, DialogInterfaceOnDismissListenerC10668pa1 dialogInterfaceOnDismissListenerC10668pa1, int i, int i2, int i3, boolean z, int i4) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        super(abstractActivityC1730l, dialogInterfaceOnDismissListenerC10668pa1, i, i2, z);
        this.f46172e = new Handler();
        this.f46169b = i3;
        this.f46171d = dialogInterfaceOnDismissListenerC10668pa1;
        this.f46170c = i4;
        this.f46174g = abstractActivityC1730l;
        m26108a(abstractActivityC1730l, i, i2, z, i4);
    }

    /* renamed from: a */
    public final void m26108a(AbstractActivityC1730l abstractActivityC1730l, int i, int i2, boolean z, int i3) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 24 && i3 == 1) {
            try {
                abstractActivityC1730l.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("TimePicker").get(null), R.attr.timePickerStyle, 0).recycle();
                TimePicker timePicker = (TimePicker) TP1.m7689a(TimePickerDialog.class, TimePicker.class, "mTimePicker").get(this);
                Field fieldM7689a = TP1.m7689a(TimePicker.class, Class.forName("android.widget.TimePicker$TimePickerDelegate"), "mDelegate");
                Object obj = fieldM7689a.get(timePicker);
                Class<?> cls = Class.forName("android.widget.TimePickerSpinnerDelegate");
                if (obj.getClass() != cls) {
                    fieldM7689a.set(timePicker, null);
                    timePicker.removeAllViews();
                    Class<?> cls2 = Integer.TYPE;
                    Constructor<?> constructor = cls.getConstructor(TimePicker.class, Context.class, AttributeSet.class, cls2, cls2);
                    constructor.setAccessible(true);
                    fieldM7689a.set(timePicker, constructor.newInstance(timePicker, abstractActivityC1730l, null, Integer.valueOf(R.attr.timePickerStyle), 0));
                    timePicker.setIs24HourView(Boolean.valueOf(z));
                    timePicker.setCurrentHour(Integer.valueOf(i));
                    timePicker.setCurrentMinute(Integer.valueOf(i2));
                    timePicker.setOnTimeChangedListener(this);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b */
    public final boolean m26109b() {
        return this.f46170c == 1;
    }

    /* renamed from: c */
    public final int m26110c(int i) {
        int i2 = this.f46169b;
        int iRound = Math.round(i / i2) * i2;
        return iRound == 60 ? iRound - i2 : iRound;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        int i = this.f46169b;
        super.onAttachedToWindow();
        AbstractActivityC1730l abstractActivityC1730l = this.f46174g;
        TimePicker timePicker = (TimePicker) findViewById(abstractActivityC1730l.getResources().getIdentifier("timePicker", NotificationConstants.f19487ID, ConstantDeviceInfo.APP_PLATFORM));
        this.f46168a = timePicker;
        if (i == 1 || timePicker == null) {
            return;
        }
        int iIntValue = timePicker.getCurrentMinute().intValue();
        if (!m26109b()) {
            this.f46168a.setCurrentMinute(Integer.valueOf(m26110c(iIntValue)));
            return;
        }
        NumberPicker numberPicker = (NumberPicker) findViewById(abstractActivityC1730l.getResources().getIdentifier(LocalNotification.Repeat.Type.MINUTE, NotificationConstants.f19487ID, ConstantDeviceInfo.APP_PLATFORM));
        numberPicker.setMinValue(0);
        int i2 = 60 / i;
        numberPicker.setMaxValue(i2 - 1);
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < 60; i3 += i) {
            arrayList.add(String.format("%02d", Integer.valueOf(i3)));
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
        this.f46168a.setCurrentMinute(Integer.valueOf(m26110c(iIntValue) / i));
    }

    @Override // android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.f46169b != 1 || m26109b();
        TimePicker timePicker = this.f46168a;
        if (timePicker == null || i != -1 || !z) {
            super.onClick(dialogInterface, i);
            return;
        }
        timePicker.clearFocus();
        int iIntValue = this.f46168a.getCurrentHour().intValue();
        int iIntValue2 = this.f46168a.getCurrentMinute().intValue();
        if (m26109b()) {
            iIntValue2 *= this.f46169b;
        }
        if (this.f46169b != 1) {
            iIntValue2 = m26110c(iIntValue2);
        }
        DialogInterfaceOnDismissListenerC10668pa1 dialogInterfaceOnDismissListenerC10668pa1 = this.f46171d;
        if (dialogInterfaceOnDismissListenerC10668pa1 != null) {
            dialogInterfaceOnDismissListenerC10668pa1.onTimeSet(this.f46168a, iIntValue, iIntValue2);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f46172e.removeCallbacks(this.f46173f);
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
        int i3 = m26109b() ? this.f46169b * i2 : i2;
        Handler handler = this.f46172e;
        handler.removeCallbacks(this.f46173f);
        if (!m26109b()) {
            if (m26109b()) {
                throw new RuntimeException("minutesNeedCorrection is not intended to be used with spinner, spinner won't allow picking invalid values");
            }
            if (this.f46169b != 1 && i3 != m26110c(i3)) {
                int iM26110c = m26110c(i3);
                if (m26109b()) {
                    throw new RuntimeException("spinner never needs to be corrected because wrong values are not offered to user (both in scrolling and textInput mode)!");
                }
                RunnableC8648Zr0 runnableC8648Zr0 = new RunnableC8648Zr0(this, iM26110c, timePicker, i, 0);
                this.f46173f = runnableC8648Zr0;
                handler.postDelayed(runnableC8648Zr0, 500L);
                return;
            }
        }
        super.onTimeChanged(timePicker, i, i2);
    }

    @Override // android.app.TimePickerDialog
    public final void updateTime(int i, int i2) {
        if (this.f46169b == 1) {
            super.updateTime(i, i2);
            return;
        }
        if (!m26109b()) {
            super.updateTime(i, m26110c(i2));
            return;
        }
        int iIntValue = this.f46168a.getCurrentMinute().intValue();
        if (m26109b()) {
            iIntValue *= this.f46169b;
        }
        super.updateTime(i, m26110c(iIntValue) / this.f46169b);
    }

    public TimePickerDialogC11778yH0(AbstractActivityC1730l abstractActivityC1730l, DialogInterfaceOnDismissListenerC10668pa1 dialogInterfaceOnDismissListenerC10668pa1, int i, int i2, int i3, boolean z, int i4, int i5) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        super(abstractActivityC1730l, ru.mes.dnevnik.R.style.SpinnerTimePickerDialog, dialogInterfaceOnDismissListenerC10668pa1, i, i2, z);
        this.f46172e = new Handler();
        this.f46169b = i3;
        this.f46171d = dialogInterfaceOnDismissListenerC10668pa1;
        this.f46170c = i4;
        this.f46174g = abstractActivityC1730l;
        m26108a(abstractActivityC1730l, i, i2, z, i4);
    }
}
