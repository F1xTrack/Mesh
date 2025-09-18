package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.InterfaceC2777Ma;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.zh */
/* loaded from: classes2.dex */
public class C3783zh {

    /* renamed from: a */
    private InterfaceExecutorC3607sn f25427a;

    /* renamed from: b */
    private final C2876Q9 f25428b;

    /* renamed from: c */
    private b f25429c;

    /* renamed from: d */
    private C3152ba f25430d;

    /* renamed from: e */
    private final C2880Qd f25431e;

    /* renamed from: f */
    private final C2814Nm f25432f;

    /* renamed from: g */
    private final C2904Rd f25433g;

    /* renamed from: h */
    private String f25434h;

    /* renamed from: com.yandex.metrica.impl.ob.zh$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3757yh f25435a;

        public a(C3757yh c3757yh) {
            this.f25435a = c3757yh;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3783zh c3783zh = C3783zh.this;
            C3783zh.m17331a(c3783zh, this.f25435a, c3783zh.f25434h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.zh$b */
    public static class b {

        /* renamed from: a */
        private final C2684Ih f25437a;

        public b() {
            this(new C2684Ih());
        }

        /* renamed from: a */
        public List<C2659Hh> m17338a(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            if (C2968U2.m15246a(bArr)) {
                return arrayList;
            }
            try {
                return this.f25437a.m14349a(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                return arrayList;
            }
        }

        public b(C2684Ih c2684Ih) {
            this.f25437a = c2684Ih;
        }
    }

    public C3783zh(Context context, String str, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(null, InterfaceC2777Ma.b.m14608a(C2584Eh.class).mo14606a(context), new b(), new C2880Qd(), interfaceExecutorC3607sn, new C3152ba(), new C2814Nm(), new C2904Rd(context));
    }

    /* renamed from: a */
    public void m17336a(C3757yh c3757yh) {
        ((C3581rn) this.f25427a).execute(new a(c3757yh));
    }

    /* renamed from: b */
    public boolean m17337b(C2885Qi c2885Qi) {
        return this.f25434h == null ? c2885Qi.m14863L() != null : !r0.equals(c2885Qi.m14863L());
    }

    public C3783zh(String str, C2876Q9 c2876q9, b bVar, C2880Qd c2880Qd, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3152ba c3152ba, C2814Nm c2814Nm, C2904Rd c2904Rd) {
        this.f25434h = str;
        this.f25428b = c2876q9;
        this.f25429c = bVar;
        this.f25431e = c2880Qd;
        this.f25427a = interfaceExecutorC3607sn;
        this.f25430d = c3152ba;
        this.f25432f = c2814Nm;
        this.f25433g = c2904Rd;
    }

    /* renamed from: a */
    public static void m17331a(C3783zh c3783zh, C3757yh c3757yh, String str) {
        if (!c3783zh.f25433g.mo14997a() || str == null) {
            return;
        }
        c3783zh.f25431e.m14847a(str, new C2484Ah(c3783zh, (C2584Eh) c3783zh.f25428b.m14814b(), c3757yh));
    }

    /* renamed from: a */
    public void m17335a(C2885Qi c2885Qi) {
        if (c2885Qi != null) {
            this.f25434h = c2885Qi.m14863L();
        }
    }
}
