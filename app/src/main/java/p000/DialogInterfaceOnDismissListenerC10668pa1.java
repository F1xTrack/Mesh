package p000;

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
public final class DialogInterfaceOnDismissListenerC10668pa1 implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

    /* renamed from: a */
    public final Promise f40221a;

    /* renamed from: b */
    public final Bundle f40222b;

    /* renamed from: c */
    public boolean f40223c = false;

    /* renamed from: d */
    public final /* synthetic */ TimePickerModule f40224d;

    public DialogInterfaceOnDismissListenerC10668pa1(TimePickerModule timePickerModule, Promise promise, Bundle bundle) {
        this.f40224d = timePickerModule;
        this.f40221a = promise;
        this.f40222b = bundle;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f40223c || !this.f40224d.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "neutralButtonAction");
        this.f40221a.resolve(writableNativeMap);
        this.f40223c = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f40223c || !this.f40224d.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dismissedAction");
        this.f40221a.resolve(writableNativeMap);
        this.f40223c = true;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        if (this.f40223c || !this.f40224d.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        Bundle bundle = this.f40222b;
        if (bundle.containsKey("value")) {
            calendar.setTimeInMillis(bundle.getLong("value"));
        }
        calendar.setTimeZone(AbstractC9886jT1.m22039e(bundle));
        Calendar calendar2 = Calendar.getInstance(AbstractC9886jT1.m22039e(bundle));
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), i, i2, 0);
        calendar2.set(14, 0);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "timeSetAction");
        writableNativeMap.putDouble("timestamp", calendar2.getTimeInMillis());
        writableNativeMap.putDouble("utcOffset", (calendar2.getTimeZone().getOffset(calendar2.getTimeInMillis()) / 1000) / 60);
        this.f40221a.resolve(writableNativeMap);
        this.f40223c = true;
    }
}
