package com.p019vk.push.core.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.p015rn.push.constants.Core;
import com.p019vk.push.core.utils.ResultExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

@Metadata(m22266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 #*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\"\u0010!¨\u0006%"}, m22267d2 = {"Lcom/vk/push/core/base/AidlResult;", "Landroid/os/Parcelable;", "T", "data", "<init>", "(Landroid/os/Parcelable;)V", "getData", "()Landroid/os/Parcelable;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exceptionOrNull", "()Ljava/lang/Exception;", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "", "flags", "LTf1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Landroid/os/Parcelable;)Lcom/vk/push/core/base/AidlResult;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isSuccess", "()Z", "isFailure", "Companion", "Success", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AidlResult<T extends Parcelable> implements Parcelable {

    /* renamed from: a */
    public final Parcelable f20337a;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AidlResult<? extends Parcelable>> CREATOR = new AidlResult$Companion$CREATOR$1();

    @Metadata(m22266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0001\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\tJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m22267d2 = {"Lcom/vk/push/core/base/AidlResult$Companion;", "", "Lcom/vk/push/core/base/AidlResult;", "Lcom/vk/push/core/base/AidlResult$Success;", "success", "()Lcom/vk/push/core/base/AidlResult;", "Landroid/os/Parcelable;", "T", "data", "(Landroid/os/Parcelable;)Lcom/vk/push/core/base/AidlResult;", "", Core.Event.Result.EXCEPTION, "Lcom/vk/push/core/base/AidlException;", "failure", "(Ljava/lang/Throwable;)Lcom/vk/push/core/base/AidlResult;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AidlResult<AidlException> failure(Throwable exception) {
            O90.m5968f(exception, Core.Event.Result.EXCEPTION);
            return new AidlResult<>(ResultExtensionsKt.toAidlException(exception));
        }

        public final AidlResult<Success> success() {
            return new AidlResult<>(new Success());
        }

        public final <T extends Parcelable> AidlResult<T> success(T data) {
            O90.m5968f(data, "data");
            return new AidlResult<>(data);
        }
    }

    @Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m22267d2 = {"Lcom/vk/push/core/base/AidlResult$Success;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "", "flags", "LTf1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "CREATOR", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Success implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m22267d2 = {"Lcom/vk/push/core/base/AidlResult$Success$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/base/AidlResult$Success;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lcom/vk/push/core/base/AidlResult$Success;", "", "size", "", "newArray", "(I)[Lcom/vk/push/core/base/AidlResult$Success;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
        /* renamed from: com.vk.push.core.base.AidlResult$Success$CREATOR, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<Success> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Success createFromParcel(Parcel parcel) {
                O90.m5968f(parcel, "parcel");
                parcel.readInt();
                return new Success();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Success[] newArray(int size) {
                return new Success[size];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            O90.m5968f(parcel, "parcel");
            parcel.writeInt(1);
        }
    }

    public AidlResult(T t) {
        O90.m5968f(t, "data");
        this.f20337a = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AidlResult copy$default(AidlResult aidlResult, Parcelable parcelable, int i, Object obj) {
        if ((i & 1) != 0) {
            parcelable = aidlResult.f20337a;
        }
        return aidlResult.copy(parcelable);
    }

    public final AidlResult<T> copy(T data) {
        O90.m5968f(data, "data");
        return new AidlResult<>(data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AidlResult) && O90.m5963a(this.f20337a, ((AidlResult) other).f20337a);
    }

    public final Exception exceptionOrNull() {
        Parcelable parcelable = this.f20337a;
        if (parcelable instanceof AidlException) {
            return ((AidlException) parcelable).toException();
        }
        return null;
    }

    public final T getData() {
        return (T) this.f20337a;
    }

    public int hashCode() {
        return this.f20337a.hashCode();
    }

    public final boolean isFailure() {
        return this.f20337a instanceof AidlException;
    }

    public final boolean isSuccess() {
        return !(this.f20337a instanceof AidlException);
    }

    public String toString() {
        Parcelable parcelable = this.f20337a;
        if (parcelable instanceof AidlException) {
            return parcelable.toString();
        }
        if (parcelable instanceof Success) {
            return "Success()";
        }
        return "Success(" + parcelable + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        O90.m5968f(parcel, "parcel");
        parcel.writeParcelable(this.f20337a, flags);
    }
}
