package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6546pu1 implements JsonSerializer {
    public static final C5806m12 b = new C5806m12(24);
    public final boolean a;

    public C6546pu1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6546pu1) && this.a == ((C6546pu1) obj).a;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("test_mode_enabled", this.a);
        O90.e(jSONObjectPut, "JSONObject()\n           …nabled\", testModeEnabled)");
        return jSONObjectPut;
    }

    public final String toString() {
        return F91.w(new StringBuilder("SdkModeData(testModeEnabled="), this.a, ')');
    }
}
