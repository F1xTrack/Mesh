package defpackage;

import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.util.Calendar;
import java.util.Iterator;

/* renamed from: go0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC4032go0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5381jo0 b;

    public /* synthetic */ ViewOnClickListenerC4032go0(C5381jo0 c5381jo0, int i) {
        this.a = i;
        this.b = c5381jo0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                C5381jo0 c5381jo0 = this.b;
                Iterator it = c5381jo0.a.iterator();
                while (it.hasNext()) {
                    XH0 xh0 = (XH0) it.next();
                    Long l = c5381jo0.s().a;
                    xh0.getClass();
                    long jLongValue = l.longValue();
                    C2226aw c2226aw = xh0.a;
                    if (!c2226aw.c && ((ReactApplicationContext) c2226aw.e).hasActiveReactInstance()) {
                        Calendar calendar = Calendar.getInstance();
                        Bundle bundle = (Bundle) c2226aw.b;
                        if (bundle.containsKey("value")) {
                            calendar.setTimeInMillis(bundle.getLong("value"));
                        }
                        calendar.setTimeZone(AbstractC5319jT1.e(bundle));
                        Calendar calendar2 = Calendar.getInstance(AbstractC5319jT1.e(bundle));
                        calendar2.setTimeInMillis(jLongValue);
                        calendar2.set(11, calendar.get(11));
                        calendar2.set(12, calendar.get(12));
                        calendar2.set(13, 0);
                        calendar2.set(14, 0);
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putString(NotificationConstants.ACTION, "dateSetAction");
                        writableNativeMap.putDouble("timestamp", calendar2.getTimeInMillis());
                        writableNativeMap.putDouble("utcOffset", (calendar2.getTimeZone().getOffset(calendar2.getTimeInMillis()) / 1000) / 60);
                        ((Promise) c2226aw.d).resolve(writableNativeMap);
                        c2226aw.c = true;
                    }
                }
                c5381jo0.dismiss();
                break;
            default:
                C5381jo0 c5381jo02 = this.b;
                Iterator it2 = c5381jo02.b.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                c5381jo02.dismiss();
                break;
        }
    }
}
