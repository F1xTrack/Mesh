package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.d8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2698d8 implements N7<Z7> {
    private final C2742f2 a;

    /* renamed from: com.yandex.metrica.impl.ob.d8$a */
    public class a implements Vm<String, C2864k0> {
        final /* synthetic */ Z7 a;

        public a(C2698d8 c2698d8, Z7 z7) {
            this.a = z7;
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public C2864k0 a(String str) {
            return J0.a(str, AbstractC3265zm.b(this.a.b.a())).c(this.a.c.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d8$b */
    public class b implements Vm<String, C2864k0> {
        final /* synthetic */ Z7 a;

        public b(C2698d8 c2698d8, Z7 z7) {
            this.a = z7;
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public C2864k0 a(String str) {
            return J0.b(str, AbstractC3265zm.b(this.a.b.a())).c(this.a.c.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d8$c */
    public static class c implements Um<File> {
        private final String a;

        public c(String str) {
            this.a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(File file) {
            CrashpadServiceHelper.a(this.a);
        }
    }

    public C2698d8(C2742f2 c2742f2) {
        this.a = c2742f2;
    }

    @Override // com.yandex.metrica.impl.ob.N7
    public void a(Z7 z7) {
        Z7 z72 = z7;
        this.a.a(z72, new b(this, z72));
    }

    @Override // com.yandex.metrica.impl.ob.N7
    public void b(Z7 z7) {
        Z7 z72 = z7;
        this.a.a(z72, new a(this, z72));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(Z7 z7) {
        this.a.a(z7, new a(this, z7));
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    public void b2(Z7 z7) {
        this.a.a(z7, new b(this, z7));
    }
}
