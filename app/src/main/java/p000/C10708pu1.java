package p000;

import com.p019vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10708pu1 implements JsonSerializer {

    /* renamed from: b */
    public static final C10212m12 f40430b = new C10212m12(24);

    /* renamed from: a */
    public final boolean f40431a;

    public C10708pu1(boolean z) {
        this.f40431a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10708pu1) && this.f40431a == ((C10708pu1) obj).f40431a;
    }

    public final int hashCode() {
        boolean z = this.f40431a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // com.p019vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("test_mode_enabled", this.f40431a);
        O90.m5967e(jSONObjectPut, "JSONObject()\n           …nabled\", testModeEnabled)");
        return jSONObjectPut;
    }

    public final String toString() {
        return F91.m2540w(new StringBuilder("SdkModeData(testModeEnabled="), this.f40431a, ')');
    }
}
