package com.p019vk.push.core.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import p000.O90;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m22267d2 = {"Lcom/vk/push/core/push/IsPushTokenExistResult;", "", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "LTf1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "CREATOR", "EXISTS", "DOES_NOT_EXIST", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class IsPushTokenExistResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final IsPushTokenExistResult DOES_NOT_EXIST;
    public static final IsPushTokenExistResult EXISTS;

    /* renamed from: a */
    public static final /* synthetic */ IsPushTokenExistResult[] f20483a;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.push.core.push.IsPushTokenExistResult$CREATOR] */
    static {
        IsPushTokenExistResult isPushTokenExistResult = new IsPushTokenExistResult("EXISTS", 0);
        EXISTS = isPushTokenExistResult;
        IsPushTokenExistResult isPushTokenExistResult2 = new IsPushTokenExistResult("DOES_NOT_EXIST", 1);
        DOES_NOT_EXIST = isPushTokenExistResult2;
        f20483a = new IsPushTokenExistResult[]{isPushTokenExistResult, isPushTokenExistResult2};
        INSTANCE = new Parcelable.Creator<IsPushTokenExistResult>(null) { // from class: com.vk.push.core.push.IsPushTokenExistResult.CREATOR
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IsPushTokenExistResult createFromParcel(Parcel parcel) {
                Object objValueOf;
                O90.m5968f(parcel, "parcel");
                String string = parcel.readString();
                Object obj = IsPushTokenExistResult.DOES_NOT_EXIST;
                if (string != null) {
                    try {
                        String upperCase = string.toUpperCase(Locale.ROOT);
                        O90.m5967e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        objValueOf = Enum.valueOf(IsPushTokenExistResult.class, upperCase);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    objValueOf = obj;
                }
                O90.m5967e(objValueOf, "{\n        if (this != nu…faultEnum\n        }\n    }");
                obj = objValueOf;
                return (IsPushTokenExistResult) obj;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IsPushTokenExistResult[] newArray(int size) {
                return new IsPushTokenExistResult[size];
            }
        };
    }

    public static IsPushTokenExistResult valueOf(String str) {
        return (IsPushTokenExistResult) Enum.valueOf(IsPushTokenExistResult.class, str);
    }

    public static IsPushTokenExistResult[] values() {
        return (IsPushTokenExistResult[]) f20483a.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        O90.m5968f(dest, "dest");
        dest.writeString(name());
    }
}
