package defpackage;

import android.R;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import androidx.fragment.app.l;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: yH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TimePickerDialogC8143yH0 extends TimePickerDialog {
    public static final /* synthetic */ int h = 0;
    public TimePicker a;
    public final int b;
    public final int c;
    public final DialogInterfaceOnDismissListenerC6486pa1 d;
    public final Handler e;
    public RunnableC2021Zr0 f;
    public final l g;

    public TimePickerDialogC8143yH0(l lVar, DialogInterfaceOnDismissListenerC6486pa1 dialogInterfaceOnDismissListenerC6486pa1, int i, int i2, int i3, boolean z, int i4) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        super(lVar, dialogInterfaceOnDismissListenerC6486pa1, i, i2, z);
        this.e = new Handler();
        this.b = i3;
        this.d = dialogInterfaceOnDismissListenerC6486pa1;
        this.c = i4;
        this.g = lVar;
        a(lVar, i, i2, z, i4);
    }

    public final void a(l lVar, int i, int i2, boolean z, int i3) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 24 && i3 == 1) {
            try {
                lVar.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("TimePicker").get(null), R.attr.timePickerStyle, 0).recycle();
                TimePicker timePicker = (TimePicker) TP1.a(TimePickerDialog.class, TimePicker.class, "mTimePicker").get(this);
                Field fieldA = TP1.a(TimePicker.class, Class.forName("android.widget.TimePicker$TimePickerDelegate"), "mDelegate");
                Object obj = fieldA.get(timePicker);
                Class<?> cls = Class.forName("android.widget.TimePickerSpinnerDelegate");
                if (obj.getClass() != cls) {
                    fieldA.set(timePicker, null);
                    timePicker.removeAllViews();
                    Class<?> cls2 = Integer.TYPE;
                    Constructor<?> constructor = cls.getConstructor(TimePicker.class, Context.class, AttributeSet.class, cls2, cls2);
                    constructor.setAccessible(true);
                    fieldA.set(timePicker, constructor.newInstance(timePicker, lVar, null, Integer.valueOf(R.attr.timePickerStyle), 0));
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

    public final boolean b() {
        return this.c == 1;
    }

    public final int c(int i) {
        int i2 = this.b;
        int iRound = Math.round(i / i2) * i2;
        return iRound == 60 ? iRound - i2 : iRound;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        int i = this.b;
        super.onAttachedToWindow();
        l lVar = this.g;
        TimePicker timePicker = (TimePicker) findViewById(lVar.getResources().getIdentifier("timePicker", NotificationConstants.ID, ConstantDeviceInfo.APP_PLATFORM));
        this.a = timePicker;
        if (i == 1 || timePicker == null) {
            return;
        }
        int iIntValue = timePicker.getCurrentMinute().intValue();
        if (!b()) {
            this.a.setCurrentMinute(Integer.valueOf(c(iIntValue)));
            return;
        }
        NumberPicker numberPicker = (NumberPicker) findViewById(lVar.getResources().getIdentifier(LocalNotification.Repeat.Type.MINUTE, NotificationConstants.ID, ConstantDeviceInfo.APP_PLATFORM));
        numberPicker.setMinValue(0);
        int i2 = 60 / i;
        numberPicker.setMaxValue(i2 - 1);
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < 60; i3 += i) {
            arrayList.add(String.format("%02d", Integer.valueOf(i3)));
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
        this.a.setCurrentMinute(Integer.valueOf(c(iIntValue) / i));
    }

    @Override // android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.b != 1 || b();
        TimePicker timePicker = this.a;
        if (timePicker == null || i != -1 || !z) {
            super.onClick(dialogInterface, i);
            return;
        }
        timePicker.clearFocus();
        int iIntValue = this.a.getCurrentHour().intValue();
        int iIntValue2 = this.a.getCurrentMinute().intValue();
        if (b()) {
            iIntValue2 *= this.b;
        }
        if (this.b != 1) {
            iIntValue2 = c(iIntValue2);
        }
        DialogInterfaceOnDismissListenerC6486pa1 dialogInterfaceOnDismissListenerC6486pa1 = this.d;
        if (dialogInterfaceOnDismissListenerC6486pa1 != null) {
            dialogInterfaceOnDismissListenerC6486pa1.onTimeSet(this.a, iIntValue, iIntValue2);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.e.removeCallbacks(this.f);
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
        int i3 = b() ? this.b * i2 : i2;
        Handler handler = this.e;
        handler.removeCallbacks(this.f);
        if (!b()) {
            if (b()) {
                throw new RuntimeException("minutesNeedCorrection is not intended to be used with spinner, spinner won't allow picking invalid values");
            }
            if (this.b != 1 && i3 != c(i3)) {
                int iC = c(i3);
                if (b()) {
                    throw new RuntimeException("spinner never needs to be corrected because wrong values are not offered to user (both in scrolling and textInput mode)!");
                }
                RunnableC2021Zr0 runnableC2021Zr0 = new RunnableC2021Zr0(this, iC, timePicker, i, 0);
                this.f = runnableC2021Zr0;
                handler.postDelayed(runnableC2021Zr0, 500L);
                return;
            }
        }
        super.onTimeChanged(timePicker, i, i2);
    }

    @Override // android.app.TimePickerDialog
    public final void updateTime(int i, int i2) {
        if (this.b == 1) {
            super.updateTime(i, i2);
            return;
        }
        if (!b()) {
            super.updateTime(i, c(i2));
            return;
        }
        int iIntValue = this.a.getCurrentMinute().intValue();
        if (b()) {
            iIntValue *= this.b;
        }
        super.updateTime(i, c(iIntValue) / this.b);
    }

    public TimePickerDialogC8143yH0(l lVar, DialogInterfaceOnDismissListenerC6486pa1 dialogInterfaceOnDismissListenerC6486pa1, int i, int i2, int i3, boolean z, int i4, int i5) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        super(lVar, ru.mes.dnevnik.R.style.SpinnerTimePickerDialog, dialogInterfaceOnDismissListenerC6486pa1, i, i2, z);
        this.e = new Handler();
        this.b = i3;
        this.d = dialogInterfaceOnDismissListenerC6486pa1;
        this.c = i4;
        this.g = lVar;
        a(lVar, i, i2, z, i4);
    }
}
