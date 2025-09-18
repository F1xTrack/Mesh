package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: is1 */
/* loaded from: classes2.dex */
public final class C5204is1 implements JsonSerializer {
    public static final C1538Tm0 c = new C1538Tm0(24);
    public final String a;
    public final String b;

    public C5204is1(String str, String str2) {
        O90.f(str, "masterHostPackageName");
        O90.f(str2, "masterHostPublicKey");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5204is1)) {
            return false;
        }
        C5204is1 c5204is1 = (C5204is1) obj;
        return O90.a(this.a, c5204is1.a) && O90.a(this.b, c5204is1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("master_host_package_name_key", this.a).put("master_host_public_key", this.b);
        O90.e(jSONObjectPut, "JSONObject()\n           …ey\", masterHostPublicKey)");
        return jSONObjectPut;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArbiterData(masterHostPackageName=");
        sb.append(this.a);
        sb.append(", masterHostPublicKey=");
        return F91.v(sb, this.b, ')');
    }
}
