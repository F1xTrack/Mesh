package defpackage;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

/* renamed from: Mk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0985Mk {
    public static final Object c = new Object();
    public final C1304Qm0 a;
    public final C1304Qm0 b;

    public C0985Mk(C1304Qm0 c1304Qm0, C1304Qm0 c1304Qm02) {
        this.a = c1304Qm0;
        this.b = c1304Qm02;
    }

    public final void a(String str) {
        synchronized (c) {
            String str2 = ((C5266jC) this.a.b).a;
            if (!(str2 == null ? false : str.equals(str2))) {
                C4067h c4067h = (C4067h) this.b.b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("short_segments", str);
                String string = jSONObject.toString();
                O90.e(string, "JSONObject().apply {\n   …ids)\n        }.toString()");
                Intent intent = new Intent();
                Context context = c4067h.a;
                intent.setPackage(context.getPackageName());
                intent.setAction("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED");
                intent.putExtra("payload", string);
                context.sendBroadcast(intent);
                ((C5266jC) this.a.b).a = str;
            }
        }
    }
}
