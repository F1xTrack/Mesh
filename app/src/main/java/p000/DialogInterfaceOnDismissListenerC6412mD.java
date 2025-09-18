package p000;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import com.reactcommunity.rndatetimepicker.DatePickerModule;
import java.util.Calendar;

/* renamed from: mD */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC6412mD implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

    /* renamed from: a */
    public final Promise f37548a;

    /* renamed from: b */
    public final Bundle f37549b;

    /* renamed from: c */
    public boolean f37550c = false;

    /* renamed from: d */
    public final /* synthetic */ DatePickerModule f37551d;

    public DialogInterfaceOnDismissListenerC6412mD(DatePickerModule datePickerModule, Promise promise, Bundle bundle) {
        this.f37551d = datePickerModule;
        this.f37548a = promise;
        this.f37549b = bundle;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f37550c || !this.f37551d.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "neutralButtonAction");
        this.f37548a.resolve(writableNativeMap);
        this.f37550c = true;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        if (this.f37550c || !this.f37551d.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        Bundle bundle = this.f37549b;
        if (bundle.containsKey("value")) {
            calendar.setTimeInMillis(bundle.getLong("value"));
        }
        calendar.setTimeZone(AbstractC9886jT1.m22039e(bundle));
        Calendar calendar2 = Calendar.getInstance(AbstractC9886jT1.m22039e(bundle));
        calendar2.set(i, i2, i3, calendar.get(11), calendar.get(12), 0);
        calendar2.set(14, 0);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dateSetAction");
        writableNativeMap.putDouble("timestamp", calendar2.getTimeInMillis());
        writableNativeMap.putDouble("utcOffset", (calendar2.getTimeZone().getOffset(calendar2.getTimeInMillis()) / 1000) / 60);
        this.f37548a.resolve(writableNativeMap);
        this.f37550c = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f37550c || !this.f37551d.getReactApplicationContext().hasActiveReactInstance()) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dismissedAction");
        this.f37548a.resolve(writableNativeMap);
        this.f37550c = true;
    }
}
