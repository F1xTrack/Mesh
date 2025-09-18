package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class HN0 extends IS0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final InterfaceC0827Kj d;

    public /* synthetic */ HN0(Object obj, long j, InterfaceC0827Kj interfaceC0827Kj, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = interfaceC0827Kj;
    }

    @Override // defpackage.IS0
    public final long o() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.IS0
    public final C1859Xp0 p() {
        Object obj = this.c;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = C1859Xp0.d;
                return AbstractC7743wA1.c(str);
            default:
                return (C1859Xp0) obj;
        }
    }

    @Override // defpackage.IS0
    public final InterfaceC0827Kj w() {
        switch (this.a) {
            case 0:
                return (C8351zN0) this.d;
            default:
                return this.d;
        }
    }
}
