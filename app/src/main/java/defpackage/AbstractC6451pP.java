package defpackage;

import org.greenrobot.eventbus.ThreadMode;

/* renamed from: pP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6451pP {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ThreadMode.values().length];
        a = iArr;
        try {
            iArr[ThreadMode.POSTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ThreadMode.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ThreadMode.BACKGROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ThreadMode.ASYNC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
