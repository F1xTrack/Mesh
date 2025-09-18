package com.huawei.hms.framework.network.grs.p008g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p006e.C2097c;
import java.util.concurrent.Callable;

/* renamed from: com.huawei.hms.framework.network.grs.g.a */
/* loaded from: classes.dex */
public class C2103a {

    /* renamed from: a */
    protected C2106d f19045a;

    /* renamed from: b */
    private final String f19046b;

    /* renamed from: c */
    private final C2105c f19047c;

    /* renamed from: d */
    private final int f19048d;

    /* renamed from: e */
    private final Context f19049e;

    /* renamed from: f */
    private final String f19050f;

    /* renamed from: g */
    private final GrsBaseInfo f19051g;

    /* renamed from: h */
    private final C2097c f19052h;

    public C2103a(String str, int i, C2105c c2105c, Context context, String str2, GrsBaseInfo grsBaseInfo, C2097c c2097c) {
        this.f19046b = str;
        this.f19047c = c2105c;
        this.f19048d = i;
        this.f19049e = context;
        this.f19050f = str2;
        this.f19051g = grsBaseInfo;
        this.f19052h = c2097c;
    }

    /* renamed from: a */
    public Context m11777a() {
        return this.f19049e;
    }

    /* renamed from: b */
    public C2105c m11778b() {
        return this.f19047c;
    }

    /* renamed from: c */
    public String m11779c() {
        return this.f19046b;
    }

    /* renamed from: d */
    public int m11780d() {
        return this.f19048d;
    }

    /* renamed from: e */
    public String m11781e() {
        return this.f19050f;
    }

    /* renamed from: f */
    public C2097c m11782f() {
        return this.f19052h;
    }

    /* renamed from: g */
    public Callable<C2106d> m11783g() {
        return new CallableC2108f(this.f19046b, this.f19048d, this.f19047c, this.f19049e, this.f19050f, this.f19051g, this.f19052h);
    }
}
