package com.p019vk.push.core.masterhost;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m22267d2 = {"Lcom/vk/push/core/masterhost/MasterHost;", "Landroid/os/Parcelable;", "", "master", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "LTf1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "getMaster", "()Ljava/lang/String;", "CREATOR", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class MasterHost implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public final String master;

    @Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m22267d2 = {"Lcom/vk/push/core/masterhost/MasterHost$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/masterhost/MasterHost;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lcom/vk/push/core/masterhost/MasterHost;", "", "size", "", "newArray", "(I)[Lcom/vk/push/core/masterhost/MasterHost;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    /* renamed from: com.vk.push.core.masterhost.MasterHost$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<MasterHost> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MasterHost createFromParcel(Parcel parcel) {
            O90.m5968f(parcel, "parcel");
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            return new MasterHost(string);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MasterHost[] newArray(int size) {
            return new MasterHost[size];
        }
    }

    public MasterHost(String str) {
        O90.m5968f(str, "master");
        this.master = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getMaster() {
        return this.master;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        O90.m5968f(parcel, "parcel");
        parcel.writeString(this.master);
    }
}
