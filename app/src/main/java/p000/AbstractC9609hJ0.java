package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: hJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC9609hJ0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f28375a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f28375a = iArr;
        try {
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f28375a[TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f28375a[TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
