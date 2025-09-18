package com.vk.push.core.push;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.O90;
import java.util.Locale;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/push/RegisterForPushesResult;", "", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "LTf1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "CREATOR", "OK", "ALREADY_REGISTERED", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RegisterForPushesResult implements Parcelable {
    public static final RegisterForPushesResult ALREADY_REGISTERED;

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final RegisterForPushesResult OK;
    public static final /* synthetic */ RegisterForPushesResult[] a;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.push.core.push.RegisterForPushesResult$CREATOR] */
    static {
        RegisterForPushesResult registerForPushesResult = new RegisterForPushesResult("OK", 0);
        OK = registerForPushesResult;
        RegisterForPushesResult registerForPushesResult2 = new RegisterForPushesResult("ALREADY_REGISTERED", 1);
        ALREADY_REGISTERED = registerForPushesResult2;
        a = new RegisterForPushesResult[]{registerForPushesResult, registerForPushesResult2};
        INSTANCE = new Parcelable.Creator<RegisterForPushesResult>(null) { // from class: com.vk.push.core.push.RegisterForPushesResult.CREATOR
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public RegisterForPushesResult createFromParcel(Parcel parcel) {
                Object objValueOf;
                O90.f(parcel, "parcel");
                String string = parcel.readString();
                Object obj = RegisterForPushesResult.OK;
                if (string != null) {
                    try {
                        String upperCase = string.toUpperCase(Locale.ROOT);
                        O90.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        objValueOf = Enum.valueOf(RegisterForPushesResult.class, upperCase);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    objValueOf = obj;
                }
                O90.e(objValueOf, "{\n        if (this != nu…faultEnum\n        }\n    }");
                obj = objValueOf;
                return (RegisterForPushesResult) obj;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public RegisterForPushesResult[] newArray(int size) {
                return new RegisterForPushesResult[size];
            }
        };
    }

    public static RegisterForPushesResult valueOf(String str) {
        return (RegisterForPushesResult) Enum.valueOf(RegisterForPushesResult.class, str);
    }

    public static RegisterForPushesResult[] values() {
        return (RegisterForPushesResult[]) a.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        O90.f(dest, "dest");
        dest.writeString(name());
    }
}
