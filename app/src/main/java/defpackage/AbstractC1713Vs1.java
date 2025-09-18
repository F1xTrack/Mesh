package defpackage;

import com.vk.push.core.push.RegisterForPushesResult;

/* renamed from: Vs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1713Vs1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RegisterForPushesResult.values().length];
        try {
            iArr[RegisterForPushesResult.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RegisterForPushesResult.ALREADY_REGISTERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
