package com.yandex.metrica.impl.ob;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.yandex.metrica.impl.ob.C2905lg;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Kh {
    private final Lh a;
    private final com.yandex.metrica.s b;

    public Kh() {
        this(new Lh(), Oh.a());
    }

    public void a(C2905lg.e.b bVar) {
        this.b.b("provided_request_result", this.a.a(bVar));
    }

    public void b(C2905lg.e.a aVar) {
        String string;
        com.yandex.metrica.s sVar = this.b;
        this.a.getClass();
        try {
            string = new JSONObject().put(NotificationConstants.ID, aVar.a).toString();
        } catch (Throwable th) {
            string = th.toString();
        }
        sVar.b("provided_request_send", string);
    }

    public Kh(Lh lh, com.yandex.metrica.s sVar) {
        this.a = lh;
        this.b = sVar;
    }

    public void a(C2905lg.e.a aVar) {
        String string;
        com.yandex.metrica.s sVar = this.b;
        this.a.getClass();
        try {
            string = new JSONObject().put(NotificationConstants.ID, aVar.a).toString();
        } catch (Throwable th) {
            string = th.toString();
        }
        sVar.b("provided_request_schedule", string);
    }
}
