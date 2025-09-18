package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Objects;

/* renamed from: uG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7380uG1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7380uG1> CREATOR = new C2093aD1(8);
    public final int a;
    public final String b;
    public final Intent c;

    public C7380uG1(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public static C7380uG1 i0(Activity activity) {
        return new C7380uG1(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7380uG1)) {
            return false;
        }
        C7380uG1 c7380uG1 = (C7380uG1) obj;
        return this.a == c7380uG1.a && Objects.equals(this.b, c7380uG1.b) && Objects.equals(this.c, c7380uG1.c);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
