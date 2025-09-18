package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C2905lg;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public interface Ma<T> {

    public static class b {
        private final HashMap<Class<?>, Ma<?>> a;
        private final Ma<Ri> b;
        private final Ma<C2905lg.e> c;
        private final Ma<List<C2829ie>> d;
        private final Ma<C2629ae> e;
        private final Ma<Eh> f;

        @Deprecated
        private final Ma<Le> g;

        @Deprecated
        private final Ma<C3090t2> h;
        private final Ma<Be> i;
        private final Ma<C3041r3> j;
        private final Ma<P3> k;

        public class a extends Na<P3> {
            public a(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8) {
                return new Q9("clids_info", interfaceC3226y8, new La(new C2713dn(context)).c(), new C2700da());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.Ma$b$b */
        public class C0007b extends Na<Ri> {
            public C0007b(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8) {
                return new Q9("startup_state", interfaceC3226y8, new La(new C2713dn(context)).i(), new Ea());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class c extends Na<C2905lg.e> {
            public c(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8) {
                return new Q9("provided_request_state", interfaceC3226y8, new La(new C2713dn(context)).g(), new C3228ya());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class d extends Na<List<C2829ie>> {
            public d(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8) {
                return new Q9("permission_list", interfaceC3226y8, new La(new C2713dn(context)).d(), new C3178wa());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class e extends Na<C2629ae> {
            public e(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8) {
                return new Q9("app_permissions_state", interfaceC3226y8, new La(new C2713dn(context)).a(), new X9());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class f extends Na<Eh> {
            public f(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8) {
                return new Q9("sdk_fingerprinting", interfaceC3226y8, new La(new C2713dn(context)).h(), new Ca());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class g extends Na<Le> {
            public g(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8) {
                return new Q9("preload_info", interfaceC3226y8, new La(new C2713dn(context)).f(), new Me());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class h extends Na<C3090t2> {
            public h(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8) {
                return new Q9("satellite_clids_info", interfaceC3226y8, new S9(), new Aa());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class i extends Na<Be> {
            public i(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8) {
                return new Q9("preload_info_data", interfaceC3226y8, new La(new C2713dn(context)).e(), new De());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class j extends Na<C3041r3> {
            public j(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9 a(Context context, InterfaceC3226y8 interfaceC3226y8) {
                return new Q9("auto_inapp_collecting_info_data", interfaceC3226y8, new La(new C2713dn(context)).b(), new C3066s3());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 c(Context context) {
                return Qa.a(context).a();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC3226y8 d(Context context) {
                return Qa.a(context).b();
            }
        }

        public static final class k {
            static final b a = new b();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public static <T> Ma<T> a(Class<T> cls) {
            return (Ma) k.a.a.get(cls);
        }

        public static <T> Ma<Collection<T>> b(Class<T> cls) {
            return (Ma) k.a.a.get(cls);
        }

        private b() {
            HashMap<Class<?>, Ma<?>> map = new HashMap<>();
            this.a = map;
            C0007b c0007b = new C0007b(this);
            this.b = c0007b;
            c cVar = new c(this);
            this.c = cVar;
            d dVar = new d(this);
            this.d = dVar;
            e eVar = new e(this);
            this.e = eVar;
            f fVar = new f(this);
            this.f = fVar;
            g gVar = new g(this);
            this.g = gVar;
            h hVar = new h(this);
            this.h = hVar;
            i iVar = new i(this);
            this.i = iVar;
            j jVar = new j(this);
            this.j = jVar;
            a aVar = new a(this);
            this.k = aVar;
            map.put(Ri.class, c0007b);
            map.put(C2905lg.e.class, cVar);
            map.put(C2829ie.class, dVar);
            map.put(C2629ae.class, eVar);
            map.put(Eh.class, fVar);
            map.put(Le.class, gVar);
            map.put(C3090t2.class, hVar);
            map.put(Be.class, iVar);
            map.put(C3041r3.class, jVar);
            map.put(P3.class, aVar);
        }
    }

    Q9 a(Context context);

    Q9 b(Context context);
}
