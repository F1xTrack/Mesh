package defpackage;

import android.content.Context;

/* renamed from: Up0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1625Up0 implements InterfaceC7493us0 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ C1625Up0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.InterfaceC7493us0
    public final InterfaceC7302ts0 a(T71 t71) {
        switch (this.a) {
            case 0:
                return new C1781Wp0(this.b, 0);
            case 1:
                return new C1781Wp0(this.b, 1);
            default:
                return new C1781Wp0(this.b, 2);
        }
    }
}
