package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.Hk;
import java.util.Collections;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.zl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3264zl {
    private final InterfaceC2935ml a;
    private final Lk b;
    private final F9 c;
    private volatile Il d;
    private final C2787gm e;
    private final Hk.b f;
    private final Ik g;

    /* renamed from: com.yandex.metrica.impl.ob.zl$a */
    public class a implements InterfaceC2935ml {
        public a(C3264zl c3264zl) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2935ml
        public void onError(String str) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2935ml
        public void onResult(JSONObject jSONObject) {
        }
    }

    public C3264zl(Il il, Lk lk, F9 f9, C2787gm c2787gm, Ik ik) {
        this(il, lk, f9, c2787gm, ik, new Hk.b());
    }

    public void a(Il il) {
        this.d = il;
    }

    public void b(Activity activity) {
        Il il = this.d;
        if (this.g.a(activity, il) == EnumC3239yl.OK) {
            a(activity, 0L, il, il.e);
        }
    }

    public C3264zl(Il il, Lk lk, F9 f9, C2787gm c2787gm, Ik ik, Hk.b bVar) {
        this.a = new a(this);
        this.d = il;
        this.b = lk;
        this.c = f9;
        this.e = c2787gm;
        this.f = bVar;
        this.g = ik;
    }

    public void a(Activity activity) {
        Il il = this.d;
        if (this.g.a(activity, il) == EnumC3239yl.OK) {
            C2662bm c2662bm = il.e;
            a(activity, c2662bm.d, il, c2662bm);
        }
    }

    private void a(Activity activity, long j, Il il, C2662bm c2662bm) {
        C2787gm c2787gm = this.e;
        Hk.b bVar = this.f;
        Lk lk = this.b;
        F9 f9 = this.c;
        InterfaceC2935ml interfaceC2935ml = this.a;
        bVar.getClass();
        c2787gm.a(activity, j, il, c2662bm, Collections.singletonList(new Hk(lk, f9, false, interfaceC2935ml, new Hk.a())));
    }
}
