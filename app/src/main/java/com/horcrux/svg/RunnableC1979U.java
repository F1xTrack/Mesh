package com.horcrux.svg;

/* renamed from: com.horcrux.svg.U */
/* loaded from: classes.dex */
public final class RunnableC1979U implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f18547a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f18548b;

    public /* synthetic */ RunnableC1979U(Runnable runnable, int i) {
        this.f18547a = i;
        this.f18548b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18547a) {
            case 0:
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(((RunnableC1980V) this.f18548b).f18549a);
                if (svgViewByTag != null) {
                    svgViewByTag.setToDataUrlTask(new RunnableC1979U(this, 2));
                    break;
                }
                break;
            case 1:
                RunnableC1980V runnableC1980V = (RunnableC1980V) this.f18548b;
                SvgViewModule.toDataURL(runnableC1980V.f18549a, runnableC1980V.f18550b, runnableC1980V.f18551c, runnableC1980V.f18552d + 1);
                break;
            default:
                RunnableC1980V runnableC1980V2 = (RunnableC1980V) ((RunnableC1979U) this.f18548b).f18548b;
                SvgViewModule.toDataURL(runnableC1980V2.f18549a, runnableC1980V2.f18550b, runnableC1980V2.f18551c, runnableC1980V2.f18552d + 1);
                break;
        }
    }
}
