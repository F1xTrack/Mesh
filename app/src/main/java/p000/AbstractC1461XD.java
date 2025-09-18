package p000;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: XD */
/* loaded from: classes.dex */
public abstract class AbstractC1461XD extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1461XD(String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1461XD(String str, Throwable th) {
        super(str, th);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
