package p000;

import com.p018my.tracker.obfuscated.C2298b3;
import com.p018my.tracker.obfuscated.C2313f0;
import com.p018my.tracker.obfuscated.InterfaceC2368t;

/* renamed from: kt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10066kt1 implements InterfaceC2368t {

    /* renamed from: a */
    public final /* synthetic */ int f36743a;

    /* renamed from: b */
    public final /* synthetic */ C2313f0 f36744b;

    public /* synthetic */ C10066kt1(C2313f0 c2313f0, int i) {
        this.f36743a = i;
        this.f36744b = c2313f0;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2368t
    /* renamed from: a */
    public final void mo7467a(Object obj) {
        switch (this.f36743a) {
            case 0:
                this.f36744b.m13078b((String) obj);
                break;
            case 1:
                this.f36744b.m12991a((C2298b3) obj);
                break;
            default:
                this.f36744b.m13024c((C2298b3) obj);
                break;
        }
    }
}
