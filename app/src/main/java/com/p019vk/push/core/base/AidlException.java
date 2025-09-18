package com.p019vk.push.core.base;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.F91;
import p000.O90;

@Metadata(m22266d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0011\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 "}, m22267d2 = {"Lcom/vk/push/core/base/AidlException;", "Landroid/os/Parcelable;", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "toException", "()Ljava/lang/Exception;", "flags", "LTf1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(ILjava/lang/String;)Lcom/vk/push/core/base/AidlException;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AidlException implements Parcelable {
    public static final int HOST_IS_NOT_MASTER = 103;
    public static final int ILLEGAL_ARGUMENT_EXCEPTION = 101;
    public static final int ILLEGAL_STATE_EXCEPTION = 102;
    public static final int RUNTIME_EXCEPTION = 100;
    public static final int SDK_IS_NOT_INITIALIZED = 104;
    public static final int TRANSFERRED_IPC_DATA_EXCEPTION = 105;
    public static final int UNKNOWN_EXCEPTION = 0;

    /* renamed from: a */
    public final int f20335a;

    /* renamed from: b */
    public final String f20336b;
    public static final Parcelable.Creator<AidlException> CREATOR = new AidlException$Companion$CREATOR$1();

    public AidlException(int i, String str) {
        O90.m5968f(str, "message");
        this.f20335a = i;
        this.f20336b = str;
    }

    public static /* synthetic */ AidlException copy$default(AidlException aidlException, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aidlException.f20335a;
        }
        if ((i2 & 2) != 0) {
            str = aidlException.f20336b;
        }
        return aidlException.copy(i, str);
    }

    public final AidlException copy(int code, String message) {
        O90.m5968f(message, "message");
        return new AidlException(code, message);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AidlException)) {
            return false;
        }
        AidlException aidlException = (AidlException) other;
        return this.f20335a == aidlException.f20335a && O90.m5963a(this.f20336b, aidlException.f20336b);
    }

    public int hashCode() {
        return this.f20336b.hashCode() + (this.f20335a * 31);
    }

    public final Exception toException() {
        int i = this.f20335a;
        String str = this.f20336b;
        switch (i) {
        }
        return new RuntimeException(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AidlException(code=");
        sb.append(this.f20335a);
        sb.append(", message=");
        return F91.m2539v(sb, this.f20336b, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        O90.m5968f(parcel, "parcel");
        parcel.writeInt(this.f20335a);
        parcel.writeString(this.f20336b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AidlException(Parcel parcel) {
        O90.m5968f(parcel, "parcel");
        int i = parcel.readInt();
        String string = parcel.readString();
        this(i, string == null ? "" : string);
    }
}
