package p000;

import com.p019vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: os1 */
/* loaded from: classes2.dex */
public final class C10576os1 implements JsonSerializer {

    /* renamed from: b */
    public static final C9937jt0 f39328b = new C9937jt0(24);

    /* renamed from: a */
    public final String f39329a;

    public C10576os1(String str) {
        O90.m5968f(str, "defaultMasterHostPackageName");
        this.f39329a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10576os1) && O90.m5963a(this.f39329a, ((C10576os1) obj).f39329a);
    }

    public final int hashCode() {
        return this.f39329a.hashCode();
    }

    @Override // com.p019vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("master_host_default_key", this.f39329a);
        O90.m5967e(jSONObjectPut, "JSONObject().put(\"master…ultMasterHostPackageName)");
        return jSONObjectPut;
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("DefaultMasterHostData(defaultMasterHostPackageName="), this.f39329a, ')');
    }
}
