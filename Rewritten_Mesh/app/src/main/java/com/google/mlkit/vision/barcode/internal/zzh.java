package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Executor;
import p000.AbstractC7414By0;
import p000.AbstractC9376fU1;
import p000.B02;
import p000.C0357Ff;
import p000.C10218m32;
import p000.C10654pT1;
import p000.C1356VY;
import p000.C6479nH;
import p000.C9039cs0;
import p000.C9222eH1;
import p000.C9450g32;
import p000.E80;
import p000.EnumC10337n02;
import p000.EnumC10593p02;
import p000.FA1;
import p000.FM0;
import p000.IA1;
import p000.InterfaceC0294Ef;
import p000.MM1;
import p000.RunnableC6704qp;
import p000.U41;

/* loaded from: classes.dex */
public final class zzh extends MobileVisionBase implements InterfaceC0294Ef {

    /* renamed from: f */
    public final boolean f18531f;

    public zzh(C0357Ff c0357Ff, C10654pT1 c10654pT1, Executor executor, C10218m32 c10218m32) {
        super(c10654pT1, executor);
        boolean zM3779c = IA1.m3779c();
        this.f18531f = zM3779c;
        C6479nH c6479nH = new C6479nH();
        c6479nH.f38228b = IA1.m3777a(c0357Ff);
        B02 b02 = new B02(c6479nH);
        U41 u41 = new U41();
        u41.f11646c = zM3779c ? EnumC10337n02.TYPE_THICK : EnumC10337n02.TYPE_THIN;
        u41.f11647d = b02;
        MM1.f7115a.execute(new RunnableC6704qp(c10218m32, new C1356VY(u41, 1), EnumC10593p02.ON_DEVICE_BARCODE_CREATE, c10218m32.m22649c(), 14));
    }

    /* renamed from: a */
    public final C9450g32 m11354a(E80 e80) {
        C9450g32 c9450g32M18243d;
        synchronized (this) {
            Preconditions.checkNotNull(e80, "InputImage can not be null");
            c9450g32M18243d = this.f18533a.get() ? AbstractC9376fU1.m18243d(new C9039cs0("This detector is already closed!", 14)) : (e80.f2505c < 32 || e80.f2506d < 32) ? AbstractC9376fU1.m18243d(new C9039cs0("InputImage width and height should be at least 32!", 3)) : this.f18534b.m2772b(this.f18536d, new FM0(this, e80), (FA1) this.f18535c.f3531b);
        }
        return c9450g32M18243d.mo11145l(new C9222eH1(this, e80.f2505c, e80.f2506d));
    }

    @Override // com.google.mlkit.vision.common.internal.MobileVisionBase, java.io.Closeable, java.lang.AutoCloseable, p000.InterfaceC0294Ef
    public final synchronized void close() {
        super.close();
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f18531f ? AbstractC7414By0.f1103a : new Feature[]{AbstractC7414By0.f1104b};
    }
}
