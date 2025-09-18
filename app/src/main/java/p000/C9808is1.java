package p000;

import com.p019vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: is1 */
/* loaded from: classes2.dex */
public final class C9808is1 implements JsonSerializer {

    /* renamed from: c */
    public static final C8326Tm0 f34790c = new C8326Tm0(24);

    /* renamed from: a */
    public final String f34791a;

    /* renamed from: b */
    public final String f34792b;

    public C9808is1(String str, String str2) {
        O90.m5968f(str, "masterHostPackageName");
        O90.m5968f(str2, "masterHostPublicKey");
        this.f34791a = str;
        this.f34792b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9808is1)) {
            return false;
        }
        C9808is1 c9808is1 = (C9808is1) obj;
        return O90.m5963a(this.f34791a, c9808is1.f34791a) && O90.m5963a(this.f34792b, c9808is1.f34792b);
    }

    public final int hashCode() {
        return this.f34792b.hashCode() + (this.f34791a.hashCode() * 31);
    }

    @Override // com.p019vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("master_host_package_name_key", this.f34791a).put("master_host_public_key", this.f34792b);
        O90.m5967e(jSONObjectPut, "JSONObject()\n           …ey\", masterHostPublicKey)");
        return jSONObjectPut;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArbiterData(masterHostPackageName=");
        sb.append(this.f34791a);
        sb.append(", masterHostPublicKey=");
        return F91.m2539v(sb, this.f34792b, ')');
    }
}
