package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.material.timepicker.e;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class YH0 implements View.OnClickListener, DialogInterface.OnDismissListener {
    public final /* synthetic */ C2226aw a;

    public YH0(C2226aw c2226aw) {
        this.a = c2226aw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O90.f(view, "v");
        C2226aw c2226aw = this.a;
        if (c2226aw.c || !((ReactApplicationContext) c2226aw.e).hasActiveReactInstance()) {
            return;
        }
        Bundle bundle = (Bundle) c2226aw.b;
        Calendar calendar = Calendar.getInstance();
        if (bundle.containsKey("value")) {
            calendar.setTimeInMillis(bundle.getLong("value"));
        }
        calendar.setTimeZone(AbstractC5319jT1.e(bundle));
        Calendar calendar2 = Calendar.getInstance(AbstractC5319jT1.e(bundle));
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        e eVar = (e) c2226aw.f;
        O90.c(eVar);
        int i4 = eVar.u.d % 24;
        e eVar2 = (e) c2226aw.f;
        O90.c(eVar2);
        calendar2.set(i, i2, i3, i4, eVar2.u.e, 0);
        calendar2.set(14, 0);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dateSetAction");
        writableNativeMap.putDouble("timestamp", calendar2.getTimeInMillis());
        writableNativeMap.putDouble("utcOffset", (calendar2.getTimeZone().getOffset(calendar2.getTimeInMillis()) / 1000) / 60);
        ((Promise) c2226aw.d).resolve(writableNativeMap);
        c2226aw.c = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        O90.f(dialogInterface, "dialog");
        C2226aw c2226aw = this.a;
        if (c2226aw.c || !((ReactApplicationContext) c2226aw.e).hasActiveReactInstance()) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dismissedAction");
        ((Promise) c2226aw.d).resolve(writableNativeMap);
        c2226aw.c = true;
    }
}
