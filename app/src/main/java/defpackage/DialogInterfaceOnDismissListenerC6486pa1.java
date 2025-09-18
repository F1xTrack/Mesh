package defpackage;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import com.reactcommunity.rndatetimepicker.TimePickerModule;
import java.util.Calendar;

/* renamed from: pa1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC6486pa1 implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
    public final Promise a;
    public final Bundle b;
    public boolean c = false;
    public final /* synthetic */ TimePickerModule d;

    public DialogInterfaceOnDismissListenerC6486pa1(TimePickerModule timePickerModule, Promise promise, Bundle bundle) {
        this.d = timePickerModule;
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

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
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
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), i, i2, 0);
        calendar2.set(14, 0);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "timeSetAction");
        writableNativeMap.putDouble("timestamp", calendar2.getTimeInMillis());
        writableNativeMap.putDouble("utcOffset", (calendar2.getTimeZone().getOffset(calendar2.getTimeInMillis()) / 1000) / 60);
        this.a.resolve(writableNativeMap);
        this.c = true;
    }
}
