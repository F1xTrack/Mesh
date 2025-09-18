package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: Jl1 */
/* loaded from: classes.dex */
public abstract class AbstractC0757Jl1 extends RuntimeException {
    public final Fragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0757Jl1(Fragment fragment, String str) {
        super(str);
        O90.f(fragment, "fragment");
        this.a = fragment;
    }
}
