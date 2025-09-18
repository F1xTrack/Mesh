package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class DK implements AK {
    @Override // defpackage.AK
    public final void a(C7726w5 c7726w5) {
        ((ThreadPoolExecutor) FK.a.getValue()).execute(new CK(c7726w5, 0));
    }
}
