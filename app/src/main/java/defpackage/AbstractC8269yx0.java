package defpackage;

import com.vk.push.core.remote.config.omicron.UpdateBehaviour;
import com.vk.push.core.remote.config.omicron.retriever.RetrievalStatus;

/* renamed from: yx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC8269yx0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[RetrievalStatus.values().length];
        b = iArr;
        try {
            iArr[RetrievalStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[RetrievalStatus.NOT_MODIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[UpdateBehaviour.values().length];
        a = iArr2;
        try {
            iArr2[UpdateBehaviour.WAIT_FOR_ACTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[UpdateBehaviour.CACHE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[UpdateBehaviour.SCHEDULED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[UpdateBehaviour.DEFAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
