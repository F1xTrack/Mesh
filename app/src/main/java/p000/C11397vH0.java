package p000;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;
import java.util.Calendar;
import java.util.Locale;
import ru.mes.dnevnik.R;

@SuppressLint({"ValidFragment"})
/* renamed from: vH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C11397vH0 extends DialogInterfaceOnCancelListenerC1725g {

    /* renamed from: a */
    public DatePickerDialogC11651xH0 f44316a;

    /* renamed from: b */
    public DialogInterfaceOnDismissListenerC6412mD f44317b;

    /* renamed from: c */
    public DialogInterfaceOnDismissListenerC6412mD f44318c;

    /* renamed from: d */
    public DialogInterfaceOnDismissListenerC6412mD f44319d;

    /* JADX WARN: Type inference failed for: r10v3, types: [uH0] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g
    public final Dialog onCreateDialog(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException {
        String str;
        DatePickerDialogC11651xH0 datePickerDialogC11651xH0;
        final Bundle arguments = getArguments();
        AbstractActivityC1730l activity = getActivity();
        DialogInterfaceOnDismissListenerC6412mD dialogInterfaceOnDismissListenerC6412mD = this.f44317b;
        Calendar calendar = Calendar.getInstance();
        if (arguments != null && arguments.containsKey("value")) {
            calendar.setTimeInMillis(arguments.getLong("value"));
        }
        calendar.setTimeZone(AbstractC9886jT1.m22039e(arguments));
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int iM5772u = (arguments == null || arguments.getString("display", null) == null) ? 2 : AbstractC0852NX.m5772u(arguments.getString("display").toUpperCase(Locale.US));
        if (arguments != null && arguments.getString("display", null) != null) {
            iM5772u = AbstractC0852NX.m5772u(arguments.getString("display").toUpperCase(Locale.US));
        }
        int i4 = iM5772u;
        if (i4 == 1) {
            str = "display";
            datePickerDialogC11651xH0 = new DatePickerDialogC11651xH0(activity, R.style.SpinnerDatePickerDialog, dialogInterfaceOnDismissListenerC6412mD, i, i2, i3);
            datePickerDialogC11651xH0.m25824a(activity, i, i2, i3, i4);
        } else {
            str = "display";
            datePickerDialogC11651xH0 = new DatePickerDialogC11651xH0(activity, dialogInterfaceOnDismissListenerC6412mD, i, i2, i3);
            datePickerDialogC11651xH0.m25824a(activity, i, i2, i3, i4);
        }
        DatePickerDialogC11651xH0 datePickerDialogC11651xH02 = datePickerDialogC11651xH0;
        if (arguments != null) {
            AbstractC9886jT1.m22043i(arguments, datePickerDialogC11651xH02, this.f44319d);
            if (activity != null) {
                datePickerDialogC11651xH02.setOnShowListener(new DialogInterfaceOnShowListenerC1001Pu(datePickerDialogC11651xH02, activity, arguments, (arguments.getString(str, null) != null ? AbstractC0852NX.m5772u(arguments.getString(str).toUpperCase(Locale.US)) : 2) == 1));
            }
        }
        final DatePicker datePicker = datePickerDialogC11651xH02.getDatePicker();
        final long jM22042h = AbstractC9886jT1.m22042h(arguments);
        final long jM22041g = AbstractC9886jT1.m22041g(arguments);
        if (arguments.containsKey("minimumDate")) {
            datePicker.setMinDate(jM22042h);
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (arguments.containsKey("maximumDate")) {
            datePicker.setMaxDate(jM22041g);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (arguments.containsKey("firstDayOfWeek")) {
            datePicker.setFirstDayOfWeek(arguments.getInt("firstDayOfWeek"));
        }
        if (i5 >= 26 && (arguments.containsKey("maximumDate") || arguments.containsKey("minimumDate"))) {
            datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() { // from class: uH0
                @Override // android.widget.DatePicker.OnDateChangedListener
                public final void onDateChanged(DatePicker datePicker2, int i6, int i7, int i8) {
                    Calendar calendar2 = Calendar.getInstance(AbstractC9886jT1.m22039e(arguments));
                    calendar2.set(i6, i7, i8, 0, 0, 0);
                    calendar2.setTimeInMillis(Math.min(Math.max(calendar2.getTimeInMillis(), jM22042h), jM22041g));
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
        this.f44316a = datePickerDialogC11651xH02;
        return datePickerDialogC11651xH02;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterfaceOnDismissListenerC6412mD dialogInterfaceOnDismissListenerC6412mD = this.f44318c;
        if (dialogInterfaceOnDismissListenerC6412mD != null) {
            dialogInterfaceOnDismissListenerC6412mD.onDismiss(dialogInterface);
        }
    }
}
