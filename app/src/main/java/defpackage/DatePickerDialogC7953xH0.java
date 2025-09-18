package defpackage;

import android.R;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import androidx.fragment.app.l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: xH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DatePickerDialogC7953xH0 extends DatePickerDialog {
    public final void a(l lVar, int i, int i2, int i3, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 24 && i4 == 1) {
            try {
                lVar.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("DatePicker").get(null), R.attr.datePickerStyle, 0).recycle();
                DatePicker datePicker = (DatePicker) TP1.a(DatePickerDialog.class, DatePicker.class, "mDatePicker").get(this);
                Field fieldA = TP1.a(DatePicker.class, Class.forName("android.widget.DatePickerSpinnerDelegate"), "mDelegate");
                if (fieldA.get(datePicker).getClass() != Class.forName("android.widget.DatePickerSpinnerDelegate")) {
                    fieldA.set(datePicker, null);
                    datePicker.removeAllViews();
                    Class cls = Integer.TYPE;
                    Method declaredMethod = DatePicker.class.getDeclaredMethod("createSpinnerUIDelegate", Context.class, AttributeSet.class, cls, cls);
                    declaredMethod.setAccessible(true);
                    fieldA.set(datePicker, declaredMethod.invoke(datePicker, lVar, null, Integer.valueOf(R.attr.datePickerStyle), 0));
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
