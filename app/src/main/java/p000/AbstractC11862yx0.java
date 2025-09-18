package p000;

import com.p019vk.push.core.remote.config.omicron.UpdateBehaviour;
import com.p019vk.push.core.remote.config.omicron.retriever.RetrievalStatus;

/* renamed from: yx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC11862yx0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f46549a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f46550b;

    static {
        int[] iArr = new int[RetrievalStatus.values().length];
        f46550b = iArr;
        try {
            iArr[RetrievalStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f46550b[RetrievalStatus.NOT_MODIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[UpdateBehaviour.values().length];
        f46549a = iArr2;
        try {
            iArr2[UpdateBehaviour.WAIT_FOR_ACTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f46549a[UpdateBehaviour.CACHE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f46549a[UpdateBehaviour.SCHEDULED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f46549a[UpdateBehaviour.DEFAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
