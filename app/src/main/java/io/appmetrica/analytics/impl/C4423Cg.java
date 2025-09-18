package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Cg */
/* loaded from: classes2.dex */
public final class C4423Cg extends AbstractC4750Q5 {

    /* renamed from: b */
    public final C5139g5 f29967b;

    /* renamed from: c */
    public final InterfaceC4398Bg f29968c;

    /* renamed from: d */
    public final C4819T3 f29969d;

    public C4423Cg(C5139g5 c5139g5, InterfaceC4398Bg interfaceC4398Bg) {
        this(c5139g5, interfaceC4398Bg, new C4819T3());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4750Q5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4473Eg load(C4726P5 c4726p5) {
        C4473Eg c4473Eg = (C4473Eg) super.load(c4726p5);
        c4473Eg.f30090n = ((C5625zg) c4726p5.componentArguments).f32923a;
        c4473Eg.f30095s = this.f29967b.f31743v.m21095a();
        c4473Eg.f30100x = this.f29967b.f31740s.m19306a();
        C5625zg c5625zg = (C5625zg) c4726p5.componentArguments;
        c4473Eg.f30080d = c5625zg.f32925c;
        c4473Eg.f30081e = c5625zg.f32924b;
        c4473Eg.f30082f = c5625zg.f32926d;
        c4473Eg.f30083g = c5625zg.f32927e;
        c4473Eg.f30086j = c5625zg.f32928f;
        c4473Eg.f30084h = c5625zg.f32929g;
        c4473Eg.f30085i = c5625zg.f32930h;
        Boolean boolValueOf = Boolean.valueOf(c5625zg.f32931i);
        InterfaceC4398Bg interfaceC4398Bg = this.f29968c;
        c4473Eg.f30087k = boolValueOf;
        c4473Eg.f30088l = interfaceC4398Bg;
        C5625zg c5625zg2 = (C5625zg) c4726p5.componentArguments;
        c4473Eg.f30099w = c5625zg2.f32933k;
        C5155gl c5155gl = c4726p5.f30602a;
        C5613z4 c5613z4 = c5155gl.f31795n;
        c4473Eg.f30091o = c5613z4.f32907a;
        C4734Pd c4734Pd = c5155gl.f31800s;
        if (c4734Pd != null) {
            c4473Eg.f30096t = c4734Pd.f30616a;
            c4473Eg.f30097u = c4734Pd.f30617b;
        }
        c4473Eg.f30092p = c5613z4.f32908b;
        c4473Eg.f30094r = c5155gl.f31786e;
        c4473Eg.f30093q = c5155gl.f31792k;
        C4819T3 c4819t3 = this.f29969d;
        Map<String, String> map = c5625zg2.f32932j;
        C4748Q3 c4748q3M20620d = C5244ka.f32038C.m20620d();
        c4819t3.getClass();
        c4473Eg.f30098v = C4819T3.m19830a(map, c5155gl, c4748q3M20620d);
        return c4473Eg;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C4473Eg(this.f29967b);
    }

    public C4423Cg(C5139g5 c5139g5, InterfaceC4398Bg interfaceC4398Bg, C4819T3 c4819t3) {
        super(c5139g5.getContext(), c5139g5.mo19229b().m20056c());
        this.f29967b = c5139g5;
        this.f29968c = interfaceC4398Bg;
        this.f29969d = c4819t3;
    }

    /* renamed from: a */
    public final C4473Eg m19280a() {
        return new C4473Eg(this.f29967b);
    }
}
