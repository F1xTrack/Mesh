package p000;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: cs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9039cs0 extends Exception {

    /* renamed from: a */
    public final int f25689a;

    public C9039cs0(String str, int i) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.f25689a = i;
    }

    public C9039cs0(String str, Exception exc) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), exc);
        this.f25689a = 13;
    }
}
