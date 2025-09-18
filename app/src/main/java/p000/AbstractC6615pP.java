package p000;

import org.greenrobot.eventbus.ThreadMode;

/* renamed from: pP */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6615pP {

    /* renamed from: a */
    public static final /* synthetic */ int[] f40050a;

    static {
        int[] iArr = new int[ThreadMode.values().length];
        f40050a = iArr;
        try {
            iArr[ThreadMode.POSTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f40050a[ThreadMode.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f40050a[ThreadMode.BACKGROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f40050a[ThreadMode.ASYNC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
