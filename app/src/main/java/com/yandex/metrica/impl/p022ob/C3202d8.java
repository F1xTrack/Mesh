package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p021ac.CrashpadServiceHelper;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.d8 */
/* loaded from: classes2.dex */
public class C3202d8 implements InterfaceC2799N7<C3098Z7> {

    /* renamed from: a */
    private final C3248f2 f23218a;

    /* renamed from: com.yandex.metrica.impl.ob.d8$a */
    public class a implements InterfaceC3013Vm<String, C3376k0> {

        /* renamed from: a */
        final /* synthetic */ C3098Z7 f23219a;

        public a(C3202d8 c3202d8, C3098Z7 c3098z7) {
            this.f23219a = c3098z7;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
        /* renamed from: a */
        public C3376k0 mo13948a(String str) {
            return C2692J0.m14394a(str, AbstractC3788zm.m17346b(this.f23219a.f22939b.m13950a())).m16232c(this.f23219a.f22940c.f24369a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d8$b */
    public class b implements InterfaceC3013Vm<String, C3376k0> {

        /* renamed from: a */
        final /* synthetic */ C3098Z7 f23220a;

        public b(C3202d8 c3202d8, C3098Z7 c3098z7) {
            this.f23220a = c3098z7;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
        /* renamed from: a */
        public C3376k0 mo13948a(String str) {
            return C2692J0.m14400b(str, AbstractC3788zm.m17346b(this.f23220a.f22939b.m13950a())).m16232c(this.f23220a.f22940c.f24369a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d8$c */
    public static class c implements InterfaceC2988Um<File> {

        /* renamed from: a */
        private final String f23221a;

        public c(String str) {
            this.f23221a = str;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(File file) {
            CrashpadServiceHelper.m13833a(this.f23221a);
        }
    }

    public C3202d8(C3248f2 c3248f2) {
        this.f23218a = c3248f2;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2799N7
    /* renamed from: a */
    public void mo14641a(C3098Z7 c3098z7) {
        C3098Z7 c3098z72 = c3098z7;
        this.f23218a.m15872a(c3098z72, new b(this, c3098z72));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2799N7
    /* renamed from: b */
    public void mo14642b(C3098Z7 c3098z7) {
        C3098Z7 c3098z72 = c3098z7;
        this.f23218a.m15872a(c3098z72, new a(this, c3098z72));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(C3098Z7 c3098z7) {
        this.f23218a.m15872a(c3098z7, new a(this, c3098z7));
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    public void b2(C3098Z7 c3098z7) {
        this.f23218a.m15872a(c3098z7, new b(this, c3098z7));
    }
}
