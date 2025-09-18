package p000;

import android.R;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import androidx.fragment.app.AbstractActivityC1730l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: xH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DatePickerDialogC11651xH0 extends DatePickerDialog {
    /* renamed from: a */
    public final void m25824a(AbstractActivityC1730l abstractActivityC1730l, int i, int i2, int i3, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 24 && i4 == 1) {
            try {
                abstractActivityC1730l.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("DatePicker").get(null), R.attr.datePickerStyle, 0).recycle();
                DatePicker datePicker = (DatePicker) TP1.m7689a(DatePickerDialog.class, DatePicker.class, "mDatePicker").get(this);
                Field fieldM7689a = TP1.m7689a(DatePicker.class, Class.forName("android.widget.DatePickerSpinnerDelegate"), "mDelegate");
                if (fieldM7689a.get(datePicker).getClass() != Class.forName("android.widget.DatePickerSpinnerDelegate")) {
                    fieldM7689a.set(datePicker, null);
                    datePicker.removeAllViews();
                    Class cls = Integer.TYPE;
                    Method declaredMethod = DatePicker.class.getDeclaredMethod("createSpinnerUIDelegate", Context.class, AttributeSet.class, cls, cls);
                    declaredMethod.setAccessible(true);
                    fieldM7689a.set(datePicker, declaredMethod.invoke(datePicker, abstractActivityC1730l, null, Integer.valueOf(R.attr.datePickerStyle), 0));
                    datePicker.setCalendarViewShown(false);
                    datePicker.init(i, i2, i3, this);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (i4 != 1 || getDatePicker() == null) {
            return;
        }
        getDatePicker().setCalendarViewShown(false);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
    }
}
