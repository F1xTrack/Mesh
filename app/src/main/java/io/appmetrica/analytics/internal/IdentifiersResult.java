package io.appmetrica.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.C4874Va;
import p000.AbstractC1374Vq;

/* loaded from: classes2.dex */
public class IdentifiersResult implements Parcelable {
    public static final Parcelable.Creator<IdentifiersResult> CREATOR = new C4874Va();
    public final String errorExplanation;

    /* renamed from: id */
    public final String f32948id;
    public final IdentifierStatus status;

    public IdentifiersResult(String str, IdentifierStatus identifierStatus, String str2) {
        this.f32948id = str;
        this.status = identifierStatus;
        this.errorExplanation = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) obj;
        String str = this.f32948id;
        if (str == null ? identifiersResult.f32948id != null : !str.equals(identifiersResult.f32948id)) {
            return false;
        }
        if (this.status != identifiersResult.status) {
            return false;
        }
        String str2 = this.errorExplanation;
        return str2 != null ? str2.equals(identifiersResult.errorExplanation) : identifiersResult.errorExplanation == null;
    }

    public int hashCode() {
        String str = this.f32948id;
        int iHashCode = (this.status.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.errorExplanation;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdentifiersResult{id='");
        sb.append(this.f32948id);
        sb.append("', status=");
        sb.append(this.status);
        sb.append(", errorExplanation='");
        return AbstractC1374Vq.m8593l(sb, this.errorExplanation, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32948id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }
}
