package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: ut0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7496ut0 implements InterfaceC6587q61, Serializable {
    public final int a;

    public C7496ut0() {
        AbstractC3588eT1.b(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // defpackage.InterfaceC6587q61
    public final Object get() {
        return new ArrayList(this.a);
    }
}
