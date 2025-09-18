package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Objects;

/* renamed from: uG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11268uG1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C11268uG1> CREATOR = new C8697aD1(8);

    /* renamed from: a */
    public final int f43627a;

    /* renamed from: b */
    public final String f43628b;

    /* renamed from: c */
    public final Intent f43629c;

    public C11268uG1(int i, String str, Intent intent) {
        this.f43627a = i;
        this.f43628b = str;
        this.f43629c = intent;
    }

    /* renamed from: i0 */
    public static C11268uG1 m25147i0(Activity activity) {
        return new C11268uG1(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11268uG1)) {
            return false;
        }
        C11268uG1 c11268uG1 = (C11268uG1) obj;
        return this.f43627a == c11268uG1.f43627a && Objects.equals(this.f43628b, c11268uG1.f43628b) && Objects.equals(this.f43629c, c11268uG1.f43629c);
    }

    public final int hashCode() {
        return this.f43627a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f43627a);
        SafeParcelWriter.writeString(parcel, 2, this.f43628b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f43629c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
