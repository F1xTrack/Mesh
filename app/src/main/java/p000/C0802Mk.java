package p000;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

/* renamed from: Mk */
/* loaded from: classes2.dex */
public final class C0802Mk {

    /* renamed from: c */
    public static final Object f7314c = new Object();

    /* renamed from: a */
    public final C8170Qm0 f7315a;

    /* renamed from: b */
    public final C8170Qm0 f7316b;

    public C0802Mk(C8170Qm0 c8170Qm0, C8170Qm0 c8170Qm02) {
        this.f7315a = c8170Qm0;
        this.f7316b = c8170Qm02;
    }

    /* renamed from: a */
    public final void m5430a(String str) {
        synchronized (f7314c) {
            String str2 = ((C6222jC) this.f7315a.f9780b).f34970a;
            if (!(str2 == null ? false : str.equals(str2))) {
                C4151h c4151h = (C4151h) this.f7316b.f9780b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("short_segments", str);
                String string = jSONObject.toString();
                O90.m5967e(string, "JSONObject().apply {\n   …ids)\n        }.toString()");
                Intent intent = new Intent();
                Context context = c4151h.f28143a;
                intent.setPackage(context.getPackageName());
                intent.setAction("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED");
                intent.putExtra("payload", string);
                context.sendBroadcast(intent);
                ((C6222jC) this.f7315a.f9780b).f34970a = str;
            }
        }
    }
}
