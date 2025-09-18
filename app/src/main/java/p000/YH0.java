package p000;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.material.timepicker.C1949e;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class YH0 implements View.OnClickListener, DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C1753aw f14224a;

    public YH0(C1753aw c1753aw) {
        this.f14224a = c1753aw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O90.m5968f(view, "v");
        C1753aw c1753aw = this.f14224a;
        if (c1753aw.f16683c || !((ReactApplicationContext) c1753aw.f16685e).hasActiveReactInstance()) {
            return;
        }
        Bundle bundle = (Bundle) c1753aw.f16682b;
        Calendar calendar = Calendar.getInstance();
        if (bundle.containsKey("value")) {
            calendar.setTimeInMillis(bundle.getLong("value"));
        }
        calendar.setTimeZone(AbstractC9886jT1.m22039e(bundle));
        Calendar calendar2 = Calendar.getInstance(AbstractC9886jT1.m22039e(bundle));
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        C1949e c1949e = (C1949e) c1753aw.f16686f;
        O90.m5965c(c1949e);
        int i4 = c1949e.f18415u.f37171d % 24;
        C1949e c1949e2 = (C1949e) c1753aw.f16686f;
        O90.m5965c(c1949e2);
        calendar2.set(i, i2, i3, i4, c1949e2.f18415u.f37172e, 0);
        calendar2.set(14, 0);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dateSetAction");
        writableNativeMap.putDouble("timestamp", calendar2.getTimeInMillis());
        writableNativeMap.putDouble("utcOffset", (calendar2.getTimeZone().getOffset(calendar2.getTimeInMillis()) / 1000) / 60);
        ((Promise) c1753aw.f16684d).resolve(writableNativeMap);
        c1753aw.f16683c = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        O90.m5968f(dialogInterface, "dialog");
        C1753aw c1753aw = this.f14224a;
        if (c1753aw.f16683c || !((ReactApplicationContext) c1753aw.f16685e).hasActiveReactInstance()) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(NotificationConstants.ACTION, "dismissedAction");
        ((Promise) c1753aw.f16684d).resolve(writableNativeMap);
        c1753aw.f16683c = true;
    }
}
