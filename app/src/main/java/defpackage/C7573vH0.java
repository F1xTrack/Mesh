package defpackage;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.g;
import androidx.fragment.app.l;
import java.util.Calendar;
import java.util.Locale;
import ru.mes.dnevnik.R;

@SuppressLint({"ValidFragment"})
/* renamed from: vH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7573vH0 extends g {
    public DatePickerDialogC7953xH0 a;
    public DialogInterfaceOnDismissListenerC5842mD b;
    public DialogInterfaceOnDismissListenerC5842mD c;
    public DialogInterfaceOnDismissListenerC5842mD d;

    /* JADX WARN: Type inference failed for: r10v3, types: [uH0] */
    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException {
        String str;
        DatePickerDialogC7953xH0 datePickerDialogC7953xH0;
        final Bundle arguments = getArguments();
        l activity = getActivity();
        DialogInterfaceOnDismissListenerC5842mD dialogInterfaceOnDismissListenerC5842mD = this.b;
        Calendar calendar = Calendar.getInstance();
        if (arguments != null && arguments.containsKey("value")) {
            calendar.setTimeInMillis(arguments.getLong("value"));
        }
        calendar.setTimeZone(AbstractC5319jT1.e(arguments));
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int iU = (arguments == null || arguments.getString("display", null) == null) ? 2 : NX.u(arguments.getString("display").toUpperCase(Locale.US));
        if (arguments != null && arguments.getString("display", null) != null) {
            iU = NX.u(arguments.getString("display").toUpperCase(Locale.US));
        }
        int i4 = iU;
        if (i4 == 1) {
            str = "display";
            datePickerDialogC7953xH0 = new DatePickerDialogC7953xH0(activity, R.style.SpinnerDatePickerDialog, dialogInterfaceOnDismissListenerC5842mD, i, i2, i3);
            datePickerDialogC7953xH0.a(activity, i, i2, i3, i4);
        } else {
            str = "display";
            datePickerDialogC7953xH0 = new DatePickerDialogC7953xH0(activity, dialogInterfaceOnDismissListenerC5842mD, i, i2, i3);
            datePickerDialogC7953xH0.a(activity, i, i2, i3, i4);
        }
        DatePickerDialogC7953xH0 datePickerDialogC7953xH02 = datePickerDialogC7953xH0;
        if (arguments != null) {
            AbstractC5319jT1.i(arguments, datePickerDialogC7953xH02, this.d);
            if (activity != null) {
                datePickerDialogC7953xH02.setOnShowListener(new DialogInterfaceOnShowListenerC1249Pu(datePickerDialogC7953xH02, activity, arguments, (arguments.getString(str, null) != null ? NX.u(arguments.getString(str).toUpperCase(Locale.US)) : 2) == 1));
            }
        }
        final DatePicker datePicker = datePickerDialogC7953xH02.getDatePicker();
        final long jH = AbstractC5319jT1.h(arguments);
        final long jG = AbstractC5319jT1.g(arguments);
        if (arguments.containsKey("minimumDate")) {
            datePicker.setMinDate(jH);
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (arguments.containsKey("maximumDate")) {
            datePicker.setMaxDate(jG);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (arguments.containsKey("firstDayOfWeek")) {
            datePicker.setFirstDayOfWeek(arguments.getInt("firstDayOfWeek"));
        }
        if (i5 >= 26 && (arguments.containsKey("maximumDate") || arguments.containsKey("minimumDate"))) {
            datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() { // from class: uH0
                @Override // android.widget.DatePicker.OnDateChangedListener
                public final void onDateChanged(DatePicker datePicker2, int i6, int i7, int i8) {
                    Calendar calendar2 = Calendar.getInstance(AbstractC5319jT1.e(arguments));
                    calendar2.set(i6, i7, i8, 0, 0, 0);
                    calendar2.setTimeInMillis(Math.min(Math.max(calendar2.getTimeInMillis(), jH), jG));
                    DatePicker datePicker3 = datePicker;
                    if (datePicker3.getYear() == calendar2.get(1) && datePicker3.getMonth() == calendar2.get(2) && datePicker3.getDayOfMonth() == calendar2.get(5)) {
                        return;
                    }
                    datePicker3.updateDate(calendar2.get(1), calendar2.get(2), calendar2.get(5));
                }
            });
        }
        if (arguments.containsKey("testID")) {
            datePicker.setTag(arguments.getString("testID"));
        }
        this.a = datePickerDialogC7953xH02;
        return datePickerDialogC7953xH02;
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterfaceOnDismissListenerC5842mD dialogInterfaceOnDismissListenerC5842mD = this.c;
        if (dialogInterfaceOnDismissListenerC5842mD != null) {
            dialogInterfaceOnDismissListenerC5842mD.onDismiss(dialogInterface);
        }
    }
}
