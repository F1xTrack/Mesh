package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class PH implements InterfaceC3412dY0 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final AbstractC1676Vg0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public PH(CharSequence charSequence, int i, int i2, Function2 function2) {
        O90.f(charSequence, "input");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = (AbstractC1676Vg0) function2;
    }

    @Override // defpackage.InterfaceC3412dY0
    public final Iterator iterator() {
        return new OH(this);
    }
}
