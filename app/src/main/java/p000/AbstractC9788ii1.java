package p000;

import com.yandex.varioqub.config.FetchError;

/* renamed from: ii1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC9788ii1 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f29417a;

    static {
        int[] iArr = new int[FetchError.values().length];
        f29417a = iArr;
        try {
            iArr[FetchError.REQUEST_THROTTLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f29417a[FetchError.EMPTY_RESULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f29417a[FetchError.IDENTIFIERS_NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f29417a[FetchError.RESPONSE_PARSE_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f29417a[FetchError.NETWORK_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f29417a[FetchError.INTERNAL_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
