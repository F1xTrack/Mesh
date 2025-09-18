package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: nr1 */
/* loaded from: classes2.dex */
public final class C6155nr1 implements JsonSerializer {
    public static final C7304tt b = new C7304tt(24);
    public final String a;

    public C6155nr1(String str) {
        O90.f(str, "pushToken");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6155nr1) && O90.a(this.a, ((C6155nr1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("push_token", this.a);
        O90.e(jSONObjectPut, "JSONObject()\n           …(\"push_token\", pushToken)");
        return jSONObjectPut;
    }

    public final String toString() {
        return F91.v(new StringBuilder("PushTokenData(pushToken="), this.a, ')');
    }
}
