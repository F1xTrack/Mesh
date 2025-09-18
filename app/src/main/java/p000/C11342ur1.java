package p000;

import com.p019vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ur1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11342ur1 implements JsonSerializer {

    /* renamed from: c */
    public static final C1210TE f43996c = new C1210TE(24);

    /* renamed from: a */
    public final String f43997a;

    /* renamed from: b */
    public final boolean f43998b;

    public C11342ur1(String str, boolean z) {
        O90.m5968f(str, "lastDeliveredPushToken");
        this.f43997a = str;
        this.f43998b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11342ur1)) {
            return false;
        }
        C11342ur1 c11342ur1 = (C11342ur1) obj;
        return O90.m5963a(this.f43997a, c11342ur1.f43997a) && this.f43998b == c11342ur1.f43998b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f43997a.hashCode() * 31;
        boolean z = this.f43998b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    @Override // com.p019vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("last_delivered_push_token", this.f43997a).put("push_token_delivered", this.f43998b);
        O90.m5967e(jSONObjectPut, "JSONObject()\n           …red\", pushTokenDelivered)");
        return jSONObjectPut;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushTokenDeliveryData(lastDeliveredPushToken=");
        sb.append(this.f43997a);
        sb.append(", pushTokenDelivered=");
        return F91.m2540w(sb, this.f43998b, ')');
    }
}
