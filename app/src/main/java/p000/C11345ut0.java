package p000;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: ut0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11345ut0 implements InterfaceC10736q61, Serializable {

    /* renamed from: a */
    public final int f44003a;

    public C11345ut0() {
        AbstractC9246eT1.m17997b(2, "expectedValuesPerKey");
        this.f44003a = 2;
    }

    @Override // p000.InterfaceC10736q61
    public final Object get() {
        return new ArrayList(this.f44003a);
    }
}
