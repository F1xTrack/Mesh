package p000;

import android.content.Context;

/* renamed from: Up0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8384Up0 implements InterfaceC11343us0 {

    /* renamed from: a */
    public final /* synthetic */ int f12155a;

    /* renamed from: b */
    public final Context f12156b;

    public /* synthetic */ C8384Up0(Context context, int i) {
        this.f12155a = i;
        this.f12156b = context;
    }

    @Override // p000.InterfaceC11343us0
    /* renamed from: a */
    public final InterfaceC11215ts0 mo8114a(T71 t71) {
        switch (this.f12155a) {
            case 0:
                return new C8488Wp0(this.f12156b, 0);
            case 1:
                return new C8488Wp0(this.f12156b, 1);
            default:
                return new C8488Wp0(this.f12156b, 2);
        }
    }
}
