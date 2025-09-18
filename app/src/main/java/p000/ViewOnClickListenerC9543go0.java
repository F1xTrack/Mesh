package p000;

import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.util.Calendar;
import java.util.Iterator;

/* renamed from: go0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC9543go0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f28001a;

    /* renamed from: b */
    public final /* synthetic */ C9927jo0 f28002b;

    public /* synthetic */ ViewOnClickListenerC9543go0(C9927jo0 c9927jo0, int i) {
        this.f28001a = i;
        this.f28002b = c9927jo0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28001a) {
            case 0:
                C9927jo0 c9927jo0 = this.f28002b;
                Iterator it = c9927jo0.f35386a.iterator();
                while (it.hasNext()) {
                    XH0 xh0 = (XH0) it.next();
                    Long l = c9927jo0.m22104s().f27015a;
                    xh0.getClass();
                    long jLongValue = l.longValue();
                    C1753aw c1753aw = xh0.f13663a;
                    if (!c1753aw.f16683c && ((ReactApplicationContext) c1753aw.f16685e).hasActiveReactInstance()) {
                        Calendar calendar = Calendar.getInstance();
                        Bundle bundle = (Bundle) c1753aw.f16682b;
                        if (bundle.containsKey("value")) {
                            calendar.setTimeInMillis(bundle.getLong("value"));
                        }
                        calendar.setTimeZone(AbstractC9886jT1.m22039e(bundle));
                        Calendar calendar2 = Calendar.getInstance(AbstractC9886jT1.m22039e(bundle));
                        calendar2.setTimeInMillis(jLongValue);
                        calendar2.set(11, calendar.get(11));
                        calendar2.set(12, calendar.get(12));
                        calendar2.set(13, 0);
                        calendar2.set(14, 0);
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putString(NotificationConstants.ACTION, "dateSetAction");
                        writableNativeMap.putDouble("timestamp", calendar2.getTimeInMillis());
                        writableNativeMap.putDouble("utcOffset", (calendar2.getTimeZone().getOffset(calendar2.getTimeInMillis()) / 1000) / 60);
                        ((Promise) c1753aw.f16684d).resolve(writableNativeMap);
                        c1753aw.f16683c = true;
                    }
                }
                c9927jo0.dismiss();
                break;
            default:
                C9927jo0 c9927jo02 = this.f28002b;
                Iterator it2 = c9927jo02.f35387b.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                c9927jo02.dismiss();
                break;
        }
    }
}
