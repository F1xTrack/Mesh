package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;

/* loaded from: classes.dex */
public final class OQ0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OQ0> CREATOR = new C7856Kl0(23);

    /* renamed from: a */
    public final Bundle f8440a;

    /* renamed from: b */
    public C7119x8 f8441b;

    /* renamed from: c */
    public C6409mA f8442c;

    public OQ0(Bundle bundle) {
        this.f8440a = bundle;
    }

    /* renamed from: i0 */
    public final Map m6067i0() {
        if (this.f8441b == null) {
            C7119x8 c7119x8 = new C7119x8();
            Bundle bundle = this.f8440a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals(RemoteMessageConst.MSGTYPE) && !str.equals("collapse_key")) {
                        c7119x8.put(str, str2);
                    }
                }
            }
            this.f8441b = c7119x8;
        }
        return this.f8441b;
    }

    /* renamed from: m0 */
    public final String m6068m0() {
        Bundle bundle = this.f8440a;
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    /* renamed from: n0 */
    public final C6409mA m6069n0() {
        if (this.f8442c == null) {
            Bundle bundle = this.f8440a;
            if (C9196e41.m17829L0(bundle)) {
                this.f8442c = new C6409mA(new C9196e41(bundle));
            }
        }
        return this.f8442c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f8440a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
