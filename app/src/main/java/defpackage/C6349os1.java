package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: os1 */
/* loaded from: classes2.dex */
public final class C6349os1 implements JsonSerializer {
    public static final C5396jt0 b = new C5396jt0(24);
    public final String a;

    public C6349os1(String str) {
        O90.f(str, "defaultMasterHostPackageName");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6349os1) && O90.a(this.a, ((C6349os1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("master_host_default_key", this.a);
        O90.e(jSONObjectPut, "JSONObject().put(\"master…ultMasterHostPackageName)");
        return jSONObjectPut;
    }

    public final String toString() {
        return F91.v(new StringBuilder("DefaultMasterHostData(defaultMasterHostPackageName="), this.a, ')');
    }
}
