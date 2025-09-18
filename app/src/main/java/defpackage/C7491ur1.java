package defpackage;

import com.vk.push.core.filedatastore.JsonSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ur1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7491ur1 implements JsonSerializer {
    public static final TE c = new TE(24);
    public final String a;
    public final boolean b;

    public C7491ur1(String str, boolean z) {
        O90.f(str, "lastDeliveredPushToken");
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7491ur1)) {
            return false;
        }
        C7491ur1 c7491ur1 = (C7491ur1) obj;
        return O90.a(this.a, c7491ur1.a) && this.b == c7491ur1.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    @Override // com.vk.push.core.filedatastore.JsonSerializer
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("last_delivered_push_token", this.a).put("push_token_delivered", this.b);
        O90.e(jSONObjectPut, "JSONObject()\n           …red\", pushTokenDelivered)");
        return jSONObjectPut;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushTokenDeliveryData(lastDeliveredPushToken=");
        sb.append(this.a);
        sb.append(", pushTokenDelivered=");
        return F91.w(sb, this.b, ')');
    }
}
