package p000;

import java.io.File;
import java.io.IOException;
import p000.C0104Be;
import p000.C0471HT;
import p000.C1831cB;

/* renamed from: RU */
/* loaded from: classes.dex */
public final class C1100RU implements InterfaceC6726rA {

    /* renamed from: a */
    public final C1831cB f10197a;

    /* renamed from: b */
    public final boolean f10198b;

    /* renamed from: c */
    public String f10199c;

    public C1100RU(C1831cB c1831cB, boolean z) {
        this.f10197a = c1831cB;
        this.f10198b = z;
    }

    @Override // p000.InterfaceC6726rA
    /* renamed from: a */
    public final InterfaceC11091su0 mo7022a(String str) {
        return new C10525oT0(this.f10197a.m10612b(str));
    }

    @Override // p000.InterfaceC6726rA
    /* renamed from: b */
    public final boolean mo7023b() {
        String str = this.f10199c;
        return str != null && mo7024c(str);
    }

    @Override // p000.InterfaceC6726rA
    /* renamed from: c */
    public final boolean mo7024c(String str) {
        File file;
        CC0 cc0 = (CC0) this.f10197a.m10612b(str).f9303a;
        return cc0 != null && (((file = (File) cc0.f1250b) != null && file.exists()) || ((C0794Mc) cc0.f1251c) != null);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.crashlytics.ndk.b] */
    @Override // p000.InterfaceC6726rA
    /* renamed from: d */
    public final synchronized void mo7025d(final String str, final long j, final C0104Be c0104Be) {
        this.f10199c = str;
        ?? r6 = new Object() { // from class: com.google.firebase.crashlytics.ndk.b
            /* renamed from: a */
            public final void m11300a() throws Throwable {
                long j2 = j;
                C0104Be c0104Be2 = c0104Be;
                C1831cB c1831cB = this.f18458a.f10197a;
                C0471HT c0471ht = c1831cB.f17348c;
                String str2 = str;
                try {
                    String canonicalPath = c0471ht.m3449i(str2).getCanonicalPath();
                    if (((JniNativeApi) c1831cB.f17347b).m11299b(c1831cB.f17346a.getAssets(), canonicalPath)) {
                        c1831cB.m10613d(j2, str2);
                        c1831cB.m10614e(str2, c0104Be2.f960a);
                        c1831cB.m10616h(str2, c0104Be2.f961b);
                        c1831cB.m10615f(str2, c0104Be2.f962c);
                    }
                } catch (IOException unused) {
                }
            }
        };
        if (this.f10198b) {
            r6.m11300a();
        }
    }
}
