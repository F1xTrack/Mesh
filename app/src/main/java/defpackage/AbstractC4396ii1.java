package defpackage;

import com.yandex.varioqub.config.FetchError;

/* renamed from: ii1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4396ii1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FetchError.values().length];
        a = iArr;
        try {
            iArr[FetchError.REQUEST_THROTTLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[FetchError.EMPTY_RESULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[FetchError.IDENTIFIERS_NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[FetchError.RESPONSE_PARSE_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[FetchError.NETWORK_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[FetchError.INTERNAL_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
