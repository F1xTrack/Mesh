package com.horcrux.svg;

/* loaded from: classes.dex */
public final class U implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ U(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(((V) this.b).a);
                if (svgViewByTag != null) {
                    svgViewByTag.setToDataUrlTask(new U(this, 2));
                    break;
                }
                break;
            case 1:
                V v = (V) this.b;
                SvgViewModule.toDataURL(v.a, v.b, v.c, v.d + 1);
                break;
            default:
                V v2 = (V) ((U) this.b).b;
                SvgViewModule.toDataURL(v2.a, v2.b, v2.c, v2.d + 1);
                break;
        }
    }
}
