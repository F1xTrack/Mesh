package p000;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* renamed from: PH */
/* loaded from: classes2.dex */
public final class C0962PH implements InterfaceC9127dY0 {

    /* renamed from: a */
    public final CharSequence f8976a;

    /* renamed from: b */
    public final int f8977b;

    /* renamed from: c */
    public final int f8978c;

    /* renamed from: d */
    public final AbstractC8418Vg0 f8979d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0962PH(CharSequence charSequence, int i, int i2, Function2 function2) {
        O90.m5968f(charSequence, "input");
        this.f8976a = charSequence;
        this.f8977b = i;
        this.f8978c = i2;
        this.f8979d = (AbstractC8418Vg0) function2;
    }

    @Override // p000.InterfaceC9127dY0
    public final Iterator iterator() {
        return new C0899OH(this);
    }
}
