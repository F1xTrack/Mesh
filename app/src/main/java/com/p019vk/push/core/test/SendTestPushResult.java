package com.p019vk.push.core.test;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import p000.O90;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bj\u0002\b\r¨\u0006\u000e"}, m22267d2 = {"Lcom/vk/push/core/test/SendTestPushResult;", "", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "LTf1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "CREATOR", "SUCCESS", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SendTestPushResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SendTestPushResult SUCCESS;

    /* renamed from: a */
    public static final /* synthetic */ SendTestPushResult[] f20581a;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.push.core.test.SendTestPushResult$CREATOR] */
    static {
        SendTestPushResult sendTestPushResult = new SendTestPushResult("SUCCESS", 0);
        SUCCESS = sendTestPushResult;
        f20581a = new SendTestPushResult[]{sendTestPushResult};
        INSTANCE = new Parcelable.Creator<SendTestPushResult>(null) { // from class: com.vk.push.core.test.SendTestPushResult.CREATOR
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SendTestPushResult createFromParcel(Parcel parcel) {
                Object objValueOf;
                O90.m5968f(parcel, "parcel");
                String string = parcel.readString();
                Object obj = SendTestPushResult.SUCCESS;
                if (string != null) {
                    try {
                        String upperCase = string.toUpperCase(Locale.ROOT);
                        O90.m5967e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        objValueOf = Enum.valueOf(SendTestPushResult.class, upperCase);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    objValueOf = obj;
                }
                O90.m5967e(objValueOf, "{\n        if (this != nu…faultEnum\n        }\n    }");
                obj = objValueOf;
                return (SendTestPushResult) obj;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SendTestPushResult[] newArray(int size) {
                return new SendTestPushResult[size];
            }
        };
    }

    public static SendTestPushResult valueOf(String str) {
        return (SendTestPushResult) Enum.valueOf(SendTestPushResult.class, str);
    }

    public static SendTestPushResult[] values() {
        return (SendTestPushResult[]) f20581a.clone();
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
