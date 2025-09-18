package com.vk.push.core.base;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J#\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/vk/push/core/base/AidlResult$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/base/AidlResult;", "Landroid/os/Parcelable;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/vk/push/core/base/AidlResult;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AidlResult$Companion$CREATOR$1 implements Parcelable.Creator<AidlResult<? extends Parcelable>> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: createFromParcel */
    public AidlResult<? extends Parcelable> createFromParcel2(Parcel parcel) {
        O90.f(parcel, "parcel");
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) parcel.readParcelable(AidlResult.class.getClassLoader(), Parcelable.class) : parcel.readParcelable(AidlResult.class.getClassLoader());
        if (parcelable != null) {
            return new AidlResult<>(parcelable);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: newArray */
    public AidlResult<? extends Parcelable>[] newArray2(int size) {
        return new AidlResult[size];
    }
}
