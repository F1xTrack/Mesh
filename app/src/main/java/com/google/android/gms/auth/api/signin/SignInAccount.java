package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000.C10857r31;

@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C10857r31(21);

    /* renamed from: a */
    public final String f18034a;

    /* renamed from: b */
    public final GoogleSignInAccount f18035b;

    /* renamed from: c */
    public final String f18036c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f18035b = googleSignInAccount;
        this.f18034a = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.f18036c = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.f18034a, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f18035b, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.f18036c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
