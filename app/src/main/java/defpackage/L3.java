package defpackage;

import com.huawei.hms.rn.push.constants.LocalNotification;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class L3 implements Serializable {
    public static final L3 b = new L3(LocalNotification.Importance.NONE);
    public final String a;

    public L3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof L3) {
            if (this.a.equals(((L3) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
