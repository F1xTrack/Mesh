package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: cs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3281cs0 extends Exception {
    public final int a;

    public C3281cs0(String str, int i) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.a = i;
    }

    public C3281cs0(String str, Exception exc) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), exc);
        this.a = 13;
    }
}
