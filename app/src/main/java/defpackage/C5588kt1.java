package defpackage;

import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.f0;
import com.my.tracker.obfuscated.t;

/* renamed from: kt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5588kt1 implements t {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ C5588kt1(f0 f0Var, int i) {
        this.a = i;
        this.b = f0Var;
    }

    @Override // com.my.tracker.obfuscated.t
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.b((String) obj);
                break;
            case 1:
                this.b.a((b3) obj);
                break;
            default:
                this.b.c((b3) obj);
                break;
        }
    }
}
