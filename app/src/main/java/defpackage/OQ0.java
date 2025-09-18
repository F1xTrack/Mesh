package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Map;

/* loaded from: classes.dex */
public final class OQ0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OQ0> CREATOR = new C0834Kl0(23);
    public final Bundle a;
    public C7925x8 b;
    public C5833mA c;

    public OQ0(Bundle bundle) {
        this.a = bundle;
    }

    public final Map i0() {
        if (this.b == null) {
            C7925x8 c7925x8 = new C7925x8();
            Bundle bundle = this.a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals(RemoteMessageConst.MSGTYPE) && !str.equals("collapse_key")) {
                        c7925x8.put(str, str2);
                    }
                }
            }
            this.b = c7925x8;
        }
        return this.b;
    }

    public final String m0() {
        Bundle bundle = this.a;
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public final C5833mA n0() {
        if (this.c == null) {
            Bundle bundle = this.a;
            if (C3513e41.L0(bundle)) {
                this.c = new C5833mA(new C3513e41(bundle));
            }
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
