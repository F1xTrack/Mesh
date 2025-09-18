package p000;

import com.p019vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Qv1 */
/* loaded from: classes2.dex */
public final class C8189Qv1 implements JsonSerializer {

    /* renamed from: b */
    public static final C7356Av0 f9865b = new C7356Av0(25);

    /* renamed from: a */
    public final int f9866a;

    public C8189Qv1(int i) {
        this.f9866a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8189Qv1) && this.f9866a == ((C8189Qv1) obj).f9866a;
    }

    public final int hashCode() {
        return this.f9866a;
    }

    @Override // com.p019vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("notification_id_key", this.f9866a);
        O90.m5967e(jSONObjectPut, "JSONObject()\n           …_key\", notificationIdKey)");
        return jSONObjectPut;
    }

    public final String toString() {
        return AbstractC7222ym.m26235l(new StringBuilder("NotificationIdData(notificationIdKey="), this.f9866a, ')');
    }
}
