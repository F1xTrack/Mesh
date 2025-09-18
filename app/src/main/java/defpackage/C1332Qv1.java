package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Qv1 */
/* loaded from: classes2.dex */
public final class C1332Qv1 implements JsonSerializer {
    public static final C0084Av0 b = new C0084Av0(25);
    public final int a;

    public C1332Qv1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1332Qv1) && this.a == ((C1332Qv1) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("notification_id_key", this.a);
        O90.e(jSONObjectPut, "JSONObject()\n           …_key\", notificationIdKey)");
        return jSONObjectPut;
    }

    public final String toString() {
        return AbstractC8235ym.l(new StringBuilder("NotificationIdData(notificationIdKey="), this.a, ')');
    }
}
