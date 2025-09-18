package com.vk.push.core.push;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.O90;
import java.util.Locale;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/vk/push/core/push/SendPushesResult;", "", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "LTf1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "CREATOR", "OK", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SendPushesResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SendPushesResult OK;
    public static final /* synthetic */ SendPushesResult[] a;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.push.core.push.SendPushesResult$CREATOR] */
    static {
        SendPushesResult sendPushesResult = new SendPushesResult("OK", 0);
        OK = sendPushesResult;
        a = new SendPushesResult[]{sendPushesResult};
        INSTANCE = new Parcelable.Creator<SendPushesResult>(null) { // from class: com.vk.push.core.push.SendPushesResult.CREATOR
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SendPushesResult createFromParcel(Parcel parcel) {
                Object objValueOf;
                O90.f(parcel, "parcel");
                String string = parcel.readString();
                Object obj = SendPushesResult.OK;
                if (string != null) {
                    try {
                        String upperCase = string.toUpperCase(Locale.ROOT);
                        O90.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        objValueOf = Enum.valueOf(SendPushesResult.class, upperCase);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    objValueOf = obj;
                }
                O90.e(objValueOf, "{\n        if (this != nu…faultEnum\n        }\n    }");
                obj = objValueOf;
                return (SendPushesResult) obj;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SendPushesResult[] newArray(int size) {
                return new SendPushesResult[size];
            }
        };
    }

    public static SendPushesResult valueOf(String str) {
        return (SendPushesResult) Enum.valueOf(SendPushesResult.class, str);
    }

    public static SendPushesResult[] values() {
        return (SendPushesResult[]) a.clone();
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
