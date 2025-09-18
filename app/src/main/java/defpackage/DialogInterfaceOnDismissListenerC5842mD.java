package defpackage;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.reactcommunity.rndatetimepicker.DatePickerModule;
import java.util.Calendar;

/* renamed from: mD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC5842mD implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
    public final Promise a;
    public final Bundle b;
    public boolean c = false;
    public final /* synthetic */ DatePickerModule d;

    public DialogInterfaceOnDismissListenerC5842mD(DatePickerModule datePickerModule, Promise promise, Bundle bundle) {
        this.d = datePickerModule;
        this.a = promise;
        this.b = bundle;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.c || !this.d.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "neutralButtonAction");
        this.a.resolve(writableNativeMap);
        this.c = true;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        if (this.c || !this.d.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        Bundle bundle = this.b;
        if (bundle.containsKey("value")) {
            calendar.setTimeInMillis(bundle.getLong("value"));
        }
        calendar.setTimeZone(AbstractC5319jT1.e(bundle));
        Calendar calendar2 = Calendar.getInstance(AbstractC5319jT1.e(bundle));
        calendar2.set(i, i2, i3, calendar.get(11), calendar.get(12), 0);
        calendar2.set(14, 0);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dateSetAction");
        writableNativeMap.putDouble("timestamp", calendar2.getTimeInMillis());
        writableNativeMap.putDouble("utcOffset", (calendar2.getTimeZone().getOffset(calendar2.getTimeInMillis()) / 1000) / 60);
        this.a.resolve(writableNativeMap);
        this.c = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.c || !this.d.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dismissedAction");
        this.a.resolve(writableNativeMap);
        this.c = true;
    }
}
