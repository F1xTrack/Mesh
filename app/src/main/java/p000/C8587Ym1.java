package p000;

import com.bumptech.glide.integration.webp.WebpFrame;

/* renamed from: Ym1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8587Ym1 {

    /* renamed from: a */
    public final int f14515a;

    /* renamed from: b */
    public final int f14516b;

    /* renamed from: c */
    public final int f14517c;

    /* renamed from: d */
    public final int f14518d;

    /* renamed from: e */
    public final int f14519e;

    /* renamed from: f */
    public final int f14520f;

    /* renamed from: g */
    public final boolean f14521g;

    /* renamed from: h */
    public final boolean f14522h;

    public C8587Ym1(int i, WebpFrame webpFrame) {
        this.f14515a = i;
        this.f14516b = webpFrame.getXOffest();
        this.f14517c = webpFrame.getYOffest();
        this.f14518d = webpFrame.getWidth();
        this.f14519e = webpFrame.getHeight();
        this.f14520f = webpFrame.getDurationMs();
        this.f14521g = webpFrame.isBlendWithPreviousFrame();
        this.f14522h = webpFrame.shouldDisposeToBackgroundColor();
    }

    public final String toString() {
        return "frameNumber=" + this.f14515a + ", xOffset=" + this.f14516b + ", yOffset=" + this.f14517c + ", width=" + this.f14518d + ", height=" + this.f14519e + ", duration=" + this.f14520f + ", blendPreviousFrame=" + this.f14521g + ", disposeBackgroundColor=" + this.f14522h;
    }
}
