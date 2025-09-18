package p000;

import com.p019vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: nr1 */
/* loaded from: classes2.dex */
public final class C10446nr1 implements JsonSerializer {

    /* renamed from: b */
    public static final C6914tt f38563b = new C6914tt(24);

    /* renamed from: a */
    public final String f38564a;

    public C10446nr1(String str) {
        O90.m5968f(str, "pushToken");
        this.f38564a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10446nr1) && O90.m5963a(this.f38564a, ((C10446nr1) obj).f38564a);
    }

    public final int hashCode() {
        return this.f38564a.hashCode();
    }

    @Override // com.p019vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("push_token", this.f38564a);
        O90.m5967e(jSONObjectPut, "JSONObject()\n           …(\"push_token\", pushToken)");
        return jSONObjectPut;
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("PushTokenData(pushToken="), this.f38564a, ')');
    }
}
