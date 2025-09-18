package p000;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: af1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8753af1 extends GuardedRunnable {

    /* renamed from: a */
    public final /* synthetic */ int f15607a;

    /* renamed from: b */
    public final /* synthetic */ Object f15608b;

    /* renamed from: c */
    public final /* synthetic */ UIManagerModule f15609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8753af1(UIManagerModule uIManagerModule, ReactApplicationContext reactApplicationContext, int i, Object obj) {
        super(reactApplicationContext);
        this.f15609c = uIManagerModule;
        this.f15607a = i;
        this.f15608b = obj;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        C8623Ze1 c8623Ze1 = this.f15609c.mUIImplementation;
        DM0 dm0M24384u = c8623Ze1.f15073d.m24384u(this.f15607a);
        if (dm0M24384u == null) {
            AbstractC3929dS.m17683p("ReactNative");
            return;
        }
        dm0M24384u.mo1655e(this.f15608b);
        C11827yf1 c11827yf1 = c8623Ze1.f15075f;
        if (c11827yf1.f46391h.isEmpty() && c11827yf1.f46390g.isEmpty()) {
            c8623Ze1.m9570f(-1);
        }
    }
}
