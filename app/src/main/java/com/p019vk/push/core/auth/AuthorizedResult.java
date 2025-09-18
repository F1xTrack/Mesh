package com.p019vk.push.core.auth;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.F91;
import p000.O90;

@Metadata(m22266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u001f"}, m22267d2 = {"Lcom/vk/push/core/auth/AuthorizedResult;", "Landroid/os/Parcelable;", "", "isAuthorized", "<init>", "(Z)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "LTf1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "copy", "(Z)Lcom/vk/push/core/auth/AuthorizedResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "CREATOR", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AuthorizedResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public final boolean isAuthorized;

    @Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m22267d2 = {"Lcom/vk/push/core/auth/AuthorizedResult$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/auth/AuthorizedResult;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lcom/vk/push/core/auth/AuthorizedResult;", "", "size", "", "newArray", "(I)[Lcom/vk/push/core/auth/AuthorizedResult;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    /* renamed from: com.vk.push.core.auth.AuthorizedResult$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AuthorizedResult> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthorizedResult createFromParcel(Parcel parcel) {
            O90.m5968f(parcel, "parcel");
            return new AuthorizedResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthorizedResult[] newArray(int size) {
            return new AuthorizedResult[size];
        }
    }

    public AuthorizedResult(boolean z) {
        this.isAuthorized = z;
    }

    public static /* synthetic */ AuthorizedResult copy$default(AuthorizedResult authorizedResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authorizedResult.isAuthorized;
        }
        return authorizedResult.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAuthorized() {
        return this.isAuthorized;
    }

    public final AuthorizedResult copy(boolean isAuthorized) {
        return new AuthorizedResult(isAuthorized);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthorizedResult) && this.isAuthorized == ((AuthorizedResult) other).isAuthorized;
    }

    public int hashCode() {
        boolean z = this.isAuthorized;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isAuthorized() {
        return this.isAuthorized;
    }

    public String toString() {
        return F91.m2540w(new StringBuilder("AuthorizedResult(isAuthorized="), this.isAuthorized, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        O90.m5968f(parcel, "parcel");
        parcel.writeByte(this.isAuthorized ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthorizedResult(Parcel parcel) {
        this(parcel.readByte() != 0);
        O90.m5968f(parcel, "parcel");
    }
}
